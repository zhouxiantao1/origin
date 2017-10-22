package com.sjq.develop.service;

import java.util.List;
import java.util.Map;

import com.sjq.develop.bean.DevelopCodeBean;
import com.sjq.develop.search.DevelopCodeSearch;
import com.sjq.develop.vo.DevelopCodeVo;
import com.sjq.util.PageBean;


/**
 * [自动生成]抽象代码生成模块service层
 * @author Zheng.ZeJie
 * @since  
 * @version 1.0
 */
public interface DevelopCodeService {

	/**
	 * (查询)查询所有的信息
	 * @return 查询到的结果列表
	 */
	List<DevelopCodeVo> selectAll();
	
	/**
	 * (查询)根据ID查询所有信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	DevelopCodeVo queryCodeById(Long id);
	
	/**
	 * (查询)根据IDS查询所有信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<DevelopCodeVo> queryCodeByIds(Long[] ids);

	/**
	 * (查询)根据条件查询所有信息 
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<DevelopCodeVo> queryCodeBySearch(DevelopCodeSearch search);
	
	/**
	 * (查询)根据条件查询count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryTotalCount(DevelopCodeSearch search);
	
	
	/**
	 * （查询）分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryPage(PageBean pb,DevelopCodeSearch search);
	
	/**
	 * (删除)删除所有的 信息
	 * @return
	 */
	int deleteAll();
	
	/**
	 * (删除)根据ID删除信息
	 * @param id
	 * @return
	 */
	int deleteCodeById(Long id);
	
	/**
	 * (删除)根据IDS删除信息
	 * @param map
	 * @return
	 */
	int deleteCodeByIds(Long[] ids);
	
	/**
	 * (删除)根据条件删除信息
	 * @param map
	 * @return
	 */
	int deleteCodeBySearch(DevelopCodeSearch search);
	
	/**
	 * (更新)更新所有信息 (慎用)
	 * @param vo 
	 * @return
	 */
	int updateCode(DevelopCodeBean vo);
	
	/**
	 * (更新)根据ID更新所有信息
	 * @param bean
	 * @return
	 */
	int updateCodeById(DevelopCodeBean vo);
	
	/**
	 * (更新)根据IDS更新有信息
	 * @param map
	 * @return
	 */
	int updateCodeByIds(Long[] ids,DevelopCodeBean vo);
	
	/**
	 * (更新)根据条件更新所有信息 
	 * @param map
	 * @return
	 */
	int updateCodeBySearch(DevelopCodeBean vo,DevelopCodeSearch search);
	
	/**
	 * (增加)增加信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertDevelopCode(DevelopCodeBean vo);
	
	
}