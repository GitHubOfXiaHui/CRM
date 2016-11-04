package com.airwxtx.recode.entity;

import java.util.Date;

import com.airwxtx.card.entity.Card;
import com.airwxtx.client.entity.Client;
import com.airwxtx.user.entity.User;

public class Recode {
	// ����ID
	private Integer id;
	
	/* ��ͨ���� */
	// �����
	private String fltNo;
	// �г�
	private String route;
	// ��������
	private Date flightDate;
	// ��Ʊ����
	private Date bookingDate;
	// ���ѽ��
	private Double consumption;
	// ��ע
	private String comment;
	
	/* �������� */
	// ��Ա
	private Client client;
	// ��Ա��
	private Card card;
	// ����Ա
	private User user;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFltNo() {
		return fltNo;
	}
	
	public void setFltNo(String fltNo) {
		this.fltNo = fltNo;
	}
	
	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Date getFlightDate() {
		return flightDate;
	}
	
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	
	public Date getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public Double getConsumption() {
		return consumption;
	}
	
	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Card getCard() {
		return card;
	}
	
	public void setCard(Card card) {
		this.card = card;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
}
