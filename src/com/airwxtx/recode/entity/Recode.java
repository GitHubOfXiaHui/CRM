package com.airwxtx.recode.entity;

import java.util.Date;

import com.airwxtx.card.entity.Card;
import com.airwxtx.client.entity.Client;
import com.airwxtx.user.entity.User;

public class Recode {
	// 物理ID
	private Integer id;
	
	/* 普通属性 */
	// 航班号
	private String fltNo;
	// 行程
	private String route;
	// 航班日期
	private Date flightDate;
	// 订票日期
	private Date bookingDate;
	// 消费金额
	private Double consumption;
	// 备注
	private String comment;
	
	/* 关联属性 */
	// 会员
	private Client client;
	// 会员卡
	private Card card;
	// 操作员
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
