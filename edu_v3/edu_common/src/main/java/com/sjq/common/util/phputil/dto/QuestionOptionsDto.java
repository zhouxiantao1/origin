package com.sjq.common.util.phputil.dto;

/**
 * 
 * 试题选择项json只针对选择题
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月2日下午3:27:56
 * @version 1.0
 */
public class QuestionOptionsDto {
	
	private String content;    //选择内容
	private String is_answer;  //是否正确答案
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content.replace("other.koo6.com", "video.koo6.com").replace("__TIIMGURL__", "video.koo6.com").replace("__tiimgurl__", "video.koo6.com");
	}
	public String getIs_answer() {
		return is_answer;
	}
	public void setIs_answer(String is_answer) {
		this.is_answer = is_answer;
	}
	
	

}
