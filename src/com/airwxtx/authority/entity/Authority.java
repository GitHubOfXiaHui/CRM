package com.airwxtx.authority.entity;

public class Authority implements AuthorityNumber {
	
	// Ȩ�ޱ��
	private Long authorityNumber;
	// Ȩ������
	private String description;
	
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Authority(Long authorityNumber, String description) {
		super();
		this.authorityNumber = authorityNumber;
		this.description = description;
	}

	public Long getAuthorityNumber() {
		return authorityNumber;
	}
	
	public void setAuthorityNumber(Long authorityNumber) {
		this.authorityNumber = authorityNumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
