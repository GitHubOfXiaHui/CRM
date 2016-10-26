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
	int countMaxPage(int pageSize);
	
	/**
	 * �г������û�
	 * @return
	 */
	List<User> listAllUsers();

}
