package com.airwxtx.client.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.airwxtx.card.entity.Card;

public class Client {
	
	// �߼�ID
	private Integer clientId;
	
	/* ��ͨ���� */
	// �ͻ���������
	private String clientName;
	// �ͻ�Ӣ������
	private String clientEnglishName;
	// �ͻ��ֻ�
	private String mobilePhoneNumber;
	// �ͻ���λ
	private String company;
	// ְ���ν
	private String title;
	// סַ
	private String address;
	// ���֤��
	private String idNumber;
	// ���պ�
	private String passportNumber;
	// ͨ��֤
	private String accessNumber;
	// ������Ч��
	private Date passportValidTime;
	// ͨ��֤��Ч��
	private Date accessValidTime;
	// ��λϲ��
	private String preferSeat;
	// �Ƽ��ͻ���Դ
	private String recommend;
	// �ر�ϲ��
	private String like;
	// ��ע
	private String comment;
	// ���ÿ��б�
	private List<String> frequentFlyers;
	
	/* �������� */
	// ����
	private Card mainCard;
	// ��Ա��
	private Set<Card> cards;

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

	public Date getAccessValidTime() {
		return accessValidTime;
	}

	public void setAccessValidTime(Date accessValidTime) {
		this.accessValidTime = accessValidTime;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<String> getFrequentFlyers() {
		return frequentFlyers;
	}

	public void setFrequentFlyers(List<String> frequentFlyers) {
		this.frequentFlyers = frequentFlyers;
	}

	public Card getMainCard() {
		return mainCard;
	}

	public void setMainCard(Card mainCard) {
		this.mainCard = mainCard;
	}

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}
	
}
