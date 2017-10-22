package com.sjq.common.util.spring;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 
 * 使用spring的webapplicationcontextutils通过request获得容器中的对象
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日上午11:41:08
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

