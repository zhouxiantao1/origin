package com.sjq.teacher.service;

import java.util.List;
import java.util.Map;

import com.sjq.teacher.bean.BaseTeacherBean;
import com.sjq.teacher.search.BaseTeacherSearch;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象教师信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-27 16:06:01
 * @version 1.0
 */
 
public interface BaseTeacherService {

	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	BaseTeacherVo queryBaseTeacherByUserId(Long userId);
	
	/**
	 * 根据ID查询教师信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseTeacherVo queryBaseTeacherById(Long id);
				
				
	/**
	 * 根据条件查询所有教师信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseTeacherVo> queryBaseTeacherBySearch(BaseTeacherSearch search);
				
					
	/**
	 * 根据条件查询教师信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseTeacherTotalCount(BaseTeacherSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseTeacherPage(PageBean pb,BaseTeacherSearch search);
				
				
	/**
	 * (删除)根据ID删除教师信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseTeacherById(BaseTeacherBean bean);
				
				
	/**
	 * (增加)增加教师信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseTeacher(BaseTeacherBean bean);
				
	
}