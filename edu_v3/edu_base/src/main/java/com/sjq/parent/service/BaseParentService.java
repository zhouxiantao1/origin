package com.sjq.parent.service;

import java.util.List;
import java.util.Map;

import com.sjq.parent.bean.BaseParentBean;
import com.sjq.parent.search.BaseParentSearch;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象基础模块-家长信息service层
 * @author  ShuiJingQiu
 * @since   2017-04-29 01:02:00
 * @version 1.0
 */
 
public interface BaseParentService {
	
	
	/**
	 * 查询所有的基础模块-家长信息信息
	 * @return 查询到的结果列表
	 */
	List<BaseParentVo> queryAllBaseParent();
	
	/**
	 * 根据userId查询基础模块-家长信息信息
	 * @return
	 */
	BaseParentVo queryBaseParentByUserId(Long userId);
				
	/**
	 * 根据ID查询基础模块-家长信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	BaseParentVo queryBaseParentById(Long id);
				
				
	/**
	 * 根据条件查询所有基础模块-家长信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseParentVo> queryBaseParentBySearch(BaseParentSearch search);
				
					
	/**
	 * 根据条件查询基础模块-家长信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseParentTotalCount(BaseParentSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseParentPage(PageBean pb,BaseParentSearch search);
				
				
	/**
	 * (删除)根据ID删除基础模块-家长信息信息
	 * @param id
	 * @return
	 */
	int deleteBaseParentById(BaseParentBean bean);
				
				
	/**
	 * (增加)增加基础模块-家长信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseParent(BaseParentBean bean);
				
	
}