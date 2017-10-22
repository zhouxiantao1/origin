package com.sjq.security.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.sjq.security.bean.SecurityRole;
import com.sjq.security.bean.SecurityUser;
import com.sjq.security.search.SecurityUserSearch;
import com.sjq.security.service.SecurityRoleService;
import com.sjq.security.service.SecurityUserService;
import com.sjq.security.util.CustomUser;
import com.sjq.security.util.SpringSecurityUtils;
import com.sjq.util.MyLogger;
import com.sjq.util.PageBean;
import com.sjq.util.datetime.DateUtil;

/**
 * 用户控制器
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月14日下午5:09:42
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/security/user")
public class SecurityUserController {
	
    /** ftl跳转目录  **/
	private static final String PAGE_FOLDER="security/";
	
	/** 角色管理页面 **/
	private static final String PAGE = "security_user";
	
	/** 角色管理访问地址 **/
	private static final String PAGE_HTM = "list.htm";
	
	/** 日志信息  **/
	private static final String OPERA_LOG_INSERT = "保存角色管理信息";
	private static final String OPERA_LOG_UPDATE = "更新角色管理信息";
	private static final String OPERA_LOG_DELETE = "删除角色管理信息";
	private static final String OPERA_LOG_BATCH_DELETE = "指删除角色管理信息";
	
	/** 记录日志对象 */
    private static final MyLogger LOGGER = new MyLogger(SecurityUserController.class);
	
    
	@Autowired
	private SecurityRoleService securityRoleService;
    
	
	@Autowired
	private SecurityUserService securityUserService;
	

	
	/**
	 * 分页查询角色管理列表信息，跳转到该页面
	 * @param request  请求体
	 * @param response 响应体
	 * @param pb       分页实体
	 * @param search   搜索条件
	 * @return         视图
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView findPageUserList(Long roleId,HttpServletRequest request, HttpServletResponse response, PageBean pb,SecurityUserSearch search) {
		
		LOGGER.info("跳转到用户角色管理界面...");
		
		pb.setUrl("findRoleList.htm");
		
		ModelAndView mav = new ModelAndView(PAGE_FOLDER + PAGE);
		
		//查询所有的角色信息
		List<SecurityRole> srs = this.securityRoleService.selectAll();
		
		if(roleId == null) roleId = srs != null ? srs.get(0).getId():0;
		search.setRoleId(roleId);
		
		PageBean pageBean = this.securityUserService.queryPage(pb,search);
		
		mav.addObject("pb", pageBean);
		mav.addObject("srs",srs);         //角色信息
		mav.addObject("roleid", roleId);  //角色id
		
		return mav;
		
	}
	
	/**
	 * 保存用户信息
	 * @param bean 用户管理信息
	 * @param request  请求体
	 * @param response 响应体
	 * @return         
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveUser(@Valid SecurityUser bean, HttpServletRequest request, HttpServletResponse response,String isPermanent,String time) {
		
		LOGGER.info("保存用户管理信息...");
		
		if(isPermanent.equals("0")){
			bean.setExpireTime(DateUtil.parseDate("0000-00-00 00:00:00","yyyy/MM/dd HH:mm:ss"));
		}else{
			bean.setExpireTime(DateUtil.parseDate(time+" 23:59:59","yyyy/MM/dd HH:mm:ss"));
		}
		
		bean.setCreateTime(new Date());
		
		CustomUser cu = SpringSecurityUtils.getCurrentCustomUser();
		bean.setCreateUser(cu.getUsername());
		
		//密码加密
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		bean.setPassword(md5.encodePassword(bean.getPassword(), bean.getCode()));
		
        int result = this.securityUserService.insertUser(bean);

        return new ModelAndView(new RedirectView(PAGE_HTM));
		
	}
	
	
	public static void main(String[] args){
		
		long startTime = System.currentTimeMillis();  
		
		int i = 95;           //设置匹配界线95%(相似度超过95%则认定为重复题度）
		
		int y = 0;
			
		String ntk = new SecurityUserController().qc("亚洲和欧洲最长的河流分别是>B.&nbsp;长江、莱茵河</br>C.&nbsp;珠江、伏尔加河</");
		
		String tk = new SecurityUserController().qc("亚洲和欧洲最长的河流分别是（）</br>A.&nbsp;黄河、多瑙河</br>B.&nbsp;长江、莱茵河</br>C.&nbsp;珠江、伏尔加河</br>D.&nbsp;长江、伏尔加河</br>");
		
		System.out.println(tk);
		System.out.println("总字符数:"+tk.length());
		
		int sy = tk.length();
		
		String[] ntks = ntk.split("");
		for(String n:ntks){
			
			if(tk.indexOf(n)>=0){
				y++;
			}
		}
		
		System.out.println("匹配上总字度数:"+y);
		
		System.out.println("相似度为:"+((float)y/sy)*100+"%");
		
		if(((float)y/sy)*100 > i){
			System.out.println("这可能为重复的题库内容");
		}else{
			System.out.println("这决对不是重复的题库内容");
		}
		
	  long endTime = System.currentTimeMillis();  
      
        float seconds = (endTime - startTime) / 1000F;  
      
        System.out.println(Float.toString(seconds) + " seconds.");  
		
	}
	
	
	public String qc(String s){
		
		
		//去掉标点符号
		s.replace("，", "").replace("、", "").replace("”", "").replace("“", "");
		
		
		String[] ntks = s.trim().split("");
		String ns = "";
		
		for(String n:ntks){
			
			if(ns.indexOf(n)<0){
				ns += n;
			}
		}
		
		System.out.println(s+"  转化为 "+ns);
		return ns;
		
	}
	
	
	

}
