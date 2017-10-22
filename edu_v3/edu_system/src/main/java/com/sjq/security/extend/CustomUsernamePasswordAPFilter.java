package com.sjq.security.extend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.TextEscapeUtils;
import org.springframework.util.Assert;

import com.sjq.security.constant.Constant;

/**
 * 自定义表单登录器，扩展usernamepasswordauthenticationfiler
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:36:36
 * @version 1.0
 */
public class CustomUsernamePasswordAPFilter extends UsernamePasswordAuthenticationFilter {
	// private final String SPLIT = "\t";
		// private static final String SPRING_SECURITY_FORM_COMPANY_KEY = "j_company";
		// private static final String SPRING_SECURITY_FORM_JUNKET_KEY = "j_junket";
		// private static final String SPRING_SECURITY_FORM_MAC_KEY = "j_mac";
		// private static final String SPRING_SECURITY_FORM_IP_KEY = "j_ip";
		private static final String SPRING_SECURITY_FORM_VALIDATECODE_KEY = "j_validateCode";

		// private String companyParameter = SPRING_SECURITY_FORM_COMPANY_KEY;
		// private String junketParameter = SPRING_SECURITY_FORM_JUNKET_KEY;
		// private String macParameter = SPRING_SECURITY_FORM_MAC_KEY;
		// private String ipParameter = SPRING_SECURITY_FORM_IP_KEY;
		private String validatecodeParameter = SPRING_SECURITY_FORM_VALIDATECODE_KEY;

		private boolean postOnly = true;

		@Override
		public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
				throws AuthenticationException {
			if (postOnly && !request.getMethod().equals("POST")) {
				throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
			}

			// String company = obtainCompany(request);
			// String mac = obtainMac(request);
			// String ip = obtainIp(request);
			String userName = obtainUsername(request);
			String password = obtainPassword(request);
			String validatecode = obtainValidatecode(request);

			if (StringUtils.isBlank(userName)) {
				userName = "";

				throw new AuthenticationServiceException("请输入用户号。 ");
			}

			if (StringUtils.isBlank(password)) {
				password = "";

				throw new AuthenticationServiceException("请输入密码。");
			}

			if (StringUtils.isBlank(validatecode)) {
				validatecode = "";

				throw new AuthenticationServiceException("请输入校验码。");
			}

			userName = userName.trim();
			password = password.trim();
			validatecode = validatecode.trim();

			String sessionValidatecode = (String) request.getSession().getAttribute(
					Constant.IMAGE_VALIDATE_CODE_SESSION_KEY);

			// 校驗碼不分大小寫
			if (!validatecode.equalsIgnoreCase(sessionValidatecode)) {
				validatecode = "";

				throw new AuthenticationServiceException("错误的校验码，请重新输入");
			}


			// 将公司及用户名称合并，以便 可能通过usernamepasswordauthenticationtoken传返信息
			// 用户名称、密码将禁止包含@分隔符
			// String companyAndJunketAndUsername = company + SPLIT + mac + SPLIT + ip + SPLIT + userName;

			UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(userName, password);

			// Place the last username attempted into HttpSession for views
			HttpSession oldSession = request.getSession(false);
			if (oldSession != null || getAllowSessionCreation()) {
				request.getSession().setAttribute(SPRING_SECURITY_LAST_USERNAME_KEY,
						TextEscapeUtils.escapeEntities(userName));
			}

			// Allow subclasses to set the "details" property
			setDetails(request, authRequest);

			// AbstractAuthenticationManager
			// 交由AuthenticationManager验证用户信息
			return this.getAuthenticationManager().authenticate(authRequest);
		}

		// protected String obtainCompany(HttpServletRequest request) {
		// return request.getParameter(companyParameter);
		// }
		//
		// protected String obtainJunket(HttpServletRequest request) {
		// return request.getParameter(junketParameter);
		// }
		//
		// protected String obtainMac(HttpServletRequest request) {
		// return request.getParameter(macParameter);
		// }
		//
		// protected String obtainIp(HttpServletRequest request) {
		// return request.getParameter(ipParameter);
		// }

		protected String obtainValidatecode(HttpServletRequest request) {
			return request.getParameter(validatecodeParameter);
		}

		// public void setCompanyParameter(String companyParameter) {
		// this.companyParameter = companyParameter;
		// Assert.hasText(companyParameter, "companyParameter parameter must not be empty or null");
		// }
		//
		// public String getCompanyParameter() {
		// return companyParameter;
		// }
		//
		// public String getJunketParameter() {
		// return junketParameter;
		// }
		//
		// public String getMacParameter() {
		// return macParameter;
		// }
		//
		// public String getIpParameter() {
		// return ipParameter;
		// }

		public String getValidatecodeParameter() {
			return validatecodeParameter;
		}

		// public void setJunketParameter(String junketParameter) {
		// this.junketParameter = junketParameter;
		// Assert.hasText(companyParameter, "junketParameter parameter must not be empty or null");
		// }
		//
		// public void setMacParameter(String macParameter) {
		// this.macParameter = macParameter;
		// Assert.hasText(macParameter, "macParameter parameter must not be empty or null");
		// }
		//
		// public void setIpParameter(String ipParameter) {
		// this.ipParameter = ipParameter;
		// Assert.hasText(ipParameter, "ipParameter parameter must not be empty or null");
		// }

		public void setValidatecodeParameter(String validatecodeParameter) {
			this.validatecodeParameter = validatecodeParameter;
			Assert.hasText(validatecodeParameter, "validatecodeParameter parameter must not be empty or null");
		}

		public boolean isPostOnly() {
			return postOnly;
		}

		@Override
		public void setPostOnly(boolean postOnly) {
			this.postOnly = postOnly;
		}
}
