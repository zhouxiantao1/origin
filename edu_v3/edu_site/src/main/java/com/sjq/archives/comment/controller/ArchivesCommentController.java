package com.sjq.archives.comment.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.sjq.comment.service.ArchivesCommentService;
import com.sjq.util.PageBean;
import com.sjq.util.datetime.DateUtil;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.staff.service.BaseStaffService;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.student.search.BaseStudentSearch;
import com.sjq.student.search.ExamStudentSearch;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.service.ExamStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.student.vo.ExamStudentVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.security.util.CustomUser;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.comment.bean.ArchivesCommentBean;
import com.sjq.comment.search.ArchivesCommentSearch;
import com.sjq.comment.vo.ArchivesCommentVo;
import com.sjq.detail.search.PapersDetailSearch;
import com.sjq.detail.service.ExamDetailService;
import com.sjq.detail.service.PapersDetailService;
import com.sjq.detail.vo.ExamDetailVo;
import com.sjq.detail.vo.PapersDetailVo;
import com.sjq.grade.search.BaseGradeSearch;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.service.ExamInfoService;
import com.sjq.info.service.PapersInfoService;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.info.vo.PapersInfoVo;
import com.sjq.parent.service.BaseParentService;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.question.vo.PapersQuestionVo;
import com.sjq.questionscore.search.ExamQuestionscoreSearch;
import com.sjq.questionscore.service.ExamQuestionscoreService;
import com.sjq.questionscore.vo.ExamQuestionscoreVo;
import com.sjq.school.service.BaseSchoolService;
import com.sjq.school.vo.BaseSchoolVo;

