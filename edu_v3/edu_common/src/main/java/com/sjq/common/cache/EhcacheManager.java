package com.sjq.common.cache;

import java.net.URL;

import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sjq.common.util.spring.SpringContextUtil;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhcacheManager {

	/**
	 * 延迟加载单例模式
	 */
	public static volatile CacheManager cacheManager = null;

	

	/**
	 * 创建单例
	 */
	public static synchronized CacheManager getInstance() {
		
		if (cacheManager == null) {
			
			// 从Spring上下文环境取Bean
			 ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/com/sjq/web/config/spring/applicationContext.xml");
			 EhCacheCacheManager ehCacheManager = (EhCacheCacheManager) ac.getBean("cacheManager");
			
			 cacheManager = ehCacheManager.getCacheManager();
			
		}
		
		return cacheManager;
		
		
	}

	/**
	 * @return
	 */
	public static CacheManager getCacheManager() {
		return getInstance();
	}

	/**
	 * 存值
	 * @param element
	 */
	public static void put(Element element) {
		CacheManager cacheManager = getCacheManager();
		Cache cache = cacheManager.getCache("userCache");

		cache.put(element);
	}

	/**
	 * 取值 
	 * @param elementKey
	 * @return
	 */
	public static Object getElement(String elementKey) {
		CacheManager cacheManager = getCacheManager();
		Cache cache = cacheManager.getCache("userCache");

		if (cache == null) {
			return null;
		} else {
			Element element = cache.get(elementKey);

			if (element == null) {
				return null;
			} else {
				Object obj = element.getObjectValue();
				return obj;
			}
		}
	}

	/**
	 * 把所有cache中的内容删除，但是cache对象还是保留
	 */
	public static void clearAll() {
		getCacheManager().clearAll();
	}

	/**
	 * 把所有cache对象都删除
	 */
	public static void removeAllCaches() {
		getCacheManager().removalAll();
	}

	/**
	 * 不用缓存时，要关闭，不然会占用cpu和内存资源
	 */
	public static void shutdown() {
		getCacheManager().shutdown();
	}
}
