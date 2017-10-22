package com.sjq.common.es.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.sjq.common.es.enumeration.ESAnalyzer;
import com.sjq.common.es.enumeration.ESFieldType;


/**
 * 
 * ES DOC FIELD注解
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午4:00:38
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ESField {
    /**
     * 字段名称
     * 
     * @return
     */
    public String fieldName() default "";

    /**
     * 字段类型,默认为string
     * 
     * @return
     */
    public ESFieldType fieldType() default ESFieldType.STRING;

    /**
     * 分词器,默认不进行分词
     * 
     * @return
     */
    ESAnalyzer analyzerType() default ESAnalyzer.not_analyzed;

    /**
     * 是否存储,默认为是
     * 
     * @return
     */
    public boolean isStore() default true;
}
