package com.sjq.work.homework.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.sjq.homework.service.WorkHomeworkService;
import com.sjq.util.PageBean;
import com.sjq.version.search.BaseVersionSearch;
import com.sjq.version.service.BaseVersionService;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.ware.search.QuestionWareSearch;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.workQuestion.search.WorkWorkQuestionSearch;
import com.sjq.workQuestion.service.WorkWorkQuestionService;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stage.search.BaseStageSearch;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.subject.search.BaseSubjectSearch;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.type.service.QuestionTypeService;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.security.util.CustomUser;
import com.sjq.answer.bean.WorkAnswerBean;
import com.sjq.answer.search.WorkAnswerSearch;
import com.sjq.answer.service.WorkAnswerService;
import com.sjq.answer.vo.WorkAnswerVo;
import com.sjq.answerDetail.search.WorkAnswerDetailSearch;
import com.sjq.answerDetail.service.WorkAnswerDetailService;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalogDetail.search.BaseCatalogDetailSearch;
import com.sjq.catalogDetail.service.BaseCatalogDetailService;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.service.QuestionCollectService;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.grade.search.BaseGradeSearch;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.homework.bean.WorkHomeworkBean;
import com.sjq.homework.search.WorkHomeworkSearch;
import com.sjq.homework.vo.WorkHomeworkVo;
import com.sjq.homeworkClasses.search.WorkHomeworkClassesSearch;
import com.sjq.homeworkClasses.service.WorkHomeworkClassesService;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;
import com.sjq.knowledge.service.BaseKnowledgeService;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.parent.service.BaseParentService;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;


