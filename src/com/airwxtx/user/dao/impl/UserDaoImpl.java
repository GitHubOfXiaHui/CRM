package com.airwxtx.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.airwxtx.user.dao.UserDao;
import com.airwxtx.user.entity.User;
import com.airwxtx.utils.BaseDaoSupport;

@Repository
public class UserDaoImpl extends BaseDaoSupport implements UserDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		String hql = "FROM User u WHERE u.username = :username";
		return (List<User>) this.getHibernateTemplate().findByNamedParam(hql, "username", username);
	}

}
