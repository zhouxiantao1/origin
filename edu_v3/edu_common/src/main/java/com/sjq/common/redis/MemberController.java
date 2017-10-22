package com.sjq.common.redis;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjq.common.redis.model.Member;
import com.sjq.common.redis.service.RedisCacheService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
 
    @Autowired
    private RedisCacheService memberService;
 
    public void setMemberService(RedisCacheService memberService) {
        this.memberService = memberService;
    }
 
	@RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public String add(HttpServletRequest request,
            HttpServletResponse response,String id,String name) {
    	
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pass", 123456);
		
		Member m = new Member("007","郑泽杰");
		
//    	this.memberService.add(m);
    	 
    	return "1";
      
    }
 
}