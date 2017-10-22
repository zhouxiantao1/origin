package com.sjq.exam.adaptation.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.sjq.adaptation.service.ExamAdaptationKnowledgeService;
import com.sjq.adaptation.service.ExamAdaptationQuestionService;
import com.sjq.adaptation.service.ExamAdaptationService;
import com.sjq.adaptation.service.ExamAdaptationUserAnswerService;
import com.sjq.adaptation.service.ExamAdaptationUserKnowledgeService;
import com.sjq.adaptation.service.ExamAdaptationUserService;
import com.sjq.util.PageBean;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.security.util.CustomUser;
import com.sjq.adaptation.bean.ExamAdaptationBean;
import com.sjq.adaptation.bean.ExamAdaptationUserAnswerBean;
import com.sjq.adaptation.bean.ExamAdaptationUserBean;
import com.sjq.adaptation.bean.ExamAdaptationUserKnowledgeBean;
import com.sjq.adaptation.search.ExamAdaptationQuestionSearch;
import com.sjq.adaptation.search.ExamAdaptationSearch;
import com.sjq.adaptation.search.ExamAdaptationUserAnswerSearch;
import com.sjq.adaptation.search.ExamAdaptationUserKnowledgeSearch;
import com.sjq.adaptation.search.ExamAdaptationUserSearch;
import com.sjq.adaptation.vo.ExamAdaptationKnowledgeVo;
import com.sjq.adaptation.vo.ExamAdaptationQuestionVo;
import com.sjq.adaptation.vo.ExamAdaptationReportVo;
import com.sjq.adaptation.vo.ExamAdaptationUserAnswerVo;
import com.sjq.adaptation.vo.ExamAdaptationUserKnowledgeVo;
import com.sjq.adaptation.vo.ExamAdaptationUserVo;
import com.sjq.adaptation.vo.ExamAdaptationVo;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.knowledge.service.BaseKnowledgeService;

