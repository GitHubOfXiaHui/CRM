package com.airwxtx.card.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airwxtx.authority.entity.AuthorityNumber;
import com.airwxtx.card.dao.CardDao;
import com.airwxtx.card.entity.Card;
import com.airwxtx.card.entity.CardStatus;
import com.airwxtx.card.service.CardService;
import com.airwxtx.client.entity.Client;
import com.airwxtx.recode.dao.RecodeDao;
import com.airwxtx.recode.entity.Recode;
import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;
import com.airwxtx.utils.Constants;
import com.opensymphony.xwork2.ActionContext;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardDao cardDao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private RecodeDao recodeDao;

	@Override
	@Transactional(readOnly = true)
	public List<Card> findCardByCardNoOrStatusWithPage(String cardNo, String status, int page, int pageSize) {
		// TODO Auto-generated method stub
		return cardDao.findCardByCardNoOrPhoneWithPage(cardNo, status, page, pageSize);
	}

	@Override
	@Transactional(readOnly = true)
	public int countCardWithCardNoOrStatus(String cardNo, String status) {
		// TODO Auto-generated method stub
		return cardDao.countUserWithCardNoOrPhone(cardNo, status);
	}

	@Override
	@Transactional(readOnly = true)
	public Card loadCard(Integer cardId) {
		// TODO Auto-generated method stub
		return cardDao.loadCard(cardId);
	}

	@Override
	@Transactional
	public void createCard(Card card, Client client, boolean mainCard) {
		// TODO Auto-generated method stub
		card.setClient(client);
		Integer cardId = cardDao.saveCard(card);
		if (mainCard) {
			card = cardDao.loadCard(cardId);
			client.setMainCard(card);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public boolean canFreezeCard(String username) {
		// TODO Auto-generated method stub
		Set<Long> userAuthority = ((Map<String, Set<Long>>) ActionContext.getContext().getApplication()
				.get("authority")).get(username);
		if (userAuthority.contains(AuthorityNumber.FREEZE_CARD_UNLIMITED)) {
			return true;
		} else if (userAuthority.contains(AuthorityNumber.FREEZE_CARD_LIMITED)) {
			int freezeCount = userDao.findUserFreezeCount(username);
			return freezeCount < Constants.FREEZE_CARD_UPPER_LIMIT;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public void freezeCard(Integer cardId, String username) {
		// TODO Auto-generated method stub
		Set<Long> userAuthority = ((Map<String, Set<Long>>) ActionContext.getContext().getApplication()
				.get("authority")).get(username);
		if (userAuthority.contains(AuthorityNumber.FREEZE_CARD_LIMITED)) {
			userDao.userFreezeCountInc(username);
		}
		cardDao.updateCardStatus(cardId, CardStatus.FREEZE);
	}

	@Override
	@Transactional
	public void unfreezeCard(Integer cardId) {
		// TODO Auto-generated method stub
		cardDao.updateCardStatus(cardId, CardStatus.NORMAL);
	}

	@Override
	@Transactional
	public void charge(Integer cardId, double money) {
		// TODO Auto-generated method stub
		cardDao.updateCardBalance(cardId, money);
	}

	@Override
	@Transactional
	public void pay(Card card, Recode recode) {
		// TODO Auto-generated method stub
		cardDao.updateCardBalance(card, -recode.getConsumption());
		recode.setCard(card);
		String username = (String) ActionContext.getContext().getSession().get("user");
		User user = userDao.findUserByName(username).get(0);
		recode.setUser(user);
		recodeDao.save(recode);
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

	public RecodeDao getRecodeDao() {
		return recodeDao;
	}

	public void setRecodeDao(RecodeDao recodeDao) {
		this.recodeDao = recodeDao;
	}

}
