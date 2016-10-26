package com.airwxtx.user.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
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

	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return (Integer) this.getHibernateTemplate().save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public User userDetials(Integer userId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().load(User.class, userId);
	}

	@Override
	public List<User> findUserWithPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().execute(new HibernateCallback<List<User>>() {

			@SuppressWarnings("unchecked")
			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("FROM User");
				query.setFirstResult((page - 1) * pageSize);
				query.setMaxResults(pageSize);
				return (List<User>) query.list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countUser() {
		// TODO Auto-generated method stub
		String hql = "SELECT COUNT(*) FROM User";
		List<Object> ans = (List<Object>) this.getHibernateTemplate().find(hql);
		return Integer.parseInt(ans.get(0).toString());
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().loadAll(User.class);
	}

}
