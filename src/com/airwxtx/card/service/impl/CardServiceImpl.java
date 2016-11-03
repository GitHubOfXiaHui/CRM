package com.airwxtx.card.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.authority.entity.AuthorityNumber;
import com.airwxtx.card.dao.CardDao;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.entity.CardStatus;
import com.airwxtx.card.service.CardService;
import com.airwxtx.user.dao.UserDao;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionContext;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardDao cardDao;

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String phone, int page, int pageSize) {
		// TODO Auto-generated method stub
		return cardDao.findCardByCardNoOrPhoneWithPage(cardNo, phone, page, pageSize);
	}

	@Override
	@Transactional(readOnly = true)
	public int countUserWithCardNoOrPhone(String cardNo, String phone) {
		// TODO Auto-generated method stub
		return cardDao.countUserWithCardNoOrPhone(cardNo, phone);
	}

	@Override
	@Transactional(readOnly = true)
	public Card loadCard(Integer id) {
		// TODO Auto-generated method stub
		Card card = cardDao.loadCard(id);
		Hibernate.initialize(card.getClient());
		return card;
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

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public boolean canFreezeCard(String username) {
		// TODO Auto-generated method stub
		Set<Long> userAuthority = ((Map<String, Set<Long>>) ActionContext.getContext().getApplication()
				.get("authority")).get(username);
		if (userAuthority.contains(AuthorityNumber.FREEZE_CARD_LIMITED)) {
			int freezeCount = userDao.findUserFreezeCount(username);
			return freezeCount < Constants.FREEZE_UPPER_LIMIT;
		} else {
			return userAuthority.contains(AuthorityNumber.FREEZE_CARD_UNLIMITED);
		}
	}

	@Override
	public void freezeCard(Integer cardId) {
		// TODO Auto-generated method stub
		cardDao.updateCardStatus(cardId, CardStatus.FREEZE);
	}

	@Override
	public void unfreezeCard(Integer cardId) {
		// TODO Auto-generated method stub
		cardDao.updateCardStatus(cardId, CardStatus.NORMAL);
	}

	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
