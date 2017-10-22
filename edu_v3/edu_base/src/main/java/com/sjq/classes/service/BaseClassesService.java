package com.sjq.classes.service;

import java.util.List;
import java.util.Map;

import com.sjq.classes.bean.BaseClassesBean;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-班级信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 17:17:25
 * @version 1.0
 */
 
public interface BaseClassesService {
	
	/**
	 * 根据学校ID查询基础模块-班级信息信息
	 * @return 查询到的列表
	 */
	public List<BaseClassesVo> queryBaseClassesBySchoolId();
	
	/**
	 * 查询所有的基础模块-班级信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseClassesVo> queryAllBaseClasses();
				
				
	/**
	 * 根据ID查询基础模块-班级信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseClassesVo queryBaseClassesById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-班级信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseClassesVo> queryBaseClassesByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-班级信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseClassesVo> queryBaseClassesBySearch(BaseClassesSearch search);
				
					
	/**
	 * 根据条件查询基础模块-班级信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseClassesTotalCount(BaseClassesSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseClassesPage(PageBean pb,BaseClassesSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-班级信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseClassesById(BaseClassesBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseClassesByIds(BaseClassesBean bean,Long[] ids);
				
								
	/**
	 * (删除)根据条件删除基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseClassesBySearch(BaseClassesBean bean,BaseClassesSearch search);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-班级信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseClassesById(BaseClassesBean bean);
				
				
	/**
	 * (更新)根据IDS更新基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	int updateBaseClassesByIds(Long[] ids,BaseClassesBean bean);
				
				
	/**
	 * (更新)根据条件更新所有基础模块-班级信息信息
	 * @param map
	 * @return
	 */
	int updateBaseClassesBySearch(BaseClassesBean bean,BaseClassesSearch search);
				
				
	/**
	 * (增加)增加基础模块-班级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseClasses(BaseClassesBean bean);
		
	//获取特定区域中比如有含有初三年级的学校，根据年级和区域找学校
	List<BaseClassesVo> queryBaseClassesByAreaId(BaseClassesSearch search);
}