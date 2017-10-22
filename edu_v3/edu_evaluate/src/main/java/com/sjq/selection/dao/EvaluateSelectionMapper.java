package com.sjq.selection.dao;

import java.util.List;
import java.util.Map;
import com.sjq.selection.vo.EvaluateSelectionVo;
import com.sjq.selection.bean.EvaluateSelectionBean;

/**
 * [自动生成]抽象选项信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-19 01:56:22
 * @version 1.0
 */
public interface EvaluateSelectionMapper {


	/**
	 * 查询所有的选项信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateSelectionVo> queryAllEvaluateSelection();
	
	/**
	 * 根据ID查询选项信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateSelectionVo queryEvaluateSelectionById(Long id);
	
	/**
	 * 根据条件查询所有选项信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateSelectionVo> queryEvaluateSelectionBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询选项信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateSelectionTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询选项信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateSelectionPage(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除选项信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteEvaluateSelectionBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有选项信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateSelectionBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加选项信息信息
	 * @param bean 选项信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateSelection(EvaluateSelectionBean bean);

	
}