/**
 * [自动生成]考试模块-自适应测试控制处理器 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * 
 * @author Zheng.zejie
 * @since
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/exam/adaptation")
public class ExamAdaptationController {

	// ftl跳转目录
	private static final String PAGE_FOLDER = "exam/adaptation/";

	// 考试模块-自适应测试页面
	private static final String PAGE = "exam_adaptation";

	// 考试模块-自适应测试访问地址
	private static final String PAGE_HTM = "list.htm";

	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存考试模块-自适应测试信息";
	private static final String OPERA_LOG_UPDATE = "更新考试模块-自适应测试信息";
	private static final String OPERA_LOG_DELETE = "删除考试模块-自适应测试信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除考试模块-自适应测试信息";

	// 记录日志对象
	private static final MyLogger LOGGER = new MyLogger(ExamAdaptationController.class);

	@Autowired
	private ExamAdaptationService examAdaptationService;

	@Autowired
	private ExamAdaptationUserService examAdaptationUserService;

	@Autowired
	private ExamAdaptationUserAnswerService examAdaptationUserAnswerService;

	@Autowired
	private ExamAdaptationUserKnowledgeService examAdaptationUserKnowledgeService;

	@Autowired
	private ExamAdaptationKnowledgeService examAdaptationKnowledgeService;

	@Autowired
	private ExamAdaptationQuestionService examAdaptationQuestionService;

	@Autowired
	private BaseSubjectService BaseSubjectService;

	@Autowired
	private BaseGradeService baseGradeService;

	@Autowired
	private BaseStageService baseStageService;

	@Autowired
	private BaseStudentService baseStudentService;
	
	@Autowired
	private BaseKnowledgeService baseKnowledgeService;
	
	@Autowired
	private QuestionWareService questionWareService;

	/**
	 * (同步)根据条件查询所有的考试模块-自适应测试
	 * 
	 * @param request
	 *            请求体
	 * @param response
	 *            响应体
	 * @param pb
	 *            分页实体
	 * @param search
	 *            搜索条件
	 * @return 视图
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryAllExamAdaptation(HttpServletRequest request, HttpServletResponse response, PageBean pb,
			ExamAdaptationSearch search) {

		LOGGER.info("(同步)根据条件查询所有的考试模块-自适应测试");

		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);

		PageBean pageBean = this.examAdaptationService.queryExamAdaptationPage(pb, search);

		mav.addObject("pb", pageBean);
		mav.addObject("search", search);

		return mav;

	}

	/**
	 * (同步）根据条件更新考试模块-自适应测试
	 * 
	 * @param id
	 *            标识
	 * @param request
	 *            请求体
	 * @return 视图
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateExamAdaptation(@Valid ExamAdaptationBean bean, HttpServletRequest request) {

		LOGGER.info("(同步）根据条件更新考试模块-自适应测试");

		// 操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());

		int result = this.examAdaptationService.updateExamAdaptationById(bean);

		return new ModelAndView(new RedirectView(PAGE_HTM));

	}

	/**
	 * (同步）增加信息考试模块-自适应测试
	 * 
	 * @param vo
	 *            考试模块-自适应测试信息
	 * @param request
	 *            请求体
	 * @param response
	 *            响应体
	 * @return
	 */
	@RequestMapping(value = "/save/page")
	public ModelAndView saveExamAdaptationPage(ExamAdaptationSearch search, HttpServletRequest request,
			HttpServletResponse response) {

		LOGGER.info("(同步）跳转到发布自适应页面-自适应测试");

		if (search.getStageId() == null)
			search.setStageId(1L); // 默认学段(小学)

		// 查询所有的学段信息
		List<BaseStageVo> bStageVos = baseStageService.queryAllBaseStage();

		// 查询所有的年级信息
		List<BaseGradeVo> bGradeVos = baseGradeService.queryBaseGradeByStageId(search.getStageId());
		if (search.getGradeId() == null)
			search.setGradeId(bGradeVos != null & bGradeVos.size() > 0 ? bGradeVos.get(0).getId() : null);

		// 查询所有的学科信息
		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectByStageId(search.getStageId());
		if (search.getSubjectId() == null)
			search.setSubjectId(bSubjectVos != null & bSubjectVos.size() > 0 ? bSubjectVos.get(0).getId() : null);

		ModelAndView mav = new ModelAndView();
		mav.setViewName(PAGE_FOLDER + "exam_adaptation_save");
		mav.addObject("bSubjectVos", bSubjectVos); // 学科信息
		mav.addObject("bStageVos", bStageVos); // 学段信息
		mav.addObject("bGradeVos", bGradeVos); // 年级信息
		mav.addObject("search", search); // 查询条件
		return mav;

	}

	/**
	 * (同步）我的自适应测试
	 * 
	 * @param vo
	 *            考我的自适应测试
	 * @param request
	 *            请求体
	 * @param response
	 *            响应体
	 * @return
	 */
	@RequestMapping(value = "/my/page")
	public ModelAndView myExamAdaptation(PageBean pb, ExamAdaptationSearch search, HttpServletRequest request,
			HttpServletResponse response) {

		LOGGER.info("(同步）我的自适应测试");
		
		if(search.getStatus()==null) search.setStatus("0"); //默认查未完成

		// 获取个人登录信息信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();

		// 获取帐号（学生）帐号信息
		BaseStudentVo bsv = baseStudentService.queryBaseStudentByUserId(cu.getUserId());

		// 查询所有的学科信息
		List<BaseSubjectVo> bsvs = BaseSubjectService.queryBaseSubjectByStageId(bsv.getStageId());
		if (search.getSubjectId() == null)
			search.setSubjectId(bsvs != null & bsvs.size() > 0 ? bsvs.get(0).getId() : null);

		search.setStageId(bsv.getStageId());
		search.setSubjectId(search.getSubjectId());
		search.setGradeId(bsv.getGradeId());
		search.setUserId(cu.getUserId()==null?0L:cu.getUserId());

		PageBean pagebean = this.examAdaptationService.queryMyExamAdaptationPage(pb, search);

		ModelAndView mav = new ModelAndView();
		mav.setViewName(PAGE_FOLDER + "exam_adaptation_my");
		mav.addObject("pb", pagebean); // 自适应测试信息
		mav.addObject("bsvs", bsvs); // 学科信息
		mav.addObject("search", search); // 查询条件
		return mav;

	}
	
	@RequestMapping(value = "/question/num/get")
	@ResponseBody
	public int queryExamAdaptationQuestionNum(@RequestParam(value = "knowIds[]") Long[] knowIds, HttpServletRequest request,
			HttpServletResponse response){
		
		return this.examAdaptationService.queryExamAdaptationQuestionNum(knowIds);
		
	}
	
	
	@RequestMapping(value = "/name/check")
	@ResponseBody
	public int checkExamAdaptationByName(ExamAdaptationSearch search, HttpServletRequest request,
			HttpServletResponse response){
		
		return this.examAdaptationService.queryExamAdaptationTotalCount(search);
		
	}

	/**
	 * (同步）在线自适应测试
	 * 
	 * @param vo
	 *            考我的自适应测试
	 * @param request
	 *            请求体
	 * @param response
	 *            响应体
	 * @return
	 */
	@RequestMapping(value = "/answer/page")
	public ModelAndView answerExamAdaptation(PageBean pb, ExamAdaptationSearch search, HttpServletRequest request,
			HttpServletResponse response) {

		LOGGER.info("(同步）在线自适应测试");

		// 获取个人登录信息信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();

		// 获取帐号（学生）帐号信息
		BaseStudentVo bsv = baseStudentService.queryBaseStudentByUserId(cu.getUserId());

		search.setStageId(bsv.getStageId());
		search.setIsValid("1");

		// 获取自适应测试内容
		List<ExamAdaptationVo> eavs = this.examAdaptationService.queryExamAdaptationBySearch(search);
		
		
		ExamAdaptationVo eav = null;
		if (eavs != null && eavs.size() > 0)
			eav = eavs.get(0);

		if (eav != null) {

			ExamAdaptationUserSearch eaus = new ExamAdaptationUserSearch();
			eaus.setUserId(cu.getUserId());
			eaus.setAdaptationId(search.getId());
			List<ExamAdaptationUserVo> eauvs = this.examAdaptationUserService.queryExamAdaptationUserBySearch(eaus);

			
			if (eauvs == null || eauvs.size() ==0) {
				// 初始化学生测试数据
				// 1.自适应用户数据
				ExamAdaptationUserBean eaub = new ExamAdaptationUserBean();
				eaub.setCreateName(cu.getNameOfUser());
				eaub.setCreateTime(new Date());
				eaub.setDelflag("0");
				eaub.setAnswerStartTime(new Date());
				eaub.setStatus("0"); // 状态答题中0
				eaub.setRightNum(0L); // 累积答对0
				eaub.setErrorNum(0L); // 累积答错
				eaub.setAnswerTime(0L); // 累积用时
				eaub.setLastAnswerNumber(0L); // 已答多少道
				eaub.setUserId(cu.getUserId());
				eaub.setAdaptationId(eav.getId());
				this.examAdaptationUserService.insertExamAdaptationUser(eaub);

			}else{
				
				//如果已经答题完成。则直接跳转到报告内容
				if(eauvs.get(0).getStatus().equals("1")) 	return new ModelAndView(new RedirectView(request.getContextPath()+"/exam/adaptation/report/page.htm?adaptationId="+search.getId())); 
				
			}
		}

		ModelAndView mav = new ModelAndView();
		mav.setViewName(PAGE_FOLDER + "exam_adaptation_answer");
		mav.addObject("search", search); // 查询条件.
		mav.addObject("eav", eav); // 考试内容.
		return mav;

	}

	/**
	 * 获取自适应试题（智能选题）
	 * 
	 * @param id
	 *            自适应id
	 * @param answer
	 *            答案
	 * @return
	 */
	@RequestMapping("/question/get")
	@ResponseBody
	public Map<String, Object> getExamAdaptationQuestion(Long adaptationId, String answer) {

		Map<String, Object> map = new HashMap<String, Object>();

		ExamAdaptationVo eav = this.examAdaptationService.queryExamAdaptationById(adaptationId);

		// 获取个人登录信息信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		if (cu == null) {
			map.put("msg", "未获取到用户信息!");
		} else if (eav == null) {
			map.put("msg", "系统无法查询此次测试信息!");
		} else {

			// 查询最新的一条测试答题信息
			ExamAdaptationUserAnswerSearch eauas = new ExamAdaptationUserAnswerSearch();
			eauas.setAdaptationId(adaptationId);
			eauas.setUserId(cu.getUserId());
			ExamAdaptationUserAnswerVo eauav = examAdaptationUserAnswerService
					.queryRecentExamAdaptationUserAnswerLimit1BySearch(eauas);
			if (eauav == null) {
				// 第1道题 (生成试题)
				this.generateExamAdapatationQuestion(adaptationId, cu.getUserId(), 1L, cu.getNameOfUser(), map);
				map.put("num", 1);
			} else {

				// 判断这道题是否已经答过
				if (!eauav.getIsRight().equals("2")) {
					// (生成试题)
					this.generateExamAdapatationQuestion(adaptationId, cu.getUserId(), eauav.getNumber() + 1L,
							cu.getNameOfUser(), map);
					map.put("num", eauav.getNumber() + 1);
				} else {
					// 直接返回该试题（已生成的试题）
					// 根据知识点id,难度获取符合测试的试题(返回1条）
					ExamAdaptationQuestionSearch eaqs = new ExamAdaptationQuestionSearch();
					eaqs.setAdaptationId(adaptationId);
					eaqs.setQuestionId(eauav.getQuestionId());
					eaqs.setKnowledgeId(eauav.getKnowledgeId());
					map.put("eaqv", this.examAdaptationQuestionService.queryExamAdaptationQuestionBySearch(eaqs));
					map.put("num", eauav.getNumber());
					map.put("id", eauav.getId());
				}
			}
		}
		
		// 查询总共答题所花费时间（秒）
		map.put("second", this.examAdaptationUserAnswerService.getExamAdaptationUserAnswerSecond(adaptationId, cu.getUserId()));
		
		return map;

	}

	@Transactional
	public void generateExamAdapatationQuestion(Long adaptationId, Long userId, Long no, String userName,
			Map<String, Object> map) {

		Long knowledgeId = 0L; // 获取到的试题所属知识点

		BigDecimal difficulty = new BigDecimal(0.5); // 默认选择难度为0.5

		// 根据答题记录获取用户 知识点分组答案信息,得到此道题对应的知识点模块
		Map<String, Object> kmap = new HashMap<String, Object>();
		kmap.put("adaptationId", adaptationId);
		kmap.put("userId", userId);
		List<Map<String, Object>> maps = this.examAdaptationService.getExamAdaptationKnowledgeAnswerCount(kmap);
		for (Map<String, Object> km : maps) {

			if (Integer.valueOf(km.get("knowledge_c").toString()) > Integer.valueOf(km.get("answer_c").toString())) {
				knowledgeId = Long.valueOf(km.get("knowledge_id").toString());
				break; // 只查询到一个符合要求，则马上跳出匹配
			}
		}

		// 先获取用户知识点的测试难度
		ExamAdaptationUserKnowledgeSearch eauks = new ExamAdaptationUserKnowledgeSearch();
		eauks.setUserId(userId);
		eauks.setKnowledgeId(knowledgeId);
		List<ExamAdaptationUserKnowledgeVo> eaukvs = examAdaptationUserKnowledgeService
				.queryExamAdaptationUserKnowledgeBySearch(eauks);
		if (eaukvs != null && eaukvs.size() > 0) {
			difficulty = eaukvs.get(0).getDifficulty(); // 获取存储到系统中该学生知识点历史难度
		}

		// 根据知识点id,难度获取符合测试的试题(返回1条）
		ExamAdaptationQuestionSearch eaqs = new ExamAdaptationQuestionSearch();
		eaqs.setAdaptationId(adaptationId);
		eaqs.setKnowledgeId(knowledgeId);
		eaqs.setDifficulty(difficulty);
		eaqs.setUserId(userId);
		ExamAdaptationQuestionVo eaqv = examAdaptationQuestionService.queryAccurateExamAdaptationQuestionBySearch(eaqs);

		// 在学生测试答题表中增加与试题id的相关记录
		if (eaqv != null) {

			map.put("eaqv", eaqv);
			ExamAdaptationUserAnswerBean eauab = new ExamAdaptationUserAnswerBean();
			eauab.setAdaptationId(adaptationId);
			eauab.setCreateTime(new Date());
			eauab.setCreateName(userName);
			eauab.setDelflag("0");
			eauab.setNumber(no);
			eauab.setKnowledgeId(knowledgeId);
			eauab.setUserId(userId);
			eauab.setQuestionId(eaqv.getQuestionId());
			eauab.setBloomTaxonomy(eaqv.getBloomTaxonomy());
			eauab.setIsRight("2");

			this.examAdaptationUserAnswerService.insertExamAdaptationUserAnswer(eauab);
			map.put("id", eauab.getId());
		}

	}
	
	@RequestMapping("/stop")
	@ResponseBody
	public int ajaxStopExamAdaptationAnswer(Long adaptationId,int number,HttpServletRequest reuqest,
			HttpServletResponse response){
		
		return this.stopExamAdaptationAnswer(adaptationId, number);
		
	}
	
	
	/**
	 * 强制停止考试（超时，题库未抽选到合适的试题)
	 * @param adaptationId
	 * @param number        第几道题
	 * @return
	 */
	@Transactional
	public int stopExamAdaptationAnswer(Long adaptationId,int number){
		
		// 操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		ExamAdaptationVo eav = this.examAdaptationService.queryExamAdaptationById(adaptationId);
		
		// 1.更新学生自适应测试
		ExamAdaptationUserSearch eaus = new ExamAdaptationUserSearch();
		eaus.setAdaptationId(adaptationId);
		
		ExamAdaptationUserBean eaub = new ExamAdaptationUserBean();
		
		eaub.setStatus("2");        //0，测试中  1.测试完成  2.测试中止
		eaub.setModName("系统中止者");
		eaub.setModTime(new Date());
		eaub.setAnswerFinalTime(new Date());
		this.examAdaptationUserService.updateExamAdaptationUserBySearch(eaub, eaus);
		
		
		// 2.补齐
		for(int i=number;i<eav.getNum()+1;i++){
			
			ExamAdaptationUserAnswerBean eauab = new ExamAdaptationUserAnswerBean();
			eauab.setAdaptationId(adaptationId);
			eauab.setCreateTime(new Date());
			eauab.setCreateName(cu.getUsername());
			eauab.setDelflag("0");
			eauab.setNumber(Long.valueOf(String.valueOf(i+1)));
			eauab.setKnowledgeId(0L);
			eauab.setUserId(cu.getUserId());
			eauab.setQuestionId(0L);
			eauab.setBloomTaxonomy("0");
			eauab.setIsRight("2");
	
			this.examAdaptationUserAnswerService.insertExamAdaptationUserAnswer(eauab);
		}
		
		return 1;
	}

	@RequestMapping("/question/answer/save")
	@ResponseBody
	public int ajaxSaveExamAdaptationQuestionAnswer(ExamAdaptationUserAnswerBean bean, String answer,HttpServletRequest reuqest,
			HttpServletResponse response) {

		LOGGER.info("考试模块-自适应测试");
		
		ExamAdaptationVo  eav = this.examAdaptationService.queryExamAdaptationById(bean.getAdaptationId());
		
		if(eav != null){
			// 操作人信息
			CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
			bean.setCreateName(cu.getUsername());
			bean.setCreateTime(new Date());

			boolean isRight = this.questionWareService.checkQuestionWareAnswer(bean.getQuestionId(), answer);
			bean.setIsRight(isRight?"0":"1");     // 0 正确  1错误
			bean.setAnswerTime(new Date());
			bean.setAnswerSecond(1L); // 表示更新答题所花时间公式：TIMESTAMPDIFF(SECOND,create_time,DATE_FORMAT(NOW(),'%Y-%m-%d
										// %H:%i:%s'))

			// 验证答案并更新测试答题记录表
			this.examAdaptationUserAnswerService.updateExamAdaptationUserAnswerById(bean);

			// 更新自适应用户记录表
			ExamAdaptationUserSearch eaus = new ExamAdaptationUserSearch();
			eaus.setAdaptationId(bean.getAdaptationId());
			eaus.setUserId(cu.getUserId());

			ExamAdaptationUserBean eaub = new ExamAdaptationUserBean();
			if(isRight){
				eaub.setRightNum(1L);
			}else{
				eaub.setErrorNum(1L);
			}
			
			//最后一题
			if(bean.getNumber().longValue()==eav.getNum().longValue()){
				eaub.setStatus("1");        //0，测试中  1.测试完成
			}
			eaub.setLastAnswerNumber(bean.getNumber());
			eaub.setModName(cu.getNameOfUser());
			eaub.setModTime(new Date());
			eaub.setAnswerFinalTime(new Date());
			this.examAdaptationUserService.updateExamAdaptationUserBySearch(eaub, eaus);

			// 更新用户知识点难度历史储存表
			ExamAdaptationUserKnowledgeSearch eauks = new ExamAdaptationUserKnowledgeSearch();
			eauks.setUserId(cu.getUserId());
			eauks.setKnowledgeId(bean.getKnowledgeId());
			List<ExamAdaptationUserKnowledgeVo> eaukvs = this.examAdaptationUserKnowledgeService
					.queryExamAdaptationUserKnowledgeBySearch(eauks);

			ExamAdaptationUserKnowledgeBean eaukb = new ExamAdaptationUserKnowledgeBean();
			eaukb.setDifficulty(bean.getDifficulty());
			if (eaukvs != null && eaukvs.size() != 0) {
				// 更新难度信息
				this.examAdaptationUserKnowledgeService.updateExamAdaptationUserKnowledgeBySearch(eaukb, eauks);
			} else {
				// 插入难度信息
				eaukb.setKnowledgeId(bean.getKnowledgeId());
				eaukb.setUserId(cu.getUserId());
				eaukb.setDifficulty(new BigDecimal("0.5"));
				eaukb.setDelflag("0");
				eaukb.setCreateName(cu.getNameOfUser());
				eaukb.setCreateTime(new Date());
				this.examAdaptationUserKnowledgeService.insertExamAdaptationUserKnowledge(eaukb);
			}
			return 1;
		}else{
			return 0;
		}
		
	}

	/**
	 * (增加)增加信息考试模块-自适应测试
	 * 
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertExamAdaptation(@RequestParam(value = "knowIds[]") Long[] knowIds, ExamAdaptationBean bean,
			HttpServletRequest reuqest, HttpServletResponse response) {

		LOGGER.info("考试模块-自适应测试");
		// 操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername() == null ? "" : cu.getUsername());
		bean.setCreateTime(new Date());

		return this.examAdaptationService.insertExamAdaptation(bean, knowIds);

	}

	/**
	 * (同步）删除信息考试模块-自适应测试
	 * 
	 * @param id
	 *            标识
	 * @param response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteExamAdaptation(@Valid Long id, HttpServletRequest request) {

		LOGGER.info("(同步）删除信息考试模块-自适应测试");

		// 操作人信息
		ExamAdaptationBean bean = new ExamAdaptationBean();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());

		int result = this.examAdaptationService.deleteExamAdaptationById(bean);

		return new ModelAndView(new RedirectView(PAGE_HTM));

	}

	@RequestMapping(value = "/report/page", method = RequestMethod.GET)
	public ModelAndView pageExamAdaptationReport(Long adaptationId, HttpServletRequest request) {

		LOGGER.info("(同步）自适应测试报告");

		ModelAndView mav = new ModelAndView();
		
		// 操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		mav.setViewName(PAGE_FOLDER + "exam_adaptation_report");
		
		ExamAdaptationVo vo = this.examAdaptationService.queryExamAdaptationById(adaptationId);
		

		ExamAdaptationUserSearch eaus = new ExamAdaptationUserSearch();
		eaus.setAdaptationId(adaptationId);
		eaus.setUserId(cu==null?0L:cu.getUserId());
		
		List<ExamAdaptationUserVo> eauvs = this.examAdaptationUserService.queryExamAdaptationUserBySearch(eaus);
		
		mav.addObject("vo",vo);
		mav.addObject("eauv", eauvs!=null&&eauvs.size()>0?eauvs.get(0):null);
		

		return mav;

	}
	
	
	
	/**
	 * (增加)增加信息考试模块-自适应测试
	 * 
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/report/get")
	@ResponseBody
	public Map<String,Object> ajaxGetExamAdaptationReport(Long adaptationId,
			HttpServletRequest reuqest, HttpServletResponse response) {

		LOGGER.info("异步获取报告内容");
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		// 操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		ExamAdaptationReportVo earvo = this.computingAdaptationResult(adaptationId, cu.getUserId());
		map.put("earvo", earvo);
		
		List<Map<String,Object>> indicator = new ArrayList<Map<String,Object>>();
		List<BigDecimal> values = new ArrayList<BigDecimal>();
		for(ExamAdaptationReportVo vo:earvo.getEarvs()){
			
			Map<String,Object> m = new HashMap<String,Object>();
			m.put("name", vo.getBkv().getName());
			m.put("max", 100);
			
			indicator.add(m);
			values.add(vo.getMasterProgram().multiply(new BigDecimal("100")));
			
		}
		
		map.put("indicator",indicator);
		map.put("value", values);
		
		return map;


	}
	
	
	/**
	 * 计算自适应测试结果，并得到vo返回
	 * @return
	 */
	public ExamAdaptationReportVo computingAdaptationResult(Long adaptationId,Long userId){
		
		ExamAdaptationReportVo earvo = new ExamAdaptationReportVo();

		List<ExamAdaptationReportVo> earvs = new ArrayList<ExamAdaptationReportVo>();

		// 查询当前自适应测试的所有知识点信息
		List<ExamAdaptationKnowledgeVo> eaks = this.examAdaptationKnowledgeService
				.queryExamAdaptationKnowledgeByAdaptationId(adaptationId);
		
		for (ExamAdaptationKnowledgeVo vo : eaks) {
			
			ExamAdaptationReportVo earv = new ExamAdaptationReportVo();
			earv.setKnowledgeId(vo.getKnowledgeId());
			earv.setBkv(this.baseKnowledgeService.queryBaseKnowledgeById(vo.getKnowledgeId()));
			earvs.add(earv);
			
		}

		// 查询当前学生的答题情况
		ExamAdaptationUserAnswerSearch eauas = new ExamAdaptationUserAnswerSearch();
		eauas.setUserId(userId);
		eauas.setAdaptationId(adaptationId);
		List<ExamAdaptationUserAnswerVo> eauavs = this.examAdaptationUserAnswerService.queryExamAdaptationUserAnswerBySearch(eauas);
		for (ExamAdaptationUserAnswerVo eauav : eauavs) {
			for (ExamAdaptationReportVo earv : earvs) {
				if (earv.getKnowledgeId().longValue() == eauav.getKnowledgeId().longValue()) {
					switch(eauav.getBloomTaxonomy()){
					//1知道，2领会，3应用，4分析，5综合，6评价
					case "1":
						if(eauav.getIsRight().equals("0")){
							earv.setBloom1IsRightNum(earv.getBloom1IsRightNum()+1);
						}else{
							earv.setBloom1IsWrongNum(earv.getBloom1IsWrongNum()+1);
						}
						break;
					case "2":
						if(eauav.getIsRight().equals("0")){
							earv.setBloom2IsRightNum(earv.getBloom2IsRightNum()+1);
						}else{
							earv.setBloom2IsWrongNum(earv.getBloom2IsWrongNum()+1);
						}
						break;
					case "3":
						if(eauav.getIsRight().equals("0")){
							earv.setBloom3IsRightNum(earv.getBloom3IsRightNum()+1);
						}else{
							earv.setBloom3IsWrongNum(earv.getBloom3IsWrongNum()+1);
						}
						break;
					case "4":
						if(eauav.getIsRight().equals("0")){
							earv.setBloom4IsRightNum(earv.getBloom4IsRightNum()+1);
						}else{
							earv.setBloom4IsWrongNum(earv.getBloom4IsWrongNum()+1);
						}
						break;
					case "5":
						if(eauav.getIsRight().equals("0")){
							earv.setBloom5IsRightNum(earv.getBloom5IsRightNum()+1);
						}else{
							earv.setBloom5IsWrongNum(earv.getBloom5IsWrongNum()+1);
						}
						break;
					case "6":
						if(eauav.getIsRight().equals("0")){
							earv.setBloom6IsRightNum(earv.getBloom6IsRightNum()+1);
						}else{
							earv.setBloom6IsWrongNum(earv.getBloom6IsWrongNum()+1);
						}
						break;
					default:
						break;
					}
					
					break;
				}
			}

		}
		
		// 计算
		// 0.掌握程度80%      √
		// 1.50%掌握程度<80%     ？
		// 2.掌握程度<50%     ×
		// 3.表示尚未考察           -
		int bloom1IsRigthNumCount = 0;
		int bloom1IsWrongNumCount = 0;
		int bloom2IsRigthNumCount = 0;
		int bloom2IsWrongNumCount = 0;
		int bloom3IsRigthNumCount = 0;
		int bloom3IsWrongNumCount = 0;
		int bloom4IsRigthNumCount = 0;
		int bloom4IsWrongNumCount = 0;
		int bloom5IsRigthNumCount = 0;
		int bloom5IsWrongNumCount = 0;
		int bloom6IsRigthNumCount = 0;
		int bloom6IsWrongNumCount = 0;
		for (ExamAdaptationReportVo earv : earvs) {
			
			bloom1IsRigthNumCount += earv.getBloom1IsRightNum();
			bloom1IsWrongNumCount += earv.getBloom1IsWrongNum();
			bloom2IsRigthNumCount += earv.getBloom2IsRightNum();
			bloom2IsWrongNumCount += earv.getBloom2IsWrongNum();
			bloom3IsRigthNumCount += earv.getBloom3IsRightNum();
			bloom3IsWrongNumCount += earv.getBloom3IsWrongNum();
			bloom4IsRigthNumCount += earv.getBloom4IsRightNum();
			bloom4IsWrongNumCount += earv.getBloom4IsWrongNum();
			bloom5IsRigthNumCount += earv.getBloom5IsRightNum();
			bloom5IsWrongNumCount += earv.getBloom5IsWrongNum();
			bloom6IsRigthNumCount += earv.getBloom6IsRightNum();
			bloom6IsWrongNumCount += earv.getBloom6IsWrongNum();
			
			int bloom1CountNum = earv.getBloom1IsRightNum() + earv.getBloom1IsWrongNum();
			if(bloom1CountNum > 0){
				
				if((float)earv.getBloom1IsRightNum()/bloom1CountNum>=0.8){
					earv.setBloom1("√");
				}else if((float)earv.getBloom1IsRightNum()/bloom1CountNum>=0.5 && (float)earv.getBloom1IsRightNum()/bloom1CountNum < 0.8){
					earv.setBloom1("?");
				}else{
					earv.setBloom1("×");
				}
				
			}else{
				earv.setBloom1("-");
			}
			
			
			int bloom2CountNum = earv.getBloom2IsRightNum() + earv.getBloom2IsWrongNum();
			if(bloom2CountNum > 0){
				
				if((float)earv.getBloom2IsRightNum()/bloom2CountNum>=0.8){
					earv.setBloom2("√");
				}else if((float)earv.getBloom2IsRightNum()/bloom2CountNum>=0.5 && (float)earv.getBloom2IsRightNum()/bloom2CountNum < 0.8){
					earv.setBloom2("?");
				}else{
					earv.setBloom2("×");
				}
				
			}else{
				earv.setBloom2("-");
			}
			
			

			int bloom3CountNum = earv.getBloom3IsRightNum() + earv.getBloom3IsWrongNum();
			if(bloom3CountNum > 0){
				
				if((float)earv.getBloom3IsRightNum()/bloom3CountNum>=0.8){
					earv.setBloom3("√");
				}else if((float)earv.getBloom3IsRightNum()/bloom3CountNum>=0.5 && (float)earv.getBloom3IsRightNum()/bloom3CountNum < 0.8){
					earv.setBloom3("?");
				}else{
					earv.setBloom3("×");
				}
				
			}else{
				earv.setBloom3("-");
			}
			
			
			int bloom4CountNum = earv.getBloom4IsRightNum() + earv.getBloom4IsWrongNum();
			if(bloom4CountNum > 0){
				
				if((float)earv.getBloom4IsRightNum()/bloom4CountNum>=0.8){
					earv.setBloom4("√");
				}else if((float)earv.getBloom4IsRightNum()/bloom4CountNum>=0.5 && (float)earv.getBloom4IsRightNum()/bloom4CountNum < 0.8){
					earv.setBloom4("?");
				}else{
					earv.setBloom4("×");
				}
				
			}else{
				earv.setBloom4("-");
			}
			
			
			int bloom5CountNum = earv.getBloom5IsRightNum() + earv.getBloom5IsWrongNum();
			if(bloom5CountNum > 0){
				
				if((float)earv.getBloom5IsRightNum()/bloom5CountNum>=0.8){
					earv.setBloom5("√");
				}else if((float)earv.getBloom5IsRightNum()/bloom5CountNum>=0.5 && (float)earv.getBloom5IsRightNum()/bloom5CountNum < 0.8){
					earv.setBloom5("?");
				}else{
					earv.setBloom5("×");
				}
				
			}else{
				earv.setBloom5("-");
			}
			
			
			int bloom6CountNum = earv.getBloom6IsRightNum() + earv.getBloom6IsWrongNum();
			if(bloom6CountNum > 0){
				
				if((float)earv.getBloom6IsRightNum()/bloom6CountNum>=0.8){
					earv.setBloom6("√");
				}else if((float)earv.getBloom6IsRightNum()/bloom6CountNum>=0.5 && (float)earv.getBloom6IsRightNum()/bloom6CountNum < 0.8){
					earv.setBloom6("?");
				}else{
					earv.setBloom6("×");
				}
				
			}else{
				earv.setBloom6("-");
			}
			
			
			//掌握程序
			//标识
			int bloomIsRightCount = earv.getBloom1IsRightNum()+earv.getBloom2IsRightNum()+earv.getBloom3IsRightNum()+earv.getBloom4IsRightNum()+earv.getBloom5IsRightNum()+earv.getBloom6IsRightNum();
			int bloomIsWrongCount = earv.getBloom1IsWrongNum()+earv.getBloom2IsWrongNum()+earv.getBloom3IsWrongNum()+earv.getBloom4IsWrongNum()+earv.getBloom5IsWrongNum()+earv.getBloom6IsWrongNum();
			int bloomCount = bloom1CountNum + bloom2CountNum + bloom3CountNum + bloom4CountNum + bloom5CountNum + bloom6CountNum;
			if(bloomIsRightCount + bloomIsWrongCount == 0){
				earv.setMasterProgram(new BigDecimal("0"));
				earv.setIdent("-");
			}else{
				earv.setMasterProgram(new BigDecimal(String.valueOf(bloomIsRightCount)).divide(new BigDecimal(String.valueOf(bloomCount)),10,BigDecimal.ROUND_HALF_DOWN));
				if((float)bloomIsRightCount/bloomCount>=0.8){
					earv.setIdent("√");
				}else if((float)bloomIsRightCount/bloomCount>=0.5 && (float)bloomIsRightCount/bloomCount < 0.8){
					earv.setIdent("?");
				}else{
					earv.setIdent("×");
				}
			}
			
		}
		
		earvo.setEarvs(earvs);
		earvo.setBloom1(String.valueOf(((float)bloom1IsRigthNumCount/(bloom1IsRigthNumCount+bloom1IsWrongNumCount))*100));
		earvo.setBloom2(String.valueOf(((float)bloom2IsRigthNumCount/(bloom2IsRigthNumCount+bloom2IsWrongNumCount))*100));
		earvo.setBloom3(String.valueOf(((float)bloom3IsRigthNumCount/(bloom3IsRigthNumCount+bloom3IsWrongNumCount))*100));
		earvo.setBloom4(String.valueOf(((float)bloom4IsRigthNumCount/(bloom4IsRigthNumCount+bloom4IsWrongNumCount))*100));
		earvo.setBloom5(String.valueOf(((float)bloom5IsRigthNumCount/(bloom5IsRigthNumCount+bloom5IsWrongNumCount))*100));
		earvo.setBloom6(String.valueOf(((float)bloom6IsRigthNumCount/(bloom6IsRigthNumCount+bloom6IsWrongNumCount))*100));
		
		int bloomIsRigthNumCount = bloom1IsRigthNumCount+bloom2IsRigthNumCount+bloom3IsRigthNumCount+bloom4IsRigthNumCount+bloom5IsRigthNumCount+bloom6IsRigthNumCount;
		int bloomNumCount = bloomIsRigthNumCount + bloom1IsWrongNumCount + bloom2IsWrongNumCount + bloom3IsWrongNumCount + bloom4IsWrongNumCount + bloom5IsWrongNumCount + bloom6IsWrongNumCount;
		
		earvo.setMasterProgram(new BigDecimal(String.valueOf(bloomIsRigthNumCount)).divide(new BigDecimal(String.valueOf(bloomNumCount)),10,BigDecimal.ROUND_HALF_DOWN));
		
		if((float)bloomIsRigthNumCount/bloomNumCount>=0.85){
			earvo.setIdent("优秀");
		}else if((float)bloomIsRigthNumCount/bloomNumCount>=0.7 && (float)bloomIsRigthNumCount/bloomNumCount < 0.85){
			earvo.setIdent("良好");
		}else if((float)bloomIsRigthNumCount/bloomNumCount>=0.7 && (float)bloomIsRigthNumCount/bloomNumCount < 0.85){
			earvo.setIdent("中等");
		}else{
			earvo.setIdent("差");
		}
		return earvo;
	}
	
	public static void main(String[] args){
		
		
	}

}