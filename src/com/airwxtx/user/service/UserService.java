package com.airwxtx.user.service;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserService {
	/**
	 * �����û�
	 * 
	 * @param user
	 * @param authorities
	 */
	void saveUser(User user, List<Long> authorities);

	/**
	 * �޸��û�
	 * 
	 * @param user
	 * @param autorities
	 */
	void updateUser(User user, List<Long> authorities);
	
	/**
	 * �޸��û�
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * �����û����������û�
	 * 
	 * @param username
	 * @return
	 */
	User findUserByName(String username);

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
	 * ͳ��ӵ���ض��û������ɫ���û�����
	 * 
	 * @param username
	 * @param role
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

}
