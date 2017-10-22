package com.sjq.common.es.lucene.ikanalyzer.org.wltea.analyzer.query;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.util.Version;

import com.sjq.common.es.lucene.ikanalyzer.org.wltea.analyzer.core.IKSegmenter;
import com.sjq.common.es.lucene.ikanalyzer.org.wltea.analyzer.core.Lexeme;


/**
 * 
 * Single Word Multi Char Query Builder IK分词算法专用
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日下午4:58:03
 * @version 1.0
 */
public class SWMCQueryBuilder {

    private static final Logger LOGGER = Logger.getLogger(SWMCQueryBuilder.class);

    /**
     * 无参构造
     * */
    private SWMCQueryBuilder() {
    }

    /**
     * 生成SWMCQuery
     * 
     * @param fieldName
     * @param keywords
     * @param quickMode
     * @return Lucene Query
     */
    public static Query create(String fieldName, String keywords, boolean quickMode) {
        if (fieldName == null || keywords == null) {
            throw new IllegalArgumentException("参数 fieldName 、 keywords 不能为null.");
        }
        // 1.对keywords进行分词处理
        List<Lexeme> lexemes = doAnalyze(keywords);
        // 2.根据分词结果，生成SWMCQuery
        return getSWMCQuery(fieldName, lexemes, quickMode);
    }

    /**
     * 分词切分，并返回结链表
     * 
     * @param keywords
     * @return
     */
    private static List<Lexeme> doAnalyze(String keywords) {
        List<Lexeme> lexemes = new ArrayList<Lexeme>();
        IKSegmenter ikSeg = new IKSegmenter(new StringReader(keywords), true);
        try {
            Lexeme l = null;
            while ((l = ikSeg.next()) != null) {
                lexemes.add(l);
            }
        } catch (IOException e) {
            LOGGER.error(e.getLocalizedMessage(), e);
        }
        return lexemes;
    }

    /**
     * 根据分词结果生成SWMC搜索
     * 
     * @param fieldName
     * @param lexemes
     * @param quickMode
     * @return
     */
    private static Query getSWMCQuery(String fieldName, List<Lexeme> lexemes, boolean quickMode) {
        // 构造SWMC的查询表达式
        StringBuilder keywordBuffer = new StringBuilder();
        // 精简的SWMC的查询表达式
        StringBuilder keywordBufferShort = new StringBuilder();
        // 记录最后词元长度
        int lastLexemeLength = 0;
        // 记录最后词元结束位置
        int lastLexemeEnd = -1;

        int shortCount = 0;
        int totalCount = 0;
        for (Lexeme l : lexemes) {
            totalCount += l.getLength();
            // 精简表达式
            if (l.getLength() > 1) {
                keywordBufferShort.append(' ').append(l.getLexemeText());
                shortCount += l.getLength();
            }

            if (lastLexemeLength == 0) {
                keywordBuffer.append(l.getLexemeText());
            } else if (lastLexemeLength == 1 && l.getLength() == 1 && lastLexemeEnd == l.getBeginPosition()) {// 单字位置相邻，长度为一，合并)
                keywordBuffer.append(l.getLexemeText());
            } else {
                keywordBuffer.append(' ').append(l.getLexemeText());

            }
            lastLexemeLength = l.getLength();
            lastLexemeEnd = l.getEndPosition();
        }

        // 借助lucene queryparser 生成SWMC Query
        QueryParser qp = new QueryParser(Version.LUCENE_47, fieldName, new StandardAnalyzer(Version.LUCENE_47));
        qp.setDefaultOperator(QueryParser.AND_OPERATOR);
        qp.setAutoGeneratePhraseQueries(true);

        if (quickMode && (shortCount * 1.0f / totalCount) > 0.5f) {
            try {
                // System.out.println(keywordBuffer.toString());
                return qp.parse(keywordBufferShort.toString());
            } catch (ParseException e) {
                LOGGER.error(e.getLocalizedMessage(), e);
            }

        } else {
            if (keywordBuffer.length() > 0) {
                try {
                    // System.out.println(keywordBuffer.toString());
                    return qp.parse(keywordBuffer.toString());
                } catch (ParseException e) {
                    LOGGER.error(e.getLocalizedMessage(), e);
                }
            }
        }
        return null;
    }
}
