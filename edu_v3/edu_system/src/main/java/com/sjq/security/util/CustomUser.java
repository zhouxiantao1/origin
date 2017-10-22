package com.sjq.security.util;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.sjq.security.bean.SecurityRole;

/**
 * 
 * 擴展SpringSecurity User對象
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月10日上午11:25:04
 * @version 1.0
 */
public class CustomUser extends User {
	
	private static final long serialVersionUID = 1;

	private Long userId;
	// Spring Security的username實際上只是用戶編號(userCode),所以再加上用戶名稱(userName)
	private String nameOfUser;
	private Date lastLoginTime;
	
	private SecurityRole role;  //资源信息
	
	private List<Map<String,Object>> menumap;  //菜单信息
	
	public List<Map<String, Object>> getMenumap() {
		return menumap;
	}

	public void setMenumap(List<Map<String, Object>> menumap) {
		this.menumap = menumap;
		
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNameOfUser() {
		return nameOfUser;
	}

	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public SecurityRole getRole() {
		return role;
	}

	public void setRole(SecurityRole role) {
		this.role = role;
	}

	/**
	 * 
	 * @param role
	 * @param userId
	 * @param username
	 * @param nameOfUser
	 * @param password
	 * @param lastLoginTime
	 * @param enabled
	 * @param accountNonExpired
	 * @param credentialsNonExpired
	 * @param accountNonLocked
	 * @param authorities
	 */
	public CustomUser(List<Map<String,Object>> menumap,SecurityRole role,Long userId,
			String username, String nameOfUser, String password, Date lastLoginTime, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.menumap = menumap;
		this.role = role;
		this.userId = userId;
		this.nameOfUser = nameOfUser;
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof User) {
			return nameOfUser.equals(((CustomUser) o).nameOfUser);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return nameOfUser.hashCode();
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
