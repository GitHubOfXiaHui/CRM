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
	public List<Recode> findRecodeByFltNoOrRouteWithPage(String fltNo, String route, int page, int pageSize) {
		DetachedCriteria query = createDetachedCriteriaWithFltNoOrRoute(fltNo, route);
		return (List<Recode>) this.getHibernateTemplate().findByCriteria(query, (page - 1) * pageSize, pageSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countRecodeWithFltNoOrRoute(String fltNo, String route) {
		DetachedCriteria query = createDetachedCriteriaWithFltNoOrRoute(fltNo, route)
				.setProjection(Projections.rowCount());
		List<Object> ans = (List<Object>) this.getHibernateTemplate().findByCriteria(query);
		return Integer.parseInt(ans.get(0).toString());
	}

	private DetachedCriteria createDetachedCriteriaWithFltNoOrRoute(String fltNo, String route) {
		// TODO Auto-generated method stub
		DetachedCriteria query = DetachedCriteria.forClass(Recode.class);
		if (fltNo != null && !fltNo.equals("")) {
			query.add(Restrictions.ilike("fltNo", fltNo, MatchMode.ANYWHERE));
		}
		if (route != null && !route.equals("")) {
			query.add(Restrictions.ilike("route", route, MatchMode.ANYWHERE));
		}
		return query;
	}

	@Override
	public Recode loadRecode(Integer recodeId) {
		return this.getHibernateTemplate().get(Recode.class, recodeId);
	}

	@Override
	public void deleteRecode(Recode recode) {
		this.getHibernateTemplate().delete(recode);
	}

	@Override
	public List<Recode> loadAllRecodes() {
		return this.getHibernateTemplate().loadAll(Recode.class);
	}

	@Override
	public void save(Recode recode) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(recode);
	}

}
