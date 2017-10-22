package com.sjq.develop.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.sjq.develop.bean.DevelopCodeBean;
import com.sjq.develop.bean.DevelopCodeMethodBean;
import com.sjq.develop.bean.DevelopCodePropertyBean;
import com.sjq.develop.service.DevelopCodePropertyService;
import com.sjq.develop.service.DevelopCodeService;
import com.sjq.develop.service.DevelopMethodService;
import com.sjq.develop.utils.DelAllFile;
import com.sjq.develop.utils.FileDownload;
import com.sjq.develop.utils.FileZip;
import com.sjq.develop.utils.FreemarkerUtil;
import com.sjq.develop.utils.PathUtil;
import com.sjq.develop.vo.DevelopCodePropertyVo;
import com.sjq.develop.vo.DevelopCodeVo;
import com.sjq.develop.vo.DevelopMethodVo;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.util.MyLogger;


/**
 * 
 * 代码管理控制器
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月11日上午9:21:45
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/code")
public class DevelopCodeController {
	
	private static final String PAGE_FOLDER="develop/";
	
	
	private static final String PAGE = "develop_code";
	
	private static final String PAGE_HTM = "list.htm";
	
	
	/** 记录日志对象 */
    private static final MyLogger LOGGER = new MyLogger(DevelopCodeController.class);
	
	@Autowired
	private DevelopCodeService developCodeService;
	
	@Autowired
	private DevelopCodePropertyService developCodePropertyService;
	
	@Autowired
	private DevelopMethodService developMethodService;

	/**
	 * 跳转到管理生成的界面
	 * @param response
	 * @param codeId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list")
	public ModelAndView codePage(HttpServletResponse response,Long codeId) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(PAGE_FOLDER + PAGE);
		
		List<DevelopCodeVo> dcvs =developCodeService.selectAll();                             //查询所有的代码信息
		
		if(codeId == null) if(dcvs != null && dcvs.size() >0) codeId = dcvs.get(0).getId();   //默认取第一个
		
		//查询当瓣的代码信息
		DevelopCodeVo dcv = developCodeService.queryCodeById(codeId);
		
		//查询代码下的属性信息
		List<DevelopCodePropertyVo> dcvps = developCodePropertyService.queryDevelopCodePropertyByCodeId(codeId);
		
		mav.addObject("dcvs", dcvs);     //所有代码基本信息
		mav.addObject("dcv", dcv);       //当前代码基本信息
		mav.addObject("codeId", codeId); //当前代码id
		mav.addObject("dcvps", dcvps);   //代码下的属性信息
		return mav;
	}
	
	
	/**
	 * 跳转到方法配置的界面
	 * @param response
	 * @param codeId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/method/list")
	public ModelAndView DevelopCodeMehtodPage(HttpServletResponse response,Long codeId) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(PAGE_FOLDER + "develop_code_method");
		
		//查询当瓣的代码信息
		DevelopCodeVo dcv = developCodeService.queryCodeById(codeId);
		
		//方法配置列表信息
		List<DevelopMethodVo> dmvs= developMethodService.queryDevelopMethodAllByCodeId(codeId);
		//代替*，用于前端展示实际生成的方法名称
		for(DevelopMethodVo vo:dmvs){
			vo.setMethodName(vo.getMethodName().replace("*", dcv.getUpperProjectName()==null?"":dcv.getUpperProjectName()+dcv.getUpperModuleName()==null?"":dcv.getUpperModuleName()));
			vo.setMethodComment(vo.getMethodComment().replace("*", dcv.getCodeComment()==null?"":dcv.getCodeComment()));
		}
		
		mav.addObject("dcv", dcv);       //当前代码基本信息
		mav.addObject("dmvs", dmvs);       //方法配置列表信息
		return mav;
		
	}
	
	
	/**
	 * 保存代码生成模块信息
	 * @param vo 代码生成模块信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveCode(@Valid DevelopCodeBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("保存代码生成模块信息...");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		
		bean.setCreateTime(new Date());
		
        int result = this.developCodeService.insertDevelopCode(bean);
        
        

        return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
	
	
	/**
	 * 保存代码下的属性信息
	 * @param vo 代码生成模块信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/propertySave", method = RequestMethod.POST)
	public ModelAndView saveCode(@Valid DevelopCodePropertyBean bean, HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("保存代码下的属性模块信息...");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		
		bean.setCreateTime(new Date());
		
        int result = this.developCodePropertyService.insertDevelopCodeProerty(bean);;

        return new ModelAndView(new RedirectView(PAGE_HTM+"?codeId="+bean.getCodeId()));
		
	}
	
	/**
	 * 保存代码下的属性信息
	 * @param vo 代码生成模块信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "/method/save", method = RequestMethod.POST)
	public ModelAndView saveDevelopCodeMethod(Long codeId,Long[] methodIds,HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.info("保存代码下的属性模块信息...");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		List<DevelopCodeMethodBean> bs = new ArrayList<DevelopCodeMethodBean>();
		DevelopCodeMethodBean bean = null;
		if(methodIds != null){
			for(Long methodId:methodIds){
				
				bean = new DevelopCodeMethodBean();
				
				bean.setCreateName(cu.getUsername());
				bean.setCodeId(codeId);
				bean.setMethodId(methodId);
				bs.add(bean);
				
			}
		}
		
		this.developMethodService.insertDevelopCodeMethod(codeId, bs);

        return new ModelAndView(new RedirectView(PAGE_HTM+"?codeId="+codeId));
		
	}

	/**
	 * 生成代码
	 */
	@RequestMapping(value = "/generate")
	public void generateDevelopCode(HttpServletResponse response,Long codeId, HttpSession session) throws Exception {

		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
				
		DevelopCodeBean bean = new DevelopCodeBean();
		bean.setId(codeId);
		bean.setModTime(new Date());
		bean.setLastGenerateTime(new Date());
		bean.setModName(cu.getUsername());
		
		//更新生成时间
		this.developCodeService.updateCodeById(bean);

		//查询开发任务
		DevelopCodeVo dco = this.developCodeService.queryCodeById(codeId);
		
		//查询开发对应的属性列表 
		List<DevelopCodePropertyVo> dcpvs = this.developCodePropertyService.queryDevelopCodePropertyByCodeId(codeId);
		
		//查询所有方式配置信息
		List<DevelopMethodVo> dmvs = this.developMethodService.queryDevelopMethodByCodeId(codeId);
		for(DevelopMethodVo vo:dmvs){
			vo.setMethodName(vo.getMethodName().replace("*", dco.getUpperProjectName()+dco.getUpperModuleName()));
			vo.setMethodComment(vo.getMethodComment().replace("*", dco.getCodeComment()));
		}
		
		Map<String, Object> root = new HashMap<String, Object>(); // 创建数据模型
		root.put("dco", dco);      // 开发任务封装
		root.put("dcpvs", dcpvs);  // 属性列表封装
		root.put("dmvs", dmvs);    // 方式配置封装
		
		String classpath = session.getServletContext().getRealPath("/");

		DelAllFile.delFolder(classpath + "code"); // 生成代码前,先清空之前生成的代码
		
		String filePath = classpath+"code/";          // 存放路径
		System.out.println(filePath);
		String ftlPath = classpath+"view/templet/";   // 模板存放路径
		System.out.println(ftlPath);
		
		/* 生成bean */
		FreemarkerUtil.printFile("bean.ftl", root, dco.getModuleName() + "/bean/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "Bean.java", filePath,ftlPath);
		
		/* 生成vo */
		FreemarkerUtil.printFile("vo.ftl", root, dco.getModuleName() + "/vo/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "Vo.java", filePath,ftlPath);
		
		/* 生成search */
		FreemarkerUtil.printFile("search.ftl", root , dco.getModuleName() + "/search/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "Search.java",filePath, ftlPath);

		/* 生成dao */
		FreemarkerUtil.printFile("mapper.ftl", root,dco.getModuleName() + "/dao/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "Mapper.java", filePath,ftlPath);
		
		FreemarkerUtil.printFile("mapperImpl.ftl", root,dco.getModuleName() + "/dao/impl/" + dco.getUpperProjectName() + dco.getUpperModuleName()  + "MapperImpl.java", filePath,ftlPath);
			
		/* 生成mybatis xml */
		FreemarkerUtil.printFile("xml.ftl", root, dco.getModuleName()  + "/mapper/" + dco.getUpperProjectName() + dco.getUpperModuleName()  + "Mapper.xml", filePath,ftlPath);
		
		
		/* 生成SQL脚本 */
		FreemarkerUtil.printFile("sql.ftl", root, dco.getModuleName() + "/sql/" + dco.getUpperProjectName() + dco.getUpperModuleName() + ".sql",filePath, ftlPath);
		
		/* 生成service */
		FreemarkerUtil.printFile("service.ftl", root, dco.getModuleName() + "/service/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "Service.java", filePath,
				ftlPath);
		FreemarkerUtil.printFile("serviceImpl.ftl", root, dco.getModuleName()  + "/service/impl/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "ServiceImpl.java",filePath, ftlPath);
		
		/* 生成controller */
		FreemarkerUtil.printFile("controller.ftl", root, dco.getModuleName()  + "/controller/" + dco.getUpperProjectName() + dco.getUpperModuleName() + "Controller.java",filePath, ftlPath);


		// /* 生成的全部代码压缩成zip文件 */
		FileZip.zip(classpath + "code", classpath + "code.zip");
		//
		// /* 下载代码 */
		FileDownload.fileDownload(response, classpath + "code.zip", "code.zip");

	}
	
	
	/**
	 * 预览代码
	 * @param response
	 * @param codeId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/preview")
	public ModelAndView codePreviewPage(HttpServletResponse response,Long codeId,Long[] methodIds,String type) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		//查询开发任务
		DevelopCodeVo dco = this.developCodeService.queryCodeById(codeId);
		
		//查询开发对应的属性列表 
		List<DevelopCodePropertyVo> dcpvs = this.developCodePropertyService.queryDevelopCodePropertyByCodeId(codeId);
		
		//查询所有方式信息
		List<DevelopMethodVo> dmvs = this.developMethodService.queryDevelopMethodByIds(methodIds);
		for(DevelopMethodVo vo:dmvs){
			vo.setMethodName(vo.getMethodName().replace("*", dco.getUpperProjectName()+dco.getUpperModuleName()));
			vo.setMethodComment(vo.getMethodComment().replace("*", dco.getCodeComment()));
		}
		
		mav.setViewName(PAGE_FOLDER + "develop_code_preview");
		mav.addObject("dco", dco);      // 开发任务封装
		mav.addObject("dcpvs", dcpvs);  // 属性列表封装
		mav.addObject("dmvs", dmvs);    // 方式配置封装
		mav.addObject("type",type);  //文件类型，如mapper
		
		
		return mav;
	}
	

}
