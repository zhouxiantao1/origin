package com.sjq.exam.offline.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.exam.offline.bean.OfflinePaperConfBean;
import com.sjq.exam.offline.dao.OfflinePaperConfMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * 
 * @ClassName:OfflinePaperConfMapperImp
 * @Description:线下考试试卷配置daoImp
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:23:34
 * @version 1.0
 */
@Repository("OfflinePaperConfMapper")
public class OfflinePaperConfMapperImpl extends BasicSqlSupport implements OfflinePaperConfMapper {

	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param map
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllQuestionNo(Map<String, Object> map) {
		return this.selectList("com.sjq.exam.offline.dao.OfflinePaperConfMapper.queryAllQuestionNo",map);
	}

	/**
	 * 
	 * @MethodName:queryAllAbility
	 * @Description:根据考试编码及学科编码，获取对应的所有认知层次
	 * @param map
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllAbility(Map<String, Object> map) {
		return this.selectList("com.sjq.exam.offline.dao.OfflinePaperConfMapper.queryAllAbility",map);
	}

	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有知识模块
	 * @param map
	 * @return List<String>
	 * @throws
	 */	
	public List<String> queryAllPoint(Map<String, Object> map) {
		return this.selectList("com.sjq.exam.offline.dao.OfflinePaperConfMapper.queryAllPoint",map);
	}

	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有题型
	 * @param map
	 * @return List<String>
	 * @throws
	 */	
	public List<String> queryAllType(Map<String, Object> map) {
		return this.selectList("com.sjq.exam.offline.dao.OfflinePaperConfMapper.queryAllType",map);
	}

	public int insertOfflinePaperConfBatch(List<OfflinePaperConfBean> offlinePaperConfBeanList) {
		return this.insert("insertOfflinePaperConfBatch", offlinePaperConfBeanList);
	}

}
