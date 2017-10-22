package com.sjq.offpaperconf.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.offpaperconf.dao.OffPaperConfMapper;
import com.sjq.offpaperconf.vo.OffPaperConfBean;

/**
 * 
 * @ClassName:OffPaperConfMapperImp
 * @Description:线下考试试卷配置daoImp
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:23:34
 * @version 1.0
 */
@Repository("OffPaperConfMapper")
public class OffPaperConfMapperImpl extends BasicSqlSupport implements OffPaperConfMapper {

	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param map
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllQuestionNo(Map<String, Object> map) {
		return this.selectList("com.sjq.offpaperconf.dao.OffPaperConfMapper.queryAllQuestionNo",map);
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
		return this.selectList("com.sjq.offpaperconf.dao.OffPaperConfMapper.queryAllAbility",map);
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
		return this.selectList("com.sjq.offpaperconf.dao.OffPaperConfMapper.queryAllPoint",map);
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
		return this.selectList("com.sjq.offpaperconf.dao.OffPaperConfMapper.queryAllType",map);
	}

	/**
	 * 
	 * @MethodName:insertOffPaperConfBatch
	 * @Description:批量添加
	 * @param offPaperConfBeanList
	 * @return
	 */
	public int insertOffPaperConfBatch(List<OffPaperConfBean> offPaperConfBeanList) {
		return this.insert("com.sjq.offpaperconf.dao.OffPaperConfMapper.insertOffPaperConfBatch", offPaperConfBeanList);
	}

	@Override
	public int deleteOffPaperConfBatch(Map<String, Object> map) {
		return this.delete("com.sjq.offpaperconf.dao.OffPaperConfMapper.deleteOffPaperConfBatch", map);
	}

}
