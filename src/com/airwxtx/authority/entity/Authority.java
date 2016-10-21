package com.airwxtx.authority.entity;

public class Authority {
	//物理id
	private Integer authorityId;
	//权限编号
	private Long authorityNumber;
	//权限描述
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
