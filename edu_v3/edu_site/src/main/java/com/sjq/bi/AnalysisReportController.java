package com.sjq.bi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.bi.search.BiSearch;
import com.sjq.bi.servlet.BiService;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.service.ExamInfoService;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.parent.service.BaseParentService;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.staff.service.BaseStaffService;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.student.search.ExamStudentSearch;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.service.ExamStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherHistory.search.BaseTeacherHistorySearch;
import com.sjq.teacherHistory.service.BaseTeacherHistoryService;
import com.sjq.teacherHistory.vo.BaseTeacherHistoryVo;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

@Controller
@RequestMapping(value = "/bi/analysis")
public class AnalysisReportController {
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(AnalysisReportController.class);
	
	@Autowired
	private BiService biService;
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private ExamStudentService examStudentService;
	
	@Autowired
	private BaseStudentService baseStudentService;
	
	@Autowired
	private BaseStaffService baseStaffService;
	
	@Autowired
	private BaseParentService baseParentService;
	
	@Autowired
	private BaseTeacherHistoryService baseTeacherHistoryService;
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	
	@Autowired
	private ExamInfoService examInfoService;
	
	/**
     * 
     * @MethodName:addExamRequest
     * @Description:查询考试，考试管理界面
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/list")
	public ModelAndView queryExamRequest(HttpServletRequest request, HttpServletResponse response,ExamStudentSearch search,PageBean pb) throws Exception {
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setIsSubmit("1");
		PageBean pageBean = new PageBean();
		if(cu.getRole().getCode().equals("ROLE_11")){
			//学生
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
			search.setStudentId(baseStudentVo.getNumber());
			if(search.getExamType() == null){
				search.setExamType("1");
			}
			List<BaseGradeVo> baseGradeVoList= baseGradeService.queryAllBaseGrade();
			mav.addObject("baseGradeVoList", baseGradeVoList);
			if(search.getGradeId() == null){
				search.setGradeId(baseGradeVoList.get(0).getId());
			}
			pageBean = examStudentService.queryDistinctExamStudentPage(pb, search);
		}else if(cu.getRole().getCode().equals("ROLE_10")){
			//家长
			BaseParentVo baseParentVo= baseParentService.queryBaseParentByUserId(cu.getUserId());
			search.setStudentId(baseParentVo.getBaseStudentVo().getNumber());
			if(search.getExamType() == null){
				search.setExamType("1");
			}
			List<BaseGradeVo> baseGradeVoList= baseGradeService.queryAllBaseGrade();
			mav.addObject("baseGradeVoList", baseGradeVoList);
			if(search.getGradeId() == null){
				search.setGradeId(baseGradeVoList.get(0).getId());
			}
			pageBean = examStudentService.queryDistinctExamStudentPage(pb, search);
		}else if(cu.getRole().getCode().equals("ROLE_02") || cu.getRole().getCode().equals("ROLE_03") || cu.getRole().getCode().equals("Role_7")){
			//市级角色
			search.setExamRange("4");
			if(search.getExamType() == null){
				search.setExamType("1");
			}
			List<BaseGradeVo> baseGradeVoList= baseGradeService.queryAllBaseGrade();
			mav.addObject("baseGradeVoList", baseGradeVoList);
			if(search.getGradeId() == null){
				search.setGradeId(baseGradeVoList.get(0).getId());
			}
			pageBean = examStudentService.queryDistinctExamStudentPage(pb, search);
		}else if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
			//区级角色
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			search.setDistrictId(baseStaffVo.getAreaId());
			search.setExamRange("3");
			if(search.getExamType() == null){
				search.setExamType("1");
			}
			List<BaseGradeVo> baseGradeVoList= baseGradeService.queryAllBaseGrade();
			mav.addObject("baseGradeVoList", baseGradeVoList);
			if(search.getGradeId() == null){
				search.setGradeId(baseGradeVoList.get(0).getId());
			}
			pageBean = examStudentService.queryDistinctExamStudentPage(pb, search);
		}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
			//校级角色
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			search.setSchoolId(baseStaffVo.getSchoolId());
			search.setExamRange("2");
			if(search.getExamType() == null){
				search.setExamType("1");
			}
			List<BaseGradeVo> baseGradeVoList= baseGradeService.queryAllBaseGrade();
			mav.addObject("baseGradeVoList", baseGradeVoList);
			if(search.getGradeId() == null){
				search.setGradeId(baseGradeVoList.get(0).getId());
			}
			pageBean = examStudentService.queryDistinctExamStudentPage(pb, search);
		}else if(cu.getRole().getCode().equals("ROLE_09")){
			//老师角色
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			List<BaseTeacherHistoryVo> baseHistoryGradeVoList = baseTeacherHistoryService.queryGreadeByTeacherId(baseTeacherVo.getId());
			mav.addObject("baseHistoryGradeVoList", baseHistoryGradeVoList);
			BaseTeacherHistorySearch baseTeacherHistorySearch = new BaseTeacherHistorySearch();
			baseTeacherHistorySearch.setTeacherId(baseTeacherVo.getId());
			baseTeacherHistorySearch.setGradeId(baseHistoryGradeVoList.get(0).getGradeId());
			List<BaseTeacherHistoryVo> baseTeacherHistoryVoList= baseTeacherHistoryService.queryBaseTeacherHistoryBySearch(baseTeacherHistorySearch);
			if(search.getGradeId() == null){
				search.setGradeId(baseHistoryGradeVoList.get(0).getBaseGradeVo().getId());
			}
			if(search.getClassId() == null){
				search.setClassId(baseHistoryGradeVoList.get(0).getBaseClassesVo().getId());
			}
			if(search.getExamType() == null){
				search.setExamType("1");
			}
			mav.addObject("baseTeacherHistoryVoList", baseTeacherHistoryVoList);
			search.setExamRange("1");
			pageBean = examStudentService.queryDistinctExamStudentPage(pb, search);
		}
		Map<String,String> examTypeMap = new HashMap<String,String>();
		examTypeMap.put("1", "单元考");
		examTypeMap.put("2", "月考");
		examTypeMap.put("3", "期中考");
		examTypeMap.put("4", "期末考");
		examTypeMap.put("5", "市级考试");
		mav.addObject("examTypeMap", examTypeMap);
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.setViewName("bi/bi_analysyis_xueye");
        return mav;
	}
	
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseTeacherHistoryVo> ajaxQueryBaseTeacherHistoryBySearch(BaseTeacherHistorySearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
		search.setTeacherId(baseTeacherVo.getId());
		return this.baseTeacherHistoryService.queryBaseTeacherHistoryBySearch(search);
	    
	}
	
	/**
	 * 
	 * @MethodName:analysisReportRequest
	 * @Description:查看分析报告
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list/report")
	public ModelAndView analysisReportRequest(HttpServletRequest request, HttpServletResponse response,Long examId,Long classId) throws Exception {
		LOGGER.info("查看分析报告...");
		ModelAndView mav = new ModelAndView();
		ExamInfoVo examInfoVo =examInfoService.queryExamInfoById(examId);
		mav.addObject("examInfoVo", examInfoVo);
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_02") || cu.getRole().getCode().equals("ROLE_03") || cu.getRole().getCode().equals("Role_7")){
			//市级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			List<Map<String,Object>> biCitySurveyVoMap = biService.queryBiCitySurveyBySearch(biSearch);
			mav.addObject("biCitySurveyVoMap", biCitySurveyVoMap);
			mav.setViewName("bi/bi_analysis_city");
		}else if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
			//区级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			biSearch.setDistrictId(baseStaffVo.getAreaId());
			List<Map<String,Object>> biRegionSurveyVoMap = biService.queryBiRegionSurveyBySearch(biSearch);
			mav.addObject("biRegionSurveyVoMap", biRegionSurveyVoMap);
			mav.setViewName("bi/bi_analysis_area");
		}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
			//校级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			biSearch.setSchoolId(baseStaffVo.getSchoolId());
			List<Map<String,Object>> biSchoolSurveyVoMap = biService.queryBiSchoolSurveyBySearch(biSearch);
			mav.addObject("biSchoolSurveyVoMap", biSchoolSurveyVoMap);
			mav.setViewName("bi/bi_analysis_school");
		}else if(cu.getRole().getCode().equals("ROLE_09")){
			//班级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			biSearch.setClassId(classId);
			List<Map<String,Object>> biClazzSurveyVoMap = biService.queryBiClazzSurveyBySearch(biSearch);
			mav.addObject("biClazzSurveyVoMap", biClazzSurveyVoMap);
			mav.setViewName("bi/bi_analysis_class");
		}else if(cu.getRole().getCode().equals("ROLE_10") || cu.getRole().getCode().equals("ROLE_11")){
			//学生或家长
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
			biSearch.setStudentId(baseStudentVo.getNumber());
			List<Map<String,Object>> biStudentSurveyMap = biService.queryBiStudentSurveyBySearch(biSearch);
			mav.addObject("biStudentSurveyMap", biStudentSurveyMap);
			List<Map<String,Object>> biStudentAbilityMap = biService.queryBiStudentAbilityBySearch(biSearch);
			mav.addObject("biStudentAbilityMap", biStudentAbilityMap);
			List<Map<String,Object>> biStudentPointMap = biService.queryBiStudentPointBySearch(biSearch);
			mav.addObject("biStudentPointMap", biStudentPointMap);
			List<Map<String,Object>> biStudentQuestionTypeMap = biService.queryBiStudentQuestionTypeBySearch(biSearch);
			mav.addObject("biStudentQuestionTypeMap", biStudentQuestionTypeMap);
			mav.setViewName("bi/bi_analysis_student");
		}
        return mav;
	}
	
	
	@RequestMapping("/ajaxQueryAnalysisReport")
	@ResponseBody
	public Map<String,List<Map<String,Object>>> ajaxQueryAnalysisReport(HttpServletRequest request, HttpServletResponse response,Long examId,Long classId) {
		Map<String,List<Map<String,Object>>> mapList = new HashMap<String,List<Map<String,Object>>>();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_02") || cu.getRole().getCode().equals("ROLE_03") || cu.getRole().getCode().equals("Role_7")){
			//市级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			List<Map<String,Object>> biCitySurveyVoMap = biService.queryBiCitySurveyBySearch(biSearch);
		}else if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
			//区级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			biSearch.setDistrictId(baseStaffVo.getAreaId());
			List<Map<String,Object>> biRegionSurveyVoMap = biService.queryBiRegionSurveyBySearch(biSearch);
		}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
			//校级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			biSearch.setSchoolId(baseStaffVo.getSchoolId());
			List<Map<String,Object>> biSchoolSurveyVoMap = biService.queryBiSchoolSurveyBySearch(biSearch);
		}else if(cu.getRole().getCode().equals("ROLE_09")){
			//班级角色
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			biSearch.setClassId(classId);
			List<Map<String,Object>> biClazzSurveyVoMap = biService.queryBiClazzSurveyBySearch(biSearch);
		}else if(cu.getRole().getCode().equals("ROLE_10") || cu.getRole().getCode().equals("ROLE_11")){
			//学生或家长
			BiSearch biSearch = new BiSearch();
			biSearch.setExamId(examId);
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
			biSearch.setStudentId(baseStudentVo.getNumber());
			List<Map<String,Object>> biStudentSurveyMap = biService.queryBiStudentSurveyBySearch(biSearch);
			List<Map<String,Object>> biStudentAbilityMap = biService.queryBiStudentAbilityBySearch(biSearch);
			List<Map<String,Object>> biStudentPointMap = biService.queryBiStudentPointBySearch(biSearch);
			List<Map<String,Object>> biStudentQuestionTypeMap = biService.queryBiStudentQuestionTypeBySearch(biSearch);
			mapList.put("biStudentSurveyMap", biStudentSurveyMap);
			mapList.put("biStudentAbilityMap", biStudentAbilityMap);
			mapList.put("biStudentPointMap", biStudentPointMap);
			mapList.put("biStudentQuestionTypeMap", biStudentQuestionTypeMap);
			return mapList;
		}
		return null;
	}
	
}