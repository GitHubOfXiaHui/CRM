package com.airwxtx.user.entity;

import java.util.Set;

import com.airwxtx.recode.entity.Recode;
import com.airwxtx.utils.Constants;

public class User implements Role {
	
	// �߼�ID
	private Integer userId;

	/* ��ͨ���� */
	// �û���
	private String username;
	// ����
	private String password = Constants.PASSWORD;
	// �û����
	private String role;
	// Ȩ�� Ĭ����û���κ�Ȩ��
	private Long authority = 0l;
	// ����Ȩ�޴���
	private Integer freezeCount = 0;

	/* �������� */
	// ���Ѽ�¼
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