/**
 * [自动生成]评语信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/archives/comment")
public class ArchivesCommentController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/archives/";
	
	// 评语信息页面 
	private static final String PAGE = "comment_list";
	private static final String STU = "comment_stu_list";
	private static final String SCH = "comment_school";
	private static final String CREATE = "comment_create";
	private static final String VIEW = "comment_view";
	private static final String PAPER = "/exam/online/exam_online_test_toview";
	
	
	// 评语信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存评语信息信息";
	private static final String OPERA_LOG_UPDATE = "更新评语信息信息";
	private static final String OPERA_LOG_DELETE = "删除评语信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除评语信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(ArchivesCommentController.class);
	
	@Autowired
	private ArchivesCommentService archivesCommentService;
	@Autowired
	private BaseStaffService baseStaffService;
	@Autowired
	private BaseSchoolService baseSchoolService;
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseGradeService baseGradeService;
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	@Autowired
	private BaseTeacherService baseTeacherService;
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private BaseSubjectService baseSubjectService;
	@Autowired
	private BaseParentService baseParentService;
	@Autowired
	private ExamStudentService examStudentService;
	@Autowired
	private ExamInfoService examInfoService;
	@Autowired
	private ExamDetailService examDetailService;
	@Autowired
	private PapersInfoService papersInfoService;
	@Autowired
	private PapersDetailService papersDetailService;
	@Autowired
	private ExamQuestionscoreService examQuestionscoreService;
				
	/**
	 * 根据条件查询所有评语信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<ArchivesCommentVo> ajaxQueryArchivesCommentBySearch(ArchivesCommentSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("评语信息");
		return this.archivesCommentService.queryArchivesCommentBySearch(search);
	    
	}
	
				
				
	/**
	 * (更新)根据ID更新所有评语信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateArchivesCommentById(ArchivesCommentBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("评语信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.archivesCommentService.updateArchivesCommentById(bean);
	    
	}
	
				
	/**
	 * (增加)增加信息评语信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertArchivesComment(ArchivesCommentBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("评语信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		//根据用户ID查询老师
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
		
		//根据班级和老师ID查询任教学科
		BaseTeacherClassesSearch baseTeacherClassesSearch = new BaseTeacherClassesSearch();
		baseTeacherClassesSearch.setTeacherId(baseTeacherVo.getId());
		baseTeacherClassesSearch.setClassesId(bean.getClassesId());
		List<BaseTeacherClassesVo> baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
		for(BaseTeacherClassesVo baseTeacherClassesVo : baseTeacherClassesVoList){
			bean.setSubjectId(baseTeacherClassesVo.getSubjectId());
		}
		Date nowTime = new Date();
		String year = String.valueOf(DateUtil.getYear(nowTime));
		//学期的时间段
		String oneStart = year+"-"+"09"+"-"+"01"+" 00:00:00";
		String oneEnd = year+"-"+"12"+"-"+"31"+" 23:59:59";
		
		String oneStart1 = year+"-"+"01"+"-"+"01"+" 00:00:00";
		String oneEnd1 = year+"-"+"03"+"-"+"01"+" 00:00:00";
		
		Date timeStart = DateUtil.StrToDate(oneStart);
		Date timeEnd = DateUtil.StrToDate(oneEnd);
		Date timeStart1 = DateUtil.StrToDate(oneStart1);
		Date timeEnd1 = DateUtil.StrToDate(oneEnd1);
		
		if((timeStart.getTime()<nowTime.getTime()&&nowTime.getTime()<timeEnd.getTime())||
				(timeStart1.getTime()<nowTime.getTime()&&nowTime.getTime()<timeEnd1.getTime())){
			bean.setTitle(year+"学年第一学期学校表现");
		}else{
			bean.setTitle(year+"学年第二学期学校表现");
		}
		
		bean.setTeacherId(baseTeacherVo.getId());
		bean.setTeacherName(baseTeacherVo.getName());
		
		return this.archivesCommentService.insertArchivesComment(bean);
	    
	}
			
				
	/**
	 * (同步)校管理员或老师查看学生学业档案列表(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllArchivesComment(ExamStudentSearch examStudentSearch, HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseStudentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的评语信息");
			
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_06")||cu.getRole().getCode().equals("ROLE_07")||cu.getRole().getCode().equals("ROLE_08")){//校级管理员
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			if(baseStaffVo!=null && baseStaffVo.getSchoolId()!=null){
				ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
				BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseStaffVo.getSchoolId());
				//通过学校获取改学校的班级信息
				BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
				baseClassesSearch.setSchoolId(baseStaffVo.getSchoolId());
				List<BaseClassesVo> baseClassesVoList = baseClassesService.queryBaseClassesBySearch(baseClassesSearch);
				
				//查询所有年级
				List<BaseGradeVo> baseGradeVoList = baseGradeService.queryBaseGradeBySearch(new BaseGradeSearch());
				
				//学生列表
				search.setSchoolId(baseStaffVo.getSchoolId());
				PageBean pageBean = baseStudentService.queryBaseStudentPage(pb, search);
				
				mav.addObject("baseClassesVoList", baseClassesVoList);
				mav.addObject("baseSchoolVo", baseSchoolVo);
				mav.addObject("baseGradeVoList", baseGradeVoList);
				mav.addObject("pb", pageBean);
				mav.addObject("search", search);
				mav.addObject("type", "1");
				return mav;
			}
			
		}else if(cu.getRole().getCode().equals("ROLE_09")){//教师
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
			ArrayList<BaseClassesVo> baseClassesVoList = new ArrayList<BaseClassesVo>(); 
			ArrayList<BaseGradeVo> baseGradeVoList = new ArrayList<BaseGradeVo>();
			
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			if(baseTeacherVo!=null){
				//通过教师ID查询不重复的年级
				List<BaseTeacherClassesVo>  teacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesByteacherId(baseTeacherVo.getId());
				
				//通过教师ID查询教师任教班级
				BaseTeacherClassesSearch baseTeacherClassesSearch = new BaseTeacherClassesSearch();
				baseTeacherClassesSearch.setTeacherId(baseTeacherVo.getId());
				List<BaseTeacherClassesVo>  baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
				for(BaseTeacherClassesVo baseTeacherClassesVo : teacherClassesVoList){
					baseGradeVoList.add(baseTeacherClassesVo.getBaseGradeVo());
				}
				for(BaseTeacherClassesVo baseTeacherClassesVo : baseTeacherClassesVoList){
					baseClassesVoList.add(baseTeacherClassesVo.getBaseClassesVo());
				}
				//查询老师所属学校
				BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseTeacherVo.getSchoolId());
				
				//学生列表
				search.setSchoolId(baseSchoolVo.getId());
				search.setTeacherId(baseTeacherVo.getId());
				PageBean pageBean = baseStudentService.queryBaseStudentPage(pb, search);
				
				mav.addObject("baseClassesVoList", baseClassesVoList);
				mav.addObject("baseSchoolVo", baseSchoolVo);
				mav.addObject("baseGradeVoList", baseGradeVoList);
				mav.addObject("pb", pageBean);
				mav.addObject("search", search);
				mav.addObject("type", "1");
//				mav.addObject("search", search);
				return mav;
			}	
		}else{//学生或家长
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + STU);
			BaseStudentVo baseStudentVo = null;
			if(cu.getRole().getCode().equals("ROLE_11")){//学生
				//根据用户ID查询学生
				baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
				
			}else if(cu.getRole().getCode().equals("ROLE_10")){
				BaseParentVo baseParentVo = baseParentService.queryBaseParentByUserId(cu.getUserId());
				baseStudentVo = baseStudentService.queryBaseStudentById(baseParentVo.getStudentId());
			}
			if(baseStudentVo!=null){
				//跟学校的ID查询学校
				BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseStudentVo.getSchoolId());
				//查询所属学段的年级
				List<BaseGradeVo> baseGradeVoList = baseGradeService.queryBaseGradeByStageId(baseStudentVo.getStageId());	
				//查询所属学段的科目
				List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryBaseSubjectByStageId(baseStudentVo.getStageId());
				
				//学生或家长
				List<ExamInfoVo> examInfoVoList = new ArrayList<ExamInfoVo>();
				examStudentSearch.setIsSubmit("1");
				examStudentSearch.setStudentId(baseStudentVo.getNumber());
//				List<ExamStudentVo> examStudentVoList = examStudentService.queryDistinctExamStudentBySearch(examStudentSearch);//考生信息集合
				PageBean pageBean = examStudentService.queryDistinctExamStudentPage(pb, examStudentSearch);//考生信息集合
//				ExamInfoVo examInfoVo;
//				Date date = new Date();
//				for (int i = 0; i < examStudentVoList.size(); i++) {
//					examInfoVo = examStudentVoList.get(i).getExamInfoVo();
//					if(date.getTime()>=examInfoVo.getEndTime().getTime()){//只有结束的考试才能有分析报告
//						examInfoVoList.add(examInfoVo);
//					}
//				} 
				
				mav.addObject("baseStudentVo", baseStudentVo);
				mav.addObject("baseSchoolVo", baseSchoolVo);
				mav.addObject("baseGradeVoList", baseGradeVoList);
				mav.addObject("baseSubjectVoList", baseSubjectVoList);
				mav.addObject("examInfoVoList", examInfoVoList);
				mav.addObject("examStudentSearch", examStudentSearch);
				mav.addObject("pageBean", pageBean);
				return mav;
			}	
		}
		return null;
	}
	
	/**
	 * (同步)学生学业档案列表(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/stulist", method = RequestMethod.GET)
	public ModelAndView queryStuArchivesComment(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseStudentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的评语信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + STU);
		
		//根据学生ID查询学生
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(search.getId());
		
		//跟学校的ID查询学校
		BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseStudentVo.getSchoolId());
		
		//查询所属学段的年级
		List<BaseGradeVo> baseGradeVoList = baseGradeService.queryBaseGradeByStageId(baseStudentVo.getStageId());
		
		//查询所属学段的科目
		List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryBaseSubjectByStageId(baseStudentVo.getStageId());
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_06")||cu.getRole().getCode().equals("ROLE_07")||cu.getRole().getCode().equals("ROLE_08")||cu.getRole().getCode().equals("ROLE_09")){
			mav.addObject("type", "1");
		}
		
		//学生或家长
		List<ExamInfoVo> examInfoVoList = new ArrayList<ExamInfoVo>();
		ExamStudentSearch examStudentSearch = new ExamStudentSearch();
		examStudentSearch.setIsSubmit("1");
		examStudentSearch.setStudentId(baseStudentVo.getNumber());
//		List<ExamStudentVo> examStudentVoList = examStudentService.queryDistinctExamStudentBySearch(examStudentSearch);//考生信息集合
		PageBean pageBean = examStudentService.queryDistinctExamStudentPage(pb, examStudentSearch);//考生信息集合
		ExamInfoVo examInfoVo;
//		Date date = new Date();
//		for (int i = 0; i < examStudentVoList.size(); i++) {
//			examInfoVo = examStudentVoList.get(i).getExamInfoVo();
//			if(date.getTime()>=examInfoVo.getEndTime().getTime()){//只有结束的考试才能有分析报告
//				examInfoVoList.add(examInfoVo);
//			}
//		} 
		
		mav.addObject("baseStudentVo", baseStudentVo);
		mav.addObject("baseSchoolVo", baseSchoolVo);
		mav.addObject("baseGradeVoList", baseGradeVoList);
		mav.addObject("baseSubjectVoList", baseSubjectVoList);
		mav.addObject("examInfoVoList", examInfoVoList);
		mav.addObject("status", "1");
		mav.addObject("search", search);
		mav.addObject("pageBean", pageBean);
		return mav;
		
	}
	
	/**
	 * (同步)学生学校表现(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/expression", method = RequestMethod.GET)
	public ModelAndView queryExpressionArchivesComment(HttpServletRequest request, HttpServletResponse response, PageBean pb, ArchivesCommentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的评语信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + SCH);
		
		//根据学生的ID查询学生
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(search.getStudentId());
		
		//跟学校的ID查询学校
		BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseStudentVo.getSchoolId());
		
		PageBean pageBean = archivesCommentService.queryArchivesCommentPage(pb, search);
		
		//判断用户是否为教师
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_09")){
			mav.addObject("isTeacher", "1");
		}
		
		mav.addObject("pb", pageBean);
		mav.addObject("baseStudentVo", baseStudentVo);
		mav.addObject("baseSchoolVo", baseSchoolVo);
		
		return mav;
		
	}
	

	/**
	 * (同步)添加评价(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createExpressionArchivesComment(HttpServletRequest request, HttpServletResponse response, PageBean pb, ArchivesCommentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的评语信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		
		//根据学生的ID查询学生
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(search.getStudentId());
		//跟学校的ID查询学校
		BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseStudentVo.getSchoolId());
		
		mav.addObject("baseStudentVo", baseStudentVo);
		mav.addObject("baseSchoolVo", baseSchoolVo);
		return mav;
		
	}
	
	/**
	 * (同步)查看评价(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewExpressionArchivesComment(HttpServletRequest request, HttpServletResponse response, PageBean pb, ArchivesCommentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的评语信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		
		ArchivesCommentVo archivesCommentVo = archivesCommentService.queryArchivesCommentById(search.getId());
		//根据学生的ID查询学生
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(search.getStudentId());
		//跟学校的ID查询学校
		BaseSchoolVo baseSchoolVo = baseSchoolService.queryBaseSchoolById(baseStudentVo.getSchoolId());
				
		mav.addObject("baseStudentVo", baseStudentVo);
		mav.addObject("baseSchoolVo", baseSchoolVo);	
		mav.addObject("archivesCommentVo", archivesCommentVo);
		
		return mav;
		
	}
	 
	/**
	 * (同步)查看试卷(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/paper/view", method = RequestMethod.GET)
	public ModelAndView viewPaperArchivesComment(HttpServletRequest request, HttpServletResponse response, PageBean pb, ArchivesCommentSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的评语信息");	
		ModelAndView mav = new ModelAndView(PAPER);
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		ExamInfoVo examInfoVo = examInfoService.queryExamInfoById(search.getExamId());//考试信息
		ExamDetailVo examDetailVo = examDetailService.queryExamDetailById(search.getDetailId());//考试信息明细
		PapersInfoVo papersInfoVo = papersInfoService.queryPapersInfoById(search.getPaperId());//试卷
		
		PapersDetailSearch papersDetailSearch = new PapersDetailSearch();
		papersDetailSearch.setPaperId(search.getPaperId());
		List<PapersDetailVo> papersDetailVoList = papersDetailService.queryPapersDetailBySearch(papersDetailSearch);//试卷明细
		
		ExamQuestionscoreSearch examQuestionscoreSearch = new ExamQuestionscoreSearch();
		examQuestionscoreSearch.setExamDetailId(search.getDetailId());
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		if(search.getStudentNum()==null || search.getStudentNum()==""){
			examQuestionscoreSearch.setStudentId(baseStudentVo.getNumber());//获取登录人id的学生id
		}else{
			examQuestionscoreSearch.setStudentId(search.getStudentNum());
		}
		
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
		
		return mav;
		
	}
	
}