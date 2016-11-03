package com.airwxtx.card.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.card.action.CardAction;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.service.CardService;
import com.airwxtx.client.entity.Client;
import com.airwxtx.client.service.ClientService;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("cardAction")
@Scope("prototype")
public class CardActionImpl extends ActionSupport implements CardAction {
	//客户id
	private Integer clientId;
	private Client client;
	private Card card;
	//卡物理id
	private Integer id;
	
	// 查询条件（卡号、手机号）
	private String cardNo;
	private String phone;
	// 分页
	private int page;
	// 查询结果
	private List<Card> cards;

	@Autowired
	private CardService cardService;
	@Autowired
	private ClientService clientService;
	
	@Override
	public String preSave() throws Exception {
		// TODO Auto-generated method stub
		client = this.clientService.getClient(clientId);
		return INPUT;
	}
	
	@Override
	public String saveCard() throws Exception {
		// TODO Auto-generated method stub
		client = this.clientService.getClient(clientId);
		card.setPhone(client.getMobilePhoneNumber());
		card.setClient(client);
		this.cardService.saveCard(card);
		return DETAILS;
	}
	
	@Override
	public String preUpdate() throws Exception {
		// TODO Auto-generated method stub
		client = this.clientService.getClient(clientId);
		card = this.cardService.loadCard(id);
		return UPDATE;
	}

	@Override
	public String update() throws Exception {
		// TODO Auto-generated method stub
		this.cardService.updateCard(card);
		return DETAILS;
	}
	
	@Override
	public String loadCard() throws Exception {
		// TODO Auto-generated method stub
		card = this.cardService.loadCard(id);
		return DETAILS;
	}
	
	@Override
	public String searchCard() throws Exception {
		// TODO Auto-generated method stub
		cards = cardService.findCardByCardNoOrPhoneWithPage(cardNo, phone, page, Constants.PAGE_SIZE);
		return LIST;
	}

	public int getMaxPage() {
		int count = cardService.countUserWithCardNoOrPhone(cardNo, phone);
		return (count - 1) / Constants.PAGE_SIZE + 1;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Integer getCardId() {
		return id;
	}

	public void setCardId(Integer cardId) {
		this.id = cardId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public CardService getCardService() {
		return cardService;
	}

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}
	
	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}


	private static final String LIST = "list";
	private static final String DETAILS = "details";
	private static final String INPUT = "input";
	private static final String UPDATE = "update";

	
	
}
