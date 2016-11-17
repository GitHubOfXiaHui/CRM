package com.airwxtx.card.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.airwxtx.card.dao.CardDao;
import com.airwxtx.card.entity.Card;
import com.airwxtx.utils.BaseDaoSupport;

@Repository
public class CardDaoImpl extends BaseDaoSupport implements CardDao {

	@Override
	public void updateCardBalance(Card card, Double money) {
		String hql = "UPDATE Card c SET c.balance = c.balance + ? WHERE c = ?";
		this.getHibernateTemplate().bulkUpdate(hql, money, card);
	}

	@Override
	public void updateCardBalance(Integer cardId, Double money) {
		String hql = "UPDATE Card SET balance = balance + ? WHERE id = ?";
		this.getHibernateTemplate().bulkUpdate(hql, money, cardId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Card> findCardByCardNoOrPhoneWithPage(String cardNo, String status, int page, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria query = createDetachedCriteriaWithCardNoOrStatus(cardNo, status);
		return (List<Card>) this.getHibernateTemplate().findByCriteria(query, (page - 1) * pageSize, pageSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countUserWithCardNoOrPhone(String cardNo, String status) {
		// TODO Auto-generated method stub
		DetachedCriteria query = createDetachedCriteriaWithCardNoOrStatus(cardNo, status)
				.setProjection(Projections.rowCount());
		List<Object> ans = (List<Object>) this.getHibernateTemplate().findByCriteria(query);
		return Integer.parseInt(ans.get(0).toString());
	}

	private DetachedCriteria createDetachedCriteriaWithCardNoOrStatus(String cardNo, String status) {
		DetachedCriteria query = DetachedCriteria.forClass(Card.class);
		if (cardNo != null && !cardNo.equals("")) {
			query.add(Restrictions.ilike("cardNo", cardNo, MatchMode.ANYWHERE));
		}
		if (status != null && !status.equals("")) {
			query.add(Restrictions.ilike("status", status, MatchMode.ANYWHERE));
		}
		return query;
	}

	@Override
	public Integer saveCard(Card card) {
		// TODO Auto-generated method stub
		return (Integer) this.getHibernateTemplate().save(card);
	}

	@Override
	public Card loadCard(Integer id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Card.class, id);
	}

	@Override
	public void updateCardStatus(Integer cardId, String cardStatus) {
		// TODO Auto-generated method stub
		String hql = "UPDATE Card SET status = ? WHERE id = ?";
		this.getHibernateTemplate().bulkUpdate(hql, cardStatus, cardId);
	}

}
