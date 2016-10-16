package com.airwxtx.user.entity;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.airwxtx.utils.MD5Encoder;

public class User implements Role{
	// �û�ID
	private Integer id;
	// �û���
	private String username;
	// ����
	private String password;
	// �û����
	private String role;
	
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
		try {
			this.password = MD5Encoder.encode(password);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			this.password = "";
		}
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
