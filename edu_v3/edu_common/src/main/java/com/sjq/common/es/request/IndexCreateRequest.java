package com.sjq.common.es.request;


import java.util.List;

import com.sjq.common.es.bean.ESSource;
import com.sjq.common.es.bean.IESMappingType;


/**
 * 
 * 创建索引请求包装
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午4:15:06
 * @version 1.0
 */
public class IndexCreateRequest {

    /**
     * 索引名称
     */
    private String index;

    /**
     * 索引下的数据
     */
    private List<ESSource> sources;

    /**
     * 索引的数据类型,
     */
    private Class<? extends IESMappingType> esMapType;

    /**
     * 无参构造函数
     */
    public IndexCreateRequest() {
    }

    /**
     * 一个参数的构造函数
     */
    public IndexCreateRequest(String index) {
        this.index = index;
    }

    /**
     * 两个参数的构造函数
     */
    public IndexCreateRequest(String index, List<ESSource> sources) {
        this.index = index;
        this.sources = sources;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List<ESSource> getSources() {
        return sources;
    }

    public void setSources(List<ESSource> sources) {
        this.sources = sources;
    }

    public Class getEsMapType() {
        return esMapType;
    }

    public void setEsMapType(Class<? extends IESMappingType> esMapType) {
        this.esMapType = esMapType;
    }

}
