package com.airwxtx.authority.entity;

public class Authority {
	//����id
	private Integer authorityId;
	//Ȩ�ޱ��
	private Long authorityNumber;
	//Ȩ������
	private String description;
	public Integer getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
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
