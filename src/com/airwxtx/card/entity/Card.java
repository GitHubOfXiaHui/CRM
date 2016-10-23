package com.airwxtx.card.entity;

import java.util.Set;

import com.airwxtx.client.entity.Client;
import com.airwxtx.recode.entity.Recode;

public class Card implements CardStatus {

	// ����ID
	private Integer id;
	
	/* ��ͨ���� */
	// ���ţ��߼�ID��
	private String cardNo;
	// ״̬������/���ᣩ
	private String status;
	// ���
	private Double balance;
	
	/* �������� */
	// �ֿ���
	private Client client;
	// ���Ѽ�¼
	private Set<Recode> recodes;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
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
