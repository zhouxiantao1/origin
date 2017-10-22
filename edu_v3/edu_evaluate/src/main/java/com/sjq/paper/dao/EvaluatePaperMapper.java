package com.sjq.paper.dao;

import java.util.List;
import java.util.Map;
import com.sjq.paper.vo.EvaluatePaperVo;
import com.sjq.paper.bean.EvaluatePaperBean;

/**
 * [自动生成]抽象问卷信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:15:23
 * @version 1.0
 */
public interface EvaluatePaperMapper {
	
	/**
	 * (更新)根据ID物理删除记录
	 * @param bean 问卷信息实体
	 * @return     受更新影响的行数
	 */
	int  deleteEvaluatePaperById(Long id);
	
	/**
	 * (更新)根据ID更新所有问卷信息信息
	 * @param bean 问卷信息实体
	 * @return     受更新影响的行数
	 */
	int updateEvaluatePaperById(EvaluatePaperBean bean);
	
	/**
	 * 查询所有的问卷信息信息
	 * @return 查询到的列表
	 */
	List<EvaluatePaperVo> queryAllEvaluatePaper();
	
	/**
	 * 根据ID查询问卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluatePaperVo queryEvaluatePaperById(Long id);
	
	/**
	 * 根据条件查询所有问卷信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluatePaperVo> queryEvaluatePaperBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询问卷信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluatePaperTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询问卷信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluatePaperPage(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除问卷信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteEvaluatePaperBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加问卷信息信息
	 * @param bean 问卷信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluatePaper(EvaluatePaperBean bean);

	
}