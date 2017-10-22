package com.sjq.common.es.enumeration;

/**
 * 
 * bool查询类型 must/should/mustnot
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午3:57:53
 * @version 1.0
 */
public enum ESBoolQueryType {

    /**
     * MUST
     */
    MUST(),

    /**
     * SHOULD
     */
    SHOULD(),

    /**
     * MUST_NOT
     */
    MUST_NOT();

    ESBoolQueryType() {
    }
}
