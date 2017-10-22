package com.sjq.security.extend;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.session.SessionFixationProtectionStrategy;
import org.springframework.util.Assert;

/**
 * 当用户已经登陆到系统时，如果又有人使用同一账号尝试登录系统，
 * 系统会判断当前用户的ip地址，如果ip地址与上次登录的ip地址相同，则注销上次登录的会话，允许当前用户登录系统
 * 扩展SessionFixationProtectionStrategy
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:28:02
 * @version 1.0
 */
public class CustomConcurrentSessionControlStrategy extends SessionFixationProtectionStrategy implements
		MessageSourceAware {
	protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();
	private SessionRegistry sessionRegistry;
	private boolean exceptionIfMaximumExceeded = false;
	private int maximumSessions = 1;

	public CustomConcurrentSessionControlStrategy() {
		super.setAlwaysCreateSession(true);
		this.sessionRegistry = new CustomSessionRegistry();
	}

	/**
	 * @param sessionRegistry
	 *            the session registry which should be updated when the
	 *            authenticated session is changed.
	 */
	public CustomConcurrentSessionControlStrategy(SessionRegistry sessionRegistry) {
		Assert.notNull(sessionRegistry, "The sessionRegistry cannot be null");
		super.setAlwaysCreateSession(true);
		this.sessionRegistry = sessionRegistry;
	}

	@Override
	public void onAuthentication(Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
		checkAuthenticationAllowed(authentication, request);

		// Allow the parent to create a new session if necessary
		super.onAuthentication(authentication, request, response);

		CustomPrincipal smartPrincipal = new CustomPrincipal(authentication);
		sessionRegistry.registerNewSession(request.getSession().getId(), smartPrincipal);
	}

	private void checkAuthenticationAllowed(Authentication authentication, HttpServletRequest request)
			throws AuthenticationException {
		CustomPrincipal smartPrincipal = new CustomPrincipal(authentication);
		// 获取的是当前用户一共有多少个会话，而不是当前用户和当前ip
		final List<SessionInformation> sessions = sessionRegistry.getAllSessions(smartPrincipal, false);

		int sessionCount = sessions.size();
		int allowedSessions = getMaximumSessionsForThisUser(authentication);

		if (sessionCount < allowedSessions) {
			// They haven't got too many login sessions running at present
			return;
		}

		if (allowedSessions == -1) {
			// We permit unlimited logins
			return;
		}

		if (sessionCount == allowedSessions) {
			HttpSession session = request.getSession(false);

			if (session != null) {
				// Only permit it though if this request is associated with one
				// of the already registered sessions
				// 当同个session的时候返回
				for (SessionInformation si : sessions) {
					if (si.getSessionId().equals(session.getId())) {
						return;
					}
				}
			}
			// If the session is null, a new one will be created by the parent
			// class, exceeding the allowed number
		}

		// verify the ip value in the smartPrincipal
		boolean sameIp = false;
		// List<Object> allPrincipals = sessionRegistry.getAllPrincipals();
		List<Object> allPrincipals = ((CustomSessionRegistry) sessionRegistry).getAllPrincipalsWithIp(smartPrincipal);

		for (Object savedPrincipal : allPrincipals) {
			// 如果会话中已经存在了同个IP同个张户的Session
			if (smartPrincipal.equals(savedPrincipal) && smartPrincipal.equalsIp((CustomPrincipal) savedPrincipal)) {
				sameIp = true;
				break;
			}
		}
		// ������һ������sameIp
		allowableSessionsExceeded(sessions, allowedSessions, sessionRegistry, sameIp);
	}

	/**
	 * Method intended for use by subclasses to override the maximum number of
	 * sessions that are permitted for a particular authentication. The default
	 * implementation simply returns the <code>maximumSessions</code> value for
	 * the bean.
	 *
	 * @param authentication
	 *            to determine the maximum sessions for
	 *
	 * @return either -1 meaning unlimited, or a positive integer to limit
	 *         (never zero)
	 */
	protected int getMaximumSessionsForThisUser(Authentication authentication) {
		return maximumSessions;
	}

	/**
	 * Allows subclasses to customise behaviour when too many sessions are
	 * detected.
	 *
	 * @param sessions
	 *            either <code>null</code> or all unexpired sessions associated
	 *            with the principal
	 * @param allowableSessions
	 *            the number of concurrent sessions the user is allowed to have
	 * @param registry
	 *            an instance of the <code>SessionRegistry</code> for subclass
	 *            use
	 *
	 */
	protected void allowableSessionsExceeded(List<SessionInformation> sessions, int allowableSessions,
			SessionRegistry registry, boolean sameIp) throws SessionAuthenticationException {
		// 如果ip相同就执行下去
		if (!sameIp) {
			// 不踢出以前的用户，当前用户不能登录
			if (exceptionIfMaximumExceeded || (sessions == null)) {
				throw new SessionAuthenticationException(messages.getMessage(
						"ConcurrentSessionControllerImpl.exceededAllowed",
						new Object[] { new Integer(allowableSessions) }, "Maximum sessions of " + allowableSessions
								+ " for this principal exceeded"));
			}
		}

		// if (exceptionIfMaximumExceeded || (sessions == null)) {
		// throw new SessionAuthenticationException(messages.getMessage(
		// "ConcurrentSessionControllerImpl.exceededAllowed",
		// new Object[] { new Integer(allowableSessions) },
		// "Maximum sessions of {0} for this principal exceeded"));
		// }

		// 当踢出前面登录的用户时，要把所有ip相同的session都抛出才可以
		SessionInformation leastRecentlyUsed = null;

		// 获取到最先登录到的用户
		for (int i = 0; i < sessions.size(); i++) {
			if ((leastRecentlyUsed == null)
					|| sessions.get(i).getLastRequest().before(leastRecentlyUsed.getLastRequest())) {
				leastRecentlyUsed = sessions.get(i);
			}
		}

		// 如果另外台机器B登录，并且A机器上超过规定的最大会话数时
		if (sessions.size() > allowableSessions && !sameIp) {

			CustomPrincipal smartPrincipal = (CustomPrincipal) leastRecentlyUsed.getPrincipal();

			// 然后获取和最先的SessionInformation 的ip相同的SessionInformation
			for (int i = 0; i < sessions.size(); i++) {
				if (sessions.get(i).getPrincipal().equals(leastRecentlyUsed.getPrincipal())) {
					if (smartPrincipal.equalsIp((CustomPrincipal) (sessions.get(i).getPrincipal()))) {
						sessions.get(i).expireNow();
					}
				}
			}
			leastRecentlyUsed.expireNow();
		} else if (!sameIp) {// 如果第二次进来是同台机器，就不设过期
			leastRecentlyUsed.expireNow();
		} else {
			// leastRecentlyUsed.expireNow();
		}

		// Determine least recently used session, and mark it for invalidation
		// SessionInformation leastRecentlyUsed = null;
		//
		// //��ȡ�����ȵ�¼�����û�
		// for (int i = 0; i < sessions.size(); i++) {
		// if ((leastRecentlyUsed == null)
		// || sessions.get(i).getLastRequest().before(
		// leastRecentlyUsed.getLastRequest())) {
		// leastRecentlyUsed = sessions.get(i);
		// }
		// }
		//
		// leastRecentlyUsed.expireNow();
	}

	@Override
	protected void onSessionChange(String originalSessionId, HttpSession newSession, Authentication auth) {
		// Update the session registry
		sessionRegistry.removeSessionInformation(originalSessionId);
		sessionRegistry.registerNewSession(newSession.getId(), auth.getPrincipal());
	}

	/**
	 * Sets the <tt>exceptionIfMaximumExceeded</tt> property, which determines
	 * whether the user should be prevented from opening more sessions than
	 * allowed. If set to <tt>true</tt>, a
	 * <tt>SessionAuthenticationException</tt> will be raised.
	 *
	 * @param exceptionIfMaximumExceeded
	 *            defaults to <tt>false</tt>.
	 */
	public void setExceptionIfMaximumExceeded(boolean exceptionIfMaximumExceeded) {
		this.exceptionIfMaximumExceeded = exceptionIfMaximumExceeded;
	}

	/**
	 * Sets the <tt>maxSessions</tt> property. The default value is 1. Use -1
	 * for unlimited sessions.
	 *
	 * @param maximumSessions
	 *            the maximimum number of permitted sessions a user can have
	 *            open simultaneously.
	 */
	public void setMaximumSessions(int maximumSessions) {
		Assert.isTrue(maximumSessions != 0,
				"MaximumLogins must be either -1 to allow unlimited logins, or a positive integer to specify a maximum");
		this.maximumSessions = maximumSessions;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messages = new MessageSourceAccessor(messageSource);
	}

	@Override
	public final void setAlwaysCreateSession(boolean alwaysCreateSession) {
		if (!alwaysCreateSession) {
			throw new IllegalArgumentException("Cannot set alwaysCreateSession to false when concurrent session "
					+ "control is required");
		}
	}

	public SessionRegistry getSessionRegistry() {
		return sessionRegistry;
	}

	public void setSessionRegistry(SessionRegistry sessionRegistry) {
		this.sessionRegistry = sessionRegistry;
	}
}
