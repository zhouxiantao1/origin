package com.sjq.exam.offline.servlet.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.exam.offline.bean.OfflinePaperConfBean;
import com.sjq.exam.offline.dao.OfflinePaperConfMapper;
import com.sjq.exam.offline.servlet.OfflinePaperConfService;

/**
 * 
 * @ClassName:OfflinePaperConfServiceImpl
 * @Description:线下考试试卷配置ServiceImpl
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:25:55
 * @version 1.0
 */
@Service("OfflinePaperConfService")
public class OfflinePaperConfServiceImpl implements OfflinePaperConfService {

	@Autowired
	private OfflinePaperConfMapper offlinePaperConfMapper;
	
	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllQuestionNo(String examCode, String subjectCode) {
		
		if(examCode == null || subjectCode == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examCode", examCode);
		map.put("subjectCode", subjectCode);
		
		return offlinePaperConfMapper.queryAllQuestionNo(map);
	}

	/**
	 * 
	 * @MethodName:queryAllAbility
	 * @Description:根据考试编码及学科编码，获取对应的所有认知层次
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllAbility(String examCode, String subjectCode) {
		if(examCode == null || subjectCode == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examCode", examCode);
		map.put("subjectCode", subjectCode);
		
		return offlinePaperConfMapper.queryAllAbility(map);
	}

	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有知识模块
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */	
	public List<String> queryAllPoint(String examCode, String subjectCode) {
		if(examCode == null || subjectCode == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examCode", examCode);
		map.put("subjectCode", subjectCode);
		
		return offlinePaperConfMapper.queryAllPoint(map);
	}

	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有题型
	 * @param examCode
	 * @param subjectCode
	 * @return List<String>
	 * @throws
	 */	
	public List<String> queryAllType(String examCode, String subjectCode) {
		if(examCode == null || subjectCode == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examCode", examCode);
		map.put("subjectCode", subjectCode);
		
		return offlinePaperConfMapper.queryAllType(map);
	}

	/**
	 * 
	 * @MethodName:insertOfflinePaperConfBatch
	 * @Description:批量插入
	 * @param offlinePaperConfBeanList
	 * @return
	 */
	public int insertOfflinePaperConfBatch(List<OfflinePaperConfBean> offlinePaperConfBeanList) {
		return offlinePaperConfMapper.insertOfflinePaperConfBatch(offlinePaperConfBeanList);
	}

}
