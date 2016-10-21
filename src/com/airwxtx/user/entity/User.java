package com.airwxtx.user.entity;

public class User implements Role {
	// �û�ID
	private Integer id;
	// �û���
	private String username;
	// ����
	private String password;
	// �û����
	private String role;
	//Ȩ�� Ĭ����û���κ�Ȩ��
	private Long authority = 0l;

	public Long getAuthority() {
		return authority;
	}

	public void setAuthority(Long authority) {
		this.authority = authority;
	}

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

}
