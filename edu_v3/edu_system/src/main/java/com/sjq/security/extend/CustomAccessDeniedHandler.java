package com.sjq.security.extend;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月8日下午5:58:16
 * @version 1.0
 */
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
	final String SPRING_SECURITY_ACCESS_DENIED_EXCEPTION_KEY = "SPRING_SECURITY_ACCESS_DENIED_EXCEPTION_KEY";

	// ~ Static fields/initializers
	// =====================================================================================

	protected static final Log logger = LogFactory.getLog(CustomAccessDeniedHandler.class);

	// ~ Instance fields
	// ================================================================================================

	private String errorPage;

	// ~ Methods
	// ========================================================================================================

	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {

		if (!response.isCommitted()) {
			if (errorPage != null) {

				// Put exception into request scope (perhaps of use to a view)
				request.setAttribute(WebAttributes.ACCESS_DENIED_403, accessDeniedException);

				// Set the 403 status code.
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);

				// response.sendError(HttpServletResponse.SC_FORBIDDEN, "闇�瑕佷笂绾ф巿鏉冦��");

				// forward to error page.
				RequestDispatcher dispatcher = request.getRequestDispatcher(errorPage);
				dispatcher.forward(request, response);
			} else {
				response.sendError(HttpServletResponse.SC_FORBIDDEN, accessDeniedException.getMessage());
			}
		}
	}

	/**
	 * The error page to use. Must begin with a "/" and is interpreted relative to the current context root.
	 *
	 * @param errorPage the dispatcher path to display
	 *
	 * @throws IllegalArgumentException if the argument doesn't comply with the above limitations
	 */
	public void setErrorPage(String errorPage) {
		if ((errorPage != null) && !errorPage.startsWith("/")) {
			throw new IllegalArgumentException("errorPage must begin with '/'");
		}

		this.errorPage = errorPage;
	}

}
