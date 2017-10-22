package com.sjq.common.es.lucene.ikanalyzer.org.wltea.analyzer.lucene;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Tokenizer;

/**
 * 
 * IK分词器，Lucene Analyzer接口实现 兼容Lucene 4.0版本
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午4:55:58
 * @version 1.0
 */
public final class IKAnalyzer extends Analyzer {

    private boolean useSmart;

    /**
     * IK分词器Lucene Analyzer接口实现类
     *
     * 默认细粒度切分算法
     */
    public IKAnalyzer() {
        this(false);
    }

    /**
     * IK分词器Lucene Analyzer接口实现类
     *
     * @param useSmart
     *            当为true时，分词器进行智能切分
     */
    public IKAnalyzer(boolean useSmart) {
        super();
        this.useSmart = useSmart;
    }

    /**
     * useSmart
     * 
     * @return
     */
    public boolean useSmart() {
        return useSmart;
    }

    /**
     * setUseSmart
     * 
     * @param useSmart
     */
    public void setUseSmart(boolean useSmart) {
        this.useSmart = useSmart;
    }

    /**
     * 重载Analyzer接口，构造分词组件
     */
    @Override
    protected TokenStreamComponents createComponents(String fieldName, final Reader in) {
        Tokenizer ikTokenizer = new IKTokenizer(in, this.useSmart());
        return new TokenStreamComponents(ikTokenizer);
    }

}
