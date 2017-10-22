package com.sjq.area.service;

import java.util.List;
import java.util.Map;

import com.sjq.area.bean.BaseAreaBean;
import com.sjq.area.search.BaseAreaSearch;
import com.sjq.area.vo.BaseAreaVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-区域信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-25 16:25:00
 * @version 1.0
 */
 
public interface BaseAreaService {
	
	/**
	 * (增加)增加基础模块-区域信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseArea(BaseAreaBean bean);
	
	/**
	 * 查询所有的基础模块-区域信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseAreaVo> queryAllBaseArea();
				
				
	/**
	 * 根据ID查询基础模块-区域信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseAreaVo queryBaseAreaById(Long id);
				
				
	/**
	 * 根据IDS查询所有基础模块-区域信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseAreaVo> queryBaseAreaByIds(Long[] ids);
	
				
	/**
	 * 根据条件查询所有基础模块-区域信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseAreaVo> queryBaseAreaBySearch(BaseAreaSearch search);
				
					
	/**
	 * 根据条件查询基础模块-区域信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseAreaTotalCount(BaseAreaSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseAreaPage(PageBean pb,BaseAreaSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-区域信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseAreaById(BaseAreaBean bean);
				
				
	/**
	 * (删除)根据IDS删除基础模块-区域信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseAreaByIds(BaseAreaBean bean,Long[] ids);
				
				
	/**
	 * (更新)根据ID更新所有基础模块-区域信息信息
	 * @param bean
	 * @return
	 */
	int updateBaseAreaById(BaseAreaBean bean);
				
	/**
	 * (查询)根据父类ID查询
	 * */
	public List<BaseAreaVo> queryBaseAreaByParentId(Long parentId);
}