package com.airwxtx.authority.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.airwxtx.authority.dao.AuthorityDao;
import com.airwxtx.authority.entity.Authority;
import com.airwxtx.utils.BaseDaoSupport;

@Repository
public class AuthorityDaoImpl extends BaseDaoSupport implements AuthorityDao {

	@Override
	public List<Authority> loadAllAuthorities() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().loadAll(Authority.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Authority> findAuthoritiesIn(Set<Long> authorityNumbers) {
		// TODO Auto-generated method stub
		String hql = "FROM Authority a WHERE a.authorityNumber IN :authorityNumbers";
		return (List<Authority>) getHibernateTemplate().findByNamedParam(hql, "authorityNumbers", authorityNumbers);
	}

}
