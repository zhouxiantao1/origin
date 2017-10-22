package com.sjq.common.es.query;

import org.elasticsearch.index.query.QueryBuilder;

import com.sjq.common.es.enumeration.ESBoolQueryType;

/**
 * 
 * bool查询单元接口
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午4:38:32
 * @version 1.0
 */
public interface IQueryItemUnit {

    /**
     * 获取查询bool类型
     * 
     * @return {@link ESBoolQueryType}
     */
    ESBoolQueryType boolQueryType();

    /**
     * 获取QueryBuilder
     * 
     * @return {@link QueryBuilder}
     */
    QueryBuilder buildQuery();
}
