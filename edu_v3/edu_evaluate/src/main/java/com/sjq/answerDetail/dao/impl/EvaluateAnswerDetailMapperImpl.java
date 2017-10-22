package com.sjq.answerDetail.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.answerDetail.vo.EvaluateAnswerDetailVo;
import com.sjq.answerDetail.bean.EvaluateAnswerDetailBean;
import com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper;

/**
 * [自动生成]作答明细信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:16:58
 * @version 1.0
 */
@Repository("EvaluateAnswerDetailMapper")
public class EvaluateAnswerDetailMapperImpl extends BasicSqlSupport implements EvaluateAnswerDetailMapper {

	/**
	 * 查询所有的作答明细信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateAnswerDetailVo> queryAllEvaluateAnswerDetail(){
	     return this.selectList("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.queryAllEvaluateAnswerDetail");
	}
				
	/**
	 * 根据ID查询作答明细信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateAnswerDetailVo queryEvaluateAnswerDetailById(Long id){
	    return this.selectOne("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.queryEvaluateAnswerDetailById",id);
	}

	/**
	 * 根据条件查询所有作答明细信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateAnswerDetailVo>  queryEvaluateAnswerDetailBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.queryEvaluateAnswerDetailBySearch",map);
	}
	
	/**
	 * 根据条件查询作答明细信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateAnswerDetailTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.queryEvaluateAnswerDetailTotalCount",map);
	}
	
	/**
	 * 分页查询作答明细信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateAnswerDetailPage(Map<String, Object> map){
		return this.selectList("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.queryEvaluateAnswerDetailPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有作答明细信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateAnswerDetailBySearch(Map<String, Object> map){
	    return this.update("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.updateEvaluateAnswerDetailBySearch", map);
	}
	
	/**
	 * (增加)增加作答明细信息信息
	 * @param bean 作答明细信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateAnswerDetail(EvaluateAnswerDetailBean bean){
		return this.insert("com.sjq.answerDetail.dao.EvaluateAnswerDetailMapper.insertEvaluateAnswerDetail", bean);
	}
	
	

}