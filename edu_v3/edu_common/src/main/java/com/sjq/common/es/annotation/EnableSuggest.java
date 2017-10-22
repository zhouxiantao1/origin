package com.sjq.common.es.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.sjq.common.es.enumeration.ESAnalyzer;


/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午4:00:24
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnableSuggest {

    String suggestName() default "suggest";

    /**
     * 分词器
     * @return {@link ESAnalyzer}
     */
    ESAnalyzer analyzerType() default ESAnalyzer.not_analyzed;

}
