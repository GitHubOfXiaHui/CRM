package com.airwxtx.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.card.dao.CardDao;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.service.CardService;
@Service
public class CardServiceImpl implements CardService {
	@Autowired
	private CardDao cardDao;
	@Override
	public Card loadCard(Integer id) {
		// TODO Auto-generated method stub
		return this.cardDao.loadCard(id);
	}

	@Override
	@Transactional
	public void saveCard(Card card) {
		// TODO Auto-generated method stub
		this.cardDao.saveCard(card);
	}

	@Override
	@Transactional
	public void updateCard(Card card) {
		// TODO Auto-generated method stub
		this.cardDao.updateCard(card);
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

}
