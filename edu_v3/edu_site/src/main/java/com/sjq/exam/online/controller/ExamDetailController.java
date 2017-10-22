package com.sjq.exam.online.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.sjq.detail.service.ExamDetailService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.staff.service.BaseStaffService;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.stageGrade.search.BaseStageGradeSearch;
import com.sjq.stageGrade.service.BaseStageGradeService;
import com.sjq.student.bean.ExamStudentBean;
import com.sjq.student.search.BaseStudentSearch;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.service.ExamStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.security.util.CustomUser;
import com.sjq.area.service.BaseAreaService;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.detail.bean.ExamDetailBean;
import com.sjq.info.search.PapersInfoSearch;
import com.sjq.info.service.PapersInfoService;
import com.sjq.info.vo.ExamInfoVo;

@Controller
@RequestMapping(value = "/exam/online/examdetail")
public class ExamDetailController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="exam/online/";
	
	// 线上考试-考试明细信息页面 
	private static final String PAGE = "exam_online_add_single";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(ExamDetailController.class);
	
	@Autowired
	private ExamDetailService examDetailService;
	
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	
	@Autowired
	private PapersInfoService papersInfoService;
	
	@Autowired
	private BaseAreaService baseAreaService;
	
	@Autowired
	private BaseClassesService baseClassesService;
	
	@Autowired
	private ExamStudentService examStudentService;
	
	@Autowired
	private BaseStudentService baseStudentService;
	
	@Autowired
	private BaseSubjectService baseSubjectService;
	
	@Autowired
	private BaseStageGradeService baseStageGradeService;
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	
	@Autowired
	private BaseStaffService baseStaffService;

	/**
	 * 
	 * @MethodName:addSingleExamRequest
	 * @Description:添加单科考试界面
	 * @param request
	 * @param response
	 * @param gradeId
	 * @param examId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list")
	public ModelAndView addSingleExamRequest(HttpServletRequest request, HttpServletResponse response,ExamInfoVo examInfoVo) throws Exception {
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_09")){
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			BaseTeacherClassesSearch search = new BaseTeacherClassesSearch();
			search.setTeacherId(baseTeacherVo.getId());//获取登录人教师id
			search.setGradeId(examInfoVo.getGradeId());
			List<BaseTeacherClassesVo> baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(search);
			List<BaseTeacherClassesVo> subjctList = baseTeacherClassesService.queryDistinctBaseTeacherClassesBySearch(search);
			mav.addObject("subjctList", subjctList);
			mav.addObject("baseTeacherClassesVoList", baseTeacherClassesVoList);
			mav.addObject("role", 0);//0老师
			mav.addObject("subjectId", subjctList.get(0).getBaseSubjectVo().getId());
		}else{
			BaseStageGradeSearch baseStageGradeSearch = new BaseStageGradeSearch();
			baseStageGradeSearch.setGradeId(examInfoVo.getGradeId());
			Long stageId = baseStageGradeService.queryBaseStageGradeBySearch(baseStageGradeSearch).get(0).getStageId();
			List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryBaseSubjectByStageId(stageId);
			mav.addObject("baseSubjectVoList", baseSubjectVoList);
			if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
				//区级角色
				BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
				BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
				baseClassesSearch.setGradeId(examInfoVo.getGradeId());
				baseClassesSearch.setAreaId(baseStaffVo.getAreaId());
				mav.addObject("schoolList",baseClassesService.queryBaseClassesByAreaId(baseClassesSearch));
				mav.addObject("role", 2);
			}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
				//校级角色
				BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
				BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
				baseClassesSearch.setGradeId(examInfoVo.getGradeId());
				baseClassesSearch.setSchoolId(baseStaffVo.getSchoolId());
				mav.addObject("classList",baseClassesService.queryBaseClassesBySearch(baseClassesSearch));
				mav.addObject("role", 3);
			}else{
				//市级或其他
				mav.addObject("regionList", baseAreaService.queryAllBaseArea());
				mav.addObject("role", 1);
			}
			mav.addObject("subjectId", baseSubjectVoList.get(0).getId());
		}
		/*mav.addObject("examType", examInfoVo.getExamType());
		mav.addObject("gradeId", examInfoVo.getGradeId());
		mav.addObject("examId", examInfoVo.getId());
		mav.addObject("startTime", examInfoVo.getStartTime());
		mav.addObject("endTime", examInfoVo.getEndTime());*/
		mav.addObject("examInfoVo", examInfoVo);
		mav.setViewName(PAGE_FOLDER + PAGE);
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:ajaxQueryPapers
	 * @Description:根据条件查询试卷
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxQueryPapers")
	@ResponseBody
	public PageBean ajaxQueryPapers(PapersInfoSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setCreateName(cu.getUsername());
		search.setIsSubjective("0");
		PageBean pageBean = this.papersInfoService.queryPapersInfoPage(pb, search);
		return pageBean;
	}
				
	/**
	 * 
	 * @MethodName:ajaxInsertExamDetail
	 * @Description:保存单科考试内容及参考人员
	 * @param bean
	 * @param classId
	 * @param regionId
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/online/save")
	@Transactional
	public String ajaxInsertExamDetail(ExamDetailBean bean,Long[] classId,Long[] schoolId,Long[] regionId,String examMethod,HttpServletRequest reuqest,HttpServletResponse response) throws Exception{
		LOGGER.info("新增单科考试..");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		Date date = new Date();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(date);
		BaseStudentSearch baseStudentSearch;//学生查询条件
		List<BaseStudentVo> baseStudentVoList;//学生集合
		ExamStudentBean examStudentBean;//考生信息bean
		this.examDetailService.insertExamDetail(bean);//保存考试明细
		if(examMethod.equals("0")){
			if(classId != null && classId.length>0){
				for (int i = 0; i < classId.length; i++) {//后续优化
					baseStudentSearch = new BaseStudentSearch();
					baseStudentSearch.setClassesId(classId[i]);
					baseStudentSearch.setGradeId(bean.getGradeId());
					baseStudentVoList = baseStudentService.queryBaseStudentBySearch(baseStudentSearch);
					for (int j = 0; j < baseStudentVoList.size(); j++) {
						examStudentBean = new ExamStudentBean();
						examStudentBean.setCreateName(cu.getUsername());
						examStudentBean.setCreateTime(date);
						examStudentBean.setExamId(bean.getExamId());
						examStudentBean.setExamDetailId(bean.getId());
						examStudentBean.setPaperId(bean.getPaperId());
						examStudentBean.setStudentId(baseStudentVoList.get(j).getNumber());
						examStudentBean.setSex(baseStudentVoList.get(j).getSex());
						examStudentBean.setStudentName(baseStudentVoList.get(j).getName());
						examStudentBean.setStatus("1");
						examStudentBean.setIsSubmit("0");
						examStudentBean.setDistrictId(baseStudentVoList.get(j).getAreaId());
						examStudentBean.setSchoolId(baseStudentVoList.get(j).getSchoolId());
						examStudentBean.setClassId(baseStudentVoList.get(j).getClassesId());
						examStudentBean.setSubjectId(bean.getSubjectId());
						examStudentService.insertExamStudent(examStudentBean);
					}
				}
			}else if(schoolId != null && schoolId.length>0){
				for (int i = 0; i < schoolId.length; i++) {
					baseStudentSearch = new BaseStudentSearch();
					baseStudentSearch.setSchoolId(schoolId[i]);
					baseStudentSearch.setGradeId(bean.getGradeId());
					baseStudentVoList = baseStudentService.queryBaseStudentBySearch(baseStudentSearch);
					for (int j = 0; j < baseStudentVoList.size(); j++) {
						examStudentBean = new ExamStudentBean();
						examStudentBean.setCreateName(cu.getUsername());
						examStudentBean.setCreateTime(date);
						examStudentBean.setExamId(bean.getExamId());
						examStudentBean.setExamDetailId(bean.getId());
						examStudentBean.setPaperId(bean.getPaperId());
						examStudentBean.setStudentId(baseStudentVoList.get(j).getNumber());
						examStudentBean.setSex(baseStudentVoList.get(j).getSex());
						examStudentBean.setStudentName(baseStudentVoList.get(j).getName());
						examStudentBean.setStatus("1");
						examStudentBean.setIsSubmit("0");
						examStudentBean.setDistrictId(baseStudentVoList.get(j).getAreaId());
						examStudentBean.setSchoolId(baseStudentVoList.get(j).getSchoolId());
						examStudentBean.setClassId(baseStudentVoList.get(j).getClassesId());
						examStudentBean.setSubjectId(bean.getSubjectId());
						examStudentService.insertExamStudent(examStudentBean);
					}
				}
			}else{
				for (int i = 0; i < regionId.length; i++) {
					baseStudentSearch = new BaseStudentSearch();
					baseStudentSearch.setAreaId(regionId[i]);
					baseStudentSearch.setGradeId(bean.getGradeId());
					baseStudentVoList = baseStudentService.queryBaseStudentBySearch(baseStudentSearch);
					for (int j = 0; j < baseStudentVoList.size(); j++) {
						examStudentBean = new ExamStudentBean();
						examStudentBean.setCreateName(cu.getUsername());
						examStudentBean.setCreateTime(date);
						examStudentBean.setExamId(bean.getExamId());
						examStudentBean.setExamDetailId(bean.getId());
						examStudentBean.setPaperId(bean.getPaperId());
						examStudentBean.setStudentId(baseStudentVoList.get(j).getNumber());
						examStudentBean.setSex(baseStudentVoList.get(j).getSex());
						examStudentBean.setStudentName(baseStudentVoList.get(j).getName());
						examStudentBean.setStatus("1");
						examStudentBean.setIsSubmit("0");
						examStudentBean.setDistrictId(baseStudentVoList.get(j).getAreaId());
						examStudentBean.setSchoolId(baseStudentVoList.get(j).getSchoolId());
						examStudentBean.setClassId(baseStudentVoList.get(j).getClassesId());
						examStudentBean.setSubjectId(bean.getSubjectId());
						examStudentService.insertExamStudent(examStudentBean);
					}
				}
			}
		}
		return "redirect:/exam/online/manage/list.htm";
	}
			
	    
}