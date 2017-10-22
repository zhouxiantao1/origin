package com.sjq.student.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.student.dao.ExamStudentMapper;
import com.sjq.student.service.ExamStudentService;
import com.sjq.student.bean.ExamStudentBean;
import com.sjq.student.search.ExamStudentSearch;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现线上考试-考生信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:49
 * @version 1.0
 */
 
@Service("ExamStudentService")
public class ExamStudentServiceImpl implements ExamStudentService {
	

	@Autowired
	private ExamStudentMapper examStudentMapper;
	
				
	
	/**
	 * 根据ID查询线上考试-考生信息信息
	 * @return
	 */
	public ExamStudentVo queryExamStudentById(Long id){
		
		return this.examStudentMapper.queryExamStudentById(id);

	}
	

	/**
	 * 根据条件查询所有线上考试-考生信息信息
	 * @param map
	 * @return
	 */
	public List<ExamStudentVo> queryExamStudentBySearch(ExamStudentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examType",search.getExamType());
  		map.put("isSubmit", search.getIsSubmit());
  		map.put("subjectId", search.getSubjectId());
  		map.put("gradeId", search.getGradeId());
  		map.put("examName", search.getExamName());
  		map.put("studentId", search.getStudentId());
		return this.examStudentMapper.queryExamStudentBySearch(map);
	}
	
				
	
	/**
	 * (删除)根据条件删除线上考试-考生信息信息
	 * @param map
	 * @return
	 */
	public int deleteExamStudentBySearch(ExamStudentBean bean,ExamStudentSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bean",bean);
		map.put("search", search);
		return this.examStudentMapper.deleteExamStudentBySearch(map);
		
	}
	
				
	/**
	 * (更新)根据ID更新所有线上考试-考生信息信息
	 * @param bean
	 * @return
	 */
	public int updateExamStudentById(ExamStudentBean bean){
		
		return this.examStudentMapper.updateExamStudentById(bean);
		
	}
	
				
	
	/**
	 * (更新)根据条件更新所有线上考试-考生信息信息
	 * @param map
	 * @return
	 */
	public int updateExamStudentBySearch(ExamStudentBean bean,ExamStudentSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.examStudentMapper.updateExamStudentBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加线上考试-考生信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamStudent(ExamStudentBean bean){
	
		
		return this.examStudentMapper.insertExamStudent(bean);
		
	}


	public PageBean queryExamStudentByPage(PageBean pb, ExamStudentSearch search) {
		// 定义一个HashMap集合
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examType",search.getExamType());
  		map.put("isSubmit", search.getIsSubmit());
  		map.put("subjectId", search.getSubjectId());
  		map.put("gradeId", search.getGradeId());
  		map.put("examName", search.getExamName());
  		map.put("studentId", search.getStudentId());
  		map.put("districtId", search.getDistrictId());
  		map.put("schoolId", search.getSchoolId());
  		map.put("classId", search.getClassId());
  		map.put("examRange", search.getExamRange());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examStudentMapper.queryExamStudentByPageTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.examStudentMapper.queryExamStudentByPage(map));
           
        // 返回pageBean
        return pb;
	}


	@Override
	public PageBean queryDistinctExamStudentPage(PageBean pb, ExamStudentSearch search) {
		// 定义一个HashMap集合
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("examType",search.getExamType());
  		map.put("isSubmit", search.getIsSubmit());
  		map.put("subjectId", search.getSubjectId());
  		map.put("gradeId", search.getGradeId());
  		map.put("examName", search.getExamName());
  		map.put("studentId", search.getStudentId());
  		map.put("districtId", search.getDistrictId());
  		map.put("schoolId", search.getSchoolId());
  		map.put("classId", search.getClassId());
  		map.put("examRange", search.getExamRange());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examStudentMapper.queryDistinctExamStudentTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.examStudentMapper.queryDistinctExamStudentPage(map));
           
        // 返回pageBean
        return pb;
	}
	
	
	
}
