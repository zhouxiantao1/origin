package com.sjq.type.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.type.bean.QuestionTypeBean;
import com.sjq.type.dao.QuestionTypeMapper;
import com.sjq.type.service.QuestionTypeService;
import com.sjq.type.search.QuestionTypeSearch;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现题库模块-题型信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-28 19:53:48
 * @version 1.0
 */
 
@Service("QuestionTypeService")
public class QuestionTypeServiceImpl implements QuestionTypeService {
	

	@Autowired
	private QuestionTypeMapper questionTypeMapper;
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryQuestionTypePage(PageBean pb,QuestionTypeSearch search){
		
		// 定义一个HashMap集合
        Map map = new HashMap();
  		map.put("id",search.getId());
  		map.put("typeName",search.getTypeName());
  		map.put("isObjective",search.getIsObjective());
  		map.put("markingCode",search.getMarkingCode());
  		map.put("status",search.getStatus());
  		map.put("subjectId",search.getSubjectId());
	
        // 设置PageBean的行数参数
        pb.setRows(this.questionTypeMapper.queryQuestionTypeTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.questionTypeMapper.queryQuestionTypePage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
	/**
	 * 根据条件查询题库模块-题型信息count总数
	 * @param map
	 * @return
	 */
	public int queryQuestionTypeTotalCount(QuestionTypeSearch search){
		
		Map map = new HashMap();
  		map.put("id",search.getId());
  		map.put("typeName",search.getTypeName());
  		map.put("isObjective",search.getIsObjective());
  		map.put("markingCode",search.getMarkingCode());
  		map.put("status",search.getStatus());
  		map.put("subjectId",search.getSubjectId());
		
		return this.questionTypeMapper.queryQuestionTypeTotalCount(map);
	}
	
	/**
	 * (增加)增加题库模块-题型信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertQuestionType(QuestionTypeBean bean){
	
		
		return this.questionTypeMapper.insertQuestionType(bean);
		
	}
	
	/**
	 * 查询所有的题库模块-题型信息信息
	 * @return
	 */
	public List<QuestionTypeVo> queryAllQuestionType(){
		
		return this.questionTypeMapper.queryAllQuestionType();
	
	}
				
				
	
	/**
	 * 根据ID查询题库模块-题型信息信息
	 * @return
	 */
	public QuestionTypeVo queryQuestionTypeById(Long id){
		
		return this.questionTypeMapper.queryQuestionTypeById(id);

		
	}
	
	/**
	 * 根据学科id查询题库模块-题型信息信息
	 * @return
	 */
	public List<QuestionTypeVo> queryQuestionTypeBySubjectId(Long subjectId){
		
		return this.questionTypeMapper.queryQuestionTypeBySubjectId(subjectId);

	}



	public List<QuestionTypeVo> queryQuestionTypeBySearch(QuestionTypeSearch search) {
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("subjectId",search.getSubjectId());
  		map.put("isObjective",search.getIsObjective());
  		map.put("markingCode",search.getMarkingCode());
		
		return this.questionTypeMapper.queryQuestionTypeBySearch(map);
	}
	
	

	
	
}
