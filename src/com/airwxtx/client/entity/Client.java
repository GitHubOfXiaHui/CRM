package com.airwxtx.client.entity;

import java.util.Date;
import java.util.Set;

import com.airwxtx.card.entity.Card;
import com.airwxtx.recode.entity.Recode;

public class Client {
	// 客户id
	private Integer clientId;
	// 客户中文姓名
	private String clientName;
	// 客户英文姓名
	private String clientEnglishName;
	// 客户手机
	private String mobilePhoneNumber;
	// 客户单位
	private String company;
	// 职别称谓
	private String title;
	// 住址
	private String address;
	// 身份证号
	private String idNumber;
	// 护照号
	private String passportNumber;
	// 通行证
	private String accessNumber;
	// 护照有效期
	private Date passportValidTime;
	// 通行证有效期
	private Date accsessValidTime;
	// 座位喜好
	private String preferSeat;
	// 推荐客户来源
	private String recommend;
	// 特别喜好
	private String like;
	// 常旅客列表
	private Set<String> frequentFlyers;
	
	/* 关联属性 */
	// 会员卡
	private Set<Card> cards;
	// 消费记录
	private Set<Recode> recodes;

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEnglishName() {
		return clientEnglishName;
	}

	public void setClientEnglishName(String clientEnglishName) {
		this.clientEnglishName = clientEnglishName;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getAccessNumber() {
		return accessNumber;
	}

	public void setAccessNumber(String accessNumber) {
		this.accessNumber = accessNumber;
	}

	public Date getPassportValidTime() {
		return passportValidTime;
	}

	public void setPassportValidTime(Date passportValidTime) {
		this.passportValidTime = passportValidTime;
	}

	public Date getAccsessValidTime() {
		return accsessValidTime;
	}

	public void setAccsessValidTime(Date accsessValidTime) {
		this.accsessValidTime = accsessValidTime;
	}

	public String getPreferSeat() {
		return preferSeat;
	}

	public void setPreferSeat(String preferSeat) {
		this.preferSeat = preferSeat;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public Set<String> getFrequentFlyers() {
		return frequentFlyers;
	}

	public void setFrequentFlyers(Set<String> frequentFlyers) {
		this.frequentFlyers = frequentFlyers;
	}

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	public Set<Recode> getRecodes() {
		return recodes;
	}

	public void setRecodes(Set<Recode> recodes) {
		this.recodes = recodes;
	}
	
}
