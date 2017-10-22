package com.sjq.stageGrade.service;

import java.util.List;
import java.util.Map;

import com.sjq.stageGrade.bean.BaseStageGradeBean;
import com.sjq.stageGrade.search.BaseStageGradeSearch;
import com.sjq.stageGrade.vo.BaseStageGradeVo;
import com.sjq.util.PageBean;

/**
 * [自动生成]抽象学段年级信息service层
 * @author  ShuiJingQiu
 * @since   2017-05-03 22:00:49
 * @version 1.0
 */
 
public interface BaseStageGradeService {
	
	
	/**
	 * 根据条件查询所有学段年级信息信息
	 * @param map 封装查询参数
	 * @return    查询到的结果列表
	 */
	List<BaseStageGradeVo> queryBaseStageGradeBySearch(BaseStageGradeSearch search);
								
	/**
	 * (删除)根据条件删除学段年级信息信息
	 * @param map
	 * @return
	 */
	int deleteBaseStageGradeBySearch(BaseStageGradeBean bean,BaseStageGradeSearch search);
				
				
	/**
	 * (增加)增加学段年级信息信息
	 * @param bean
	 * @param name 增加操作人
	 * @return
	 */
	int insertBaseStageGrade(BaseStageGradeBean bean);
				
	
}