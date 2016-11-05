package com.airwxtx.card.entity;

import java.util.Set;

import com.airwxtx.client.entity.Client;
import com.airwxtx.recode.entity.Recode;

public class Card implements CardStatus {

	// �߼�ID
	private Integer cardId;
	
	/* ��ͨ���� */
	// ����
	private String cardNo;
	// ״̬������/���ᣩ
	private String status = NORMAL;
	// ���
	private double balance = 0.0;
	// ��У����
	private String checkCode;
	// �ֻ���
	private String phone;
	
	/* �������� */
	// �ֿ���
	private Client client;
	// ���Ѽ�¼
	private Set<Recode> recodes;
	
	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Set<Recode> getRecodes() {
		return recodes;
	}
	
	public void setRecodes(Set<Recode> recodes) {
		this.recodes = recodes;
	}
	
}
