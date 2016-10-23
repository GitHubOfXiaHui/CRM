package com.airwxtx.card.entity;

import java.util.Set;

import com.airwxtx.client.entity.Client;
import com.airwxtx.recode.entity.Recode;

public class Card implements CardStatus {

	// 物理ID
	private Integer id;
	
	/* 普通属性 */
	// 卡号（逻辑ID）
	private String cardNo;
	// 状态（正常/冻结）
	private String status;
	// 余额
	private Double balance;
	
	/* 关联属性 */
	// 持卡人
	private Client client;
	// 消费记录
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
