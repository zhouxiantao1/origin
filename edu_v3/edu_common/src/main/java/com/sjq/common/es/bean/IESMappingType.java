package com.sjq.common.es.bean;

import java.lang.reflect.Field;

/**
 * 
 * es 文档数据类型,所有定义为es文档的bean 必须实现该接口
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午3:59:43
 * @version 1.0
 */
public interface IESMappingType {

    /**
     * 生成文档ID
     * @return 文档ID
     */
    String generateDocId();

    /**
     * 返回该文档对象进行索引的field, 用于反射调用生成MapType
     * 
     * @return {@link Field}
     */
    public Field[] foundTypeField();
}
