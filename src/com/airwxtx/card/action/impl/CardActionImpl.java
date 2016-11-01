package com.airwxtx.card.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.card.action.CardAction;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.service.CardService;
@Controller("cardAction")
@Scope("prototype")
public class CardActionImpl implements CardAction {
	private Card card;
	private Integer id;
	@Autowired
	private CardService cardService;
	@Override
	public String preSave() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}
	
	@Override
	public String saveCard() throws Exception {
		// TODO Auto-generated method stub
		this.cardService.saveCard(card);
		return DETAILS;
	}
	
	@Override
	public String preUpdate() throws Exception {
		// TODO Auto-generated method stub
		card = this.cardService.loadCard(id);
		return UPDATE;
	}

	@Override
	public String update() throws Exception {
		// TODO Auto-generated method stub
		this.cardService.updateCard(card);
		return DETAILS;
	}
	
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CardService getCardService() {
		return cardService;
	}

	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}


	private static final String DETAILS = "details";
	private static final String INPUT = "input";
	private static final String UPDATE = "update";
	
}
