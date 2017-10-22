package com.sjq.question.check;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.sjq.check.bean.QuestionCheckBean;
import com.sjq.check.model.QuestionCheckModel;
import com.sjq.check.model.QuestionCheckNumModel;
import com.sjq.check.search.QuestionCheckSearch;
import com.sjq.check.service.QuestionCheckService;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;
import com.sjq.version.service.BaseVersionService;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.search.QuestionWareSearch;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.ware.vo.QuestionWareVo;

/**
 * [自动生成]题库模块-题库审核控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/question/check")
public class QuestionCheckController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="question/";
	
	// 题库模块-题库审核页面 
	private static final String ALLCATION_PAGE = "question_check_allocation";
	// 题库模块-题库审核页面 
	private static final String CHECK_PAGE = "question_check";
												  
	// 题库模块-题库审核访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存题库模块-题库审核信息";
	private static final String OPERA_LOG_UPDATE = "更新题库模块-题库审核信息";
	private static final String OPERA_LOG_DELETE = "删除题库模块-题库审核信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除题库模块-题库审核信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(QuestionCheckController.class);
	
	@Autowired
	private QuestionCheckService questionCheckService;
	
	@Autowired
	private QuestionWareService questionWareService;
	
	@Autowired
	private BaseSubjectService BaseSubjectService;
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private BaseStageService baseStageService;
	
	@Autowired
	private SecurityUserService securityUserService;
	

	
	/**
	 * (审核页面）
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionCheck(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		
		LOGGER.info("(同步)审核页面");
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CHECK_PAGE);
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		if(search.getCheckStatus() == null)search.setCheckStatus("1");   //默认查询待审核
		if(search.getStageId() == null) search.setStageId(1L);           //默认学段(小学)
		
		
		//查询所有的学段信息
		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		
		//查询所有的年级信息
		List<BaseGradeVo>  bGradeVos = baseGradeService.queryBaseGradeByStageId(search.getStageId());
		if(search.getGradeId() == null) {
			search.setGradeId(bGradeVos!=null&bGradeVos.size()>0?bGradeVos.get(0).getId():null);
		}else if(search.getGradeId() == 0){
			search.setGradeId(null);   // 如果id等于0，则说明查询全部，则清空该id值
		}
		
		//查询所有的学科信息
		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectByStageId(search.getStageId());
		if(search.getSubjectId() == null){
			search.setSubjectId(bSubjectVos!=null&bSubjectVos.size()>0?bSubjectVos.get(0).getId():null);	
		}else if(search.getSubjectId() == 0){
			search.setSubjectId(null); // 如果id等于0，则说明查询全部，则清空该id值
		}
		
		
		search.setCheckId(cu.getUserId()==null?0L:cu.getUserId());
		
		
		pb = this.questionWareService.queryQuestionWarePage(pb, search);
		
		mav.addObject("pb", pb);                          //待审核试题信息
		mav.addObject("search", search);                  //查询条件
		mav.addObject("bSubjectVos", bSubjectVos);        //学科信息
		mav.addObject("bStageVos", bStageVos);            //学段信息
		mav.addObject("bGradeVos", bGradeVos);            //年级信息
		
		return mav;
		
	}
	
	
	/**
	 * (分配页面）
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/allocation/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionCheckAllocation(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的题库分配页面");
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + ALLCATION_PAGE);

		
		if(search.getStageId() == null) search.setStageId(1L);           //默认学段(小学)
		
		//查询所有的学段信息
		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		
		//查询所有的年级信息
		List<BaseGradeVo>  bGradeVos = baseGradeService.queryBaseGradeByStageId(search.getStageId());
		if(search.getGradeId() == null) search.setGradeId(bGradeVos!=null&bGradeVos.size()>0?bGradeVos.get(0).getId():null);
		
		//查询所有的学科信息
		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectByStageId(search.getStageId());
		if(search.getSubjectId() == null) search.setSubjectId(bSubjectVos!=null&bSubjectVos.size()>0?bSubjectVos.get(0).getId():null);
		
		search.setCheckStatus("0");  //查询未审核的试题信息
		
		//总数
		int count = this.questionWareService.queryQuestionWareTotalCount(search);
		
		//查询审核试题人员列表信息
		SecurityUserSearch sus = new SecurityUserSearch();
		sus.setRoleId(12L);
		List<SecurityUser> subs = securityUserService.queryUserBySearch(sus);
		
		mav.addObject("bStageVos", bStageVos);            //学段信息
		mav.addObject("bGradeVos", bGradeVos);            //年级信息
		mav.addObject("bSubjectVos", bSubjectVos);        //学科信息
		mav.addObject("search", search);                  //搜索条件
		mav.addObject("count",count);                     //待审核总数
		mav.addObject("subs", subs);                      //审核试题人员列表信息
		return mav;
		
	}
	
	
	/**
	 * 
	 * (同步）增加信息题库模块-题库审核
	 * @param vo 题库模块-题库审核信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/allocation/save")
	public ModelAndView saveQuestionCheck(HttpServletRequest request, HttpServletResponse response,QuestionCheckModel qcm) {
		
		LOGGER.info("(同步）分配试题进行审核");
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		//获取分配提交的信息（教研员id,试题数量)
		QuestionWareSearch qws = new QuestionWareSearch();
		qws.setGradeId(qcm.getGradeId());
		qws.setStageId(qcm.getStageId());
		qws.setSubjectId(qcm.getSubjectId());
		qws.setCheckStatus("0");
		List<Map<String,Object>> ids = this.questionWareService.queryQuestionIdsBySearch(qws);
		
		List<QuestionWareBean> qwbs = new ArrayList<QuestionWareBean>();
		for(QuestionCheckNumModel qcnm:qcm.getQcnms()){
			for(int i=0;i<qcnm.getNum();i++){
				QuestionWareBean bean = new QuestionWareBean();
				bean.setCheckId(qcnm.getCheckId());
				bean.setCheckStatus("1");           //  0.未分配审核 1.待审核 2.审核通过 3.审核不通过
				bean.setCheckName(qcnm.getCheckName());
				bean.setModTime(new Date());
				bean.setModName(cu.getUsername()==null?"":cu.getUsername());
				qwbs.add(bean);
			}
		}
		
		for(int i=0;i<qwbs.size();i++){
			qwbs.get(i).setId(Long.valueOf(ids.get(i).get("id").toString()));
		}
		
		for(QuestionWareBean qwb:qwbs){
			this.questionWareService.updateQuestionWareById(qwb);
		}
		
		
		return new ModelAndView(new RedirectView(request.getContextPath()+"/question/check/allocation/success.htm"));
		 
	}
	
	
	@RequestMapping(value = "/allocation/success")
	public ModelAndView QuestionCheckAllocationSuccess(HttpServletRequest request, HttpServletResponse response) {
		
		return new ModelAndView("common/success");
		
	}
	
	
	/**
	 * (更新)审核试题
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public int ajaxUpdateQuestionWareBySearch(QuestionWareBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题库中心");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		QuestionWareBean qwb = new QuestionWareBean();
		qwb.setCheckStatus(bean.getCheckStatus());
		qwb.setModName(cu.getUsername());
		qwb.setModTime(new Date());
		qwb.setCheckTime(new Date());
		qwb.setBelongToLib(bean.getBelongToLib());
		
		QuestionWareSearch qws = new QuestionWareSearch();
		qws.setCheckId(cu.getUserId());
		qws.setId(bean.getId());
		qws.setCheckStatus("1");
		return this.questionWareService.updateQuestionWareBySearch(qwb,qws);
	    
	}
	
	
	
	
	    
	
	    
}