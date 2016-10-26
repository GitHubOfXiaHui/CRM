package com.airwxtx.user.dao;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserDao {

	/**
	 * �����û��������û�
	 * 
	 * @param username
	 * @return
	 */
	List<User> findByUsername(String username);

	/**
	 * �����û�
	 * 
	 * @param user
	 */
	Integer saveUser(User user);

	/**
	 * �����û�
	 * 
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * ͨ���û�id�����û�
	 * 
	 * @param userId
	 * @return
	 */
	User userDetials(Integer userId);

	/**
	 * �����û�����ҳ��
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<User> findUserWithPage(int page, int pageSize);

	/**
	 * ͳ���û�����
	 * 
	 * @return
	 */
	int countUser();
	
	/**
	 * �г������û�
	 * @return
	 */
	List<User> listAllUsers();

}
