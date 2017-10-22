package com.sjq.evaDetailPaper.dao;

import java.util.List;
import java.util.Map;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.evaDetailPaper.bean.EvaluateEvaDetailPaperBean;

/**
 * [自动生成]抽象测评明细问卷信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:17:14
 * @version 1.0
 */
public interface EvaluateEvaDetailPaperMapper {


	/**
	 * 查询所有的测评明细问卷信息信息
	 * @return 查询到的列表
	 */
	List<EvaluateEvaDetailPaperVo> queryAllEvaluateEvaDetailPaper();
	
	/**
	 * 根据EvaDetailId查询测评明细问卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperByEvaDetailId(Long evaDetailId);
	
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperById(Long id);
	
	/**
	 * 根据条件查询所有测评明细问卷信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<EvaluateEvaDetailPaperVo> queryEvaluateEvaDetailPaperBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询测评明细问卷信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryEvaluateEvaDetailPaperTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询测评明细问卷信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryEvaluateEvaDetailPaperPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有测评明细问卷信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateEvaluateEvaDetailPaperBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加测评明细问卷信息信息
	 * @param bean 测评明细问卷信息实体
	 * @return     受增加影响的行数
	 */
	int insertEvaluateEvaDetailPaper(EvaluateEvaDetailPaperBean bean);

	
}