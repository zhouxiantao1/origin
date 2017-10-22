package com.sjq.exam.online.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.student.service.BaseStudentService;
import com.sjq.student.service.ExamStudentService;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;
import com.sjq.detail.search.PapersDetailSearch;
import com.sjq.detail.service.ExamDetailService;
import com.sjq.detail.service.PapersDetailService;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.info.service.ExamInfoService;
import com.sjq.info.service.PapersInfoService;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.paperscore.bean.ExamPaperscoreBean;
import com.sjq.paperscore.service.ExamPaperscoreService;
import com.sjq.paperscore.vo.ExamPaperscoreVo;
import com.sjq.question.search.PapersQuestionSearch;
import com.sjq.question.service.PapersQuestionService;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.questionscore.bean.ExamQuestionscoreBean;
import com.sjq.questionscore.search.ExamQuestionscoreSearch;
import com.sjq.questionscore.service.ExamQuestionscoreService;
import com.sjq.questionscore.vo.ExamQuestionscoreVo;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.student.bean.ExamStudentBean;
import com.sjq.student.search.ExamStudentSearch;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;

@Controller
@RequestMapping(value = "/exam/online/student")
public class ExamStudentController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="exam/online/";
	
	// 线上考试-考生信息页面 
	private static final String PAGE = "exam_online_test_list";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(ExamStudentController.class);
	
	@Autowired
	private ExamStudentService examStudentService;
	
	@Autowired
	private BaseSubjectService baseSubjectService;
	
	@Autowired
	private ExamInfoService examInfoService;
	
	@Autowired
	private ExamDetailService examDetailService;
	
	@Autowired
	private PapersInfoService papersInfoService;
	
	@Autowired
	private PapersDetailService papersDetailService;
	
	@Autowired
	private PapersQuestionService papersQuestionService;
	
	@Autowired
	private ExamPaperscoreService examPaperscoreService;
	
	@Autowired
	private ExamQuestionscoreService examQuestionscoreService;
	
	@Autowired
	private BaseStudentService baseStudentService;
	
	/**
	 * 
	 * @MethodName:examListRequest
	 * @Description:在线考试列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list")
	public ModelAndView examListRequest(PageBean pageBean,ExamStudentSearch search,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		if(search.getIsSubmit() == null){
			search.setIsSubmit("0");
		}
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		search.setGradeId(baseStudentVo.getGradeId());
		search.setStudentId(baseStudentVo.getNumber());
		
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryBaseSubjectByStageId(baseStudentVo.getStageId());
		if(search.getSubjectId() == null){
			search.setSubjectId(baseSubjectVoList.get(0).getId());
		}
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		Map<String,String> examTypeMap = new HashMap<String,String>();
		examTypeMap.put("1", "单元考");
		examTypeMap.put("2", "月考");
		examTypeMap.put("3", "期中考");
		examTypeMap.put("4", "期末考");
		examTypeMap.put("5", "市级考试");
		mav.addObject("examTypeMap", examTypeMap);
		if(search.getExamType() == null){
			search.setExamType("1");
		}
		PageBean pb = examStudentService.queryExamStudentByPage(pageBean,search);
		mav.addObject("pb", pb);
		mav.addObject("search", search);
		mav.setViewName(PAGE_FOLDER + PAGE);
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:onlineExamRequest
	 * @Description:在线考试结果页面
	 * @param request
	 * @param response
	 * @param detailName
	 * @param examId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list/exam/result")
	public ModelAndView onlineExamRequest(HttpServletRequest request, HttpServletResponse response,String detailName,Long examId) throws Exception {
		ModelAndView mav = new ModelAndView();
		ExamStudentSearch examStudentSearch = new ExamStudentSearch();
		examStudentSearch.setIsSubmit("0");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		examStudentSearch.setStudentId(baseStudentVo.getNumber());
		List<ExamStudentVo> examStudentVoList = examStudentService.queryExamStudentBySearch(examStudentSearch);
		List<ExamDetailVo> examDetailVoList = new ArrayList<ExamDetailVo>();
		Map<String,ExamInfoVo> examInfoMap = new HashMap<String,ExamInfoVo>();//考试
		Map<String,List<ExamDetailVo>> examDetailMap = new HashMap<String,List<ExamDetailVo>>();//key考试id  value考试明细集合
		ExamDetailVo examDetailVo;
		ExamInfoVo examInfoVo;
		for (int i = 0; i < examStudentVoList.size(); i++) {//后续优化 参考examListRequest
			examDetailVo = examStudentVoList.get(i).getExamDetailVo();//考试明细
			examInfoVo = examStudentVoList.get(i).getExamInfoVo();//考试
			if(i == 0){
				examDetailVoList.add(examDetailVo);
				if(examStudentVoList.size() == 1){//只有一个
					examDetailMap.put(examDetailVo.getExamId().toString(), examDetailVoList);
					examInfoMap.put(examDetailVo.getExamId().toString(), examInfoVo);
				}
			}else if(examInfoVo.getId() == examStudentVoList.get(i-1).getExamInfoVo().getId()){//第二个的考试id=第一个的考试id,即同一场考试
				examDetailVoList.add(examDetailVo);
				if(i==examStudentVoList.size()-1){//当最后一个也相同时，说明只有一个大考
					examDetailMap.put(examDetailVo.getExamId().toString(), examDetailVoList);
					examInfoMap.put(examDetailVo.getExamId().toString(), examInfoVo);
				}
			}else{//第二个的考试id!=第一个的考试id,即不是同一场考试
				if(i==examStudentVoList.size()-1){//最后一个并且最好一个与前一个不是同一场考试
					ExamDetailVo examDetailVo1 = examStudentVoList.get(i-1).getExamDetailVo();//前一个考试明细
					ExamInfoVo examInfoVo1 = examStudentVoList.get(i-1).getExamInfoVo();//前一个考试
					examDetailMap.put(examDetailVo1.getExamId().toString(), examDetailVoList);
					examInfoMap.put(examDetailVo1.getExamId().toString(), examInfoVo1);
					
					examDetailVoList = new ArrayList<ExamDetailVo>();
					examDetailVoList.add(examDetailVo);
					examDetailMap.put(examDetailVo.getExamId().toString(), examDetailVoList);
					examInfoMap.put(examDetailVo.getExamId().toString(), examInfoVo);
				}else{
					examDetailMap.put(examDetailVoList.get(0).getExamId().toString(), examDetailVoList);
					examInfoMap.put(examDetailVoList.get(0).getExamId().toString(), examStudentVoList.get(i-1).getExamInfoVo());
					examDetailVoList = new ArrayList<ExamDetailVo>();
					examDetailVoList.add(examDetailVo);
				}
			}
		} 
		mav.addObject("examMap", examDetailMap);
		mav.addObject("examInfoMap", examInfoMap);
		mav.addObject("detailName", detailName);//试卷名称
		mav.setViewName("exam/online/exam_online_test_result");
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:onlineExamRequest
	 * @Description:线上考试
	 * @param request
	 * @param response
	 * @param examId
	 * @param paperId
	 * @param detailId
	 * @param examStudentId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list/exam")
	public ModelAndView onlineExamRequest(HttpServletRequest request, HttpServletResponse response,Long examId,Long paperId,Long detailId) throws Exception {
		ModelAndView mav = new ModelAndView();
		ExamInfoVo examInfoVo = examInfoService.queryExamInfoById(examId);//考试信息
		ExamDetailVo examDetailVo = examDetailService.queryExamDetailById(detailId);//考试信息明细
		PapersInfoVo papersInfoVo = papersInfoService.queryPapersInfoById(paperId);//试卷
		PapersDetailSearch papersDetailSearch = new PapersDetailSearch();
		papersDetailSearch.setPaperId(paperId);
		List<PapersDetailVo> papersDetailVoList = papersDetailService.queryPapersDetailBySearch(papersDetailSearch);//试卷明细
		PapersQuestionSearch PapersQuestionSearch;
		Map<String,List<PapersQuestionVo>> papersQuestionVoMap = new HashMap<String,List<PapersQuestionVo>>();
		List<PapersQuestionVo> papersQuestionVoList = new ArrayList<PapersQuestionVo>();
		for (int i = 0; i < papersDetailVoList.size(); i++) {
			PapersQuestionSearch = new PapersQuestionSearch();
			PapersQuestionSearch.setPaperDetailId(papersDetailVoList.get(i).getId());
			papersQuestionVoList = papersQuestionService.queryPapersQuestionBySearch(PapersQuestionSearch);
			papersQuestionVoMap.put(papersDetailVoList.get(i).getId().toString(), papersQuestionVoList);
			
		}
		mav.addObject("examInfoVo", examInfoVo);
		mav.addObject("examDetailVo", examDetailVo);
		mav.addObject("papersInfoVo", papersInfoVo);
		mav.addObject("papersDetailVoList", papersDetailVoList);
		mav.addObject("papersQuestionVoMap", papersQuestionVoMap);
		mav.setViewName("exam/online/exam_online_test_respond");
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:toViewExamRequest
	 * @Description:查看答卷
	 * @param request
	 * @param response
	 * @param examId
	 * @param paperId
	 * @param detailId
	 * @param examStudentId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list/toview")
	public ModelAndView toViewExamRequest(HttpServletRequest request, HttpServletResponse response,Long examId,Long paperId,Long detailId) throws Exception {
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		ExamInfoVo examInfoVo = examInfoService.queryExamInfoById(examId);//考试信息
		ExamDetailVo examDetailVo = examDetailService.queryExamDetailById(detailId);//考试信息明细
		PapersInfoVo papersInfoVo = papersInfoService.queryPapersInfoById(paperId);//试卷
		PapersDetailSearch papersDetailSearch = new PapersDetailSearch();
		papersDetailSearch.setPaperId(paperId);
		List<PapersDetailVo> papersDetailVoList = papersDetailService.queryPapersDetailBySearch(papersDetailSearch);//试卷明细
		/*PapersQuestionSearch PapersQuestionSearch;
		Map<String,List<PapersQuestionVo>> papersQuestionVoMap = new HashMap<String,List<PapersQuestionVo>>();
		List<PapersQuestionVo> papersQuestionVoList = new ArrayList<PapersQuestionVo>();
		for (int i = 0; i < papersDetailVoList.size(); i++) {
			PapersQuestionSearch = new PapersQuestionSearch();
			PapersQuestionSearch.setPaperDetailId(papersDetailVoList.get(i).getId());
			papersQuestionVoList = papersQuestionService.queryPapersQuestionBySearch(PapersQuestionSearch);
			papersQuestionVoMap.put(papersDetailVoList.get(i).getId().toString(), papersQuestionVoList);
			for (int j = 0; j < papersQuestionVoList.size(); j++) {
				
			}
			
		}*/
		ExamQuestionscoreSearch examQuestionscoreSearch = new ExamQuestionscoreSearch();
		examQuestionscoreSearch.setExamDetailId(detailId);
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		examQuestionscoreSearch.setStudentId(baseStudentVo.getNumber());//获取登录人id的学生id
		List<ExamQuestionscoreVo> examQuestionscoreVoList = examQuestionscoreService.queryExamQuestionscoreBySearch(examQuestionscoreSearch);
		PapersQuestionVo papersQuestionVo;
		for (int i = 0; i < papersDetailVoList.size(); i++) {
			for (int j = 0; j < papersDetailVoList.get(i).getPapersQuestionVoList().size(); j++) {
				papersQuestionVo = papersDetailVoList.get(i).getPapersQuestionVoList().get(j);
				for (int j2 = 0; j2 < examQuestionscoreVoList.size(); j2++) {
					if(papersQuestionVo.getQuestionId().equals(examQuestionscoreVoList.get(j2).getQuestionId())){
						papersQuestionVo.setIsWrong(examQuestionscoreVoList.get(j2).getIsWrong());
						papersQuestionVo.setOptions(examQuestionscoreVoList.get(j2).getOptions());
					}
				}
			}
		}
		mav.addObject("examInfoVo", examInfoVo);
		mav.addObject("examDetailVo", examDetailVo);
		mav.addObject("papersInfoVo", papersInfoVo);
		mav.addObject("papersDetailVoList", papersDetailVoList);
		//mav.addObject("papersQuestionVoMap", papersQuestionVoMap);
		mav.setViewName("exam/online/exam_online_test_toview");
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:ajaxInsertExamDetail
	 * @Description:提交试卷
	 * @param examPaperscoreVo
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list/assignment",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	@Transactional
	public int ajaxInsertExamDetail(@RequestBody String examPaperscoreVo,HttpServletRequest reuqest,HttpServletResponse response) throws Exception{
		LOGGER.info("保存考生作答信息..");
		ObjectMapper mapper = new ObjectMapper();  
		ExamPaperscoreVo xamPaperscoreVo = mapper.readValue(examPaperscoreVo, ExamPaperscoreVo.class);
		//获取试卷试题的答案等信息
		ExamQuestionscoreVo examQuestionscoreVo;//试题相关信息
		List<ExamQuestionscoreVo> examQuestionscoreVoList = new ArrayList<ExamQuestionscoreVo>();//题目答案
		PapersQuestionSearch papersQuestionSearch = new PapersQuestionSearch();
		papersQuestionSearch.setPaperId(xamPaperscoreVo.getPaperId());
		List<PapersQuestionVo> papersQuestionVoList = papersQuestionService.queryPapersQuestionBySearch(papersQuestionSearch);//试卷各题型对应的题目集合
		for (int j = 0; j < papersQuestionVoList.size(); j++) {
			for (int j2 = 0; j2 < papersQuestionVoList.get(j).getQuestionWareVo().getQods().size(); j2++) {//此方法目前只针对单选题
				if(papersQuestionVoList.get(j).getQuestionWareVo().getQods().get(j2).getIs_answer().equals("1")){
					examQuestionscoreVo = new ExamQuestionscoreVo();
					examQuestionscoreVo.setAnswer(String.valueOf(j2+1));
					examQuestionscoreVo.setScore(papersQuestionVoList.get(j).getScore());
					examQuestionscoreVo.setQuestionId(papersQuestionVoList.get(j).getQuestionWareVo().getId());
					examQuestionscoreVoList.add(examQuestionscoreVo);
				}
			}
		}
		//计算总得得分
		Long score = 0l;
		List<ExamQuestionscoreVo> examQuestionscoreVoList1 = xamPaperscoreVo.getExamQuestionscoreVoList();//提交的选项集合
		for (int i = 0; i < examQuestionscoreVoList1.size(); i++) {
			if(examQuestionscoreVoList1.get(i).getOptions().equals(examQuestionscoreVoList.get(i).getAnswer())){
				score+=examQuestionscoreVoList.get(i).getScore();
			}
		}
		//考生卷面得分
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		ExamPaperscoreBean examPaperscoreBean = new ExamPaperscoreBean();
		examPaperscoreBean.setCreateName(cu.getUsername());
		examPaperscoreBean.setCreateTime(new Date());
		examPaperscoreBean.setScore(score);
		examPaperscoreBean.setStatus("1");
		examPaperscoreBean.setExamId(xamPaperscoreVo.getExamId());
		examPaperscoreBean.setExamDetailId(xamPaperscoreVo.getExamDetailId());
		examPaperscoreBean.setSubjectId(xamPaperscoreVo.getSubjectId());
		examPaperscoreBean.setStudentId(baseStudentVo.getNumber());
		examPaperscoreBean.setDistrictId(baseStudentVo.getAreaId());
		examPaperscoreBean.setSchoolId(baseStudentVo.getSchoolId());
		examPaperscoreBean.setClassId(baseStudentVo.getClassesId());
		int paperScoreId = examPaperscoreService.insertExamPaperscore(examPaperscoreBean);
		//考生卷面得分明细
		ExamQuestionscoreBean examQuestionscoreBean;
		for (int i = 0; i < examQuestionscoreVoList1.size(); i++) {//后续改成批量添加
			examQuestionscoreBean = new ExamQuestionscoreBean();
			examQuestionscoreBean.setCreateName(cu.getUsername());
			examQuestionscoreBean.setCreateTime(new Date());
			examQuestionscoreBean.setExamId(xamPaperscoreVo.getExamId());
			examQuestionscoreBean.setExamDetailId(xamPaperscoreVo.getExamDetailId());
			examQuestionscoreBean.setOptions(examQuestionscoreVoList1.get(i).getOptions());
			examQuestionscoreBean.setQuestionId(examQuestionscoreVoList1.get(i).getQuestionId());
			examQuestionscoreBean.setScore(examQuestionscoreVoList.get(i).getScore());
			if(examQuestionscoreVoList1.get(i).getOptions().equals(examQuestionscoreVoList.get(i).getAnswer())){
				examQuestionscoreBean.setIsWrong("0");
			}else{
				examQuestionscoreBean.setIsWrong("1");
			}
			examQuestionscoreBean.setPaperScoreId(new Long(paperScoreId));
			examQuestionscoreBean.setStudentId(baseStudentVo.getNumber());//获取登录人id的学生学籍号
			examQuestionscoreService.insertExamQuestionscore(examQuestionscoreBean);
		}
		//更改考试状态
		ExamStudentBean examStudentBean = new ExamStudentBean();
		examStudentBean.setIsSubmit("1");
		ExamStudentSearch examStudentSearch = new ExamStudentSearch();
		examStudentSearch.setExamDetailId(xamPaperscoreVo.getExamDetailId());//考试明细id
		examStudentSearch.setStudentId(baseStudentVo.getNumber());//获取登录人id的学生学籍号
		examStudentService.updateExamStudentBySearch(examStudentBean, examStudentSearch);
		
		return 1;
	    
	}		
	    
}