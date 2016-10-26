package com.airwxtx.user.entity;

import java.util.Set;

import com.airwxtx.recode.entity.Recode;

public class User implements Role {
	// 用户ID
	private Integer id;
	
	/* 普通属性 */
	// 用户名
	private String username;
	// 密码
	private String password;
	// 用户身份
	private String role;
	// 权限 默认是没有任何权限
	private Long authority = 0l;
	private Integer freezeAuthority = 2;
	/* 关联属性 */
	private Set<Recode> recodes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getFreezeAuthority() {
		return freezeAuthority;
	}

	public void setFreezeAuthority(Integer freezeAuthority) {
		this.freezeAuthority = freezeAuthority;
	}

}
