package com.sjq.exam.online.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sjq.info.service.ExamInfoService;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.teacher.service.BaseTeacherService;
import com.sjq.teacher.vo.BaseTeacherVo;
import com.sjq.teacherClasses.service.BaseTeacherClassesService;
import com.sjq.teacherClasses.vo.BaseTeacherClassesVo;
import com.sjq.security.util.CustomUser;
import com.sjq.grade.search.BaseGradeSearch;
import com.sjq.grade.service.BaseGradeService;
import com.sjq.grade.vo.BaseGradeVo;
import com.sjq.info.bean.ExamInfoBean;
import com.sjq.info.search.ExamInfoSearch;

@Controller
@RequestMapping(value = "/exam/online/manage")
public class ExamManageController {
	
	// ftl跳转目录  
	private static final String PAGE_FOLDER="exam/online/";
	
	// 线上考试-考试信息页面 
	private static final String PAGE = "exam_online_manage";
	
	// 记录日志对象 
	private static final MyLogger LOGGER = new MyLogger(ExamManageController.class);
	
	@Autowired
	private ExamInfoService examInfoService;
	
	@Autowired
	private BaseTeacherClassesService baseTeacherClassesService;
	
	@Autowired
	private BaseGradeService baseGradeService;
	
	@Autowired
	private BaseTeacherService baseTeacherService;
	
	/**
     * 
     * @MethodName:addExamRequest
     * @Description:查询考试，考试管理界面
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/list")
	public ModelAndView queryExamRequest(HttpServletRequest request, HttpServletResponse response,PageBean pageBean,ExamInfoSearch search) throws Exception {
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		search.setCreateName(cu.getUsername());
		PageBean pb = examInfoService.queryExamInfoPage(pageBean,search);
		mav.addObject("pb", pb);
		mav.addObject("progress", (search.getProgress()!=null)&&(search.getProgress().trim()!="")?search.getProgress():"0");
		mav.setViewName(PAGE_FOLDER + PAGE);
        return mav;
	}
	
	/**
     * 
     * @MethodName:newExamRequest
     * @Description:新增考试，新增考试界面
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	@RequestMapping(value = "/list/newexam")
	public ModelAndView newExamRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		Map<String,String> examTypeMap = new HashMap<String,String>();
		examTypeMap.put("1", "单元考");
		examTypeMap.put("2", "月考");
		examTypeMap.put("3", "期中考");
		examTypeMap.put("4", "期末考");
		if(cu.getRole().getCode().equals("ROLE_09")){
			BaseTeacherVo baseTeacherVo = baseTeacherService.queryBaseTeacherByUserId(cu.getUserId());
			List<BaseTeacherClassesVo> baseTeacherClassesVoList = baseTeacherClassesService.queryBaseTeacherClassesByteacherId(baseTeacherVo.getId());
			mav.addObject("baseTeacherClassesVoList", baseTeacherClassesVoList);//年级集合
			mav.addObject("role", 0);
		}else{
			examTypeMap.put("5", "市级考试");
			List<BaseGradeVo> baseGradeVoList = baseGradeService.queryBaseGradeBySearch(new BaseGradeSearch());
			mav.addObject("baseGradeVoList", baseGradeVoList);//年级集合
			mav.addObject("role", 1);
		}
		mav.addObject("examTypeId", 1);//设置默认选择的考试类型
		mav.addObject("examTypeMap", examTypeMap);//考试类型
		mav.setViewName("exam/online/exam_online_new_exam");
        return mav;
	}
	
	/**
	 * 
	 * @MethodName:insertExamInfo
	 * @Description:新增考试
	 * @param bean
	 * @param reuqest
	 * @param response
	 * @return
	 */
	@RequestMapping("/list/save")
	public String insertExamInfo(ExamInfoBean bean,HttpServletRequest reuqest,HttpServletResponse response) {
		
		LOGGER.info("新增一场大考...");
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateName(cu.getUsername());
		bean.setCreateTime(new Date());
		if(cu.getRole().getCode().equals("ROLE_02") || cu.getRole().getCode().equals("ROLE_03") || cu.getRole().getCode().equals("Role_7")){
			//市级角色
			bean.setExamRange("4");
		}else if(cu.getRole().getCode().equals("ROLE_04") || cu.getRole().getCode().equals("ROLE_05")){
			//区级角色
			bean.setExamRange("3");
		}else if(cu.getRole().getCode().equals("ROLE_06") || cu.getRole().getCode().equals("ROLE_07") || cu.getRole().getCode().equals("ROLE_08")){
			//校级角色
			bean.setExamRange("2");
		}else if(cu.getRole().getCode().equals("ROLE_09")){
			//班级角色
			bean.setExamRange("1");
		}
		
		bean.setStatus("0");
		this.examInfoService.insertExamInfo(bean);
		return "redirect:/exam/online/manage/list.htm";
	}
	
}