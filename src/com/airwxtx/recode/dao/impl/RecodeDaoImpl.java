package com.airwxtx.recode.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.airwxtx.recode.dao.RecodeDao;
import com.airwxtx.recode.entity.Recode;
import com.airwxtx.utils.BaseDaoSupport;

@Repository
public class RecodeDaoImpl extends BaseDaoSupport implements RecodeDao {

	@SuppressWarnings("unchecked")
	public List<Recode> findRecodeByCompanyOrNameWithPage(String company, String name, int page, int pageSize) {
		DetachedCriteria query = createDetachedCriteriaWithCompanyOrName(company, name);
		return (List<Recode>) this.getHibernateTemplate().findByCriteria(query, (page - 1) * pageSize, pageSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countUserWithCompanyOrName(String company, String name) {
		DetachedCriteria query = createDetachedCriteriaWithCompanyOrName(company, name)
				.setProjection(Projections.rowCount());
		List<Object> ans = (List<Object>) this.getHibernateTemplate().findByCriteria(query);
		return Integer.parseInt(ans.get(0).toString());
	}

	private DetachedCriteria createDetachedCriteriaWithCompanyOrName(String company, String name) {
		// TODO Auto-generated method stub
		DetachedCriteria query = DetachedCriteria.forClass(Recode.class).createCriteria("client");
		if (company != null && !company.equals("")) {
			query.add(Restrictions.ilike("company", company, MatchMode.ANYWHERE));
		}
		if (name != null && !name.equals("")) {
			query.add(Restrictions.or(Restrictions.ilike("clientName", name, MatchMode.ANYWHERE),
					Restrictions.ilike("clientEnglishName", name, MatchMode.ANYWHERE)));
		}
		return query;
	}
	
	@Override
	public Recode loadRecode(Integer id){
		return this.getHibernateTemplate().get(Recode.class, id);
	}
	
	@Override
	public void deleteRecode(Integer recodeId){
		String hql = "DELETE FROM Recode WHERE id = ?";
		this.getHibernateTemplate().bulkUpdate(hql, recodeId);
	}
}
