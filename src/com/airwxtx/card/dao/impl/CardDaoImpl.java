package com.airwxtx.card.dao.impl;

import org.springframework.stereotype.Repository;

import com.airwxtx.card.dao.CardDao;
import com.airwxtx.card.entity.Card;
import com.airwxtx.utils.BaseDaoSupport;

@Repository
public class CardDaoImpl extends BaseDaoSupport implements CardDao {

	@Override
	public void addMoneyTo(Double money, Card card) {
		String hql = "UPDATE Card c SET c.balance = c.balance + ? WHERE c = ?";
		this.getHibernateTemplate().bulkUpdate(hql, money, card);
	}
}
