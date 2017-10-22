package com.sjq.security.servlet;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import com.sjq.security.bean.SecurityUserLoginLog;
import com.sjq.security.util.CustomUser;


/**
 * 
 * Spring监听器
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:39:29
 * @version 1.0
 */
public class SpringListener implements ApplicationListener {
	private final int DISTANCE_HOUR = 24;

	private ServletContext servletContext;


	// @Autowired
	// private LogFacade logFacade;

	public ServletContext getServletContext() {
		return servletContext;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public void onApplicationEvent(ApplicationEvent event) {
		// 輸入了錯誤的密碼以致登錄失敗
		if (event instanceof AuthenticationFailureBadCredentialsEvent) {
			AuthenticationFailureBadCredentialsEvent authEvent = (AuthenticationFailureBadCredentialsEvent) event;
			Authentication authentication = (Authentication) authEvent.getSource();

			String username = (String) authentication.getPrincipal();
			addBadCount(username);
		}

		// 登錄成功(後於UserDetails.loadUserByUsername執行)　
		if (event instanceof AuthenticationSuccessEvent) {
			AuthenticationSuccessEvent authEvent = (AuthenticationSuccessEvent) event;
			Authentication authentication = (Authentication) authEvent.getSource();

			CustomUser userInfo = (CustomUser) authentication.getPrincipal();
			String username = userInfo.getUsername();
			cleanBadCount(username);

			// 登錄日誌
			SecurityUserLoginLog model = new SecurityUserLoginLog();
//			model.setCompanyCode(userInfo.getCompanyCode());
//			model.setUserId(userInfo.getUserId());
//			model.setCode(userInfo.getUsername());
//			model.setName(userInfo.getNameOfUser());
			model.setLoginTime(new Date());

//			securityFacade.createSecurityUserLoginLog(model);
		}
	}

	/**
	 * 将登录用户失败次数累加
	 * @param username
	 */
	private void addBadCount(String username) {
		Map<String, LockObject> lockUserMap = getLockUserMap();

		LockObject lo = lockUserMap.get(username);

		if (lo == null) {
			LockObject newo = new LockObject();
			newo.setRecdate(new Date());
			newo.setCount(Integer.valueOf(1));

			lockUserMap.put(username, newo);
		} else {
			Date lastDate = lo.getRecdate();
			Integer count = lo.getCount();

			// 每24小时需要清空用户login时错误密码记录 （未足三次时）
			Hours hours = Hours.hoursBetween(new DateTime(lastDate), new DateTime(new Date()));

			int resultCount = count.intValue() + 1;
			if (hours.getHours() >= DISTANCE_HOUR) {
				resultCount = 1;
			}

			System.out.println("onApplicationEventcount..............." + username + "......" + resultCount);

			// 达到三次就锁定用户
			if (resultCount > 3) {
				// securityFacade.lockSecurityUserByCode(username);
			} else {
				LockObject newo = new LockObject();
				newo.setRecdate(new Date());
				newo.setCount(Integer.valueOf(resultCount));

				lockUserMap.put(username, newo);
			}
		}
	}

	/**
	 * 登录成功后，将登录用户失败次数全部清零
	 * @param username
	 */
	private void cleanBadCount(String username) {
		Map<String, LockObject> lockUserMap = getLockUserMap();

		if (lockUserMap.containsKey(username)) {
			lockUserMap.remove(username);
		}
	}

	/**
	 * 将用户登录错误次数保存在Servletcontext中
	 * @return
	 */
	private Map<String, LockObject> getLockUserMap() {
		Map<String, LockObject> lockUserMap = (Map<String, LockObject>) servletContext.getAttribute("LOCK_USER_MAP");

		if (lockUserMap == null) {
			lockUserMap = new HashMap<String, LockObject>();
			servletContext.setAttribute("LOCK_USER_MAP", lockUserMap);
		}

		return lockUserMap;
	}
}
