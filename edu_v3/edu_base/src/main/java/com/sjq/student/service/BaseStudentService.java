package com.sjq.student.service;

import java.util.List;
import java.util.Map;

import com.sjq.student.bean.BaseStudentBean;
import com.sjq.student.search.BaseStudentSearch;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学生信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-16 15:50:40
 * @version 1.0
 */
 
public interface BaseStudentService {

	/**
	 * 查询所有的基础模块-学生信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseStudentVo> queryAllBaseStudent();
				
				
	/**
	 * 根据ID查询基础模块-学生信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseStudentVo queryBaseStudentById(Long id);
	
	
	
	/**
	* 根据ID查询基础模块-学生信息信息
	* @param id 标识
	* @return   查询到的结果列表
	*/
	BaseStudentVo queryBaseStudentByUserId(Long userId);
				
				
	/**
	 * 根据IDS查询所有基础模块-学生信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStudentVo> queryBaseStudentByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学生信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStudentVo> queryBaseStudentBySearch(BaseStudentSearch search);
				
					
	/**
	 * 根据条件查询基础模块-学生信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseStudentTotalCount(BaseStudentSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseStudentPage(PageBean pb,BaseStudentSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学生信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseStudentById(BaseStudentBean bean);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学生信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseStudentById(BaseStudentBean bean);
				
				
	/**
	 * (增加)增加基础模块-学生信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseStudent(BaseStudentBean bean);
				
	
}