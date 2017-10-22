package com.sjq.common.util.phputil.dto;

/**
 * 
 * 格灵数据json保存与解析格式
 * @author SJQ-ZeJie Zheng
 * @since 2017年5月2日上午9:57:49
 * @version 1.0
 */
public class QuestionContentDto {
	
	private String title;    //标题
	
	private String content;  //内容

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title.replace("other.koo6.com", "video.koo6.com").replace("__TIIMGURL__", "video.koo6.com").replace("__tiimgurl__", "video.koo6.com"); 
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content.replace("other.koo6.com", "video.koo6.com").replace("__TIIMGURL__", "video.koo6.com").replace("__tiimgurl__", "video.koo6.com");
	}
	
	

}
