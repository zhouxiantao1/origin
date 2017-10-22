package com.sjq.common.redis.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.METHOD})  

/**
 * 
 * 若为名称相同的方法配置缓存,可以在@Cacheable中加入key属性,追加额外的key后缀
 * @Cacheable还有一个KeyMode属性,用于配置哪些参数可以追加到key后缀中,
 * 默认取值 DEFAULT:表示只有加了@CacheKey的参数才能追加到key后缀
 * BASIC:自动将基本类型追加到key后缀,而无需再配置@CacheKey
 * ALL:自动将所有参数追加到key后缀,而无需再配置@CacheKey
 * 对缓存方法配置使用缓存,缓存有效期为3600秒,缓存的key格式为:{package_name}.DemoServiceImpl.get 
 * 同时为参数配置了@CacheKey后,表示此参数的值将做为key的后缀,此例的key,最终是:{package_name}.DemoServiceImpl.get.{id} 
 * 可以为多个参数配置@CacheKey,拦截器会调用参数的toString()做为key的后缀 
 * 若配置多个@CacheKey参数,那么最终的key格式为:{package_name}.{class_name}.{method}.{arg1}.{arg2}.{...} 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午2:11:16
 * @version 1.0
 */
public @interface Cacheable {  
      
    public enum KeyMode{  
        DEFAULT,    //只有加了@CacheKey的参数,才加入key后缀中  
        BASIC,      //只有基本类型参数,才加入key后缀中,如:String,Integer,Long,Short,Boolean  
        ALL;        //所有参数都加入key后缀  
    }  
      
    public String key() default "";     //缓存key  
    public KeyMode keyMode() default KeyMode.DEFAULT;       //key的后缀模式  
    public int expire() default 0;      //缓存多少秒,默认无限期  
}  