package com.sjq.base.catalogDetail.controller;

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
import com.sjq.catalogDetail.service.BaseCatalogDetailService;
import com.sjq.util.PageBean;
import com.sjq.ware.dto.ZTreeNodesDto;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.security.util.CustomUser;
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalogDetail.bean.BaseCatalogDetailBean;
import com.sjq.catalogDetail.search.BaseCatalogDetailSearch;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;

/**
 * [自动生成]基础模块-目录详情信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/base/catalogDetail")
public class BaseCatalogDetailController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="base/catalogDetail/";
	
	// 基础模块-目录详情信息页面 
	private static final String PAGE = "catalogDetailList";
	
	// 基础模块-目录详情信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存基础模块-目录详情信息信息";
	private static final String OPERA_LOG_UPDATE = "更新基础模块-目录详情信息信息";
	private static final String OPERA_LOG_DELETE = "删除基础模块-目录详情信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除基础模块-目录详情信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(BaseCatalogDetailController.class);
	
	@Autowired
	private BaseCatalogDetailService baseCatalogDetailService;
	@Autowired
	private BaseCatalogService baseCatalogService;
	@Autowired
	private BaseQuestionRelatedService baseQuestionRelatedService;
	
	/**
	 * (增加)增加信息基础模块-目录详情信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertBaseCatalogDetail(BaseCatalogDetailBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-目录详情信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		//通过id查询catalog
		BaseCatalogVo baseCatalogVo = baseCatalogService.queryBaseCatalogById(bean.getCatalogId());
		
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		bean.setGradeId(baseCatalogVo.getGradeId());
		bean.setSubjectId(baseCatalogVo.getSubjectId());
		bean.setVersionId(baseCatalogVo.getVersionId());
		bean.setStageId(baseCatalogVo.getStageId());
		bean.setTermId(baseCatalogVo.getTermId());
		bean.setYearId(baseCatalogVo.getYearId());
		return this.baseCatalogDetailService.insertBaseCatalogDetail(bean);
	    
	}			
				
	/**
	 * 根据ID查询基础模块-目录详情信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public BaseCatalogDetailVo ajaxQueryBaseCatalogDetailById(BaseCatalogDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-目录详情信息");
		return this.baseCatalogDetailService.queryBaseCatalogDetailById(search.getId());
	    
	}		
				
	/**
	 * 根据条件查询所有基础模块-目录详情信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<BaseCatalogDetailVo> ajaxQueryBaseCatalogDetailBySearch(BaseCatalogDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("基础模块-目录详情信息");
		return this.baseCatalogDetailService.queryBaseCatalogDetailBySearch(search);
	    
	}
	
	/**
	 * 根据条件查询所有基础模块-目录详情信息信息(树型)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/treelistbysearch")
	@ResponseBody
	public List<ZTreeNodesDto> ajaxTreeQueryBaseCatalogDetailBySearch(BaseCatalogDetailSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		List<ZTreeNodesDto> zts =  this.baseCatalogDetailService.queryTreeNodesBaseCatalogDetailBySearch(search);
		
		if(search.getQuestionId()!=null){
			
			BaseQuestionRelatedSearch bqrs = new BaseQuestionRelatedSearch();
			bqrs.setQuestionId(search.getQuestionId());
			bqrs.setRelatedType("1");
			List<BaseQuestionRelatedVo> bqrvs = baseQuestionRelatedService.queryBaseQuestionRelatedBySearch(bqrs);
			Long[] ids = new Long[bqrvs.size()];
			int i=0;
			for(BaseQuestionRelatedVo bqrv:bqrvs){
				ids[i]=bqrv.getRelatedId();
				i++;
			}
			
			this.changeTreeChecked(zts, ids);
			
		}
		
		LOGGER.info("基础模块-目录详情信息");
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
	    
}