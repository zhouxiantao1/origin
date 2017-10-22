package com.sjq.common.es.enumeration;

/**
 * es查询的方式 : match:走分词 term:不走分词,全次匹配 nested:嵌套对象查询
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午3:58:18
 * @version 1.0
 */
public enum ESQueryWay {
    /**
     * match匹配查询
     */
    MATCH(),

    /**
     * 匹配整条短语,不进行分词
     */
    MATCH_PHRASE(),

    /**
     * term查询
     */
    TERM(),

    /**
     * nest查询
     */
    NESTED(),

    /**
     * match all
     */
    MATCH_ALL();

    ESQueryWay() {
    }
}
