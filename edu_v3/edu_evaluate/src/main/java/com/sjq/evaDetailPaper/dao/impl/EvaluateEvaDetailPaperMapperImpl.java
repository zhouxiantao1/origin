package com.sjq.evaDetailPaper.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.evaDetailPaper.vo.EvaluateEvaDetailPaperVo;
import com.sjq.evaDetailPaper.bean.EvaluateEvaDetailPaperBean;
import com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper;

/**
 * [自动生成]测评明细问卷信息DAO实现
 * @author  ShuiJingQiu
 * @since   2017-05-04 00:17:14
 * @version 1.0
 */
@Repository("EvaluateEvaDetailPaperMapper")
public class EvaluateEvaDetailPaperMapperImpl extends BasicSqlSupport implements EvaluateEvaDetailPaperMapper {

	/**
	 * 查询所有的测评明细问卷信息信息
	 * @return 查询到的列表
	 */
	public List<EvaluateEvaDetailPaperVo> queryAllEvaluateEvaDetailPaper(){
	     return this.selectList("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.queryAllEvaluateEvaDetailPaper");
	}	
	
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperByEvaDetailId(Long evaDetailId){
	    return this.selectOne("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperByEvaDetailId",evaDetailId);
	}
	
	/**
	 * 根据ID查询测评明细问卷信息信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public EvaluateEvaDetailPaperVo queryEvaluateEvaDetailPaperById(Long id){
	    return this.selectOne("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperById",id);
	}

	/**
	 * 根据条件查询所有测评明细问卷信息信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<EvaluateEvaDetailPaperVo>  queryEvaluateEvaDetailPaperBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperBySearch",map);
	}
	
	/**
	 * 根据条件查询测评明细问卷信息count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryEvaluateEvaDetailPaperTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperTotalCount",map);
	}
	
	/**
	 * 分页查询测评明细问卷信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryEvaluateEvaDetailPaperPage(Map<String, Object> map){
		return this.selectList("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.queryEvaluateEvaDetailPaperPage",map);
	}
	
	/**
	 * (更新)根据条件更新所有测评明细问卷信息信息
	 * @param map 封装更新参数
	 * @return    受更新影响的行数
	 */
	public int  updateEvaluateEvaDetailPaperBySearch(Map<String, Object> map){
	    return this.update("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.updateEvaluateEvaDetailPaperBySearch", map);
	}
	
	/**
	 * (增加)增加测评明细问卷信息信息
	 * @param bean 测评明细问卷信息实体
	 * @return     受增加影响的行数
	 */
	public int  insertEvaluateEvaDetailPaper(EvaluateEvaDetailPaperBean bean){
		return this.insert("com.sjq.evaDetailPaper.dao.EvaluateEvaDetailPaperMapper.insertEvaluateEvaDetailPaper", bean);
	}
	
	

}