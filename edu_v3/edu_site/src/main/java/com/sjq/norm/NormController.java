package com.sjq.norm;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.compare.bean.NormCompareBean;
import com.sjq.compare.search.NormCompareSearch;
import com.sjq.compare.service.NormCompareService;
import com.sjq.compare.vo.NormCompareVo;
import com.sjq.definition.bean.NormDefinitionBean;
import com.sjq.definition.search.NormDefinitionSearch;
import com.sjq.definition.service.NormDefinitionService;
import com.sjq.detail.search.ExamDetailSearch;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.search.ExamInfoSearch;
import com.sjq.info.service.ExamInfoService;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;

@Controller
@RequestMapping(value = "/norm")
public class NormController {
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(NormController.class);
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private ExamInfoService examInfoService;
	
	@Autowired
	private NormDefinitionService normDefinitionService;
	
	@Autowired
	private NormCompareService normCompareService;
	/**
     * 
     * @MethodName:queryNormRequest
     * @Description:查询常模，常模管理
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/list")
	public ModelAndView queryNormRequest(HttpServletRequest request, HttpServletResponse response,NormDefinitionSearch search,PageBean pb) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<BaseGradeVo> baseGradeVoList = baseGradeService.queryAllBaseGrade();
		if(search.getGradeId() == null){
			search.setGradeId(baseGradeVoList.get(0).getId());
		}
		mav.addObject("baseGradeVoList", baseGradeVoList);
		if(search.getStartTime() == null || search.getEndTime() == null){
			Calendar ca = Calendar.getInstance();// 得到一个Calendar的实例  
			ca.setTime(new Date()); // 设置时间为当前时间    
			ca.add(Calendar.MONTH, -1);// 月份减1  
			search.setStartTime(ca.getTime());
			search.setEndTime(new Date());
		}
		//PageBean pageBean = normDefinitionService.queryNormDefinitionPage(pb, search);
		PageBean pageBean = normDefinitionService.queryNormDefinitionPageBySearch(pb, search);
		mav.addObject("search", search);
		mav.addObject("pb", pageBean);
		mav.setViewName("norm/norm_manage");
        return mav;
	}
	
	@RequestMapping(value = "/list/view")
	public ModelAndView queryNormBySearchRequest(HttpServletRequest request, HttpServletResponse response,NormCompareSearch search) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<NormCompareVo> normCompareVoList= normCompareService.queryNormCompareBySearch(search);
		mav.addObject("search", search);
		mav.addObject("normCompareVoList", normCompareVoList);
		mav.setViewName("norm/norm_detail_single");
        return mav;
	}
	
	@Transactional
	@ResponseBody
	@RequestMapping(value = "/list/delete" , method = RequestMethod.POST)
	public int ajaxDeleteNormRequest(NormDefinitionBean bean,HttpServletRequest reuqest,HttpServletResponse response) throws Exception {
		LOGGER.info("删除常模...");
		normDefinitionService.deleteNormDefinitionById(bean);
		Map<String, Object> map = new HashMap<String, Object>();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
  		map.put("modName",cu.getUsername());
  		map.put("modTime",new Date());
  		map.put("defId",bean.getId());
		normCompareService.deleteNormCompareBySerach(map);
		return 0;
	}
	
	/**
     * 
     * @MethodName:addExamRequest
     * @Description:添加常模管理
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/add")
	public ModelAndView addNormRequest(HttpServletRequest request, HttpServletResponse response,NormDefinitionSearch search,PageBean pb) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<BaseGradeVo> baseGradeVoList = baseGradeService.queryAllBaseGrade();
		mav.addObject("baseGradeVoList", baseGradeVoList);
		ExamInfoSearch examInfoSearch = new ExamInfoSearch();
		examInfoSearch.setGradeId(baseGradeVoList.get(0).getId());
		examInfoSearch.setExamRange("4");
		List<ExamInfoVo> examInfoVoList = examInfoService.queryExamInfoBySearch(examInfoSearch);
		mav.addObject("examInfoVoList", examInfoVoList);
		mav.setViewName("norm/norm_add");
        return mav;
	}
	
	@RequestMapping("/examlist")
	@ResponseBody
	public List<ExamInfoVo> ajaxQueryExamList(ExamInfoSearch examInfoSearch,HttpServletRequest reuqest,HttpServletResponse response) {
		examInfoSearch.setExamRange("4");
		List<ExamInfoVo> examInfoVoList = examInfoService.queryExamInfoBySearch(examInfoSearch);
		return examInfoVoList;
	    
	}
	
	@RequestMapping("/save")
	@Transactional
	public String ajaxInsertormDefinition(NormDefinitionBean bean,HttpServletRequest reuqest,HttpServletResponse response) throws Exception{
		LOGGER.info("新增常模..");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		Date date = new Date();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(date);
		ExamDetailSearch examDetailSearch = new ExamDetailSearch();
		examDetailSearch.setExamId(bean.getExamId());
		this.normDefinitionService.insertNormDefinition(bean);
		NormCompareSearch normCompareSearch = new NormCompareSearch();
		normCompareSearch.setExamId(bean.getExamId());
		List<NormCompareBean> normCompareBeanList = null;
		if(bean.getCalculationMethod().equals("0")){
			normCompareBeanList = normCompareService.queryNormCompareByExamId(normCompareSearch);
		}else{
			normCompareBeanList = normCompareService.queryNormCompareByExam(normCompareSearch);
		}
		for (NormCompareBean NormCompareBean : normCompareBeanList) {
			NormCompareBean.setDefId(new Long(bean.getId()));
			NormCompareBean.setCreateName(cu.getUsername());
			NormCompareBean.setCreateTime(date);
		}
		normCompareService.insertNormCompareBatch(normCompareBeanList);
		return "redirect:/norm/list.htm";
	}
}