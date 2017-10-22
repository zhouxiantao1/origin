package com.sjq.work.wrong.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
import com.sjq.wrong.service.WorkWrongService;
import com.sjq.util.PageBean;
import com.sjq.version.service.BaseVersionService;
import com.sjq.version.vo.BaseVersionVo;
import com.sjq.ware.search.QuestionWareSearch;
import com.sjq.ware.service.QuestionWareService;
import com.sjq.ware.vo.QuestionWareVo;
import com.sjq.workQuestion.bean.WorkWorkQuestionBean;
import com.sjq.workQuestion.search.WorkWorkQuestionSearch;
import com.sjq.workQuestion.service.WorkWorkQuestionService;
import com.sjq.workQuestion.vo.WorkWorkQuestionVo;
import com.sjq.util.MyLogger;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.stage.search.BaseStageSearch;
import com.sjq.stage.service.BaseStageService;
import com.sjq.stage.vo.BaseStageVo;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.subject.search.BaseSubjectSearch;
import com.sjq.subject.service.BaseSubjectService;
import com.sjq.subject.vo.BaseSubjectVo;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.type.service.QuestionTypeService;
import com.sjq.type.vo.QuestionTypeVo;
import com.sjq.answer.search.WorkAnswerSearch;
import com.sjq.answer.service.WorkAnswerService;
import com.sjq.answerDetail.search.WorkAnswerDetailSearch;
import com.sjq.answerDetail.service.WorkAnswerDetailService;
import com.sjq.answerDetail.vo.WorkAnswerDetailVo;
import com.sjq.catalog.service.BaseCatalogService;
import com.sjq.catalog.vo.BaseCatalogVo;
import com.sjq.catalogDetail.service.BaseCatalogDetailService;
import com.sjq.collect.search.QuestionCollectSearch;
import com.sjq.collect.service.QuestionCollectService;
import com.sjq.collect.vo.QuestionCollectVo;
import com.sjq.grade.search.BaseGradeSearch;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.homework.bean.WorkHomeworkBean;
import com.sjq.homework.service.WorkHomeworkService;
import com.sjq.homework.vo.WorkHomeworkVo;
import com.sjq.homeworkClasses.search.WorkHomeworkClassesSearch;
import com.sjq.homeworkClasses.service.WorkHomeworkClassesService;
import com.sjq.homeworkClasses.vo.WorkHomeworkClassesVo;
import com.sjq.knowledge.search.BaseKnowledgeSearch;
import com.sjq.knowledge.service.BaseKnowledgeService;
import com.sjq.knowledge.vo.BaseKnowledgeVo;
import com.sjq.parent.service.BaseParentService;
import com.sjq.questionRelated.search.BaseQuestionRelatedSearch;
import com.sjq.questionRelated.service.BaseQuestionRelatedService;
import com.sjq.questionRelated.vo.BaseQuestionRelatedVo;
import com.sjq.security.util.CustomUser;
import com.sjq.wrong.bean.WorkWrongBean;
import com.sjq.wrong.search.WorkWrongSearch;
import com.sjq.wrong.vo.WorkWrongVo;

/**
 * [自动生成]错题信息控制处理器
 * 使用GET请求的方法显示视图，使用POST请求的方法处理业务逻辑
 * @author  ShuiJingQiu
 * @since 
 * @version 1.0
 */

