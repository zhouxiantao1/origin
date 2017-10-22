package com.sjq.index;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sjq.answerAsk.search.InterlocutionAnswerAskSearch;
import com.sjq.answerAsk.service.InterlocutionAnswerAskService;
import com.sjq.eva.search.EvaluateEvaSearch;
import com.sjq.eva.service.EvaluateEvaService;
import com.sjq.eva.vo.EvaluateEvaVo;
import com.sjq.info.search.ExamInfoSearch;
import com.sjq.info.service.ExamInfoService;
import com.sjq.info.vo.ExamInfoVo;
import com.sjq.security.constant.Constant;
import com.sjq.security.service.SecurityResourceService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.student.service.BaseStudentService;
import com.sjq.student.vo.BaseStudentVo;
import com.sjq.util.PageBean;


/**
 * 
 * 公用页面控制器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月26日下午2:20:26
 * @version 1.0
 */
@Controller
public class IndexController{
	
	@Autowired
	private SecurityResourceService securityResourceService;
	
	@Autowired
	private ExamInfoService examInfoService;
	
	@Autowired
	private BaseStudentService baseStudentService;
	
	@Autowired
	private InterlocutionAnswerAskService interlocutionAnswerAskService;
	
	
	@Autowired
	private EvaluateEvaService evaluateEvaService;
	
	/**
	 * 登录页面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("common/login");

		return modelAndView;
	}
	
	
	
	/**
	 * 登录页面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/relogin", method = RequestMethod.GET)
	public ModelAndView relogin(HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("common/login");

		return modelAndView;
	}
	
	
	/**
	 * 登录首页
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView("common/home");
		
		//操作人信息
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		
		// 教管
		if(cu.getRole().getCode().equals("Role_7") || cu.getRole().getCode().equals("ROLE_04")){
			
			// 试券信息
			
			ExamInfoSearch eis = new ExamInfoSearch();
			eis.setCreateName(cu.getUsername());
			List<ExamInfoVo> examInfoVoList = examInfoService.queryExamInfoBySearch(eis);
			
			
			//测评信息
			EvaluateEvaSearch ees = new EvaluateEvaSearch();
			ees.setDelflag("0");
			ees.setUserId(cu.getUserId());
			List<EvaluateEvaVo> evaluateEvaVoList = evaluateEvaService.queryEvaluateEvaBySearch(ees);
			
			modelAndView.addObject("eiv", examInfoVoList);
			modelAndView.addObject("ess", evaluateEvaVoList);
		}
		
		
		// 老师
		if(cu.getRole().getCode().equals("ROLE_09")){
			
			// 试券信息
			
			ExamInfoSearch eis = new ExamInfoSearch();
			eis.setCreateName(cu.getUsername());
			List<ExamInfoVo> examInfoVoList = examInfoService.queryExamInfoBySearch(eis);
			
			// 查询问答信息
			
			InterlocutionAnswerAskSearch is = new InterlocutionAnswerAskSearch();
			
			is.setUserId(cu.getUserId());
			
			PageBean ipb = this.interlocutionAnswerAskService.queryInterlocutionAnswerAskPage(new PageBean(),is);
			
			modelAndView.addObject("ipb", ipb);
			modelAndView.addObject("eiv", examInfoVoList);
			
		}
		
		
		// 学生
		if(cu.getRole().getCode().equals("ROLE_11") ){
			
			
			// 查询考试信息
			BaseStudentVo baseStudentVo = baseStudentService.queryBaseStudentByUserId(cu.getUserId());
			
			PageBean epb = examInfoService.queryHomeExamStudentByNumber(baseStudentVo.getNumber());
			
			// 查询问答信息
			
			InterlocutionAnswerAskSearch is = new InterlocutionAnswerAskSearch();
			
			is.setUserId(cu.getUserId());
			
			PageBean ipb = this.interlocutionAnswerAskService.queryInterlocutionAnswerAskPage(new PageBean(),is);
			
			modelAndView.addObject("epb", epb);
			modelAndView.addObject("ipb", ipb);
		}
		
		return modelAndView;
		
	}
	
	
	/**
	 * 访问拒绝
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/accessDenied")
	public ModelAndView accessDenied(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("common/accessDenied");
		return modelAndView;
	}
	
	
	/**
	 * 404
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/404e")
	public ModelAndView e404(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("common/404");
		return modelAndView;
	}
	
	
	/**
	 * 403
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/403e")
	public ModelAndView e403(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("common/403");
		return modelAndView;
	}
	
	
	/**
	 * 400
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/400e")
	public ModelAndView e400(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("common/400");
		return modelAndView;
	}
	
	/**
	 * 500
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/500e")
	public ModelAndView e500(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("common/500");
		return modelAndView;
	}
	
	
	/**
	 * 503
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/503e")
	public ModelAndView e503(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("common/503");
		return modelAndView;
	}
	
	
	/**
	 * 創建驗證圖片
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/generatevVerifyCode", method = RequestMethod.GET)
	public void generatevVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 在內存中創建圖像
		int width = 100, height = 22;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// 獲取圖形上下文
		Graphics graphics = image.getGraphics();

		// 設置隨機背景色
		Random random = new Random();
		graphics.setColor(new Color(201 + random.nextInt(50), 201 + random.nextInt(50), 201 + random.nextInt(50)));
		graphics.fillRect(0, 0, width, height);

		// 字體
		// g.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		graphics.setFont(new Font("Times new Roman", Font.BOLD, 25));
		// Font font = new Font("Fixedsys", Font.PLAIN, fontHeight);

		// 邊框
		graphics.drawRect(0, 0, width - 1, height - 1);

		// 隨機產生155條干擾線，加強圖片中的校驗碼探測難度
		graphics.setColor(new Color(160 + random.nextInt(41), 160 + random.nextInt(41), 160 + random.nextInt(41)));
		for (int i = 0; i < 155; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			graphics.drawLine(x, y, x + xl, y + yl);
		}

		// 隨機產生的校驗碼（4位數字）
		String validateCode = "";
		for (int i = 0; i < 4; i++) {
			String value = String.valueOf(random.nextInt(10));
			validateCode += value;

			// 將校驗碼添加到圖片中
			graphics.setColor(new Color(20 + random.nextInt(111), 20 + random.nextInt(111), 20 + random.nextInt(111)));

			graphics.drawString(value, 25 * i + 6, 20);
		}

		// 保存校验码
		request.getSession().setAttribute(Constant.IMAGE_VALIDATE_CODE_SESSION_KEY, validateCode);

		graphics.dispose();

		ImageIO.write(image, "JPEG", response.getOutputStream());
	}

	
}
