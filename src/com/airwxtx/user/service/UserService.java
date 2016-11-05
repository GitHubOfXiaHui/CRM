package com.airwxtx.user.service;

import java.util.List;
import java.util.Set;

import com.airwxtx.user.entity.User;

public interface UserService {

	/**
	 * 验证用户是否合法
	 * 
	 * @param user
	 * @return
	 */
	public boolean canLogin(User user);

	/**
	 * 创建用户
	 * 
	 * @param user
	 * @param authorityNumbers
	 */
	public void saveUser(User user, Set<Long> authorityNumbers);

	/**
	 * 编辑用户
	 * 
	 * @param user
	 * @param authorityNumbers
	 */
	public void updateUser(User user, Set<Long> authorityNumbers);

	/**
	 * 根据用户名，查找用户
	 * 
	 * @param username
	 * @return
	 */
	public User findUserByName(String username);

	/**
	 * 按用户名或密码分页查询用户
	 * 
	 * @param username
	 * @param role
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize);

	/**
	 * 统计拥有特定用户名或角色的用户数量
	 * 
	 * @param username
	 * @param role
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

	/**
	 * 刷新冻结权限
	 */
	public void refreshFreeze();

	/**
	 * 检查用户名是否存在
	 * 
	 * @param username
	 * @return
	 */
	public boolean hasUsername(String username);

	/**
	 * 修改对应用户的密码
	 * 
	 * @param username
	 * @param newPassword
	 */
	public void updatePasswordWithUsername(String username, String newPassword);

}
