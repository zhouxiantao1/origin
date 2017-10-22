package com.sjq.exam.online.servlet;

import com.sjq.exam.online.bean.OnlineSchedulingConfBean;
import com.sjq.exam.online.vo.OnlineSchedulingConfVo;
import com.sjq.info.bean.ExamInfoBean;

/**
 * 
 * @ClassName:OnlineSchedulingConfService
 * @Description:线下考试调度Service
 * @author SJQ-XiaoCong Yin
 * @date 2017年4月27日 上午10:14:22
 * @version 1.0
 */
public interface OnlineSchedulingConfService {
	
	/**
	 * 
	 * @MethodName:updateOnlineSchedulingConfById
	 * @Description:计算调用次数
	 * @param examId
	 * @param runningState
	 * @return
	 */
	int updateOnlineSchedulingConfById(Long examId,String runningState);
	
	/**
	 * 
	 * @MethodName:allSurveyProc
	 * @Description:考试概况分析
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allSurveyProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allSumSegmentedProc
	 * @Description:总分分数段分布对比
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allSumSegmentedProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allEachSegmentedProc
	 * @Description:各学科分数段分布对比
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allEachSegmentedProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allLevelSpreadProc
	 * @Description:各水平等级分布
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allLevelSpreadProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allScoreContrastProc
	 * @Description:各水平等级学生各科得分率对比
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allScoreContrastProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allSumSegmentedProc
	 * @Description:考试情况分析
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allExamSituationProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allPointNameProc
	 * @Description:各知识模块得分情况分析
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allPointNameProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allAbilityNameProc
	 * @Description:各认知层次得分情况分析
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allAbilityNameProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allQuestionTypeProc
	 * @Description:各题型得分情况分析
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allQuestionTypeProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allQuestionNoProc
	 * @Description:各小题得分情况分析
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allQuestionNoProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:allSubjectScatterProc
	 * @Description:难度分布
	 * @param examId
	 * @param examRange
	 * @return 0失败 1成功
	 */
	int allSubjectScatterProc(Long examId,String examRange);
	
	/**
	 * 
	 * @MethodName:selectSchedulingStatus
	 * @Description:获取调度运行状态
	 * @param examId
	 * @return
	 */
	OnlineSchedulingConfVo selectSchedulingStatus(Long examId);
	
	
	int insertOnlineSchedulingConfBean(OnlineSchedulingConfBean bean);
}
