package com.airwxtx.card.service.impl;

import java.util.List;

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
	@Transactional(readOnly = true)
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String phone, int page, int pageSize) {
		// TODO Auto-generated method stub
		return cardDao.findCardByCardNoOrPhoneWithPage(cardNo, phone, page, pageSize);
	}
	
	@Override
	public int countUserWithCardNoOrPhone(String cardNo, String phone) {
		// TODO Auto-generated method stub
		return cardDao.countUserWithCardNoOrPhone(cardNo, phone);
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

}
