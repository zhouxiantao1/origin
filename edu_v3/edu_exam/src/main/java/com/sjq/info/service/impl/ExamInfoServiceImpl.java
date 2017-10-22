package com.sjq.info.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sjq.info.dao.ExamInfoMapper;
import com.sjq.info.service.ExamInfoService;
import com.sjq.info.bean.ExamInfoBean;
import com.sjq.info.search.ExamInfoSearch;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]实现线上考试-考试信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:14
 * @version 1.0
 */
 
@Service("ExamInfoService")
public class ExamInfoServiceImpl implements ExamInfoService {
	

	@Autowired
	private ExamInfoMapper examInfoMapper;
	
	/**
	 * 查询所有的线上考试-考试信息信息
	 * @return
	 */
	public List<ExamInfoVo> queryAllExamInfo(){
		
		return this.examInfoMapper.queryAllExamInfo();
	
	}
				
				
	
	/**
	 * 根据ID查询线上考试-考试信息信息
	 * @return
	 */
	public ExamInfoVo queryExamInfoById(Long id){
		
		return this.examInfoMapper.queryExamInfoById(id);

	}
	

	/**
	 * 根据条件查询所有线上考试-考试信息信息
	 * @param map
	 * @return
	 */
	public List<ExamInfoVo> queryExamInfoBySearch(ExamInfoSearch search){
		
		Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("examName",search.getExamName());
  		map.put("gradeId",search.getGradeId());
  		map.put("examType",search.getExamType());
  		map.put("createName",search.getCreateName());
  		map.put("progress",search.getProgress());
		
		return this.examInfoMapper.queryExamInfoBySearch(map);
	}
	
				
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	public PageBean queryExamInfoPage(PageBean pb,ExamInfoSearch search){
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("examName",search.getExamName());
  		map.put("gradeId",search.getGradeId());
  		map.put("examType",search.getExamType());
  		map.put("progress",search.getProgress());
  		map.put("createName",search.getCreateName());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examInfoMapper.queryExamInfoTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.examInfoMapper.queryExamInfoPage(map));
           
        // 返回pageBean
        return pb;
		
	}
	
				
	
	/**
	 * (删除)根据ID删除线上考试-考试信息信息
	 * @param id
	 * @return
	 */
	public int deleteExamInfoById(ExamInfoBean bean){
		return this.examInfoMapper.deleteExamInfoById(bean);
	}
	
				
	
	/**
	 * (更新)根据条件更新所有线上考试-考试信息信息
	 * @param map
	 * @return
	 */
	public int updateExamInfoBySearch(ExamInfoBean bean,ExamInfoSearch search){
		
		
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bean", bean);
        map.put("search", search);
		
		return this.examInfoMapper.updateExamInfoBySearch(map);
	}
	
				
	
	/**
	 * (增加)增加线上考试-考试信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	public int insertExamInfo(ExamInfoBean bean){
	
		
		return this.examInfoMapper.insertExamInfo(bean);
		
	}



	@Override
	public PageBean queryStuedntExamInfoPage(PageBean pb, ExamInfoSearch search) {
		// 定义一个HashMap集合
        Map<String, Object> map = new HashMap<String, Object>();
  		map.put("id",search.getId());
  		map.put("examName",search.getExamName());
  		map.put("gradeId",search.getGradeId());
  		map.put("examType",search.getExamType());
  		map.put("studentId",search.getStudentId());
  		map.put("isSubmit",search.getIsSubmit());
	
        // 设置PageBean的行数参数
        pb.setRows(this.examInfoMapper.queryStudentExamInfoTotalCount(map));

        // 封装分页参数
        map.put("startRowNum", pb.getStartRowNum());
        map.put("endRowNum", pb.getEndRowNum());

        // 设置列表
        pb.setList(this.examInfoMapper.queryStudentExamInfoPage(map));
           
        // 返回pageBean
        return pb;
	}



	@Override
	public PageBean queryHomeExamStudentByNumber(String studentId) {
		
		PageBean pb = new PageBean();
		pb.setRows(this.examInfoMapper.queryHomeExamStudentTotalCountByNumber(studentId));
		pb.setMlist(this.examInfoMapper.queryHomeExamStudentByNumber(studentId));
		return pb;
		
	}
	
}
