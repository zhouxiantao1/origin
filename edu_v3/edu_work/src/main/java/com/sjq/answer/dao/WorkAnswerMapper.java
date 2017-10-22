package com.sjq.answer.dao;

import java.util.List;
import java.util.Map;
import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.answer.bean.WorkAnswerBean;

/**
 * [自动生成]抽象作答信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:27:33
 * @version 1.0
 */
public interface WorkAnswerMapper {
	
	/**
	 * 查询各个段的得分率人数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
   int  queryWorkAnswerBycorrect(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有作答信息信息
	 * @param bean 作答信息实体
	 * @return     受更新影响的行数
	 */
	int updateWorkAnswerById(WorkAnswerBean bean);

	/**
	 * 根据ID查询作答信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkAnswerVo queryWorkAnswerById(Long id);
	
	/**
	 * 根据条件查询所有作答信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkAnswerVo> queryWorkAnswerBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作答信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkAnswerTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作答信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkAnswerPage(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除作答信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteWorkAnswerBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加作答信息信息
	 * @param bean 作答信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkAnswer(WorkAnswerBean bean);

	
}