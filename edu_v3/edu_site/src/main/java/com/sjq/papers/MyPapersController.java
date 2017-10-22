package com.sjq.papers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;
import com.sjq.detail.bean.PapersDetailBean;
import com.sjq.detail.search.ExamDetailSearch;
import com.sjq.detail.search.PapersDetailSearch;
import com.sjq.detail.service.ExamDetailService;
import com.sjq.detail.service.PapersDetailService;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.bean.PapersInfoBean;
import com.sjq.info.search.PapersInfoSearch;
import com.sjq.info.service.PapersInfoService;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.question.bean.PapersQuestionBean;
import com.sjq.question.search.PapersQuestionSearch;
import com.sjq.question.service.PapersQuestionService;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherHistory.service.BaseTeacherHistoryService;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;

@Controller
@RequestMapping(value = "/papers/mypapers")
public class MyPapersController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="papers/";
	
	// 试卷模块-试卷明细信息页面 
	private static final String PAGE = "papers_mypapers_page";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(MyPapersController.class);
	
	@Autowired
	private PapersInfoService papersInfoService;
	
	@Autowired
	private PapersDetailService papersDetailService;
	
	@Autowired
	private PapersQuestionService papersQuestionService;
	
	@Autowired
	private ExamDetailService examDetailService;
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private BaseSubjectService baseSubjectService;
	
	@Autowired
	private BaseTeacherHistoryService baseTeacherHistoryService;
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	
	/**
	 * 
	 * @MethodName:queryMyAllPapersList
	 * @Description:查询我的所有卷子
	 * @param request
	 * @param response
	 * @param pb
	 * @param search
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView queryMyAllPapersList(HttpServletRequest request, HttpServletResponse response, PageBean pb,PapersInfoSearch search) {
		LOGGER.info("跳转到我的卷子界面...");
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setCreateName(cu.getUsername());//只能查询自己的卷子
		Map<String,String> examTypeMap = new HashMap<String,String>();//考试类型
		examTypeMap.put("1", "单元考");
		examTypeMap.put("2", "月考");
		examTypeMap.put("3", "期中考");
		examTypeMap.put("4", "期末考");
		if(cu.getRole().getCode().equals("ROLE_09")){//角色为老师
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			List<BaseTeacherHistoryVo> baseHistoryGradeVoList = baseTeacherHistoryService.queryGreadeByTeacherId(baseTeacherVo.getId());
			if(search.getGradeId() == null) search.setGradeId(baseHistoryGradeVoList!=null&&baseHistoryGradeVoList.size()>0&&baseHistoryGradeVoList.get(0).getBaseGradeVo()!=null?baseHistoryGradeVoList.get(0).getBaseGradeVo().getId():null);
			List<BaseTeacherHistoryVo> baseHistorySubjectVoList = baseTeacherHistoryService.querySubjectByTeacherId(baseTeacherVo.getId());
			if(search.getSubjectId() == null) search.setSubjectId(baseHistorySubjectVoList!=null&&baseHistorySubjectVoList.size()>0&&baseHistorySubjectVoList.get(0).getBaseSubjectVo()!=null?baseHistorySubjectVoList.get(0).getBaseSubjectVo().getId():null);
			mav.addObject("baseHistoryGradeVoList", baseHistoryGradeVoList);
			mav.addObject("baseHistorySubjectVoList", baseHistorySubjectVoList);
			mav.addObject("role", 0);
		}else{
			examTypeMap.put("5", "市级考试");
			List<BaseGradeVo> baseGradeVoList = baseGradeService.queryAllBaseGrade();//年级集合
			if(search.getGradeId() == null) search.setGradeId(baseGradeVoList!=null&baseGradeVoList.size()>0?baseGradeVoList.get(0).getId():null);
			List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryAllBaseSubject();//学科集合
			if(search.getSubjectId() == null) search.setSubjectId(baseSubjectVoList!=null&baseSubjectVoList.size()>0?baseSubjectVoList.get(0).getId():null);
			mav.addObject("baseGradeVoList", baseGradeVoList);
			mav.addObject("baseSubjectVoList", baseSubjectVoList);
			mav.addObject("role", 1);
		}
		if(search.getExamType() == null) search.setExamType("1");
		PageBean pageBean = this.papersInfoService.queryPapersInfoPage(pb, search);
		mav.addObject("examTypeMap", examTypeMap);
		mav.addObject("search", search);//查询条件
		mav.addObject("pb", pageBean);
		mav.setViewName(PAGE_FOLDER + PAGE);
		return mav;
	}
	
	/**
	 * 
	 * @MethodName:ajaxDeleteMyPapersRequest
	 * @Description:删除我的卷子
	 * @param paperId
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@Transactional
	@ResponseBody
	@RequestMapping(value = "/list/delete" , method = RequestMethod.POST)
	public int ajaxDeleteMyPapersRequest(Long paperId,HttpServletRequest reuqest,HttpServletResponse response) throws Exception {
		LOGGER.info("删除我的卷子...");
		//删除前先判断该卷子是否有发布过，若发布过，则不允许删除。
		ExamDetailSearch examDetailSearch = new ExamDetailSearch();
		examDetailSearch.setPaperId(paperId);
		List<ExamDetailVo> examDetailVoList = examDetailService.queryExamDetailBySearch(examDetailSearch);//后续这里改成查count条数
		if(examDetailVoList.size()>0){
			return 0;
		}
		PapersInfoBean papersInfoBean = new PapersInfoBean();
		papersInfoBean.setId(paperId);
		papersInfoService.deletePapersInfoById(papersInfoBean);//删除试卷信息
		
		PapersDetailSearch papersDetailSearch = new PapersDetailSearch();
		papersDetailSearch.setPaperId(paperId);
		papersDetailService.deletePapersDetailBySearch(new PapersDetailBean(), papersDetailSearch);//删除试卷明细信息
		
		PapersQuestionSearch papersQuestionSearch = new PapersQuestionSearch();
		papersQuestionSearch.setPaperId(paperId);
		papersQuestionService.deletePapersQuestionBySearch(new PapersQuestionBean(), papersQuestionSearch);//删除试卷试题信息
		
		return 1;
	}
	
	/**
	 * 
	 * @MethodName:previewMyPapers
	 * @Description:查看我的卷子
	 * @param id
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "list/preview", method = RequestMethod.GET)
	public ModelAndView previewMyPapers(@RequestParam(value="paperId")Long paperId,HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("查看我的卷子...");
		ModelAndView mav = new ModelAndView();
		PapersInfoVo papersInfoVo = papersInfoService.queryPapersInfoById(paperId);//试卷信息
		PapersDetailSearch papersDetailSearch = new PapersDetailSearch();
		papersDetailSearch.setPaperId(paperId);
		List<PapersDetailVo> papersDetailVoList = papersDetailService.queryPapersDetailBySearch(papersDetailSearch);//试卷明细信息
		Map<String,List<PapersQuestionVo>> papersQuestionVoMap = new LinkedHashMap<String,List<PapersQuestionVo>>();//题型--题目集合
		Map<String,String> questionQuScoreMap = new LinkedHashMap<String,String>();//题型--分数
		Map<String,String> questionQuQuantityMap = new LinkedHashMap<String,String>();//题型--题量
		Map<String,String> questionTypeMap = new LinkedHashMap<String,String>();//题型--题型名称
		
		List<PapersQuestionVo> papersQuestionVoList;//试卷题型对应的试题集合
		PapersQuestionSearch papersQuestionSearch;//试卷试题查询条件
		for (int i = 0; i < papersDetailVoList.size(); i++) {
			papersQuestionSearch = new PapersQuestionSearch();
			papersQuestionSearch.setPaperDetailId(papersDetailVoList.get(i).getId());
			papersQuestionVoList = new ArrayList<PapersQuestionVo>();
			papersQuestionVoList = papersQuestionService.queryPapersQuestionBySearch(papersQuestionSearch);
			papersQuestionVoMap.put(papersDetailVoList.get(i).toString(), papersQuestionVoList);
			questionQuScoreMap.put(papersDetailVoList.get(i).toString(), papersDetailVoList.get(i).getQuScore().toString());
			questionQuQuantityMap.put(papersDetailVoList.get(i).toString(),papersDetailVoList.get(i).getQuQuantity().toString());
			questionTypeMap.put(papersDetailVoList.get(i).toString(),papersDetailVoList.get(i).getQuestionTypeVo().getTypeName());
		}
		mav.addObject("papersInfoVo", papersInfoVo); //试卷信息
		mav.addObject("papersDetailVoList",papersDetailVoList);//试卷明细信息
		mav.addObject("papersQuestionVoMap",papersQuestionVoMap);//试卷试题信息
		mav.addObject("questionQuScoreMap",questionQuScoreMap);//题型--分数
		mav.addObject("questionQuQuantityMap",questionQuQuantityMap);//题型--题量
		mav.addObject("questionTypeMap",questionTypeMap);//题型--题型名称
		mav.setViewName("papers/papers_preview_page");
		return mav;
		
	}
	
}