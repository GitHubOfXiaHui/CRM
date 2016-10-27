package com.airwxtx.user.service;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserService {
	/**
	 * 创建用户
	 * 
	 * @param user
	 * @param authorities
	 */
	void saveUser(User user, List<Long> authorities);

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @param autorities
	 */
	void updateUser(User user, List<Long> authorities);
	
	/**
	 * 修改用户
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * 根据用户名，查找用户
	 * 
	 * @param username
	 * @return
	 */
	User findUserByName(String username);

	/**
	 * 按用户名或密码分页查询用户
	 * 
	 * @param username
	 * @param role
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<User> findUserByNameOrRoleWithPage(String username, String role, int page, int pageSize);

	/**
	 * 统计拥有特定用户名或角色的用户数量
	 * 
	 * @param username
	 * @param role
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

}
