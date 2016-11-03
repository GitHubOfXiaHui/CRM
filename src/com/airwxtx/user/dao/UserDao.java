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
	public List<User> findUserByName(String username);

	/**
	 * �����û�
	 * 
	 * @param user
	 */
	public void saveOrUpdateUser(User user);

	/**
	 * ���û������ɫ��ҳ��ѯ�û�
	 * 
	 * @param username
	 * @param role
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize);

	/**
	 * ͳ���û�����
	 * 
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

	/**
	 * ˢ�¶���Ȩ��
	 */
	public void refreshFreeze();

	/**
	 * ���ö�Ӧ�û�������
	 * 
	 * @param username
	 */
	public void resetPasswordByName(String username);

	/**
	 * 
	 * @param username
	 * @return
	 */
	public int findUserFreezeCount(String username);

}
