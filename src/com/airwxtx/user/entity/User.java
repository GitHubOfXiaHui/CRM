package com.airwxtx.user.entity;

import java.util.Set;

import com.airwxtx.recode.entity.Recode;
import com.airwxtx.utils.Constants;

public class User implements Role {
	
	// 逻辑ID
	private Integer userId;

	/* 普通属性 */
	// 用户名
	private String username;
	// 密码
	private String password = Constants.PASSWORD;
	// 用户身份
	private String role;
	// 权限 默认是没有任何权限
	private Long authority = 0l;
	// 冻结权限次数
	private Integer freezeCount = 0;

	/* 关联属性 */
	// 消费记录
	private Set<Recode> recodes;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getAuthority() {
		return authority;
	}

	public void setAuthority(Long authority) {
		this.authority = authority;
	}

	public Set<Recode> getRecodes() {
		return recodes;
	}

	public void setRecodes(Set<Recode> recodes) {
		this.recodes = recodes;
	}

	public Integer getFreezeCount() {
		return freezeCount;
	}

	public void setFreezeCount(Integer freezeCount) {
		this.freezeCount = freezeCount;
	}

}
