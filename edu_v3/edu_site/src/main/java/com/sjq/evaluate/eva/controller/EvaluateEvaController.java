package com.sjq.evaluate.eva.controller;

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
import com.sjq.eva.service.EvaluateEvaService;
import com.sjq.util.PageBean;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.staff.service.BaseStaffService;
import com.sjq.staff.vo.BaseStaffVo;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.teacher.search.BaseTeacherSearch;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.security.util.CustomUser;
import com.sjq.answer.bean.EvaluateAnswerBean;
import com.sjq.answer.bean.WorkAnswerBean;
import com.sjq.answer.search.EvaluateAnswerSearch;
import com.sjq.answer.service.EvaluateAnswerService;
import com.sjq.answer.service.WorkAnswerService;
import com.sjq.answer.vo.EvaluateAnswerVo;
import com.sjq.classes.search.BaseClassesSearch;
import com.sjq.classes.service.BaseClassesService;
import com.sjq.classes.vo.BaseClassesVo;
import com.sjq.eva.bean.EvaluateEvaBean;
import com.sjq.eva.search.EvaluateEvaSearch;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.evaDetail.bean.EvaluateEvaDetailBean;
import com.sjq.evaDetail.search.EvaluateEvaDetailSearch;
import com.sjq.evaDetail.service.EvaluateEvaDetailService;
import com.sjq.evaDetail.vo.EvaluateEvaDetailVo;
import com.sjq.evaIssue.bean.EvaluateEvaIssueBean;
import com.sjq.evaIssue.search.EvaluateEvaIssueSearch;
import com.sjq.evaIssue.service.EvaluateEvaIssueService;
import com.sjq.evaIssue.vo.EvaluateEvaIssueVo;
import com.sjq.issueList.search.EvaluateIssueListSearch;
import com.sjq.issueList.service.EvaluateIssueListService;
import com.sjq.issueList.vo.EvaluateIssueListVo;
import com.sjq.parent.service.BaseParentService;
import com.sjq.parent.vo.BaseParentVo;
import com.sjq.school.service.BaseSchoolService;
import com.sjq.school.vo.BaseSchoolVo;

