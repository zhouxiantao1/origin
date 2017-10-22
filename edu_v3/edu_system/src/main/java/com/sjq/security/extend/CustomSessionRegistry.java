package com.sjq.security.extend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * 扩展SessionRegistryImpl
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:33:48
 * @version 1.0
 */
@Service("customSessionRegistry")
public class CustomSessionRegistry extends SessionRegistryImpl {
	public synchronized void registerNewSession(String sessionId, Object principal) {
		if (!(principal instanceof CustomPrincipal)) {
			principal = new CustomPrincipal(SecurityContextHolder.getContext().getAuthentication());
		}

		super.registerNewSession(sessionId, principal);
	}

	public List<Object> getAllPrincipalsWithIp(CustomPrincipal smartPrincipal) {
		List<SessionInformation> sessions = getAllSessions(smartPrincipal, false);

		List<Object> allPrincipals = new ArrayList<Object>();
		for (SessionInformation sessionInformation : sessions) {
			allPrincipals.add(sessionInformation.getPrincipal());
		}
		return allPrincipals;
	}
}
