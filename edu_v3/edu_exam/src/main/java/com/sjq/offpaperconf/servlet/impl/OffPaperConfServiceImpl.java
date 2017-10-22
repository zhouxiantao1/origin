package com.sjq.offpaperconf.servlet.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.offpaperconf.dao.OffPaperConfMapper;
import com.sjq.offpaperconf.servlet.OffPaperConfService;
import com.sjq.offpaperconf.vo.OffPaperConfBean;

/**
 * 
 * @ClassName:OfflinePaperConfServiceImpl
 * @Description:线下考试试卷配置ServiceImpl
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:25:55
 * @version 1.0
 */
@Service("OffPaperConfService")
public class OffPaperConfServiceImpl implements OffPaperConfService {

	@Autowired
	private OffPaperConfMapper offPaperConfMapper;
	
	/**
	 * 
	 * @MethodName:queryAllQuestionNo
	 * @Description:根据考试编码及学科编码，获取对应的所有小题
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllQuestionNo(Long examDetailId) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examDetailId", examDetailId);
		
		return offPaperConfMapper.queryAllQuestionNo(map);
	}

	/**
	 * 
	 * @MethodName:queryAllAbility
	 * @Description:根据考试编码及学科编码，获取对应的所有认知层次
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */
	public List<String> queryAllAbility(Long examId, Long subjectId) {
		if(examId == null || subjectId == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("subjectId", subjectId);
		
		return offPaperConfMapper.queryAllAbility(map);
	}

	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有知识模块
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */	
	public List<String> queryAllPoint(Long examId, Long subjectId) {
		if(examId == null || subjectId == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("subjectId", subjectId);
		
		return offPaperConfMapper.queryAllPoint(map);
	}

	/**
	 * 
	 * @MethodName:queryqueryAllPoint
	 * @Description:根据考试编码及学科编码，获取对应的所有题型
	 * @param examId
	 * @param subjectId
	 * @return List<String>
	 * @throws
	 */	
	public List<String> queryAllType(Long examId, Long subjectId) {
		if(examId == null || subjectId == null){
			return null;
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examId", examId);
		map.put("subjectId", subjectId);
		
		return offPaperConfMapper.queryAllType(map);
	}

	/**
	 * 
	 * @MethodName:insertOfflinePaperConfBatch
	 * @Description:批量插入
	 * @param offlinePaperConfBeanList
	 * @return
	 */
	public int insertOffPaperConfBatch(List<OffPaperConfBean> offPaperConfBeanList) {
		return offPaperConfMapper.insertOffPaperConfBatch(offPaperConfBeanList);
	}
	
	public int deleteOffPaperConfBatch(Long examId, Long examDetailId) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examId",examId);
  		map.put("examDetailId", examDetailId);
		return offPaperConfMapper.deleteOffPaperConfBatch(map);
	}

}
