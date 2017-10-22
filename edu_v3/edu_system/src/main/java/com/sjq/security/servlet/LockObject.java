package com.sjq.security.servlet;
import java.util.Date;
import java.io.Serializable;

/**
 * 
 * 登录加锁对象
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月9日下午2:38:49
 * @version 1.0
 */
public class LockObject  implements Serializable {
	
	private static final long serialVersionUID = 1;

	private Date recdate;
	private Integer count;

	public Date getRecdate() {
		return recdate;
	}

	public void setRecdate(Date recdate) {
		this.recdate = recdate;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
