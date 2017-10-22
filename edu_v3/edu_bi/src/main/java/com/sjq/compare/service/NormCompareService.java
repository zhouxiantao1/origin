package com.sjq.compare.service;

import java.util.List;
import java.util.Map;

import com.sjq.compare.bean.NormCompareBean;
import com.sjq.compare.search.NormCompareSearch;
import com.sjq.compare.vo.NormCompareVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象常模管理-常模对照service层
 * @author  ShuiJingQiu
 * @since   2017-07-06 15:06:34
 * @version 1.0
 */
 
public interface NormCompareService {

				
	/**
	 * 根据ID查询常模管理-常模对照信息
	 * @param id 标识
	 * @return   查询到的结果列表
	 */
	NormCompareVo queryNormCompareById(Long id);
				
				
	/**
	 * 根据条件查询所有常模管理-常模对照信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<NormCompareVo> queryNormCompareBySearch(NormCompareSearch search);
				
					
	/**
	 * 根据条件查询常模管理-常模对照count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryNormCompareTotalCount(NormCompareSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryNormComparePage(PageBean pb,NormCompareSearch search);
				
				
	/**
	 * (删除)根据ID删除常模管理-常模对照信息
	 * @param id
	 * @return
	 */
	int deleteNormCompareById(NormCompareBean bean);
				
				
	/**
	 * (增加)增加常模管理-常模对照信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertNormCompare(NormCompareBean bean);
	
	//根据查询条件获取标准分数，计算方式：标准分数
	List<NormCompareBean> queryNormCompareByExamId(NormCompareSearch search);
	
	//根据查询条件获取百分位，计算方式：百分位
	List<NormCompareBean> queryNormCompareByExam(NormCompareSearch search);
	
	int insertNormCompareBatch(List<NormCompareBean> beanList);
	
	int deleteNormCompareBySerach(Map<String, Object> map);
}