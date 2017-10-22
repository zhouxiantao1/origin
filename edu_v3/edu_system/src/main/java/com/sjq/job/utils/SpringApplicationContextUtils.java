package com.sjq.job.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * Spring上下文环境工具
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月6日下午2:06:36
 * @version 1.0
 */
public class SpringApplicationContextUtils implements ApplicationContextAware {

	/**
	 * Spring应用上下文
	 */
	private static ApplicationContext context;

	/**
	 * 注入Spring上下文环境
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringApplicationContextUtils.context = applicationContext;
		// System.out.println("将Spring应用上下文注入到" + SpringApplicationContextUtils.class.getName());
	}

	/**
	 * 获取SPRING上下文环境
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		return context;
	}

	/**
	 * 获取SPRING对象
	 * @param name
	 * @return
	 * @throws BeansException
	 */
	public static Object getBean(String name) throws BeansException {
		return context.getBean(name);
	}

	/**
	 * 获取类型为requiredType的对象
	 * 如果bean不能被类型转换，相应的异常将会被抛出（BeanNotOfRequiredTypeException）
	 * @param name
	 * @param requiredType
	 * @return
	 * @throws BeansException
	 */
	public static Object getBean(String name, Class requiredType) throws BeansException {
		return context.getBean(name, requiredType);
	}

	/**
	 * 如果BeanFactory包含一个与所给名称匹配的bean定义，则返回true
	 * @param name
	 * @return
	 */
	public static boolean containsBean(String name) {
		return context.containsBean(name);
	}

	/**
	 * 判断以给定名字注册的bean定义是一个singleton还是一个prototype。
	 * 如果与给定名字相应的bean定义没有被找到，将会抛出一个异常（NoSuchBeanDefinitionException）
	 * @param name
	 * @return
	 * @throws NoSuchBeanDefinitionException
	 */
	public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		return context.isSingleton(name);
	}

	/**
	 * 
	 * @param name
	 * @return
	 * @throws NoSuchBeanDefinitionException
	 */
	public static Class getType(String name) throws NoSuchBeanDefinitionException {
		return context.getType(name);
	}

	/**
	 * 如果给定的bean名字在bean定义中有别名，则返回这些别名
	 * @param name
	 * @return
	 * @throws NoSuchBeanDefinitionException
	 */
	public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
		return context.getAliases(name);
	}
}