@Controller
@RequestMapping(value = "/work/wrong")
public class WorkWrongController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="/work/homework/";
	
	// 错题信息页面 
	private static final String PAGE = "homework_wrong";
	private static final String ANSWER = "homework_wrong_answer";
	private static final String VIEW = "homework_wrong_view";
	
	// 错题信息访问地址 
	private static final String PAGE_HTM = "list.htm";
	
	// 日志信息
	private static final String OPERA_LOG_INSERT = "保存错题信息信息";
	private static final String OPERA_LOG_UPDATE = "更新错题信息信息";
	private static final String OPERA_LOG_DELETE = "删除错题信息信息";
	private static final String OPERA_LOG_BATCH_DELETE = "批量删除错题信息信息";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(WorkWrongController.class);
	
	@Autowired
	private WorkWrongService workWrongService;
	
	@Autowired
	private BaseQuestionRelatedService baseQuestionRelatedService;
	@Autowired
	private QuestionTypeService questionTypeService;
	@Autowired
	private WorkWorkQuestionService workWorkQuestionService;
	@Autowired
	private BaseSubjectService BaseSubjectService;	
	@Autowired
	private BaseGradeService baseGradeService;	
	@Autowired
	private BaseStageService baseStageService;	
	@Autowired
	private BaseKnowledgeService baseKnowledgeService;	
	@Autowired
	private BaseCatalogService baseCatalogService;
	@Autowired
	private QuestionWareService questionWareService;
	@Autowired
	private BaseVersionService baseVersionService;
	@Autowired
	private QuestionCollectService questionCollectService;
	@Autowired
	private BaseStudentService baseStudentService;
	@Autowired
	private WorkHomeworkService workHomeworkService;
	@Autowired
	private WorkAnswerDetailService workAnswerDetailService;
	
				
	/**
	 * 根据ID查询错题信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid")
	@ResponseBody
	public WorkWrongVo ajaxQueryWorkWrongById(WorkWrongSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		return this.workWrongService.queryWorkWrongById(search.getId());
	    
	}
	
				
	/**
	 * 根据条件查询所有错题信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbysearch")
	@ResponseBody
	public List<WorkWrongVo> ajaxQueryWorkWrongBySearch(WorkWrongSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		return this.workWrongService.queryWorkWrongBySearch(search);
	    
	}
	
	
				
	/**
	 * 分页查询错题信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/page/list")
	@ResponseBody
	public PageBean ajaxQueryWorkWrongPage(PageBean pb,WorkWrongSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		return this.workWrongService.queryWorkWrongPage(pb, search);
	    
	}
				
				
	/**
	 * (删除)根据ID删除错题信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/delete")
	@ResponseBody
	public int ajaxDeleteWorkWrongById(WorkWrongBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workWrongService.deleteWorkWrongById(bean);
	    
	}
	
				
	/**
	 * (更新)根据ID更新所有错题信息信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/listbyid/update")
	@ResponseBody
	public int ajaxUpdateWorkWrongById(WorkWrongBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setModName(cu.getNameOfUser());
		bean.setModTime(new Date());
		return this.workWrongService.updateWorkWrongById(bean);
	    
	}
	
				
	/**
	 * (增加)增加信息错题信息
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	@ResponseBody
	public int ajaxInsertWorkWrong(WorkWrongBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		return this.workWrongService.insertWorkWrong(bean);
	    
	}
	
	/**
	 * 判断数据库里面是否有足够的题目(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/enough")
	@ResponseBody
	public Long enoughQuestion(QuestionWareSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("错题信息");
		//题目信息
		QuestionWareVo questionWareVo = questionWareService.queryQuestionWareById(search.getId());
		//通过知识点名称查询
		List<String> knowledgeNames = questionWareVo.getKnowledgeNames();
		
		//收集知识点id集合
		String nameStr = "";
		for(String name : knowledgeNames){
			BaseKnowledgeSearch baseKnowledgeSearch = new BaseKnowledgeSearch();
			baseKnowledgeSearch.setName(name);
			List<BaseKnowledgeVo> BaseKnowledgeVos = baseKnowledgeService.queryBaseKnowledgeBySearch(baseKnowledgeSearch);
			for(BaseKnowledgeVo baseKnowledgeVo : BaseKnowledgeVos){
				if(nameStr==""){
					nameStr = "'"+baseKnowledgeVo.getId()+"'";
				}else{
					nameStr += ",'"+baseKnowledgeVo.getId()+"'";
				}
			}
		}
		if(nameStr==""){
			nameStr = "null";
		}
		//通过id结合查看题目知识点关联表数目
		BaseQuestionRelatedSearch baseQuestionRelatedSearch = new BaseQuestionRelatedSearch();
		baseQuestionRelatedSearch.setRelatedType("2");
		baseQuestionRelatedSearch.setRelatedIds(nameStr);
		List<BaseQuestionRelatedVo> baseQuestionRelatedVos = baseQuestionRelatedService.queryBaseQuestionRelatedBySearch(baseQuestionRelatedSearch);
		if(baseQuestionRelatedVos.size()>15){
			 //生成错题练习
			CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
			WorkHomeworkBean bean = new WorkHomeworkBean();
			bean.setCreateName(cu.getUsername());
			bean.setCreateTime(new Date());
			bean.setUserId(cu.getUserId());
			bean.setStatus("1");
			bean.setType("2");
			bean.setUserId(cu.getUserId());
			bean.setTitle("纠错练习");
			workHomeworkService.insertWorkHomework(bean);
			
			//随机抽取15道题目
			Random random = new Random();
			Long[] ids = new Long[16]; //id数组
			int[] temps = new int[16]; //用于判断是否取了重复值
			int m = 15; //要随机取的元素个数
			int n = 0;
		    while(true){
			   int temp = random.nextInt(baseQuestionRelatedVos.size());
			   if(ids[n]==null){
			        if(n == m){
			        	 break;//取到足量随机数后退出循环
			        } 
			        int status = 0;
			        for(int i=0; i<15; i++){
			        	if(temps[i]==temp){
			        		status = 1;
			        	}
			        }
			        if(status==0){
			        	temps[n]=temp;
			        	ids[n] = baseQuestionRelatedVos.get(temp).getQuestionId();
			        	
			        	//将题目加入纠错练习
			        	WorkWorkQuestionBean workWorkQuestionBean = new WorkWorkQuestionBean();
						workWorkQuestionBean.setCreateName(cu.getUsername());
						workWorkQuestionBean.setCreateTime(new Date());
						workWorkQuestionBean.setQuestionId(baseQuestionRelatedVos.get(temp).getQuestionId());
						workWorkQuestionBean.setHomeworkId(bean.getId());
						workWorkQuestionService.insertWorkWorkQuestion(workWorkQuestionBean);
			        	n ++;
			        }   
	
			    }
		 	}
			return bean.getId();
		}else{
			return 0L;
		}
		
	    
	}
			
	/**
	 * 作答(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/exercise")
	@ResponseBody
	public ModelAndView exerciseWorkWrongList(Long questionId,WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		LOGGER.info("纠错练习");
			
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + ANSWER);
		
		LOGGER.info("预览作业信息");
		//查询作业题目
		WorkWorkQuestionSearch workWorkQuestionSearch = new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(bean.getId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> workWorkQuestionVoList = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
		
		//查询作业信息
		WorkHomeworkVo workHomeworkVo = workHomeworkService.queryWorkHomeworkById(bean.getId());
		
		//通过用户id获取学生
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		
		mav.addObject("workWorkQuestionVoList", workWorkQuestionVoList);
		mav.addObject("workHomeworkVo", workHomeworkVo);
		mav.addObject("studentId", baseStudentVo.getId());
		mav.addObject("qtnNum", workWorkQuestionVoList.size());
		mav.addObject("homeworkId", bean.getId());
		mav.addObject("questionId", questionId);
		
		return mav;
	}
	
	/**
	 *  纠错练习答案页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/answer/view")
	@ResponseBody
	public ModelAndView answerViewQuestionHomework(Long questionId,WorkHomeworkBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		LOGGER.info("预览作业信息");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + VIEW);
		//查询作业题目
		WorkWorkQuestionSearch workWorkQuestionSearch = new WorkWorkQuestionSearch();
		workWorkQuestionSearch.setHomeworkId(bean.getId());
		workWorkQuestionSearch.setDelflag("0");
		List<WorkWorkQuestionVo> workWorkQuestionVoList = workWorkQuestionService.queryWorkWorkQuestionBySearch(workWorkQuestionSearch);
			
		//查询作业信息
		WorkHomeworkVo wkv = workHomeworkService.queryWorkHomeworkById(bean.getId());
		
		
		//查询作答列表并判断是否正确
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		WorkAnswerDetailSearch workAnswerDetailSearch = new WorkAnswerDetailSearch();
		workAnswerDetailSearch.setHomeworkId(bean.getId());
		workAnswerDetailSearch.setUserId(cu.getUserId());
		workAnswerDetailSearch.setDelflag("0");
		List<WorkAnswerDetailVo> workAnswerDetailVoList = workAnswerDetailService.queryWorkAnswerDetailBySearch(workAnswerDetailSearch);
		int rightNum=0;
		int wrongNum=0;
		for(WorkAnswerDetailVo workAnswerDetailVo : workAnswerDetailVoList){
			boolean isRight = questionWareService.checkQuestionWareAnswer(workAnswerDetailVo.getQuestionId(), workAnswerDetailVo.getSelectNum());
			workAnswerDetailVo.setIsRight(isRight?"0":"1"); //0-z正确，1-错误
			if(isRight){
				rightNum++;
			}else{
				wrongNum++;
			}
		}
		mav.addObject("workWorkQuestionVoList", workWorkQuestionVoList);
		mav.addObject("wkv", wkv);
		mav.addObject("questionNum", workWorkQuestionVoList.size());
		mav.addObject("workAnswerDetailVoList", workAnswerDetailVoList);
		mav.addObject("homeworkId", bean.getId());
		mav.addObject("rightNum", rightNum);
		mav.addObject("wrongNum", wrongNum);
		mav.addObject("questionId", questionId);
		return mav;
		
	    
	}
	
	/**
	 * 作业选题页面(用到)
	 * @param search
	 * @param pb
	 * @param reuqest
	 * @param response
	 */
	@RequestMapping("/list")
	@ResponseBody
	public ModelAndView queryAllWorkWrongList(WorkAnswerSearch workAnswerSearch, PageBean pb, QuestionWareSearch search,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("我的错题集");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		//根据用户ID获取学生
		BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
		
		Long stageId = baseStudentVo.getStageId();
		WorkWrongSearch workWrongSearch = new WorkWrongSearch();
		workWrongSearch.setGradeId(search.getGradeId());
		workWrongSearch.setStageId(stageId);
		workWrongSearch.setSubjectId(search.getSubjectId());
		workWrongSearch.setQuestionType(search.getTypeId());
		workWrongSearch.setUserId(cu.getUserId());
		workWrongSearch.setDelflag("0");
	
		QuestionWareSearch questionWareSearch = new QuestionWareSearch();
		
		List<WorkWrongVo> workWrongVoList = workWrongService.queryWorkWrongBySearch(workWrongSearch);
		if(workWrongVoList !=null && workWrongVoList.size()>0){
			Long[] ids = new Long[workWrongVoList.size()];
			for(int i=0;i<workWrongVoList.size();i++){
				ids[i] = workWrongVoList.get(i).getQuestionId();
			}
			questionWareSearch.setIds(ids);
		}else{
			Long[] ids = new Long[1];
			ids[0] = 0L;
			questionWareSearch.setIds(ids);
		}		
		
		
		//1考试题库,2作业题库,3錨题库,4种子题库（自适应题库）, 5个人题库（教师题库）,6专家题库 （新题库）
		
		search.setBelongToLib("5");
		//默认查询
		if(search.getBelongToLib() != null && search.getBelongToLib().equals("5") && cu!=null) search.setCreateId(cu.getUserId());   //查询个人题库时，绑定登录人id
		
		if(search.getVersionId() == null) search.setVersionId(1L);//默认版本
		if(search.getStageId() == null) search.setStageId(1L);           //默认学段(小学)
		
		//查询所有的学段信息
		List<BaseStageVo>  bStageVos = baseStageService.queryAllBaseStage();
		
		//查询所有的年级信息
		List<BaseGradeVo>  bGradeVos = baseGradeService.queryBaseGradeByStageId(stageId);
		if(search.getGradeId() == null) search.setGradeId(bGradeVos!=null&bGradeVos.size()>0?bGradeVos.get(0).getId():null);
		
		//查询所有的学科信息
		List<BaseSubjectVo> bSubjectVos = BaseSubjectService.queryBaseSubjectByStageId(stageId);
		if(search.getSubjectId() == null) search.setSubjectId(bSubjectVos!=null&bSubjectVos.size()>0?bSubjectVos.get(0).getId():null);
		
		//查询所有的题型信息
		List<QuestionTypeVo> qTypeVos = questionTypeService.queryQuestionTypeBySubjectId(search.getSubjectId());
		
		//查询所有的教材版本
		List<BaseVersionVo>  bVersionVos = baseVersionService.queryAllBaseVersion();
		
		//查询所有的目录详情
		List<BaseCatalogVo> bCatalogVos =  baseCatalogService.queryAllBaseCatalog();
		
		//查询所有的知识点
		List<BaseKnowledgeVo>  bKnowledgeVos = baseKnowledgeService.queryAllBaseKnowledge();
		
		//查询题库信息
		
		PageBean pageBean = this.questionWareService.queryQuestionWarePage(pb,questionWareSearch);
		
		//查询用户收藏的列表
		QuestionCollectSearch qcs = new QuestionCollectSearch();
		qcs.setUserId(cu.getUserId()==null?0L:cu.getUserId());
		qcs.setDelflag("0");
		List<QuestionCollectVo> qCollectVos = this.questionCollectService.queryQuestionCollectBySearch(qcs);
		
		mav.addObject("pb", pageBean);
		mav.addObject("search", search);                  //查询条件
		mav.addObject("bVersionVos", bVersionVos);        //教材版本信息
		mav.addObject("bSubjectVos", bSubjectVos);        //学科信息
		mav.addObject("bStageVos", bStageVos);            //学段信息
		mav.addObject("bGradeVos", bGradeVos);            //年级信息
		mav.addObject("bKnowledgeVos", bKnowledgeVos);    //知识点信息
		mav.addObject("qTypeVos",qTypeVos);               //题型信息
		mav.addObject("bCatalogVos",bCatalogVos);         //目录信息
		mav.addObject("qCollectVos", qCollectVos);        //收藏列表
		mav.addObject("workWrongVoList", workWrongVoList);        //收藏列表
		return mav;
	    
	}
}