package com.sjq.homework.dao;

import java.util.List;
import java.util.Map;
import com.sjq.homework.vo.WorkHomeworkVo;
import com.sjq.homework.bean.WorkHomeworkBean;

/**
 * [自动生成]抽象作业信息Dao层
 * @author  ShuiJingQiu
 * @since   2017-05-11 23:11:48
 * @version 1.0
 */
public interface WorkHomeworkMapper {


	/**
	 * 查询所有的作业信息信息
	 * @return 查询到的列表
	 */
	List<WorkHomeworkVo> queryAllWorkHomework();
	
	/**
	 * 根据ID查询作业信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	WorkHomeworkVo queryWorkHomeworkById(Long id);
	
	/**
	 * 根据条件查询所有作业信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<WorkHomeworkVo> queryWorkHomeworkBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询作业信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryWorkHomeworkTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询作业信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryWorkHomeworkPage(Map<String, Object> map);
	
	/**
	 * (删除)根据条件删除作业信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	int deleteWorkHomeworkBySearch(Map<String, Object> map);
	
	/**
	 * (更新)根据ID更新所有作业信息信息
	 * @param bean 作业信息实体
	 * @return     受更新影响的行数
	 */
	int updateWorkHomeworkById(WorkHomeworkBean bean);
	
	/**
	 * (增加)增加作业信息信息
	 * @param bean 作业信息实体
	 * @return     受增加影响的行数
	 */
	int insertWorkHomework(WorkHomeworkBean bean);

	
}