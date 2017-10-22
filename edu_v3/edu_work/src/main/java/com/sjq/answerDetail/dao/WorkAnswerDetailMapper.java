package com.sjq.answerDetail.dao;

import java.util.List;
import java.util.Map;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.answerDetail.bean.WorkAnswerDetailBean;

/**
 * [自动生成]抽象作答详细信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:28:06
 * @version 1.0
 */
public interface WorkAnswerDetailMapper {


	/**
	 * 根据ID查询作答详细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkAnswerDetailVo queryWorkAnswerDetailById(Long id);
	
	/**
	 * 根据条件查询所有作答详细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkAnswerDetailVo> queryWorkAnswerDetailBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作答详细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkAnswerDetailTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作答详细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkAnswerDetailPage(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除作答详细信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteWorkAnswerDetailBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据条件更新所有作答详细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	int updateWorkAnswerDetailBySearch(Map<String, Object> map);
	
	/**
	 * (增加)增加作答详细信息信息
	 * @param bean 作答详细信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkAnswerDetail(WorkAnswerDetailBean bean);

	
}