package com.sjq.compare.dao;

import java.util.List;
import java.util.Map;
import com.sjq.compare.vo.NormCompareVo;
import com.sjq.compare.bean.NormCompareBean;

/**
 * [自动生成]抽象常模管理-常模对照Dao层
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:06:34
 * @version 1.0
 */
public interface NormCompareMapper {


	/**
	 * 根据ID查询常模管理-常模对照信息
	 * @param id 标识
	 * @return   查询到的列表
	 */
	NormCompareVo queryNormCompareById(Long id);
	
	/**
	 * 根据条件查询所有常模管理-常模对照信息
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<NormCompareVo> queryNormCompareBySearch(Map<String, Object> map);
	
	/**
	 * 根据条件查询常模管理-常模对照count总数
	 * @param map 封装查询参数 
	 * @return    查询到符合条件的总数
	 */
	int queryNormCompareTotalCount(Map<String, Object> map);
	
	/**
	 * 分页查询常模管理-常模对照
	 * @param map 封装查询参数 
	 * @return    查询到的列表
	 */
	List<Object> queryNormComparePage(Map<String, Object> map);
	
	/**
	 * (删除)根据ID删除常模管理-常模对照信息
	 * @param id 标识
	 * @return   受删除影响的行数
	 */
	int deleteNormCompareById(NormCompareBean bean);
	
	/**
	 * (增加)增加常模管理-常模对照信息
	 * @param bean 常模管理-常模对照实体
	 * @return     受增加影响的行数
	 */
	int insertNormCompare(NormCompareBean bean);

	List<NormCompareBean> queryNormCompareByExamId(Map<String, Object> map);
	
	List<NormCompareBean> queryNormCompareByExam(Map<String, Object> map);
	
	int insertNormCompareBatch(List<NormCompareBean> beanList);
	
	int deleteNormCompareBySerach(Map<String, Object> map);
}