package com.airwxtx.user.service;

import java.util.List;
import java.util.Set;

import com.airwxtx.user.entity.User;

public interface UserService {

	/**
	 * ��֤�û��Ƿ�Ϸ�
	 * 
	 * @param user
	 * @return
	 */
	public boolean canLogin(User user);

	/**
	 * �����û�
	 * 
	 * @param user
	 * @param authorityNumbers
	 */
	public void saveUser(User user, Set<Long> authorityNumbers);

	/**
	 * �༭�û�
	 * 
	 * @param user
	 * @param authorityNumbers
	 */
	public void updateUser(User user, Set<Long> authorityNumbers);

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
	 * �޸Ķ�Ӧ�û�������
	 * 
	 * @param username
	 * @param newPassword
	 */
	public void updatePasswordWithUsername(String username, String newPassword);

}
