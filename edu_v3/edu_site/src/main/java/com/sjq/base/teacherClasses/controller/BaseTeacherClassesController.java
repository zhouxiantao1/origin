package com.sjq.base.teacherClasses.controller;

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
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stageGrade.search.BaseStageGradeSearch;
import com.sjq.stageGrade.service.BaseStageGradeService;
import com.sjq.stageGrade.vo.BaseStageGradeVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.security.util.CustomUser;
import com.sjq.teacherClasses.bean.BaseTeacherClassesBean;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.teacherHistory.bean.BaseTeacherHistoryBean;
import com.sjq.teacherHistory.service.BaseTeacherHistoryService;

/**
 * [自动生成]教师班级信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/teacher/classes")
public class BaseTeacherClassesController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/teacher/";
	
	// 教师班级信息页面 
	private static final String PAGE = "teacher_classes_list";
	
	// 教师班级信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存教师班级信息信息";
	private static final String OPERA_LOG_UPDATE = "更新教师班级信息信息";
	private static final String OPERA_LOG_DELETE = "删除教师班级信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除教师班级信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseTeacherClassesController.class);
	
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	@Autowired
	private BaseTeacherHistoryService baseTeacherHistoryService;
	@Autowired
	private BaseTeacherService baseTeacherService;
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseStageGradeService baseStageGradeService;
				
	/**
	 * 根据ID查询教师班级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseTeacherClassesVo ajaxQueryBaseTeacherClassesById(BaseTeacherClassesSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师班级信息");
		return this.baseTeacherClassesService.queryBaseTeacherClassesById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有教师班级信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseTeacherClassesVo> ajaxQueryBaseTeacherClassesBySearch(BaseTeacherClassesSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师班级信息");
		return this.baseTeacherClassesService.queryBaseTeacherClassesBySearch(search);
	    
	}
	
	

	
	/**
	 * (同步)根据条件查询所有的教师班级信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseTeacherClasses(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseTeacherClassesSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的教师班级信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		PageBean pageBean = this.baseTeacherClassesService.queryBaseTeacherClassesPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	/**
	 * (增加)增加信息教师班级信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseTeacherClasses(BaseTeacherClassesBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("教师班级信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		
		//通过老师ID查询
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherById(bean.getTeacherId());
		
		//通过班级ID查询班级
		BaseClassesVo baseClassesVo = baseClassesService.queryBaseClassesById(bean.getClassesId());
		bean.setGradeId(baseClassesVo.getGradeId());
		BaseStageGradeSearch baseStageGradeSearch = new BaseStageGradeSearch();
		baseStageGradeSearch.setGradeId(baseClassesVo.getGradeId());
		List<BaseStageGradeVo> baseStageGradeVoList = baseStageGradeService.queryBaseStageGradeBySearch(baseStageGradeSearch);
        for(BaseStageGradeVo baseStageGradeVo : baseStageGradeVoList){
        	bean.setStageId(baseStageGradeVo.getStageId());
        }
		
		
		BaseTeacherHistoryBean baseTeacherHistoryBean = new BaseTeacherHistoryBean();
		baseTeacherHistoryBean.setTeacherId(bean.getTeacherId());
		baseTeacherHistoryBean.setUserId(baseTeacherVo.getUserId());
		baseTeacherHistoryBean.setSchoolId(baseTeacherVo.getSchoolId());
		baseTeacherHistoryBean.setClassesId(bean.getClassesId());
		baseTeacherHistoryBean.setIsIncharge(bean.getIsIncharge());
		baseTeacherHistoryBean.setGradeId(bean.getGradeId());
		baseTeacherHistoryBean.setSubjectId(bean.getSubjectId());
		baseTeacherHistoryBean.setCreateTime(new Date());
		baseTeacherHistoryBean.setCreateName(cu.getUsername());
		baseTeacherHistoryService.insertBaseTeacherHistory(baseTeacherHistoryBean);
		
		return this.baseTeacherClassesService.insertBaseTeacherClasses(bean);
	    
	}
	
	/**
	 * (同步）增加信息教师班级信息
	 * @param vo 教师班级信息信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveBaseTeacherClasses(@Valid BaseTeacherClassesBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("(同步）增加信息教师班级信息");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
//		bean.setCreateName(cu.getUsername());
		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		
		int result = this.baseTeacherClassesService.insertBaseTeacherClasses(bean);
		
		return new ModelAndView(new RedirectView(PAGE_HTM));
	
	}
	    
}