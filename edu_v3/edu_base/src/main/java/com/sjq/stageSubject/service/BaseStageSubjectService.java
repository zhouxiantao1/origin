package com.sjq.stageSubject.service;

import java.util.List;
import java.util.Map;

import com.sjq.stageSubject.bean.BaseStageSubjectBean;
import com.sjq.stageSubject.search.BaseStageSubjectSearch;
import com.sjq.stageSubject.vo.BaseStageSubjectVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象学段学科信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-03 01:20:27
 * @version 1.0
 */
 
public interface BaseStageSubjectService {

				
	/**
	 * 根据条件查询所有学段学科信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStageSubjectVo> queryBaseStageSubjectBySearch(BaseStageSubjectSearch search);
				
					
	/**
	 * 根据条件查询学段学科信息count总数
	 * @param map 封装查询参数
	 * @return    查询符合结果总数
	 */
	int queryBaseStageSubjectTotalCount(BaseStageSubjectSearch search);
	
	
	/**
	 * 分页查询
	 * @param pb     分页
	 * @param search 搜索条件
	 * @return       封装后的分页
	 */
	PageBean queryBaseStageSubjectPage(PageBean pb,BaseStageSubjectSearch search);
				
				
	/**
	 * (增加)增加学段学科信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseStageSubject(BaseStageSubjectBean bean);
				
	
}