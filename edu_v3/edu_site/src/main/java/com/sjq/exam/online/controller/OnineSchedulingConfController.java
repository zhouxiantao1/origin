package com.sjq.exam.online.controller;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.exam.online.bean.OnlineSchedulingConfBean;
import com.sjq.exam.online.servlet.OnlineSchedulingConfService;
import com.sjq.exam.online.vo.OnlineSchedulingConfVo;
import com.sjq.util.MyLogger;

@Controller
@RequestMapping(value = "/exam/online/schedulingconf")
public class OnineSchedulingConfController {
	
	//jsp跳转目录
	private static final String PAGE_FOLDER="exam/online/";
	
	//线下下载基础数据模版页面
	private static final String PAGE = "exam_online_scheduling_conf";
	
	@Autowired
	private OnlineSchedulingConfService onlineSchedulingConfService;
	
	@Autowired
    private DataSourceTransactionManager txManager;
	
	//记录日志对象
    private static final MyLogger LOGGER = new MyLogger(OnineSchedulingConfController.class);
    
    /**
     * 
     * @MethodName:schedulingConfRequest
     * @Description:生成分析报告调度界面
     * @param request
     * @param response
     * @param examId
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/list")
	public ModelAndView schedulingConfRequest(HttpServletRequest request, HttpServletResponse response, Long examId) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(PAGE_FOLDER + PAGE);
		OnlineSchedulingConfVo onlineSchedulingConfVo = onlineSchedulingConfService.selectSchedulingStatus(examId);
		if(onlineSchedulingConfVo != null){
			if(onlineSchedulingConfVo.getStatus().equals("1")){
				mav.addObject("msg","生成次数达到上限！");
			}else{
				if(onlineSchedulingConfVo.getRunningState().equals("0")){
					mav.addObject("msg","未开始");
				}else{
					mav.addObject("msg","进行中");
				}
			}
		}else{
			mav.addObject("msg","生成失败！");
		}
		
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:startscheduling
	 * @Description:生成线上考试分析报告
	 * @param request
	 * @param examId
	 * @param examRange
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@ResponseBody
    @RequestMapping("/startscheduling")
    public Map<String,String> startscheduling(HttpServletRequest request,@RequestParam(value="examId")Long examId, @RequestParam(value="examRange")String examRange,
    		@DateTimeFormat(pattern="yyyy-MM-dd")Date endTime,HttpServletResponse response) throws UnsupportedEncodingException {
    	Map<String,String> map = new HashMap<String,String>();
        System.out.println("控制台输出：走入调度");
        OnlineSchedulingConfVo onlineSchedulingConfVo = onlineSchedulingConfService.selectSchedulingStatus(examId);
		if(onlineSchedulingConfVo != null){
			if(onlineSchedulingConfVo.getCallNumber()>5){
				map.put("msg", "生成次数达到上限！");
			}else if(onlineSchedulingConfVo.getEndTime().getTime()<(new Date()).getTime()){
				map.put("msg", "可生成时间已结束！");
			}else if(onlineSchedulingConfVo.getStartTime().getTime()>(new Date()).getTime()){
				map.put("msg", "未到到生成报告时间！");
			}else{
				if(onlineSchedulingConfVo.getRunningState().equals("0")){
					DefaultTransactionDefinition def = new DefaultTransactionDefinition();
			        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);// 事物隔离级别，开启新事务
			        TransactionStatus status = txManager.getTransaction(def); // 获得事务状态
			        try{
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"1");
			        	txManager.commit(status);//运行后就提交
			    	}catch(Exception e){
			        	txManager.rollback(status);
			    	}
			        int flag;
			        flag = onlineSchedulingConfService.allSurveyProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("考试概况分析存储过程失败");
			        	map.put("msg", "考试概况分析存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allSumSegmentedProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("总分分数段分布对比存储过程失败");
			        	map.put("msg", "总分分数段分布对比存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allEachSegmentedProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各学科分数段分布对比存储过程失败");
			        	map.put("msg", "各学科分数段分布对比存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allLevelSpreadProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各水平等级分布存储过程失败");
			        	map.put("msg", "各水平等级分布存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allScoreContrastProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各水平等级学生各科得分率对比存储过程失败");
			        	map.put("msg", "各水平等级学生各科得分率对比存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allExamSituationProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("考试情况分析存储过程失败");
			        	map.put("msg", "考试情况分析存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allPointNameProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各知识模块得分情况分析存储过程失败");
			        	map.put("msg", "各知识模块得分情况分析存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allAbilityNameProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各认知层次得分情况分析存储过程失败");
			        	map.put("msg", "各认知层次得分情况分析存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allQuestionTypeProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各题型得分情况分析存储过程失败");
			        	map.put("msg", "各题型得分情况分析存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allQuestionNoProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("各小题得分情况分析存储过程失败");
			        	map.put("msg", "各小题得分情况分析存储过程失败");
			        	return map;
			        }
			        flag = onlineSchedulingConfService.allSubjectScatterProc(examId, examRange);
			        if(flag == 0){
			        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        	LOGGER.error("难度分布存储过程失败");
			        	map.put("msg", "难度分布存储过程失");
			        	return map;
			        }
			        onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
			        LOGGER.info("后台执行成功");
			        System.out.println("后台执行完成");
			        map.put("msg", "后台执行成功");
				}else{
					map.put("msg", "后台正在执行！");
				}
			}
		}else{
			OnlineSchedulingConfBean onlineSchedulingConfBean = new OnlineSchedulingConfBean();
			onlineSchedulingConfBean.setExamId(examId);
			onlineSchedulingConfBean.setStartTime(endTime);
			Calendar cal = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。  
			cal.setTime(endTime); 
			cal.add(Calendar.DAY_OF_MONTH, +7);//取当前日期的后一天.
			onlineSchedulingConfBean.setEndTime(cal.getTime());
			onlineSchedulingConfBean.setRunningState("1");
			onlineSchedulingConfBean.setCallNumber(0);
			onlineSchedulingConfBean.setStatus("1");
			onlineSchedulingConfService.insertOnlineSchedulingConfBean(onlineSchedulingConfBean);
			int flag;
	        flag = onlineSchedulingConfService.allSurveyProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("考试概况分析存储过程失败");
	        	map.put("msg", "考试概况分析存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allSumSegmentedProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("总分分数段分布对比存储过程失败");
	        	map.put("msg", "总分分数段分布对比存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allEachSegmentedProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各学科分数段分布对比存储过程失败");
	        	map.put("msg", "各学科分数段分布对比存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allLevelSpreadProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各水平等级分布存储过程失败");
	        	map.put("msg", "各水平等级分布存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allScoreContrastProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各水平等级学生各科得分率对比存储过程失败");
	        	map.put("msg", "各水平等级学生各科得分率对比存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allExamSituationProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("考试情况分析存储过程失败");
	        	map.put("msg", "考试情况分析存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allPointNameProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各知识模块得分情况分析存储过程失败");
	        	map.put("msg", "各知识模块得分情况分析存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allAbilityNameProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各认知层次得分情况分析存储过程失败");
	        	map.put("msg", "各认知层次得分情况分析存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allQuestionTypeProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各题型得分情况分析存储过程失败");
	        	map.put("msg", "各题型得分情况分析存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allQuestionNoProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("各小题得分情况分析存储过程失败");
	        	map.put("msg", "各小题得分情况分析存储过程失败");
	        	return map;
	        }
	        flag = onlineSchedulingConfService.allSubjectScatterProc(examId, examRange);
	        if(flag == 0){
	        	onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        	LOGGER.error("难度分布存储过程失败");
	        	map.put("msg", "难度分布存储过程失");
	        	return map;
	        }
	        onlineSchedulingConfService.updateOnlineSchedulingConfById(examId,"0");
	        LOGGER.info("后台执行成功");
	        System.out.println("后台执行完成");
	        map.put("msg", "后台执行成功");
		}
        
    	return map;
    }

}
