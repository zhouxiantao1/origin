package com.sjq.security.extend;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;


/**
 * 
 * 该过滤器的主要作用就是通过Spring著名的IoC生成securityMetadataSource。
 * securityMetadataSource相当于本包中自定义的CustomInvocationSecurityMetadataSource。
 * 该CustomInvocationSecurityMetadataSource的作用提从数据库提取权限和资源，装配到HashMap中，
 * 供Spring Security使用，用于权限校验。
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:30:06
 * @version 1.0
 */
public class CustomFilterSecurityInterceptor extends AbstractSecurityInterceptor implements Filter {
	// 与applicationContext-security-url.xml里的customFSIFilter的属性securityMetadataSource对应
	private FilterInvocationSecurityMetadataSource securityMetadataSource;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		FilterInvocation fi = new FilterInvocation(request, response, chain);
		invoke(fi);
	}

	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

	public void setSecurityMetadataSource(FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}

	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

	public Class<? extends Object> getSecureObjectClass() {
		return FilterInvocation.class;
	}

	public void invoke(FilterInvocation fi) throws IOException, ServletException {
		InterceptorStatusToken token = super.beforeInvocation(fi);

		try {
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
		} finally {
			super.afterInvocation(token, null);
		}
	}

	public void destroy() {
	}

	public void init(FilterConfig filterconfig) throws ServletException {
	}
}