/**
 * [自动生成]作业信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/homework")
public class WorkHomeworkController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="work/homework/";
	
	// 作业信息页面 
	private static final String PAGE = "homework_list";
	private static final String SET = "homework_set";
	private static final String SETECT1 = "homework_select1";
	private static final String SETECT = "homework_select";
	private static final String VIEW = "homework_view";
	private static final String STUDENT = "homework_student_list";
	private static final String ANSWER = "homework_answer";
	private static final String ANSVIEW = "homework_answer_view";
	private static final String FINISH = "homework_finish";
	private static final String  PARENT= "homework_parent_list";
	
	// 作业信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存作业信息信息";
	private static final String OPERA_LOG_UPDATE = "更新作业信息信息";
	private static final String OPERA_LOG_DELETE = "删除作业信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除作业信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkHomeworkController.class);
	
	@Autowired
	private WorkHomeworkService workHomeworkService;
	
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	@Autowired
	private BaseVersionService baseVersionService;
	@Autowired
	private BaseCatalogDetailService baseCatalogDetailService;
	@Autowired
	private BaseQuestionRelatedService baseQuestionRelatedService;
	@Autowired
	private QuestionTypeService questionTypeService;
	@Autowired
	private WorkWorkQuestionService workWorkQuestionService;
	@Autowired
	private WorkHomeworkClassesService workHomeworkClassesService;
	@Autowired
	private BaseSubjectService BaseSubjectService;	
	@Autowired
	private BaseGradeService baseGradeService;	
	@Autowired
	private BaseStageService baseStageService;	
	@Autowired
	private BaseKnowledgeService baseKnowledgeService;	
	@Autowired
	private BaseCatalogService baseCatalogService;
	@Autowired
	private QuestionWareService questionWareService;
	@Autowired
	private BaseTeacherService baseTeacherService;
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private WorkAnswerService workAnswerService;
	@Autowired
	private WorkAnswerDetailService workAnswerDetailService;
	@Autowired
	private BaseParentService baseParentService;
				 
	/**
	 * 根据ID查询作业信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkHomeworkVo ajaxQueryWorkHomeworkById(WorkHomeworkSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业信息");
		return this.workHomeworkService.queryWorkHomeworkById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有作业信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkHomeworkVo> ajaxQueryWorkHomeworkBySearch(WorkHomeworkSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业信息");
		return this.workHomeworkService.queryWorkHomeworkBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询作业信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryWorkHomeworkPage(PageBean pb,WorkHomeworkSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业信息");
		return this.workHomeworkService.queryWorkHomeworkPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据条件删除作业信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/delete")
	@ResponseBody
	public int ajaxDeleteWorkHomeworkBySearch(WorkHomeworkBean bean,WorkHomeworkSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workHomeworkService.deleteWorkHomeworkBySearch(bean,search);
	    
	}
	
				
	/**
	 * (更新)根据ID更新所有作业信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateWorkHomeworkById(WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setCreateName(cu.getUsername());
		bean.setModTime(new Date());
		return this.workHomeworkService.updateWorkHomeworkById(bean);
	    
	}
	
				
	/**
	 * (同步)根据条件查询所有的作业信息，教师作业管理列表(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllWorkHomework(HttpServletRequest request, HttpServletResponse response, PageBean pb, WorkHomeworkSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作业信息");
			
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if("ROLE_09".equals(cu.getRole().getCode())){//教师
			search.setCreateName(cu.getUsername());
			search.setType("1");
			search.setWorkType("1");
			//判断进行中的作业的状态超过时间的修改
			List<WorkHomeworkVo> workHomeworkVoList = workHomeworkService.queryWorkHomeworkBySearch(search);
			Date nowTime = new Date();
			for(WorkHomeworkVo workHomeworkVo : workHomeworkVoList){
				Date endTime = workHomeworkVo.getEndTime();
				if(nowTime.getTime()>endTime.getTime()){
					WorkHomeworkBean bean = new WorkHomeworkBean();
					bean.setId(workHomeworkVo.getId());
					bean.setStatus("2");
					workHomeworkService.updateWorkHomeworkById(bean);
				}
			}
			
			PageBean pageBean = this.workHomeworkService.queryWorkHomeworkPage(pb,search);
			
			
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
			//根据用户ID获取教师
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			
			//获取不重复任教学科
			List<BaseTeacherClassesVo> subjectVoList = baseTeacherClassesService.querySubjectByteacherId(baseTeacherVo.getId());
			//获取不重复任教班级
			List<BaseTeacherClassesVo> classesVoList = baseTeacherClassesService.queryClassesByteacherId(baseTeacherVo.getId());
			
			mav.addObject("subjectId", search.getSubjectId());
			mav.addObject("classesId", search.getClassesId());
			mav.addObject("title", search.getTitle());
			mav.addObject("pb", pageBean);
			mav.addObject("search", search);
			mav.addObject("pageBean", pageBean);
			mav.addObject("questionNum", pageBean.getList().size());
			mav.addObject("subjectVoList", subjectVoList);
			mav.addObject("classesVoList", classesVoList);
			
			return mav;
			
		}else if("ROLE_11".equals(cu.getRole().getCode())){//学生
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + STUDENT);
			//通过用户id获取学生
			
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
			
			//查询作业列表
			WorkHomeworkClassesSearch workHomeworkClassesSearch = new WorkHomeworkClassesSearch();
			workHomeworkClassesSearch.setClassesId(baseStudentVo.getClassesId());
			workHomeworkClassesSearch.setStudentId(baseStudentVo.getId());
			
			workHomeworkClassesSearch.setTitle(search.getTitle());
			workHomeworkClassesSearch.setStatus(0L);
			List<WorkHomeworkClassesVo> workHomeworkClassesVoList = workHomeworkClassesService.queryWorkClassesPending(workHomeworkClassesSearch);
			
			//查询作答列表
			WorkAnswerSearch workAnswerSearch = new WorkAnswerSearch();
			workAnswerSearch.setStudentId(baseStudentVo.getId());
			List<WorkAnswerVo> workAnswerVoList1 =  workAnswerService.queryWorkAnswerBySearch(workAnswerSearch);
			
			//判断作业是否已经超过截止时间,超过新增一条未完成记录
			for(WorkHomeworkClassesVo workHomeworkClassesVo : workHomeworkClassesVoList){
				String status = "1";
				for(WorkAnswerVo workAnswerVo : workAnswerVoList1){
					if(workAnswerVo.getHomeworkId()==workHomeworkClassesVo.getHomeworkId()){
						status = "2";
					}
				}
				if(status.equals("1")){//未完成的
					//判断时间是否超时
					WorkHomeworkVo workHomeworkVo = workHomeworkClassesVo.getWorkHomeworkVo();
					Date nowTime = new Date();
					Date endTime = workHomeworkVo.getEndTime();
					if(endTime.getTime()<nowTime.getTime()){//已经超时
						//操作人信息
						WorkAnswerBean workAnswerBean = new WorkAnswerBean();
						workAnswerBean.setCreateTime(new Date());
						workAnswerBean.setCreateName(baseStudentVo.getName());
						workAnswerBean.setStudentId(baseStudentVo.getId());
						workAnswerBean.setStatus("0");
						workAnswerBean.setHomeworkId(workHomeworkVo.getId());
						workAnswerBean.setCorrect("0");
						this.workAnswerService.insertWorkAnswer(workAnswerBean);
					}
				}
			} 
			if(search.getStatus()==null){
				search.setStatus(3L);
				workHomeworkClassesSearch.setStatus(search.getStatus());
			}else if(search.getStatus()==2){//未完成	
				workHomeworkClassesSearch.setAnsStatus("0");
				workHomeworkClassesSearch.setStatus(1L);
			}else if(search.getStatus()==1){
				workHomeworkClassesSearch.setStatus(search.getStatus());
				workHomeworkClassesSearch.setAnsStatus("1");
			}else{
				workHomeworkClassesSearch.setStatus(search.getStatus());
			}
			PageBean pageBean = workHomeworkClassesService.queryWorkHomeworkClassesPage(pb, workHomeworkClassesSearch);
			
			//查询作答列表
			List<WorkAnswerVo> workAnswerVoList =  workAnswerService.queryWorkAnswerBySearch(workAnswerSearch);
			
			mav.addObject("pb", pageBean);
			mav.addObject("search", search);
			mav.addObject("pageBean", pageBean);
			mav.addObject("workAnswerVoList", workAnswerVoList);
			mav.addObject("status", search.getStatus());
			mav.addObject("title", search.getTitle());
			
			return mav;
		}else if("ROLE_10".equals(cu.getRole().getCode())){//家长
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + PARENT);
			//通过用户id获取学生
			BaseParentVo baseParentVo = baseParentService.queryBaseParentByUserId(cu.getUserId());
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(baseParentVo.getStudentId());
			
			//查询作业列表
			WorkHomeworkClassesSearch workHomeworkClassesSearch = new WorkHomeworkClassesSearch();
			workHomeworkClassesSearch.setClassesId(baseStudentVo.getClassesId());
			workHomeworkClassesSearch.setStudentId(baseStudentVo.getId());
			
			workHomeworkClassesSearch.setTitle(search.getTitle());
			workHomeworkClassesSearch.setStatus(0L);
			List<WorkHomeworkClassesVo> workHomeworkClassesVoList = workHomeworkClassesService.queryWorkClassesPending(workHomeworkClassesSearch);
			
			//查询作答列表
			WorkAnswerSearch workAnswerSearch = new WorkAnswerSearch();
			workAnswerSearch.setStudentId(baseStudentVo.getId());
			List<WorkAnswerVo> workAnswerVoList1 =  workAnswerService.queryWorkAnswerBySearch(workAnswerSearch);
			
			//判断作业是否已经超过截止时间,超过新增一条未完成记录
			for(WorkHomeworkClassesVo workHomeworkClassesVo : workHomeworkClassesVoList){
				String status = "1";
				for(WorkAnswerVo workAnswerVo : workAnswerVoList1){
					if(workAnswerVo.getHomeworkId()==workHomeworkClassesVo.getHomeworkId()){
						status = "2";
					}
				}
				if(status.equals("1")){//未完成的
					//判断时间是否超时
					WorkHomeworkVo workHomeworkVo = workHomeworkClassesVo.getWorkHomeworkVo();
					Date nowTime = new Date();
					Date endTime = workHomeworkVo.getEndTime();
					if(endTime.getTime()<nowTime.getTime()){//已经超时
						//操作人信息
						WorkAnswerBean workAnswerBean = new WorkAnswerBean();
						workAnswerBean.setCreateTime(new Date());
						workAnswerBean.setCreateName(baseStudentVo.getName());
						workAnswerBean.setStudentId(baseStudentVo.getId());
						workAnswerBean.setStatus("0");
						workAnswerBean.setHomeworkId(workHomeworkVo.getId());
						workAnswerBean.setCorrect("0");
						this.workAnswerService.insertWorkAnswer(workAnswerBean);
					}
				}
			} 
			if(search.getStatus()==null){
				search.setStatus(3L);
				workHomeworkClassesSearch.setStatus(search.getStatus());
			}else if(search.getStatus()==2){//未完成	
				workHomeworkClassesSearch.setAnsStatus("0");
				workHomeworkClassesSearch.setStatus(1L);
			}else if(search.getStatus()==1){
				workHomeworkClassesSearch.setStatus(search.getStatus());
				workHomeworkClassesSearch.setAnsStatus("1");
			}else{
				workHomeworkClassesSearch.setStatus(search.getStatus());
			}
			PageBean pageBean = workHomeworkClassesService.queryWorkHomeworkClassesPage(pb, workHomeworkClassesSearch);
			
			//查询作答列表
			List<WorkAnswerVo> workAnswerVoList =  workAnswerService.queryWorkAnswerBySearch(workAnswerSearch);
			
			mav.addObject("pb", pageBean);
			mav.addObject("search", search);
			mav.addObject("pageBean", pageBean);
			mav.addObject("workAnswerVoList", workAnswerVoList);
			mav.addObject("status", search.getStatus());
			mav.addObject("title", search.getTitle());
			
			return mav;
		}
		
		return null;
		
		
	}
	
	/**
	 * (同步)根据条件查询所有的作业信息，学生作业管理列表(废弃)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/student/list", method = RequestMethod.GET)
	public ModelAndView queryAllStudentWorkHomework(HttpServletRequest request, HttpServletResponse response, PageBean pb, WorkHomeworkClassesSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的作业信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + STUDENT);
		
//		WorkHomeworkClassesSearch workHomeworkClassesSearch = new WorkHomeworkClassesSearch();
		search.setClassesId(7L);
		search.setStudentId(2L);
		if(search.getStatus()==null){
			search.setStatus(0L);
		}
		PageBean pageBean = workHomeworkClassesService.queryWorkHomeworkClassesPage(pb, search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.addObject("pageBean", pageBean);
		
		return mav;
		
	}
				
	/**
	 * (同步）增加信息作业信息
	 * @param vo 作业信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveWorkHomework(@Valid WorkHomeworkBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息作业信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		int result = this.workHomeworkService.insertWorkHomework(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	
	/**
	 * (增加)增加信息作业信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public Long ajaxInsertWorkHomework(WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("作业信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		//通过userID获取教师
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
		
		bean.setTeacherId(baseTeacherVo.getId());
		bean.setStatus("1");
		bean.setDelflag("1");
		bean.setFinishNum(0L);
		bean.setUserId(cu.getUserId());
		this.workHomeworkService.insertWorkHomework(bean);
		
		return bean.getId();
	    
	}
	
	/**
	 * 布置作业页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/set")
	@ResponseBody
	public ModelAndView setWork(WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("布置作业信息");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + SET);
		
		//根据用户ID查询teacherID
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
		
		//通过教师ID查询不重复的年级
		List<BaseTeacherClassesVo>  teacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesByteacherId(baseTeacherVo.getId());
		
		//通过教师ID查询教师任教班级
		BaseTeacherClassesSearch baseTeacherClassesSearch = new BaseTeacherClassesSearch();
		baseTeacherClassesSearch.setTeacherId(baseTeacherVo.getId());
		baseTeacherClassesSearch.setGroup("2");
		List<BaseTeacherClassesVo>  baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
		
		Long stageId = null;
		for(BaseTeacherClassesVo baseTeacherClassesVo : baseTeacherClassesVoList){
			stageId = baseTeacherClassesVo.getStageId();
		}
		
		//查询所有版本
		List<BaseVersionVo> baseVersionVoList = baseVersionService.queryAllBaseVersion();
		
		mav.addObject("teacherClassesVoList", teacherClassesVoList);
		mav.addObject("baseTeacherClassesVoList", baseTeacherClassesVoList);
		mav.addObject("baseVersionVoList", baseVersionVoList);
		mav.addObject("stageId", stageId);
		mav.addObject("teacherId", baseTeacherVo.getId());
		return mav;
	    
	}
	
	/**
	 * 作业选题页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/select")
	@ResponseBody
	public ModelAndView setectQuestionHomework1(WorkAnswerSearch workAnswerSearch, PageBean pb, QuestionWareSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("布置作业信息");
		
		LOGGER.info("(同步)根据条件查询所有的题库模块-题库中心");
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + SETECT1);
		
		
		// 根据课本章节查询
		if(search.getCatalogDetailId() != null && search.getKnowledgeId() == null){
			
			BaseQuestionRelatedSearch bqrs = new BaseQuestionRelatedSearch();
			bqrs.setRelatedId(search.getCatalogDetailId());
			bqrs.setRelatedType("1");
			List<BaseQuestionRelatedVo> bqrvs = baseQuestionRelatedService.queryBaseQuestionRelatedBySearch(bqrs);
			
			if(bqrvs !=null && bqrvs.size()>0){
				Long[] ids = new Long[bqrvs.size()];
				for(int i=0;i<bqrvs.size();i++){
					ids[i] = bqrvs.get(i).getQuestionId();
				}
				search.setIds(ids);
			}else{
				Long[] ids = new Long[1];
				ids[0] = 1L;
				search.setIds(ids);
			}
			
		}

		// 根据知识点查询
		if(search.getKnowledgeId() != null  && search.getCatalogDetailId() == null){
			
			BaseQuestionRelatedSearch bqrs = new BaseQuestionRelatedSearch();
			bqrs.setRelatedId(search.getKnowledgeId());
			bqrs.setRelatedType("2");
			List<BaseQuestionRelatedVo> bqrvs = baseQuestionRelatedService.queryBaseQuestionRelatedBySearch(bqrs);
			
			if(bqrvs !=null && bqrvs.size()>0){
				Long[] ids = new Long[bqrvs.size()];
				for(int i=0;i<bqrvs.size();i++){
					ids[i] = bqrvs.get(i).getQuestionId();
				}
				search.setIds(ids);
			}else{
				Long[] ids = new Long[1];
				ids[0] = 1L;
				search.setIds(ids);
			}
		}
		
		
		//1考试题库,2作业题库,3錨题库,4种子题库（自适应题库）, 5个人题库（教师题库）,6专家题库 （新题库）
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		//默认查询
		if(search.getBelongToLib() == null) search.setBelongToLib("2");  //默认查询考试题库
		if(search.getBelongToLib() != null && search.getBelongToLib().equals("5") && cu!=null) search.setCreateId(cu.getUserId());   //查询个人题库时，绑定登录人id
		

		if(search.getStageId() == null) search.setStageId(1L);           //默认学段(小学)
		
		//查询所有的学段信息
//		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		BaseStageSearch baseStageSearch = new BaseStageSearch();
		baseStageSearch.setId(search.getStageId());
		List<BaseStageVo> bStageVos = baseStageService.queryBaseStageBySearch(baseStageSearch);
		
		//查询所有的年级信息
//		List<BaseGradeVo>  bGradeVos = baseGradeService.queryBaseGradeByStageId(search.getStageId());
		BaseGradeSearch baseGradeSearch = new BaseGradeSearch();
		baseGradeSearch.setId(search.getGradeId());
		List<BaseGradeVo>  bGradeVos = baseGradeService.queryBaseGradeBySearch(baseGradeSearch);
		if(search.getGradeId() == null) search.setGradeId(bGradeVos!=null&bGradeVos.size()>0?bGradeVos.get(0).getId():null);
		
		//查询所有的学科信息
//		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectByStageId(search.getStageId());
		BaseSubjectSearch baseSubjectSearch = new BaseSubjectSearch();
		baseSubjectSearch.setId(search.getSubjectId());
		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectBySearch(baseSubjectSearch);
		if(search.getSubjectId() == null) search.setSubjectId(bSubjectVos!=null&bSubjectVos.size()>0?bSubjectVos.get(0).getId():null);
		
		
		
		//查询所有的题型信息
		ArrayList<QuestionTypeVo> qTypeVos = new ArrayList<QuestionTypeVo>();
		
		List<QuestionTypeVo> qTypeVos1 = questionTypeService.queryQuestionTypeBySubjectId(search.getSubjectId());
		for(QuestionTypeVo questionTypeVo : qTypeVos1){
			if(questionTypeVo.getMarkingCode().equals("1")||questionTypeVo.getMarkingCode().equals("2")){
				if(search.getTypeId()==null&&questionTypeVo.getMarkingCode().equals("1")){
					search.setTypeId(questionTypeVo.getId());
				}
				qTypeVos.add(questionTypeVo);
			}
		}
		//默认单选题
		
		
//		//查询所有的教材版本
//		List<BaseVersionVo>  bVersionVos = baseVersionService.queryAllBaseVersion();
		
		//查询所有的目录详情
		List<BaseCatalogVo> bCatalogVos =  baseCatalogService.queryAllBaseCatalog();
		
		//查询所有的知识点
		List<BaseKnowledgeVo>  bKnowledgeVos = baseKnowledgeService.queryAllBaseKnowledge();
		
		//查询题库信息
		PageBean pageBean = this.questionWareService.queryQuestionWarePage(pb,search);
		
		//查询用户收藏的列表
//		QuestionCollectSearch qcs = new QuestionCollectSearch();
//		qcs.setUserId(cu.getUserId()==null?0L:cu.getUserId());
//		qcs.setDelflag("0");
//		List<QuestionCollectVo> qCollectVos = this.questionCollectService.queryQuestionCollectBySearch(qcs);
		WorkWorkQuestionSearch workWorkQuestionSearch = new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(workAnswerSearch.getHomeworkId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> qCollectVos = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);                  //查询条件
//		mav.addObject("bVersionVos", bVersionVos);        //教材版本信息
		mav.addObject("bSubjectVos", bSubjectVos);        //学科信息
		mav.addObject("bStageVos", bStageVos);            //学段信息
		mav.addObject("bGradeVos", bGradeVos);            //年级信息
		mav.addObject("bKnowledgeVos", bKnowledgeVos);    //知识点信息
		mav.addObject("qTypeVos",qTypeVos);               //题型信息
		mav.addObject("bCatalogVos",bCatalogVos);         //目录信息
		mav.addObject("qCollectVos", qCollectVos);        //作业题目列表
		if(workAnswerSearch.getCatalogId()!=null){
			mav.addObject("catalogId", workAnswerSearch.getCatalogId());        //课本ID
		}
		mav.addObject("homeworkId", workAnswerSearch.getHomeworkId());        //作业ID
		return mav;
	    
	}
	
	/**
	 *  预览作业页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/view")
	@ResponseBody
	public ModelAndView setectQuestionHomeworkview(WorkHomeworkSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("预览作业信息");
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		//查询作业题目
		WorkWorkQuestionSearch workWorkQuestionSearch = new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(search.getId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> workWorkQuestionVoList = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
		
		//查询作业关联班级信息
		WorkHomeworkClassesSearch workHomeworkClassesSearch = new WorkHomeworkClassesSearch();
		workHomeworkClassesSearch.setHomeworkId(search.getId());
		List<WorkHomeworkClassesVo> workHomeworkClassesVoList = workHomeworkClassesService.queryWorkHomeworkClassesBySearch(workHomeworkClassesSearch);
		
		//查询作业信息
		WorkHomeworkVo wkv = workHomeworkService.queryWorkHomeworkById(search.getId());
		
		mav.addObject("workWorkQuestionVoList", workWorkQuestionVoList);
		mav.addObject("wkv", wkv);
		mav.addObject("questionNum", workWorkQuestionVoList.size());
		mav.addObject("workHomeworkClassesVoList", workHomeworkClassesVoList);
		
		return mav;
	    
	}
	
	/**
	 *  学生作答页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/answer")
	@ResponseBody
	public ModelAndView answerQuestionHomework(WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("预览作业信息");
		//查询作业题目
		WorkWorkQuestionSearch workWorkQuestionSearch = new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(bean.getId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> workWorkQuestionVoList = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
		
		//查询作业信息
		WorkHomeworkVo workHomeworkVo = workHomeworkService.queryWorkHomeworkById(bean.getId());
		
		//通过用户id获取学生
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + ANSWER);
		mav.addObject("workWorkQuestionVoList", workWorkQuestionVoList);
		mav.addObject("workHomeworkVo", workHomeworkVo);
		mav.addObject("studentId", baseStudentVo.getId());
		mav.addObject("qtnNum", workWorkQuestionVoList.size());
		
		return mav;
	    
	}
	
	/**
	 *  学生作答答案页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/answer/view")
	@ResponseBody
	public ModelAndView answerViewQuestionHomework(Long studentId,String type,WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		LOGGER.info("预览作业信息");
		//查询作业题目
		WorkWorkQuestionSearch workWorkQuestionSearch = new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(bean.getId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> workWorkQuestionVoList = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
		
		//查询作业关联班级信息
		WorkHomeworkClassesSearch workHomeworkClassesSearch = new WorkHomeworkClassesSearch();
		workHomeworkClassesSearch.setHomeworkId(bean.getId());
		List<WorkHomeworkClassesVo> workHomeworkClassesVoList = workHomeworkClassesService.queryWorkHomeworkClassesBySearch(workHomeworkClassesSearch);
		
		//查询作业信息
		WorkHomeworkVo wkv = workHomeworkService.queryWorkHomeworkById(bean.getId());
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + ANSVIEW);
		
		//查询作答列表并判断是否正确
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		WorkAnswerDetailSearch workAnswerDetailSearch = new WorkAnswerDetailSearch();
		workAnswerDetailSearch.setHomeworkId(bean.getId());
		workAnswerDetailSearch.setUserId(cu.getUserId());
		if(studentId!=null){
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(studentId);
			workAnswerDetailSearch.setUserId(baseStudentVo.getUserId());
		}
		workAnswerDetailSearch.setDelflag("0");
		List<WorkAnswerDetailVo> workAnswerDetailVoList = workAnswerDetailService.queryWorkAnswerDetailBySearch(workAnswerDetailSearch);

		for(WorkAnswerDetailVo workAnswerDetailVo : workAnswerDetailVoList){
			boolean isRight = questionWareService.checkQuestionWareAnswer(workAnswerDetailVo.getQuestionId(), workAnswerDetailVo.getSelectNum());
			workAnswerDetailVo.setIsRight(isRight?"0":"1"); //0-z正确，1-错误
			
		}
		String type1 = type;
		mav.addObject("workWorkQuestionVoList", workWorkQuestionVoList);
		mav.addObject("wkv", wkv);
		mav.addObject("questionNum", workWorkQuestionVoList.size());
		mav.addObject("workHomeworkClassesVoList", workHomeworkClassesVoList);
		mav.addObject("workAnswerDetailVoList", workAnswerDetailVoList);
		mav.addObject("type", type);
		mav.addObject("homeworkId", bean.getId());
		
		
		return mav;
		
	    
	}
	
	/**
	 *  查看完成情况(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/finish")
	@ResponseBody
	public ModelAndView finishViewQuestionHomework(WorkAnswerSearch workAnswerSearch,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		LOGGER.info("预览作业信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + FINISH);
		
		//查询各个等分率
		int levelA = workAnswerService.queryWorkAnswerBycorrect(80, 101, workAnswerSearch.getHomeworkId());
		int levelB = workAnswerService.queryWorkAnswerBycorrect(70, 80, workAnswerSearch.getHomeworkId());
		int levelC = workAnswerService.queryWorkAnswerBycorrect(60, 70, workAnswerSearch.getHomeworkId());
		int levelD = workAnswerService.queryWorkAnswerBycorrect(0, 60, workAnswerSearch.getHomeworkId());
		int levelAll = levelA + levelB + levelC + levelD;
		
		//查询作业题目数量
		WorkWorkQuestionSearch workWorkQuestionSearch =  new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(workAnswerSearch.getHomeworkId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> workWorkQuestionVoList = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
		
		ArrayList<Object> accuracyList = new ArrayList<Object>();//正确率列表
		ArrayList<String> acStrList = new ArrayList<String>();//正确率列表
		String rightStr = "";
		String accuracyStr = "";
		int i = 1;
		for(WorkWorkQuestionVo WorkWorkQuestionVo : workWorkQuestionVoList){
			HashMap<String,String>  accuracyMap = new HashMap<String,String>();
			//根据作业ID和题目的ID查询答对人数和正确率
			WorkAnswerDetailSearch workAnswerDetailSearch = new WorkAnswerDetailSearch();
			workAnswerDetailSearch.setHomeworkId(workAnswerSearch.getHomeworkId());
			workAnswerDetailSearch.setQuestionId(WorkWorkQuestionVo.getQuestionId());
			//答对人数
			workAnswerDetailSearch.setIsRight("0");
			int rightNum = workAnswerDetailService.queryWorkAnswerDetailTotalCount(workAnswerDetailSearch);
			//答错人数
			workAnswerDetailSearch.setIsRight("1");
			int wrongNum = workAnswerDetailService.queryWorkAnswerDetailTotalCount(workAnswerDetailSearch);
			//正确率
			double accuracy = (double)rightNum/(double)(rightNum+wrongNum)*100;
			DecimalFormat df = new DecimalFormat("0");
			
			accuracyMap.put("num", String.valueOf(i));
			accuracyMap.put("accuracy", df.format(accuracy));
			
			accuracyList.add(accuracyMap);
			acStrList.add( df.format(accuracy));
			rightStr +=  rightNum + ",";
			accuracyStr +=  "'第"+i+"题'"+",";
			i++;
		}
		Collections.sort(acStrList,Collections.reverseOrder());//降序
		
		//分页查询学生
		workAnswerSearch.setHomeworkId(workAnswerSearch.getHomeworkId());
		if("1".equals(workAnswerSearch.getLevel())){
			workAnswerSearch.setStart("80");
			workAnswerSearch.setEnd("101");
		}else if("2".equals(workAnswerSearch.getLevel())){
			workAnswerSearch.setStart("70");
			workAnswerSearch.setEnd("80");
		}else if("3".equals(workAnswerSearch.getLevel())){
			workAnswerSearch.setStart("60");
			workAnswerSearch.setEnd("70");
		}else if("4".equals(workAnswerSearch.getLevel())){
			workAnswerSearch.setStart("0");
			workAnswerSearch.setEnd("60");
		}
		
		//查询作业信息
		WorkHomeworkVo wkv = workHomeworkService.queryWorkHomeworkById(workAnswerSearch.getHomeworkId());
		
		//查询作业关联班级信息
		WorkHomeworkClassesSearch workHomeworkClassesSearch = new WorkHomeworkClassesSearch();
		workHomeworkClassesSearch.setHomeworkId(workAnswerSearch.getHomeworkId());
		List<WorkHomeworkClassesVo> workHomeworkClassesVoList = workHomeworkClassesService.queryWorkHomeworkClassesBySearch(workHomeworkClassesSearch);
		
		workAnswerSearch.setStatus("1");
		PageBean pageBean = workAnswerService.queryWorkAnswerPage(pb, workAnswerSearch);
		mav.addObject("levelA", levelA);
		mav.addObject("levelB", levelB);
		mav.addObject("levelC", levelC);
		mav.addObject("levelD", levelD);
		mav.addObject("levelAll", levelAll);
		
		mav.addObject("accuracyList", accuracyList); //题目和正确率列表
		mav.addObject("rightStr", rightStr.substring(0, rightStr.length()-1));
		mav.addObject("accuracyStr", accuracyStr.substring(0, accuracyStr.length()-1));
		mav.addObject("acStrList", acStrList);//正确率列表
		mav.addObject("pb", pageBean);//学生作答列表
		mav.addObject("wkv", wkv);//作业信息
		mav.addObject("wkcvList", workHomeworkClassesVoList);//作业信息
		mav.addObject("level", workAnswerSearch.getLevel());//查询条件
		mav.addObject("createName", workAnswerSearch.getCreateName());//查询条件
		
		return mav;	
	    
	}
	
	    
}