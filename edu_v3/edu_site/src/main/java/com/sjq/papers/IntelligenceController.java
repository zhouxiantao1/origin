package com.sjq.papers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.detail.service.PapersDetailService;
import com.sjq.util.MyLogger;
import com.sjq.version.service.BaseVersionService;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stage.search.BaseStageSearch;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.search.BaseTeacherClassesSearch;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.type.search.QuestionTypeSearch;
import com.sjq.type.service.QuestionTypeService;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.security.util.CustomUser;
import com.sjq.catalog.search.BaseCatalogSearch;
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalogDetail.search.BaseCatalogDetailSearch;
import com.sjq.catalogDetail.service.BaseCatalogDetailService;
import com.sjq.catalogDetail.vo.BaseCatalogDetailVo;
import com.sjq.detail.bean.PapersDetailBean;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.bean.PapersInfoBean;
import com.sjq.info.service.PapersInfoService;
import com.sjq.info.vo.IntelligenceVo;
import com.sjq.question.bean.PapersQuestionBean;
import com.sjq.question.service.PapersQuestionService;

@Controller
@RequestMapping(value = "/papers/intelligence")
public class IntelligenceController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="papers/";
	
	// 试卷模块-试卷明细信息页面 
	private static final String PAGE = "papers_intelligence_page";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存试卷模块-智能组卷";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(IntelligenceController.class);
	
	@Autowired
	private PapersDetailService papersDetailService;
	
	@Autowired
	private PapersInfoService papersInfoService;
	
	@Autowired
	private PapersQuestionService papersQuestionService;
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private BaseSubjectService baseSubjectService;
	
	@Autowired
	private QuestionTypeService questionTypeService;
	
	@Autowired
	private BaseVersionService baseVersionService;
	
	@Autowired
	private BaseCatalogService baseCatalogService;
	
	@Autowired
	private BaseCatalogDetailService baseCatalogDetailService;
	
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	
	@Autowired
	private BaseStageService baseStageService;
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	
	@Autowired
	private QuestionWareService questionWareService;
	
	/**
	 * 
	 * @MethodName:intelligenceRequest
	 * @Description:添加智能组卷页面
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list")
	public ModelAndView intelligenceRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.info("跳转到添加智能组卷页面...");
		ModelAndView mav = new ModelAndView();
		//1.获取登录人信息，判断其权限
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if(cu.getRole().getCode().equals("ROLE_09")){
			//角色老师
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			//1.根据权限，设置其可以建立的考试类型  1单元考、2月考、3期中考、4期末考
			Map<String,String> examTypeMap = new HashMap<String,String>();
			examTypeMap.put("1", "单元考");
			examTypeMap.put("2", "月考");
			examTypeMap.put("3", "期中考");
			examTypeMap.put("4", "期末考");
			mav.addObject("examTypeMap", examTypeMap);
			//2.获取老师对应的年级、学科、学段
			BaseTeacherClassesSearch baseTeacherClassesSearch = new BaseTeacherClassesSearch();
			baseTeacherClassesSearch.setTeacherId(baseTeacherVo.getId());//老师id
			List<BaseTeacherClassesVo> baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
			List<BaseGradeVo> baseGradeVoList = new ArrayList<BaseGradeVo>();//年级集合
			List<BaseSubjectVo> baseSubjectVoList = new ArrayList<BaseSubjectVo>();//学科集合
			List<BaseStageVo> baseStageVoList = new ArrayList<BaseStageVo>();//学段集合
			BaseGradeVo baseGradeVo;//年级vo
			BaseStageVo baseStageVo;//学段vo
			for (int i = 0; i < baseTeacherClassesVoList.size(); i++) {
				baseGradeVo = baseTeacherClassesVoList.get(i).getBaseGradeVo();
				baseStageVo = baseTeacherClassesVoList.get(i).getBaseStageVo();
				if(i != 0){
					if(baseGradeVo.getId() != baseTeacherClassesVoList.get(i-1).getBaseGradeVo().getId()){
						baseGradeVoList.add(baseTeacherClassesVoList.get(i).getBaseGradeVo());
					}
					if(baseStageVo.getId() != baseTeacherClassesVoList.get(i-1).getBaseStageVo().getId()){
						baseStageVoList.add(baseTeacherClassesVoList.get(i).getBaseStageVo());
					}
				}else{
					baseGradeVoList.add(baseTeacherClassesVoList.get(i).getBaseGradeVo());
					baseStageVoList.add(baseTeacherClassesVoList.get(i).getBaseStageVo());
				}
				
			}
			baseTeacherClassesSearch.setGradeId(baseTeacherClassesVoList.get(0).getBaseGradeVo().getId());
			baseTeacherClassesSearch.setGroup("3");
			List<BaseTeacherClassesVo> baseTeacherClassesVoList1 = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
			for (int i = 0; i < baseTeacherClassesVoList1.size(); i++) {
				baseSubjectVoList.add(baseTeacherClassesVoList1.get(i).getBaseSubjectVo());
			}
			mav.addObject("baseStageVoList", baseStageVoList);
			mav.addObject("baseGradeVoList", baseGradeVoList);
			mav.addObject("baseSubjectVoList", baseSubjectVoList);
			//6.根据学科，获取对应学科的题目类型
			QuestionTypeSearch questionTypeSearch = new QuestionTypeSearch();
			questionTypeSearch.setSubjectId(baseSubjectVoList.get(0).getId());
			//questionTypeSearch.setIsObjective("1");
			List<QuestionTypeVo> questionTypeVoList = questionTypeService.queryQuestionTypeBySearch(questionTypeSearch);
			mav.addObject("questionTypeVoList", questionTypeVoList);
			//7.根据获取教材版本
			List<BaseVersionVo> baseVersionVoList = baseVersionService.queryAllBaseVersion();
			mav.addObject("baseVersionVoList", baseVersionVoList);
			//8.根据教材版本、学科、年级，获取对应的学测
			BaseCatalogSearch search = new BaseCatalogSearch();
			search.setSubjectId(baseSubjectVoList.get(0).getId());
			search.setVersionId(baseVersionVoList.get(0).getId());
			search.setGradeId(baseGradeVoList.get(0).getId());
			List<BaseCatalogVo> baseCatalogVoList = baseCatalogService.queryBaseCatalogBySearch(search);
			mav.addObject("baseCatalogVoList", baseCatalogVoList);
			//9.根据学测，获取课本章节
			BaseCatalogDetailSearch baseCatalogDetailSearch = new BaseCatalogDetailSearch();
			baseCatalogDetailSearch.setCatalogId(baseCatalogVoList.get(0).getId());
			List<BaseCatalogDetailVo> baseCatalogDetailVoList = baseCatalogDetailService.queryBaseCatalogDetailBySearch(baseCatalogDetailSearch);
			mav.addObject("baseCatalogDetailVoList", baseCatalogDetailVoList);
		}else{
			//2.根据权限，设置其可以建立的考试类型  1单元考、2月考、3期中考、4期末考、5市级考试
			Map<String,String> examTypeMap = new HashMap<String,String>();
			examTypeMap.put("1", "单元考");
			examTypeMap.put("2", "月考");
			examTypeMap.put("3", "期中考");
			examTypeMap.put("4", "期末考");
			examTypeMap.put("5", "市级考试");
			mav.addObject("examTypeMap", examTypeMap);
			//3.根据权限，获取学段信息。若为市级，显示全部学段，显示学段对应的年级。若为老师，显示老师任教的学段，显示任教学段对应的年级
			List<BaseStageVo> baseStageVoList = baseStageService.queryBaseStageBySearch(new BaseStageSearch());
			mav.addObject("baseStageVoList", baseStageVoList);
			//4.学段获取年级
			List<BaseGradeVo> baseGradeVoList = baseGradeService.queryBaseGradeByStageId(baseStageVoList.get(0).getId());
			mav.addObject("baseGradeVoList", baseGradeVoList);
			//5.学段获取学科
			List<BaseSubjectVo> baseSubjectVoList = baseSubjectService.queryBaseSubjectByStageId(baseStageVoList.get(0).getId());
			mav.addObject("baseSubjectVoList", baseSubjectVoList);
			//6.根据学科，获取对应学科的题目类型
			QuestionTypeSearch questionTypeSearch = new QuestionTypeSearch();
			questionTypeSearch.setSubjectId(baseSubjectVoList.get(0).getId());
			//questionTypeSearch.setIsObjective("1");
			List<QuestionTypeVo> questionTypeVoList = questionTypeService.queryQuestionTypeBySearch(questionTypeSearch);
			mav.addObject("questionTypeVoList", questionTypeVoList);
			//7.根据获取教材版本
			List<BaseVersionVo> baseVersionVoList = baseVersionService.queryAllBaseVersion();
			mav.addObject("baseVersionVoList", baseVersionVoList);
			//8.根据教材版本、学科、年级，获取对应的学测
			BaseCatalogSearch search = new BaseCatalogSearch();
			search.setSubjectId(baseSubjectVoList.get(0).getId());
			search.setVersionId(baseVersionVoList.get(0).getId());
			search.setGradeId(baseGradeVoList.get(0).getId());
			List<BaseCatalogVo> baseCatalogVoList = baseCatalogService.queryBaseCatalogBySearch(search);
			mav.addObject("baseCatalogVoList", baseCatalogVoList);
			//9.根据学测，获取课本章节
			BaseCatalogDetailSearch baseCatalogDetailSearch = new BaseCatalogDetailSearch();
			baseCatalogDetailSearch.setCatalogId(baseCatalogVoList.get(0).getId());
			List<BaseCatalogDetailVo> baseCatalogDetailVoList = baseCatalogDetailService.queryBaseCatalogDetailBySearch(baseCatalogDetailSearch);
			mav.addObject("baseCatalogDetailVoList", baseCatalogDetailVoList);
		}
		mav.addObject("examType", 1);//默认考试类型 
		mav.addObject("roleType", cu.getRole().getCode());
		mav.setViewName(PAGE_FOLDER + PAGE);
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:ajaxQueryBaseTeacherClassesBySearch
	 * @Description:获取老师对应年级的学科集合
	 * @param baseTeacherClassesSearch
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/teachersubject/list")
	@ResponseBody
	public List<BaseSubjectVo> ajaxQueryBaseTeacherClassesBySearch(BaseTeacherClassesSearch baseTeacherClassesSearch,HttpServletRequest reuqest,HttpServletResponse response) {
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
		baseTeacherClassesSearch.setTeacherId(baseTeacherVo.getId());//根据登录人获取登录人id(教师id)
		List<BaseTeacherClassesVo> baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesBySearch(baseTeacherClassesSearch);
		List<BaseSubjectVo> baseSubjectVoList = new ArrayList<BaseSubjectVo>();//学科集合
		for (int i = 0; i < baseTeacherClassesVoList.size(); i++) {
			baseSubjectVoList.add(baseTeacherClassesVoList.get(i).getBaseSubjectVo());
		}
		return baseSubjectVoList;
	    
	}
	
	/**
	 * 
	 * @MethodName:ajaxPreviewRequest
	 * @Description:智能组卷预览
	 * @param intelligenceVo
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list/preview",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public IntelligenceVo ajaxPreviewRequest(@RequestBody String intelligenceVo,HttpServletRequest reuqest,HttpServletResponse response) throws Exception {
		ObjectMapper mapper = new ObjectMapper();  
		IntelligenceVo intelligence = mapper.readValue(intelligenceVo, IntelligenceVo.class); 
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		intelligence.setCreateName(cu.getUsername());
		SimpleDateFormat formatter; 
	    formatter = new SimpleDateFormat ("yyyy-MM-dd"); 
	    intelligence.setCreateTime(formatter.format(new Date(System.currentTimeMillis())));
		//学段、年级 、学科、 归属题库、 客观题 、题型、 题型数量 、教材版本、 学册、 章节
	    Map<String,Object> map = new HashMap<String,Object>();
		map.put("stageId", intelligence.getStageId());
		map.put("gradeId", intelligence.getGradeId());
		map.put("subjectId", intelligence.getSubjectId());
		map.put("versionId", intelligence.getVersionId());
		map.put("catalogId", intelligence.getCatalogId());
		map.put("catalogDetailIdList", intelligence.getCatalogDetailIdList());
		map.put("createId", cu.getUserId());
		List<QuestionWareVo> questionWareVoList;
		Map<String, List<QuestionWareVo>> questionWareVoMap = new HashMap<String, List<QuestionWareVo>>();
		for (int i = 0; i < intelligence.getQuestionTypeVoList().size(); i++) {
			Long typeId = intelligence.getQuestionTypeVoList().get(i).getId();
			map.put("typeId", typeId);
			map.put("quQuantity",Integer.parseInt(intelligence.getQuestionQuQuantityMap().get(typeId.toString())));
			questionWareVoList = papersQuestionService.queryQuestionWareVoList(map);
			if(questionWareVoList.size() != Integer.parseInt(intelligence.getQuestionQuQuantityMap().get(typeId.toString()))){
				intelligence.setTotalQuantity(0l);//当有题型题量为0时，跳出循环，前端显示题量不足
				break;
			}
			questionWareVoMap.put(intelligence.getQuestionTypeVoList().get(i).getId().toString(), questionWareVoList);
		}
		intelligence.setQuestionWareVoMap(questionWareVoMap);//题型对应题目
		return intelligence;
	}

	/**
	 * 
	 * @MethodName:ajaxInsertIntelligence
	 * @Description:添加智能组卷
	 * @param intelligence
	 * @param reuqest
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@Transactional
	@RequestMapping(value = "/list/save",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public int ajaxInsertIntelligence(@RequestBody String intelligence,HttpServletRequest reuqest,HttpServletResponse response) throws Exception {
		LOGGER.info(OPERA_LOG_INSERT);
		ObjectMapper mapper = new ObjectMapper();  
		IntelligenceVo intelligenceVo = mapper.readValue(intelligence, IntelligenceVo.class); 
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		PapersInfoBean papersInfoBean = new PapersInfoBean();
		papersInfoBean.setCreateName(cu.getUsername());//创建人
		papersInfoBean.setCreateTime(new Date(System.currentTimeMillis()));//创建时间
		papersInfoBean.setPaperName(intelligenceVo.getPaperName());
		papersInfoBean.setPaperType("1");//智能组卷
		papersInfoBean.setSubjectId(intelligenceVo.getSubjectId());
		papersInfoBean.setGradeId(intelligenceVo.getGradeId());
		papersInfoBean.setIsPublic("0");//是否公开0否，1是
		papersInfoBean.setTestTime(intelligenceVo.getTestTime());
		papersInfoBean.setTotalQuantity(intelligenceVo.getTotalQuantity());
		papersInfoBean.setTotalScore(intelligenceVo.getTotalScore());
		papersInfoBean.setIsRelease("0");//是否发布过考试，0未发布，1发布过
		papersInfoBean.setStatus("1");//有效
		papersInfoBean.setPaperDifficulty(intelligenceVo.getPaperDifficulty());
		papersInfoBean.setExamType(intelligenceVo.getExamType());
		papersInfoBean.setIsSubjective(intelligenceVo.getIsSubjective());//是否包含主观题（0否，1是）
		this.papersInfoService.insertPapersInfo(papersInfoBean);//新增试卷
		
		PapersDetailBean papersDetailBean;
		PapersQuestionBean papersQuestionBean;
		List<QuestionWareVo> tmList;//随机获取题目集合
		Long xtdf;//小题得分
		Long i = 0l;
		Long k = 0l;
		List<Long> wareIds = new ArrayList<Long>();//题目id集合
		for (Map.Entry<String, String> entry : intelligenceVo.getQuestionTypeMap().entrySet()) { 
			papersDetailBean = new PapersDetailBean();
			xtdf = Long.parseLong(intelligenceVo.getQuestionQuScoreMap().get(entry.getKey()));
			papersDetailBean.setPaperId(papersInfoBean.getId());//考试编码
			papersDetailBean.setCreateName(cu.getUsername());//创建人
			papersDetailBean.setCreateTime(new Date(System.currentTimeMillis()));//创建时间
			papersDetailBean.setQuTypeId(Long.parseLong(entry.getKey()));//题型
			papersDetailBean.setQuQuantity(Long.parseLong(intelligenceVo.getQuestionQuQuantityMap().get(entry.getKey())));//题量
			papersDetailBean.setQuScore(xtdf);//小题得分
			papersDetailBean.setStatus("0");
			i++;
			papersDetailBean.setReorder(i);
			this.papersDetailService.insertPapersDetail(papersDetailBean);
			k++;
			tmList = intelligenceVo.getQuestionWareVoMap().get(entry.getKey());
			for (int j = 0; j < tmList.size(); j++) {
				papersQuestionBean = new PapersQuestionBean();
				papersQuestionBean.setPaperId(papersInfoBean.getId());//考试编码
				papersQuestionBean.setPaperDetailId(papersDetailBean.getId());//试卷明细编码
				papersQuestionBean.setCreateName(cu.getUsername());//创建人
				papersQuestionBean.setCreateTime(new Date(System.currentTimeMillis()));//创建时间
				papersQuestionBean.setQuestionId(tmList.get(j).getId());//题目id
				papersQuestionBean.setScore(xtdf);//分数
				papersQuestionBean.setStatus("1");
				papersQuestionBean.setQuestionNo(k);//题号
				wareIds.add(tmList.get(j).getId());
				k++;
				this.papersQuestionService.insertPapersQuestion(papersQuestionBean);
			}
		}
		if(wareIds !=null && wareIds.size() >0){
			Map<String, Object> map = new HashMap<String, Object>();
		  	map.put("wareIds",wareIds);
			questionWareService.updateQuestionWareByIds(map);
		}
		
		return 1;
	} 
}