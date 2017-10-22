package com.sjq.common.util.spring;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 
 * ʹ��spring��webapplicationcontextutilsͨ��request��������еĶ���
 * @author SJQ-ZeJie Zheng
 * @since 2017��3��9������11:41:08
 * @version 1.0
 */
public class SpringContextUtil {

	/**
	 * @param context
	 * @return
	 */
	public static ApplicationContext getApplicationContext(ServletContext context) {
		ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
		return ac;
	}
	
}

