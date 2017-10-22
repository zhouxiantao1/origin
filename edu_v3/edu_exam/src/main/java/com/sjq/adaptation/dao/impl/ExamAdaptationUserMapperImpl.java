package com.sjq.adaptation.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.adaptation.bean.ExamAdaptationUserBean;
import com.sjq.adaptation.dao.ExamAdaptationUserMapper;
import com.sjq.adaptation.vo.ExamAdaptationUserVo;
import com.sjq.manager.base.BasicSqlSupport;
	
/**
 * [自动生成]考试模块-自适应测试用户记录表DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-19 23:16:26
 * @version 1.0
 */
@Repository("ExamAdaptationUserMapper")
public class ExamAdaptationUserMapperImpl extends BasicSqlSupport implements ExamAdaptationUserMapper {

	/**
	 * 根据ID查询考试模块-自适应测试用户记录表信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public ExamAdaptationUserVo queryExamAdaptationUserById(Long id){
	    return this.selectOne("com.sjq.adaptationUser.dao.ExamAdaptationUserMapper.queryExamAdaptationUserById",id);
	}

	/**
	 * 根据条件查询所有考试模块-自适应测试用户记录表信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<ExamAdaptationUserVo>  queryExamAdaptationUserBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.adaptationUser.dao.ExamAdaptationUserMapper.queryExamAdaptationUserBySearch",map);
	}
	
	/**
	 * (删除)根据ID删除考试模块-自适应测试用户记录表信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteExamAdaptationUserById(ExamAdaptationUserBean bean){
		return this.delete("com.sjq.adaptationUser.dao.ExamAdaptationUserMapper.deleteExamAdaptationUserById",bean);
	}
	
	/**
	 * (增加)增加考试模块-自适应测试用户记录表信息
	 * @param bean 考试模块-自适应测试用户记录表实体
	 * @return     受增加影响的行数
	 */
	public int  insertExamAdaptationUser(ExamAdaptationUserBean bean){
		return this.insert("com.sjq.adaptationUser.dao.ExamAdaptationUserMapper.insertExamAdaptationUser", bean);
	}
	
	/**
	 * (更新)根据条件更新所有考试模块-自适应测试用户记录表信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateExamAdaptationUserBySearch(Map<String,Object> map){
	    return this.update("com.sjq.adaptationUser.dao.ExamAdaptationUserMapper.updateExamAdaptationUserBySearch", map);
	}
	
	

}