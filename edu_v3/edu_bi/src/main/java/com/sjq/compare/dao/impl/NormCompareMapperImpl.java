package com.sjq.compare.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.sjq.manager.base.BasicSqlSupport;
import com.sjq.compare.vo.NormCompareVo;
import com.sjq.compare.bean.NormCompareBean;
import com.sjq.compare.dao.NormCompareMapper;

/**
 * [自动生成]常模管理-常模对照DAO实现
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:06:34
 * @version 1.0
 */
@Repository("NormCompareMapper")
public class NormCompareMapperImpl extends BasicSqlSupport implements NormCompareMapper {

	/**
	 * 根据ID查询常模管理-常模对照信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	public NormCompareVo queryNormCompareById(Long id){
	    return this.selectOne("com.sjq.compare.dao.NormCompareMapper.queryNormCompareById",id);
	}

	/**
	 * 根据条件查询所有常模管理-常模对照信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<NormCompareVo>  queryNormCompareBySearch(Map<String, Object> map){
		return this.selectList("com.sjq.compare.dao.NormCompareMapper.queryNormCompareBySearch",map);
	}
	
	/**
	 * 根据条件查询常模管理-常模对照count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	public int  queryNormCompareTotalCount(Map<String, Object> map){
	    return this.selectOne("com.sjq.compare.dao.NormCompareMapper.queryNormCompareTotalCount",map);
	}
	
	/**
	 * 分页查询常模管理-常模对照
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	public List<Object>  queryNormComparePage(Map<String, Object> map){
		return this.selectList("com.sjq.compare.dao.NormCompareMapper.queryNormComparePage",map);
	}
	
	/**
	 * (删除)根据ID删除常模管理-常模对照信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	public int  deleteNormCompareById(NormCompareBean bean){
		return this.delete("com.sjq.compare.dao.NormCompareMapper.deleteNormCompareById",bean);
	}
	
	/**
	 * (增加)增加常模管理-常模对照信息
	 * @param bean 常模管理-常模对照实体
	 * @return     受增加影响的行数
	 */
	public int  insertNormCompare(NormCompareBean bean){
		return this.insert("com.sjq.compare.dao.NormCompareMapper.insertNormCompare", bean);
	}

	public List<NormCompareBean> queryNormCompareByExamId(Map<String, Object> map) {
		return this.selectList("com.sjq.compare.dao.NormCompareMapper.queryNormCompareByExamId",map);
	}

	@Override
	public int insertNormCompareBatch(List<NormCompareBean> beanList) {
		return this.insert("com.sjq.compare.dao.NormCompareMapper.insertNormCompareBatch", beanList);
	}

	@Override
	public int deleteNormCompareBySerach(Map<String, Object> map) {
		return this.delete("com.sjq.compare.dao.NormCompareMapper.deleteNormCompareBySerach",map);
	}

	@Override
	public List<NormCompareBean> queryNormCompareByExam(Map<String, Object> map) {
		return this.selectList("com.sjq.compare.dao.NormCompareMapper.queryNormCompareByExam",map);
	}
	
	

}