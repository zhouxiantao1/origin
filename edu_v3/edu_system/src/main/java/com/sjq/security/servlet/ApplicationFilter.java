package com.sjq.security.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;

import com.sjq.common.util.spring.SpringContextUtil;
import com.sjq.security.bean.SecurityOperationLogBean;
import com.sjq.security.constant.Constant;
import com.sjq.security.service.SecurityOperationLogService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;


/**
 * 
 * 主要用于记录操作日志
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:38:19
 * @version 1.0
 */
public class ApplicationFilter implements Filter {
	
	// private final Logger logger = LoggerFactory.getLogger(ApplicationFilter.class);

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		request.setCharacterEncoding("UTF-8");

		HttpServletRequest httpRequest = (HttpServletRequest) request;

		StringBuilder data = new StringBuilder();
		if ("post".equalsIgnoreCase(httpRequest.getMethod())) {
			data.append("[POST]:");
		} else if ("get".equalsIgnoreCase(httpRequest.getMethod())) {
			data.append("[GET]:");
		}

		StringBuilder sb = new StringBuilder("?");
		for (Enumeration e = request.getParameterNames(); e.hasMoreElements();) {
			String param = (String) e.nextElement();
			sb.append(param).append("=").append(request.getParameter(param)).append("&");
		}

		String queryString = sb.toString().substring(0, sb.length() - 1);
		
		ApplicationContext ac = SpringContextUtil.getApplicationContext(httpRequest.getSession().getServletContext());
		SecurityOperationLogService securityOperationLogService = (SecurityOperationLogService) ac.getBean("SecurityOperationLogService");

		SecurityOperationLogBean solb = new SecurityOperationLogBean();

		CustomUser customUser = SpringSecurityUtils.getCurrentCustomUser();
		System.out.println("customUser.ApplicationFilter.." + customUser);

		if (customUser != null) {
			solb.setUserCode(customUser.getUsername());
			solb.setUserName(customUser.getNameOfUser());
			solb.setCreateName(customUser.getUserId().toString());
			solb.setCreateTime(new Date());
		} 

		
		// IP
		String ip = httpRequest.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = httpRequest.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = httpRequest.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = httpRequest.getRemoteAddr();
		}
		
		solb.setIp(ip);
		solb.setOperateTime(new Date());
		solb.setOperateUrl(data + httpRequest.getRequestURI());
		solb.setOperateData(queryString);
		

		securityOperationLogService.insertSecurityOperationLog(solb);

		chain.doFilter(request, response);
	}

	public void destroy() {
	}

}
