package com.sjq.question.ware;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.LineSpacingRule;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.ware.vo.QuestionWareVo;

import gui.ava.html.image.generator.HtmlImageGenerator;

import com.sjq.util.PageBean;
import com.sjq.version.service.BaseVersionService;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.type.service.QuestionTypeService;
import com.sjq.type.vo.QuestionTypeVo;
import com.alibaba.fastjson.JSON;
import com.sjq.answer.bean.QuestionAnswerBean;
import com.sjq.answer.vo.QuestionAnswerVo;
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalogDetail.service.BaseCatalogDetailService;
import com.sjq.collect.bean.QuestionCollectBean;
import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.service.QuestionCollectService;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.common.export.ColumnConfig;
import com.sjq.common.export.ExcelExporter;
import com.sjq.common.util.cookie.CookieUtil;
import com.sjq.common.util.phputil.dto.QuestionContentDto;
import com.sjq.common.util.phputil.dto.QuestionOptionsDto;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.knowledge.service.BaseKnowledgeService;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;
import com.sjq.security.util.CustomUser;
import com.sjq.ware.bean.QuestionWareBean;
import com.sjq.ware.dto.QuestionExportDto;
import com.sjq.ware.search.QuestionWareSearch;


/**
 * [自动生成]题库模块-题库中心控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author Zheng.zejie
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/question/ware")
public class QuestionWareController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="question/";
	
	// 题库模块-题库中心页面 
	private static final String PAGE = "question_ware";
	
	// 题库模块-题库中心访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存题库模块-题库中心信息";
	private static final String OPERA_LOG_UPDATE = "更新题库模块-题库中心信息";
	private static final String OPERA_LOG_DELETE = "删除题库模块-题库中心信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除题库模块-题库中心信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(QuestionWareController.class);
	
	
	@Autowired
	private BaseSubjectService BaseSubjectService;
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private BaseVersionService baseVersionService;
	
	@Autowired
	private BaseStageService baseStageService;
	
	@Autowired
	private BaseKnowledgeService baseKnowledgeService;
	
	@Autowired
	private BaseCatalogService baseCatalogService;
	
	@Autowired
	private BaseCatalogDetailService baseCatalogDetailService;
	
	@Autowired
	private QuestionWareService questionWareService;
	
	@Autowired
	private QuestionTypeService questionTypeService;
	
	@Autowired
	private QuestionCollectService questionCollectService;
	
	@Autowired
	private BaseQuestionRelatedService baseQuestionRelatedService;
	
	/**
	 * (同步)根据条件查询所有的题库模块-1考试题库
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/1/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib1(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		
		search.setBelongToLib("1");
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	
	/**
	 * (同步)根据条件查询所有的题库模块-2作业题库
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/2/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib2(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		search.setBelongToLib("2");
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	/**
	 * (同步)根据条件查询所有的题库模块-3錨题库
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/3/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib3(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		search.setBelongToLib("3");
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	/**
	 * (同步)根据条件查询所有的题库模块-4种子题库
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/4/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib4(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		search.setBelongToLib("4");
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	
	/**
	 * (同步)根据条件查询所有的题库模块- 5个人题库（教师题库）
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/5/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib5(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		
		search.setBelongToLib("5");
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setCreateId(cu.getUserId());
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	
	/**
	 * (同步)根据条件查询所有的题库模块-6专家题库 （新题库）
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/6/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib6(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		search.setBelongToLib("6");
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	
	/**
	 * (同步)根据条件查询所有的题库模块-7.自适应题库
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/7/list", method = RequestMethod.GET)
	public ModelAndView queryAllQuestionWareByLib7(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search) {
		search.setBelongToLib("7");
		return this.searchQuestionWare(request, response, pb, search);
		
	}
	
	/**
	 * 查询题库内容
	 */
	public ModelAndView searchQuestionWare(HttpServletRequest request, HttpServletResponse response, PageBean pb, QuestionWareSearch search){
		
		LOGGER.info("(同步)根据条件查询所有的题库模块-题库中心");
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		
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
		if(search.getBelongToLib() != null && search.getBelongToLib().equals("5") && cu!=null) search.setCreateId(cu.getUserId());   //查询个人题库时，绑定登录人id
		
		if(search.getVersionId() == null) search.setVersionId(1L);//默认版本
		if(search.getStageId() == null) search.setStageId(1L);           //默认学段(小学)
		
		//查询所有的学段信息
		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		
		//查询所有的年级信息
		List<BaseGradeVo>  bGradeVos = baseGradeService.queryBaseGradeByStageId(search.getStageId());
		if(search.getGradeId() == null) search.setGradeId(bGradeVos!=null&bGradeVos.size()>0?bGradeVos.get(0).getId():null);
		
		//查询所有的学科信息
		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectByStageId(search.getStageId());
		if(search.getSubjectId() == null) search.setSubjectId(bSubjectVos!=null&bSubjectVos.size()>0?bSubjectVos.get(0).getId():null);
		
		//查询所有的题型信息
		List<QuestionTypeVo> qTypeVos = questionTypeService.queryQuestionTypeBySubjectId(search.getSubjectId());
		
		//查询所有的教材版本
		List<BaseVersionVo>  bVersionVos = baseVersionService.queryAllBaseVersion();
		
//		//查询所有的目录详情
//		List<BaseCatalogVo> bCatalogVos =  baseCatalogService.queryAllBaseCatalog();
//		
//		//查询所有的知识点
//		List<BaseKnowledgeVo>  bKnowledgeVos = baseKnowledgeService.queryAllBaseKnowledge();
		
		//查询题库信息
		PageBean pageBean = this.questionWareService.queryQuestionWarePage(pb,search);
		
		//查询用户收藏的列表
		QuestionCollectSearch qcs = new QuestionCollectSearch();
		qcs.setUserId(cu.getUserId()==null?0L:cu.getUserId());
		qcs.setDelflag("0");
		List<QuestionCollectVo> qCollectVos = this.questionCollectService.queryQuestionCollectBySearch(qcs);
		
		//查询用户导入的列表
		String cookieValue = this.questionWareService.queryQuestionExportCookie(request, response);   //获取存储中cookie中待导出的试题id
	    List<Long> eids = new ArrayList<Long>();
	    
	    if(cookieValue!=null && !cookieValue.equals("")){
				
			try {
				cookieValue = URLDecoder.decode(cookieValue,"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
				
			for(String v:cookieValue.split("\\|")){
				eids.add(Long.valueOf(v.split("#")[1]));
			}
	    }
					
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);                  //查询条件
		mav.addObject("bVersionVos", bVersionVos);        //教材版本信息
		mav.addObject("bSubjectVos", bSubjectVos);        //学科信息
		mav.addObject("bStageVos", bStageVos);            //学段信息
		mav.addObject("bGradeVos", bGradeVos);            //年级信息
//		mav.addObject("bKnowledgeVos", bKnowledgeVos);    //知识点信息
		mav.addObject("qTypeVos",qTypeVos);               //题型信息
//		mav.addObject("bCatalogVos",bCatalogVos);         //目录信息
		mav.addObject("qCollectVos", qCollectVos);        //收藏列表
		mav.addObject("eids",eids);                           //待导出试题ids集
		return mav;
		
	}
	
	
	
	/**
	 * (同步)跳转到命题页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/save/page", method = RequestMethod.GET)
	public ModelAndView saveQuestionWarePage(HttpServletRequest request, HttpServletResponse response, PageBean pb) {
		
		LOGGER.info("跳转到命题页面");
		
		//查询所有的教材版本
		List<BaseVersionVo>  bVersionVos = baseVersionService.queryAllBaseVersion();
		
		//查询所有的学段信息
		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + "question_ware_save");
		mav.addObject("bVersionVos", bVersionVos);        //教材版本信息
		mav.addObject("bStageVos", bStageVos);            //学段信息
		
		return mav;
		
	}
	
	
	/**
	 * (同步)跳转到编辑命题页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "/modify/page", method = RequestMethod.GET)
	public ModelAndView modifyQuestionWarePage(Long id,HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("跳转到编辑命题页面");
		
		QuestionWareVo vo = this.questionWareService.queryQuestionWareById(id);
		
		//查询所有的教材版本
		List<BaseVersionVo>  bVersionVos = baseVersionService.queryAllBaseVersion();
		
		//查询所有的学段信息	
		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + "question_ware_save");
		mav.addObject("bVersionVos", bVersionVos);        //教材版本信息
		mav.addObject("bStageVos", bStageVos);            //学段信息
		mav.addObject("vo",vo);                           //试题类型
		
		return mav;
		
	}
	
	
	/**
	 * (增加)编辑信息题库模块-题库中心
	 * @param knowIds          知识点ids
	 * @param catelogIds       课本章节ids
	 * @param qc               试题标题与内容
	 * @param qs               试题选项（选择题专用）
	 * @param av               试题判断对与错（判断题专用）
	 * @param qwb              试题信息
	 * @param qab              试题答案信息
	 * @param reuqest          请求体
	 * @param response         响应体
	 * @return
	 */
	@RequestMapping("/list/modify")
	@ResponseBody
	public int ajaxModifyQuestionWare(Long questionId,Long questionAnswerId,@RequestParam(value = "knowIds[]") Long[] knowIds,@RequestParam(value = "catelogIds[]") Long[] catelogIds, QuestionContentDto qc,String qs,String av,QuestionWareBean qwb,QuestionAnswerBean qab,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题库中心");
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		qwb.setId(questionId);
		qab.setId(questionAnswerId);
		
		//选择题
		if(!qs.equals("[]")){
			//解析选项内容options
			qwb.setQods(JSON.parseArray(qs,QuestionOptionsDto.class));
		}
		
		//判断题
		if(av!=null && !av.equals("")){
			qab.setAnswerValue("s:1:\""+av+"\"");
		}
		
		qwb.setCreateId(cu.getUserId());
		qwb.setCreateName(cu.getNameOfUser());
		qwb.setCreateTime(new Date());
		qwb.setQcd(qc);
		
		return this.questionWareService.modifyQuestionWare(qwb,qab,knowIds,catelogIds);
		
	}
	
	
	
	/**
	 * (增加)增加信息题库模块-题库中心
	 * @param knowIds          知识点ids
	 * @param catelogIds       课本章节ids
	 * @param qc               试题标题与内容
	 * @param qs               试题选项（选择题专用）
	 * @param av               试题判断对与错（判断题专用）
	 * @param qwb              试题信息
	 * @param qab              试题答案信息
	 * @param reuqest          请求体
	 * @param response         响应体
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertQuestionWare(@RequestParam(value = "knowIds[]") Long[] knowIds,@RequestParam(value = "catelogIds[]") Long[] catelogIds, QuestionContentDto qc,String qs,String av,QuestionWareBean qwb,QuestionAnswerBean qab,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题库中心");
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		//选择题
		if(!qs.equals("[]")){
			//解析选项内容options
			qwb.setQods(JSON.parseArray(qs,QuestionOptionsDto.class));
		}
		
		//判断题
		if(av!=null && !av.equals("")){
			qab.setAnswerValue("s:1:\""+av+"\"");
		}
		
		qwb.setCreateId(cu.getUserId());
		qwb.setCreateName(cu.getNameOfUser());
		qwb.setCreateTime(new Date());
		qwb.setQcd(qc);
		
		return this.questionWareService.insertQuestionWare(qwb,qab,knowIds,catelogIds);
		
	}
	    
	
	/**
	 * 试题导入的模板下载
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/templet/export", method = RequestMethod.GET)
	public void exportTemplet(HttpServletRequest request, HttpServletResponse response) {
		
		// 标题定义
		List<ColumnConfig> columnConfigs = new ArrayList<ColumnConfig>();
		columnConfigs.add(new ColumnConfig("questionTypeName", "题型名称"));
		columnConfigs.add(new ColumnConfig("questionContent", "试题内容"));
		columnConfigs.add(new ColumnConfig("questionAnswer", "试题答案"));
		columnConfigs.add(new ColumnConfig("questionAnswerDescription", "试题解析"));
		columnConfigs.add(new ColumnConfig("difficulty", "试题难度值"));
		columnConfigs.add(new ColumnConfig("bloomTaxonomy", "认知程次"));
		
		List<QuestionExportDto> list = new ArrayList<QuestionExportDto>();
		
		try {
			ExcelExporter<QuestionExportDto> export = new ExcelExporter<QuestionExportDto>(response, request, list, columnConfigs);
			export.export("试题导入模板","xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * 导出试题
	 * @param id  试题id
	 * @param request  请求
	 * @param response 响应
	 * @throws IOException 
	 */
	@RequestMapping(value = "/batch/export", method = RequestMethod.GET)
	public void exportQuestion(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String optionNumber = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
        String content = "";
        
        content += "<html>";
        content += "<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head>";
        content += "<body style=\"font-size:12px;width:60%\">";
        
        String cookieValue = this.questionWareService.queryQuestionExportCookie(request, response);   //获取存储中cookie中待导出的试题id
        
        if(cookieValue!=null && !cookieValue.equals("")){
			
			cookieValue = URLDecoder.decode(cookieValue,"utf-8");
			
			for(String v:cookieValue.split("\\|")){
				
				String[] ks = v.split("#");
				
				QuestionWareVo qwv = this.questionWareService.queryQuestionWareById(Long.valueOf(ks[1]));
				
				if(qwv!=null){
	        	
		        	if(qwv.getQcd().getTitle()!=null)content += qwv.getQcd().getTitle();
		            if(qwv.getQcd().getContent()!=null)content += qwv.getQcd().getContent();
		        
			        content += "<br/>"; 
			    	
			        // 如果为选择题可显示选项
			        if(qwv.getQods()!=null && qwv.getQods().size()>0){
			        	
			        	
			        	for(int i=0;i<qwv.getQods().size();i++){
			        		
			        		QuestionOptionsDto d = qwv.getQods().get(i);
			        		
			        		content += optionNumber.substring(i,i+1)+" "+d.getContent()+"<br/>";
			        	}
			        }
			        
			        // 显示答案 根据不同的评价机制展示答案阅卷机制。0，非机器阅卷 1.选择题 2.多选题 3填空题 4.多填空题 5.判断题  
			        content += "<br/>"; 
			        
			        if(qwv.getAvs()!=null && qwv.getAvs().size() >0){
			        		
			        	for(QuestionAnswerVo av:qwv.getAvs()){
			        		
				        	if(qwv.getQtv().getMarkingCode().equals("0")){
				        	// 非客观题(直接展示
				        		content += "【答案】"+ av.getAnswerValue();
				        	}else if(qwv.getQtv().getMarkingCode().equals("1") || qwv.getQtv().getMarkingCode().equals("2")){
				        	
				        		content += "【答案】";
				        		
				        		for(int i=0;i<qwv.getQods().size();i++){
				            		
				            		QuestionOptionsDto d = qwv.getQods().get(i);
				        			
				        			if(d.getIs_answer().equals("1")){
				        				content += optionNumber.substring(i,i+1)+"&nbsp;";
				        			}
				        			
				        		}
				        		
				        		content += "<br/>";
				        	}else if(qwv.getQtv().getMarkingCode().equals("3") || qwv.getQtv().getMarkingCode().equals("4")){
				        		
				        		content += "【答案】";
				        		
				        		String[] s = av.getAnswerValue().split("\\|");
				        		
				        		for(int i=0;i<s.length;i++){
				        			
				        			content += s[i];
				        			
				        		}
				        		
				        		content += "<br/>";
				        		
				        	}else if(qwv.getQtv().getMarkingCode().equals("5")){
				        		
				        		content += "【答案】";
				        		
				        		String[] s = av.getAnswerValue().split("\\|");
				        		
				        		for(int i=0;i<s.length;i++){
				        			
				        			if(s[i].equals("0")){
				        				content += "×&nbsp;";
				        			}else{
				        				content += "√&nbsp;";
				        			}
				        			
				        		}
				        		
				        		content += "<br/>";
				        		
				        	}
				        	
				        	// 显示解析
				            content += "<br/>"; 
				            content += "【解析】"+ av.getAnswerDescription();
				        	
			        	}
			        	
			        }
			        
			        content += "<br/>-------------------------------------------------------------------------------------------------------<br/>"; 
		        
				}
				
			
			}
			
        }else{
        	content += "暂无试题内容!请重新选择需要导出的试题信息";
        }
        
				
        
        content += "</body>";
        content += "</html>";
        
        
        byte b[] = content.getBytes();    
        ByteArrayInputStream bais = new ByteArrayInputStream(b);    
        POIFSFileSystem poifs = new POIFSFileSystem();    
        DirectoryEntry directory = poifs.getRoot();    
        DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);    
        //输出文件  
        String name="试题";  
        response.reset();  
        response.setHeader("Content-Disposition",  
                 "attachment;filename=" +  
                 new String( (name + ".doc").getBytes(),  
                            "iso-8859-1"));  
        response.setContentType("application/msword");  
        OutputStream ostream = response.getOutputStream();   
        poifs.writeFilesystem(ostream);    
        bais.close();    
        ostream.close();   
        
	}
	
	
	
	
	/**
	 * (删除)根据ID删除题库模块-题库中心信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/export/get")
	@ResponseBody
	public Map<String,Integer> ajaxGetQuestionExportCookie(QuestionWareBean bean,HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		String cookieValue = this.questionWareService.queryQuestionExportCookie(reuqest, response);
		
		
		
		if(cookieValue!=null){
			
			cookieValue = URLDecoder.decode(cookieValue,"utf-8");
			
			for(String v:cookieValue.split("\\|")){
				
				String[] ks = v.split("#");
				
				if(!ks[0].equals("")){
					if(map.get(ks[0])==null){
						
						map.put(ks[0], 1);
						
					}else{
						
						map.put(ks[0],map.get(ks[0])+1);
						
					}
				}
					
			}
		}
		
		return map;
		
	}
	
	
	/**
	 * (删除)根据ID删除题库模块-题库中心信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/export/add")
	@ResponseBody
	public int ajaxAddQuestionExportCookie(String id,String typeName,HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		this.questionWareService.addQuestionExportCookie(id, URLEncoder.encode(typeName, "utf-8"), reuqest, response);
		
		return 1;
		
	}
	
	
	@RequestMapping("/export/clean")
	@ResponseBody
	public int ajaxAddQuestionExportCookie(HttpServletRequest reuqest,HttpServletResponse response) throws UnsupportedEncodingException {
		
		this.questionWareService.clearQuestionExportCookie(reuqest, response);
		
		return 1;
		
	}
	
	

	/**
	 * 根据题型名称删除cooike信息
	 * @param id
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/name/delete")
	@ResponseBody
	public int deleteQuestionExportCookieByTypeName(String typeName,HttpServletRequest request ,HttpServletResponse response) throws UnsupportedEncodingException{
		
		this.questionWareService.deleteQuestionExportCookieByTypeName(URLEncoder.encode(typeName, "utf-8"), request, response);
		
		return 1;
		
	}
	
	/**
	 * 根据试题id删除cooike信息
	 * @param id
	 * @param request
	 * @param response
	 */
	@RequestMapping("/id/delete")
	@ResponseBody
	public int  deleteQuestionExportCookieById(String id,HttpServletRequest request ,HttpServletResponse response){
		
		this.questionWareService.deleteQuestionExportCookieById(id, request, response);
		
		return 1;
		
	}
	

	
	
	/**
	 * (删除)根据ID删除题库模块-题库中心信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/delete")
	@ResponseBody
	public int ajaxDeleteQuestionWareById(QuestionWareBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("题库模块-题库中心");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername()==null?"":cu.getUsername());
		bean.setCreateTime(new Date());
		return this.questionWareService.deleteQuestionWareById(bean);
	    
	}

	
	
	public static void main(String[] args){
		String value= "选择题,1234|";
		String[] s = value.split("\\|");
		for(String ss:s){
			
			String[] ks = ss.split(",");
			System.out.println(ks[0]+"  "+ks[1]);
		}
	}
	
	    
}