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
	 * ���û����������ҳ��ѯ�û�
	 * 
	 * @param username
	 * @param role
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize);

	/**
	 * ͳ���û�����
	 * 
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

}
