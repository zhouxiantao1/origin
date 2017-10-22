package com.sjq.base.knowledge.controller;

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
import com.sjq.knowledge.service.BaseKnowledgeService;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.security.util.CustomUser;
import com.sjq.knowledge.bean.BaseKnowledgeBean;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;

/**
 * [自动生成]基础模块-知识点信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/knowledge")
public class BaseKnowledgeController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/base/";
	
	// 基础模块-知识点信息页面 
	private static final String PAGE = "base_knowledge";
	private static final String EDIT = "base_konwledge_edit";
	private static final String CREATE = "base_knowledge_create";
	
	// 基础模块-知识点信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-知识点信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-知识点信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-知识点信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-知识点信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseKnowledgeController.class);
	
	@Autowired
	private BaseKnowledgeService baseKnowledgeService;
	@Autowired
	private BaseSubjectService baseSubjectService;
	@Autowired
	private BaseQuestionRelatedService baseQuestionRelatedService;
	
	/**
	 * (同步)根据条件查询所有的基础模块-知识点信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllBaseKnowledge(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseKnowledgeSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-知识点信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		search.setParentId(0L);
		PageBean pageBean = this.baseKnowledgeService.queryBaseKnowledgePage(pb,search);
		
		//查询所有学科
		List<BaseSubjectVo> baseSubjectVos = baseSubjectService.queryAllBaseSubject();
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		mav.addObject("baseSubjectVos", baseSubjectVos);
		
		return mav;
		
	}	
	

	/**
	 * (同步)根据条件查询所有的基础模块-知识点信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editBaseKnowledge(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseKnowledgeSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-知识点信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + EDIT);
//		
//		search.setParentId(0L);
//		PageBean pageBean = this.baseKnowledgeService.queryBaseKnowledgePage(pb,search);
//		
//		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}	
	
	/**
	 * (同步)根据条件查询所有的基础模块-知识点信息
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createBaseKnowledge(HttpServletRequest request, HttpServletResponse response, PageBean pb, BaseKnowledgeSearch search) {
		
		LOGGER.info("(同步)根据条件查询所有的基础模块-知识点信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + CREATE);
//		
//		search.setParentId(0L);
//		PageBean pageBean = this.baseKnowledgeService.queryBaseKnowledgePage(pb,search);
//		
//		mav.addObject("pb", pageBean);
		mav.addObject("search", search);
		
		return mav;
		
	}
	
	/**
	 * (增加)增加信息基础模块-知识点信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseKnowledge(BaseKnowledgeBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-知识点信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		if(bean.getParentId()!=null){
			BaseKnowledgeVo baseKnowledgeVo = baseKnowledgeService.queryBaseKnowledgeById(bean.getParentId());
			bean.setGradeId(baseKnowledgeVo.getGradeId());
			bean.setSubjectId(baseKnowledgeVo.getSubjectId());
			bean.setStageId(baseKnowledgeVo.getStageId());
		}
		
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.baseKnowledgeService.insertBaseKnowledge(bean);
	    
	}
	
	/**
	 * (更新)根据ID更新所有基础模块-知识点信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateBaseKnowledgeById(BaseKnowledgeBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-知识点信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getUsername());
		bean.setModTime(new Date());
		return this.baseKnowledgeService.updateBaseKnowledgeById(bean);
	    
	}
				
	/**
	 * 根据ID查询基础模块-知识点信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseKnowledgeVo ajaxQueryBaseKnowledgeById(BaseKnowledgeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-知识点信息");
		return this.baseKnowledgeService.queryBaseKnowledgeById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有基础模块-知识点信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseKnowledgeVo> ajaxQueryBaseKnowledgeBySearch(BaseKnowledgeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-知识点信息");
		return this.baseKnowledgeService.queryBaseKnowledgeBySearch(search);
	    
	}
	
	
	/**
	 * 根据条件查询所有基础模块-知识点信息信息(树型)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/treelistbysearch")
	@ResponseBody
	public List<ZTreeNodesDto> ajaxQueryTreeBaseKnowledgeBySearch(BaseKnowledgeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		List<ZTreeNodesDto> zts = this.baseKnowledgeService.queryTreeNodesBaseKnowledgeBySearch(search);
				
		if(search.getQuestionId()!=null){
			
			BaseQuestionRelatedSearch bqrs = new BaseQuestionRelatedSearch();
			bqrs.setQuestionId(search.getQuestionId());
			bqrs.setRelatedType("2");
			List<BaseQuestionRelatedVo> bqrvs = baseQuestionRelatedService.queryBaseQuestionRelatedBySearch(bqrs);
			Long[] ids = new Long[bqrvs.size()];
			int i=0;
			for(BaseQuestionRelatedVo bqrv:bqrvs){
				ids[i]=bqrv.getRelatedId();
				i++;
			}
			
			this.changeTreeChecked(zts, ids);
			
		}


		LOGGER.info("基础模块-知识点信息");
		return zts;
		
	}
	
	/**
	 * 改变选中状态
	 * @param dto
	 * @param ids
	 * @return
	 */
	public List<ZTreeNodesDto> changeTreeChecked(List<ZTreeNodesDto> zts,Long[] ids){
		
		for(ZTreeNodesDto dto:zts){
			for(Long id:ids){
				if(dto.getId().longValue()==id.longValue()){
					dto.setChecked(true);
					if(dto.getChildren()!=null){
						changeTreeChecked(dto.getChildren(),ids);
					}
				}
			}
		}
		
		return zts;
	}
	

	/**
	 * 根据条件查询所有基础模块-知识点信息信息(树型)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/treelistbyparentId")
	@ResponseBody
	public List<ZTreeNodesDto> getTreeBaseKnowledgeBySearch(BaseKnowledgeSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		List<ZTreeNodesDto> zts = this.baseKnowledgeService.queryBaseKnowledgeByParentId(search.getParentId());
				
		
		LOGGER.info("基础模块-知识点信息");
		return zts;
		
	}
	    
}