/**
 * [自动生成]测评信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/evaluate/eva")
public class EvaluateEvaController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/evaluate/";
	
	// 测评信息页面 
	private static final String PAGE = "eva_list";
	private static final String CREATE = "eva_create";
	private static final String ISSUE = "evaIssue_list";
	private static final String SCHOOL = "evaIssue_schoolList";
	private static final String EVAOBJ = "issueList_list";
	private static final String REPORT = "eva_report";
	
	// 测评信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存测评信息信息";
	private static final String OPERA_LOG_UPDATE = "更新测评信息信息";
	private static final String OPERA_LOG_DELETE = "删除测评信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除测评信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(EvaluateEvaController.class);
	
	@Autowired
	private EvaluateEvaService evaluateEvaService;
	@Autowired
	private BaseStaffService baseStaffService;
	@Autowired
	private EvaluateEvaIssueService evaluateEvaIssueService;
	@Autowired
	private BaseSchoolService baseSchoolService;
	@Autowired
	private BaseClassesService baseClassesService;
	@Autowired
	private BaseTeacherService baseTeacherService;
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private BaseParentService baseParentService;
	@Autowired
	private EvaluateIssueListService evaluateIssueListService;
	@Autowired
	private EvaluateEvaDetailService evaluateEvaDetailService;
	@Autowired
	private EvaluateAnswerService evaluateAnswerService;
	@Autowired
	private WorkAnswerService workAnswerService;
				
	/**
	 * 查询所有的测评信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/ajaxlist")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaAll(EvaluateEvaSearch search,PageBean pb,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评信息");
		PageBean pageBean = this.evaluateEvaService.queryEvaluateEvaPage(pb,new EvaluateEvaSearch());
		return pageBean;
	    
	}
				
	/**
	 * 根据ID查询测评信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public EvaluateEvaVo ajaxQueryEvaluateEvaById(EvaluateEvaSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评信息");
		return this.evaluateEvaService.queryEvaluateEvaById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有测评信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<EvaluateEvaVo> ajaxQueryEvaluateEvaBySearch(EvaluateEvaSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评信息");
		return this.evaluateEvaService.queryEvaluateEvaBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询测评信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryEvaluateEvaPage(PageBean pb,EvaluateEvaSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评信息");
		return this.evaluateEvaService.queryEvaluateEvaPage(pb, search);
	    
	}
				
				
	/**
	 * (更新)根据条件更新所有测评信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch/update")
	@ResponseBody
	public int ajaxUpdateEvaluateEvaBySearch(EvaluateEvaBean bean,EvaluateEvaSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.evaluateEvaService.updateEvaluateEvaBySearch(bean,search);
	    
	}
	
	
				
	/**
	 * (同步)根据条件查询所有的测评信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllEvaluateEva(EvaluateIssueListSearch evaluateIssueListSearch,HttpServletRequest request, HttpServletResponse response, PageBean pb, EvaluateEvaSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评信息");
		
		//根据角色返回不同的页面
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		String code = cu.getRole().getCode();
		if("ROLE_02".equals(code)||"ROLE_03".equals(code)||"Role_7".equals(code)){//市级
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
			search.setDelflag("0");
			search.setUserId(cu.getUserId());
			List<EvaluateEvaVo> evaluateEvaVoList = evaluateEvaService.queryEvaluateEvaBySearch(search);
			for(EvaluateEvaVo evaluateEvaVo : evaluateEvaVoList){//测评状态判断和更新
				Date nowTime = new Date();
				Date startTime = evaluateEvaVo.getStartTime();
				Date endTime = evaluateEvaVo.getEndTime();
				if((nowTime.getTime()>endTime.getTime()) && !"3".equals(evaluateEvaVo.getStatus())){
					EvaluateEvaBean bean = new EvaluateEvaBean();
					bean.setStatus("3");
					bean.setId(evaluateEvaVo.getId());
					evaluateEvaService.updateEvaluateEvaById(bean);
				}else if((nowTime.getTime()<endTime.getTime()) && (nowTime.getTime()>startTime.getTime()) && !"2".equals(evaluateEvaVo.getStatus())){
					EvaluateEvaBean bean = new EvaluateEvaBean();
					bean.setStatus("2");
					bean.setId(evaluateEvaVo.getId());
					evaluateEvaService.updateEvaluateEvaById(bean);
				}
			}
			EvaluateEvaDetailSearch evaluateEvaDetailSearch = new EvaluateEvaDetailSearch();
			evaluateEvaDetailSearch.setDelflag("0");
			List<EvaluateEvaDetailVo> evaluateEvaDetailVoList = evaluateEvaDetailService.queryEvaluateEvaDetailBySearch(evaluateEvaDetailSearch);
			for(EvaluateEvaDetailVo evaluateEvaDetailVo : evaluateEvaDetailVoList){//测评状态判断和更新
				Date nowTime = new Date();
				Date startTime = evaluateEvaDetailVo.getStartTime();
				Date endTime = evaluateEvaDetailVo.getEndTime();
				if((nowTime.getTime()>endTime.getTime()) && !"3".equals(evaluateEvaDetailVo.getStatus())){
					EvaluateEvaDetailBean bean = new EvaluateEvaDetailBean();
					bean.setStatus("3");
					bean.setId(evaluateEvaDetailVo.getId());
					evaluateEvaDetailService.updateEvaluateEvaDetailById(bean);
				}else if((nowTime.getTime()<endTime.getTime()) && (nowTime.getTime()>startTime.getTime()) && !"2".equals(evaluateEvaDetailVo.getStatus())){
					EvaluateEvaDetailBean bean = new EvaluateEvaDetailBean();
					bean.setStatus("2");
					bean.setId(evaluateEvaDetailVo.getId());
					evaluateEvaDetailService.updateEvaluateEvaDetailById(bean);
				}
			}
			
			PageBean pageBean = this.evaluateEvaService.queryEvaluateEvaPage(pb,search);
			
			mav.addObject("pageBean", pageBean);
			mav.addObject("search", search);
			mav.addObject("status", search.getStatus());
		
			return mav;
		}else if("ROLE_04".equals(code)||"ROLE_05".equals(code)){//区级
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + ISSUE);
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			if(baseStaffVo!=null&&baseStaffVo.getAreaId()!=null){
				String status = search.getStatus();
				EvaluateEvaIssueSearch evaluateEvaIssueSearch = new EvaluateEvaIssueSearch();
				evaluateEvaIssueSearch.setAreaId(baseStaffVo.getAreaId());
				evaluateEvaIssueSearch.setType("0");
				evaluateEvaIssueSearch.setStatus("1");
				evaluateEvaIssueSearch.setDelflag("0");
				//查询待发布的
				
				List<EvaluateEvaIssueVo> evaluateEvaIssueVoList = evaluateEvaIssueService.queryEvaluateEvaIssueBySearch(evaluateEvaIssueSearch);
				for(EvaluateEvaIssueVo evaluateEvaIssueVo : evaluateEvaIssueVoList){
					Date nowTime = new Date();
					if(evaluateEvaIssueVo.getEvaluateEvaDetailVo()!=null){
						Date endTime = evaluateEvaIssueVo.getEvaluateEvaDetailVo().getEndTime();
						if(nowTime.getTime()>endTime.getTime()){
							EvaluateEvaIssueBean evaluateEvaIssueBean = new EvaluateEvaIssueBean();
							evaluateEvaIssueBean.setId(evaluateEvaIssueVo.getId());
							evaluateEvaIssueBean.setStatus("3");
							evaluateEvaIssueService.updateEvaluateEvaIssueById(evaluateEvaIssueBean);
						}
					}
					
				}
				evaluateEvaIssueSearch.setStatus(status);
				PageBean pageBean = evaluateEvaIssueService.queryEvaluateEvaIssuePage(pb,evaluateEvaIssueSearch);
				
				//根据区域id查询学校列表
				List<BaseSchoolVo> baseSchoolVoList= baseSchoolService.queryBaseSchoolByAreaId(5L);
				
				mav.addObject("pageBean", pageBean);
				mav.addObject("search", search);
				mav.addObject("baseSchoolVoList", baseSchoolVoList);
				mav.addObject("areaId", baseStaffVo.getAreaId());
				mav.addObject("status", search.getStatus());
				return mav;
			}else{
				return null;
			}
			
		}else if("ROLE_07".equals(code)||"ROLE_08".equals(code)){//校级
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + SCHOOL);
			BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
			if(baseStaffVo!=null&&baseStaffVo.getSchoolId()!=null){
				String status = search.getStatus();
				EvaluateEvaIssueSearch evaluateEvaIssueSearch = new EvaluateEvaIssueSearch();
				evaluateEvaIssueSearch.setSchoolId(baseStaffVo.getSchoolId());
				evaluateEvaIssueSearch.setType("1");
				evaluateEvaIssueSearch.setStatus("1");
				evaluateEvaIssueSearch.setDelflag("0");
				
				//查询待发布的
				List<EvaluateEvaIssueVo> evaluateEvaIssueVoList = evaluateEvaIssueService.queryEvaluateEvaIssueBySearch(evaluateEvaIssueSearch);
				for(EvaluateEvaIssueVo evaluateEvaIssueVo : evaluateEvaIssueVoList){
					Date nowTime = new Date();
					if(evaluateEvaIssueVo.getEvaluateEvaDetailVo()!=null){
						Date endTime = evaluateEvaIssueVo.getEvaluateEvaDetailVo().getEndTime();
						if(nowTime.getTime()>endTime.getTime()){
							EvaluateEvaIssueBean evaluateEvaIssueBean = new EvaluateEvaIssueBean();
							evaluateEvaIssueBean.setId(evaluateEvaIssueVo.getId());
							evaluateEvaIssueBean.setStatus("3");
							evaluateEvaIssueService.updateEvaluateEvaIssueById(evaluateEvaIssueBean);
						}
					}
					
				}
				evaluateEvaIssueSearch.setStatus(status);
				PageBean pageBean = this.evaluateEvaIssueService.queryEvaluateEvaIssuePage(pb,evaluateEvaIssueSearch);
				
				//根据学校id查询班级列表
				BaseClassesSearch baseClassesSearch = new BaseClassesSearch();
				baseClassesSearch.setSchoolId(baseStaffVo.getSchoolId());
				List<BaseClassesVo> baseClassesVoList= baseClassesService.queryBaseClassesBySearch(baseClassesSearch);

				//根据学校ID查询所有老师
				BaseTeacherSearch baseTeacherSearch = new BaseTeacherSearch();
				baseTeacherSearch.setSchoolId(baseStaffVo.getSchoolId());
				List<BaseTeacherVo> baseTeacherVoList = baseTeacherService.queryBaseTeacherBySearch(baseTeacherSearch);
				
				mav.addObject("pageBean", pageBean);
				mav.addObject("search", search);
				mav.addObject("baseClassesVoList", baseClassesVoList);
				mav.addObject("baseTeacherVoList", baseTeacherVoList);
				mav.addObject("schoolId", baseStaffVo.getSchoolId());
				mav.addObject("status", search.getStatus());
				return mav;
			}
			
		}else if("ROLE_06".equals(code)||"ROLE_09".equals(code)||"ROLE_10".equals(code)||"ROLE_11".equals(code)){//个人
			LOGGER.info("(同步)根据条件查询所有的发布列表");
			
			ModelAndView mav = new ModelAndView(PAGE_FOLDER + EVAOBJ);
			String type = evaluateIssueListSearch.getType();
			if(code.equals("ROLE_11")){//学生
				//通过用户ID获取班级ID
				BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
				evaluateIssueListSearch.setClassesId(baseStudentVo.getClassesId());
				evaluateIssueListSearch.setEvaObject("1");
				evaluateIssueListSearch.setUserId(cu.getUserId());
			}else if(code.equals("ROLE_10")){//家长
				//通过家长ID获取学生班级ID
				BaseParentVo baseParentVo = baseParentService.queryBaseParentByUserId(cu.getUserId());
				BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentById(baseParentVo.getStudentId());
				evaluateIssueListSearch.setClassesId(baseStudentVo.getClassesId());
				evaluateIssueListSearch.setEvaObject("2");
				evaluateIssueListSearch.setUserId(cu.getUserId());
			}else if(code.equals("ROLE_09")){//老师
				evaluateIssueListSearch.setUserId(cu.getUserId());
				evaluateIssueListSearch.setEvaObject("3");
			}else{//校长
				//根据userId查询校长
				BaseStaffVo baseStaffVo = baseStaffService.queryBaseStaffByUserId(cu.getUserId());
				if(baseStaffVo.getSchoolId()!=null){
					evaluateIssueListSearch.setSchoolId(baseStaffVo.getSchoolId());
				}else{
					evaluateIssueListSearch.setSchoolId(1L);
				}
				evaluateIssueListSearch.setUserId(cu.getUserId());
				evaluateIssueListSearch.setEvaObject("4");
			}
			
			//查询待完成的，如果超过时间侧放到未完成里面
			evaluateIssueListSearch.setType("1");
			List<EvaluateIssueListVo> evaluateIssueListVos = evaluateIssueListService.queryEvaluateIssueListBySearch(evaluateIssueListSearch);
			for(EvaluateIssueListVo evaluateIssueListVo : evaluateIssueListVos){
				Date nowTime = new Date();
				Date endTime = evaluateIssueListVo.getEvaluateEvaDetailVo().getEndTime();
				if(nowTime.getTime()>endTime.getTime()){//已经超时
					EvaluateAnswerBean evaluateAnswerBean = new EvaluateAnswerBean();
					evaluateAnswerBean.setCreateName(cu.getUsername());
					evaluateAnswerBean.setCreateTime(new Date());
					evaluateAnswerBean.setUserId(cu.getUserId());
					evaluateAnswerBean.setStatus("0");
					evaluateAnswerBean.setEvaDetailId(evaluateIssueListVo.getEvaDetailId());
					evaluateAnswerBean.setIssueListId(evaluateIssueListVo.getId());
					evaluateAnswerService.insertEvaluateAnswer(evaluateAnswerBean);
				}
			}
			
			evaluateIssueListSearch.setType(type);
			PageBean pageBean = this.evaluateIssueListService.queryEvaluateIssueListPage(pb,evaluateIssueListSearch);
			//通过userId去查询已答题的列表
			EvaluateAnswerSearch evaluateAnswerSearch = new EvaluateAnswerSearch();
			evaluateAnswerSearch.setUserId(cu.getUserId());
			List<EvaluateAnswerVo> evaluateAnswerVoList = evaluateAnswerService.queryEvaluateAnswerBySearch(evaluateAnswerSearch);
			
			mav.addObject("pb", pageBean);
			mav.addObject("search", evaluateIssueListSearch);
			mav.addObject("type", type);
			mav.addObject("evaluateAnswerVoList", evaluateAnswerVoList);
			
			
			return mav;
		}
		return null;
		
	}
	
	/**
	 * (同步创建测评信息页面(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createEvaluateEva(HttpServletRequest request, HttpServletResponse response, EvaluateEvaSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
		
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息测评信息(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertEvaluateEva(EvaluateEvaBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("测评信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getNameOfUser());
//		bean.setCreateName("zhouxiaotao");
		bean.setCreateTime(new Date());
		bean.setUserId(cu.getUserId());
		return this.evaluateEvaService.insertEvaluateEva(bean);
	    
	}
	
	/**
	 * (同步创建测评信息页面(用到)
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public ModelAndView reportEvaluateEva(HttpServletRequest request, HttpServletResponse response, EvaluateEvaSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的测评信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + REPORT);
		
		
		return mav;
		
	}

	    
}