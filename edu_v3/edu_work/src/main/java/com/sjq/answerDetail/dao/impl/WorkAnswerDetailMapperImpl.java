package com.sjq.answerDetail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.answerDetail.bean.WorkAnswerDetailBean;
import com.sjq.answerDetail.dao.WorkAnswerDetailMapper;

/**
 * [自动生成]作答详细信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-02 22:28:06
 * @version 1.0
 */
@Repository("WorkAnswerDetailMapper")
public class WorkAnswerDetailMapperImpl extends BasicSqlSupport implements WorkAnswerDetailMapper {

	/**
	 * 根据ID查询作答详细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public WorkAnswerDetailVo queryWorkAnswerDetailById(Long id){
	    return this.selectOne("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.queryWorkAnswerDetailById",id);
	}

	/**
	 * 根据条件查询所有作答详细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<WorkAnswerDetailVo>  queryWorkAnswerDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.queryWorkAnswerDetailBySearch",map);
	}
	
	/**
	 * 根据条件查询作答详细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryWorkAnswerDetailTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.queryWorkAnswerDetailTotalCount",map);
	}
	
	/**
	 * 分页查询作答详细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryWorkAnswerDetailPage(Map<String, Object> map){
		return this.selectList("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.queryWorkAnswerDetailPage",map);
	}
	
	/**
	 * (删除)根据条件删除作答详细信息信息
	 * @param map 封装查询参数 
	 * @return    受删除影响的行数
	 */
	public int  deleteWorkAnswerDetailBySearch(Map<String, Object> map){
		return this.delete("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.deleteWorkAnswerDetailBySearch",map);
	}
	
	/**
	 * (更新)根据条件更新所有作答详细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateWorkAnswerDetailBySearch(Map<String, Object> map){
	    return this.update("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.updateWorkAnswerDetailBySearch", map);
	}
	
	/**
	 * (增加)增加作答详细信息信息
	 * @param bean 作答详细信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertWorkAnswerDetail(WorkAnswerDetailBean bean){
		return this.insert("com.sjq.answerDetail.dao.WorkAnswerDetailMapper.insertWorkAnswerDetail", bean);
	}
	
	

}