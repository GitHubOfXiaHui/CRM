package com.airwxtx.client.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.airwxtx.client.dao.ClientDao;
import com.airwxtx.client.entity.Client;
import com.airwxtx.utils.BaseDaoSupport;

//@Repository用于标注数据访问组件，即DAO组件
@Repository
public class ClientDaoImpl extends BaseDaoSupport implements ClientDao {

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(client);
	}

	@Override
	public Integer saveClient(Client client) {
		// TODO Auto-generated method stub
		return (Integer) this.getHibernateTemplate().save(client);
	}

	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(client);
	}

	@Override
	public Client getClient(Integer clientId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Client.class, clientId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> searchClientByNameOrPhoneOrCompanyOrCardWithPage(String name, String phone, String company,
			String card, int page, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria query = createQuery(name, phone, company, card);
		return (List<Client>) this.getHibernateTemplate().findByCriteria(query, (page - 1) * pageSize, pageSize);
	}

	private DetachedCriteria createQuery(String name, String phone, String company, String card) {
		DetachedCriteria query = DetachedCriteria.forClass(Client.class);
		if (name != null && !name.equals("")) {
			query.add(Restrictions.or(Restrictions.ilike("clientName", name, MatchMode.ANYWHERE),
					Restrictions.ilike("clientEnglishName", name, MatchMode.ANYWHERE)));
		}
		if (phone != null && !phone.equals("")) {
			query.add(Restrictions.ilike("mobilePhoneNumber", phone, MatchMode.ANYWHERE));
		}
		if (company != null && !company.equals("")) {
			query.add(Restrictions.ilike("company", company, MatchMode.ANYWHERE));
		}
		if (card != null && !card.equals("")) {
			query.createCriteria("cards").add(Restrictions.ilike("cardNo", card, MatchMode.ANYWHERE));
		}

		return query;
	}

	@Override
	public int countClientByNameOrPhoneOrCompanyOrCardWithPage(String name, String phone, String company, String card) {
		// TODO Auto-generated method stub
		DetachedCriteria query = createQuery(name,phone,company,card)
				.setProjection(Projections.rowCount());
		@SuppressWarnings("unchecked")
		List<Object> ans = (List<Object>) this.getHibernateTemplate().findByCriteria(query);
		return Integer.parseInt(ans.get(0).toString());
	}

}
