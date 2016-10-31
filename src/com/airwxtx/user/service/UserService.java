package com.airwxtx.user.service;

import java.util.List;
import java.util.Set;

import com.airwxtx.user.entity.User;

public interface UserService {

	/**
	 * �����û�
	 * 
	 * @param user
	 * @param authorityNumbers
	 */
	public void createUser(User user, Set<Long> authorityNumbers);

	/**
	 * �༭�û�
	 * 
	 * @param user
	 * @param authorityNumbers
	 */
	public void editUser(User user, Set<Long> authorityNumbers);

	/**
	 * �����û����������û�
	 * 
	 * @param username
	 * @return
	 */
	public User findUserByName(String username);

	/**
	 * ���û����������ҳ��ѯ�û�
	 * 
	 * @param username
	 * @param role
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize);

	/**
	 * ͳ��ӵ���ض��û������ɫ���û�����
	 * 
	 * @param username
	 * @param role
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

	/**
	 * ˢ�¶���Ȩ��
	 */
	public void refreshFreeze();

	/**
	 * ����û����Ƿ����
	 * 
	 * @param username
	 * @return
	 */
	public boolean hasUsername(String username);

	/**
	 * ���ö�Ӧ�û�������
	 * 
	 * @param username
	 */
	public void resetPasswordByName(String username);

}
