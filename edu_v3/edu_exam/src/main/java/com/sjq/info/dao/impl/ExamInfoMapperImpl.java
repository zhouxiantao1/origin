package com.sjq.info.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.info.bean.ExamInfoBean;
import com.sjq.info.dao.ExamInfoMapper;

/**
 * [自动生成]线上考试-考试信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-12 18:27:14
 * @version 1.0
 */
@Repository("ExamInfoMapper")
public class ExamInfoMapperImpl extends BasicSqlSupport implements ExamInfoMapper {

	/**
	 * 查询所有的线上考试-考试信息信息
	 * @return 查询到的列表
	 */
	public List<ExamInfoVo> queryAllExamInfo(){
	     return this.selectList("com.sjq.info.dao.ExamInfoMapper.queryAllExamInfo");
	}
				
	/**
	 * 根据ID查询线上考试-考试信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamInfoVo queryExamInfoById(Long id){
	    return this.selectOne("com.sjq.info.dao.ExamInfoMapper.queryExamInfoById",id);
	}

	/**
	 * 根据条件查询所有线上考试-考试信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamInfoVo>  queryExamInfoBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.info.dao.ExamInfoMapper.queryExamInfoBySearch",map);
	}
	
	/**
	 * 根据条件查询线上考试-考试信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryExamInfoTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.info.dao.ExamInfoMapper.queryExamInfoTotalCount",map);
	}
	
	/**
	 * 分页查询线上考试-考试信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryExamInfoPage(Map<String, Object> map){
		return this.selectList("com.sjq.info.dao.ExamInfoMapper.queryExamInfoPage",map);
	}
	
	/**
	 * (删除)根据ID删除线上考试-考试信息信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteExamInfoById(ExamInfoBean bean){
		return this.delete("com.sjq.info.dao.ExamInfoMapper.deleteExamInfoById",bean);
	}
	
	/**
	 * (更新)根据条件更新所有线上考试-考试信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamInfoBySearch(Map<String, Object> map){
	    return this.update("com.sjq.info.dao.ExamInfoMapper.updateExamInfoBySearch", map);
	}
	
	/**
	 * (增加)增加线上考试-考试信息信息
	 * @param bean 线上考试-考试信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamInfo(ExamInfoBean bean){
		return this.insert("com.sjq.info.dao.ExamInfoMapper.insertExamInfo", bean);
	}

	@Override
	public int queryStudentExamInfoTotalCount(Map<String, Object> map) {
		return this.selectOne("com.sjq.info.dao.ExamInfoMapper.queryStudentExamInfoTotalCount",map);
	}

	@Override
	public List<Object> queryStudentExamInfoPage(Map<String, Object> map) {
		return this.selectList("com.sjq.info.dao.ExamInfoMapper.queryStudentExamInfoPage",map);
	}

	@Override
	public int queryHomeExamStudentTotalCountByNumber(String studentId) {
		return this.selectOne("com.sjq.student.dao.ExamStudentMapper.queryHomeExamStudentTotalCountByNumber",studentId);

	}

	@Override
	public List<Map<String, Object>> queryHomeExamStudentByNumber(String studentId) {
		return this.selectList("com.sjq.student.dao.ExamStudentMapper.queryHomeExamStudentByNumber",studentId);

	}
	
	

}