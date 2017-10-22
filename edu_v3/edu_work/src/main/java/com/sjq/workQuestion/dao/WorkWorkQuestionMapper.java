package com.sjq.workQuestion.dao;

import java.util.List;
import java.util.Map;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;
import com.sjq.workQuestion.bean.WorkWorkQuestionBean;

/**
 * [自动生成]抽象作业题目信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-05 23:19:47
 * @version 1.0
 */
public interface WorkWorkQuestionMapper {

	/**
	 * (删除)根据条件删除作业题目信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteWorkWorkQuestionBySearch(Map<String, Object> map);
	
	/**
	 * 查询所有的作业题目信息信息
	 * @return 查询到的列表
	 */
	List<WorkWorkQuestionVo> queryAllWorkWorkQuestion();
	
	/**
	 * 根据ID查询作业题目信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkWorkQuestionVo queryWorkWorkQuestionById(Long id);
	
	/**
	 * 根据条件查询所有作业题目信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkWorkQuestionVo> queryWorkWorkQuestionBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作业题目信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkWorkQuestionTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作业题目信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkWorkQuestionPage(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有作业题目信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateWorkWorkQuestionBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加作业题目信息信息
	 * @param bean 作业题目信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkWorkQuestion(WorkWorkQuestionBean bean);

	
}