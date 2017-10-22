package com.sjq.school.service;

import java.util.List;
import java.util.Map;

import com.sjq.school.bean.BaseSchoolBean;
import com.sjq.school.search.BaseSchoolSearch;
import com.sjq.school.vo.BaseSchoolVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-学校信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:53:37
 * @version 1.0
 */
 
public interface BaseSchoolService {

	/**
	 * 查询所有的基础模块-学校信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseSchoolVo> queryAllBaseSchool();
				
				
	/**
	 * 根据ID查询基础模块-学校信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseSchoolVo queryBaseSchoolById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-学校信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseSchoolVo> queryBaseSchoolByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-学校信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseSchoolVo> queryBaseSchoolBySearch(BaseSchoolSearch search);
				
					
	/**
	 * 根据条件查询基础模块-学校信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseSchoolTotalCount(BaseSchoolSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseSchoolPage(PageBean pb,BaseSchoolSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-学校信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseSchoolById(BaseSchoolBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseSchoolByIds(BaseSchoolBean bean,Long[] ids);
				
								
	/**
	 * (删除)根据条件删除基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseSchoolBySearch(BaseSchoolBean bean,BaseSchoolSearch search);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-学校信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseSchoolById(BaseSchoolBean bean);
				
				
	/**
	 * (更新)根据IDS更新基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	int updateBaseSchoolByIds(Long[] ids,BaseSchoolBean bean);
				
				
	/**
	 * (更新)根据条件更新所有基础模块-学校信息信息
	 * @param map
	 * @return
	 */
	int updateBaseSchoolBySearch(BaseSchoolBean bean,BaseSchoolSearch search);
				
				
	/**
	 * (增加)增加基础模块-学校信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseSchool(BaseSchoolBean bean);
				
	/**
	 * 根据区域id给学校列表
	 * */
	List<BaseSchoolVo> queryBaseSchoolByAreaId(Long areaId);
}