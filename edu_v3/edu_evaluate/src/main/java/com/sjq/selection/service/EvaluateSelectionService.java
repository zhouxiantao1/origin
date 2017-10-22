package com.sjq.selection.service;

import java.util.List;
import java.util.Map;

import com.sjq.selection.bean.EvaluateSelectionBean;
import com.sjq.selection.search.EvaluateSelectionSearch;
import com.sjq.selection.vo.EvaluateSelectionVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象选项信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-19 01:56:22
 * @version 1.0
 */
 
public interface EvaluateSelectionService {

	/**
	 * 查询所有的选项信息信息
	 * @return 查询到的结果列表
	 */
	List<EvaluateSelectionVo> queryAllEvaluateSelection();
				
				
	/**
	 * 根据ID查询选项信息信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	EvaluateSelectionVo queryEvaluateSelectionById(Long id);
				
				
	/**
	 * 根据条件查询所有选项信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<EvaluateSelectionVo> queryEvaluateSelectionBySearch(EvaluateSelectionSearch search);
				
					
	/**
	 * 根据条件查询选项信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryEvaluateSelectionTotalCount(EvaluateSelectionSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryEvaluateSelectionPage(PageBean pb,EvaluateSelectionSearch search);
				
								
	/**
	 * (删除)根据条件删除选项信息信息
	 * @param map
	 * @return
	 */
	int deleteEvaluateSelectionBySearch(EvaluateSelectionBean bean,EvaluateSelectionSearch search);
				
				
	/**
	 * (更新)根据条件更新所有选项信息信息
	 * @param map
	 * @return
	 */
	int updateEvaluateSelectionBySearch(EvaluateSelectionBean bean,EvaluateSelectionSearch search);
				
				
	/**
	 * (增加)增加选项信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertEvaluateSelection(EvaluateSelectionBean bean);
				
	
}