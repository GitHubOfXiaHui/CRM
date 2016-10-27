package com.airwxtx.user.dao;

import java.util.List;

import com.airwxtx.user.entity.User;

public interface UserDao {

	/**
	 * 根据用户名查找用户
	 * 
	 * @param username
	 * @return
	 */
	List<User> findByUsername(String username);

	/**
	 * 创建用户
	 * 
	 * @param user
	 */
	Integer saveUser(User user);

	/**
	 * 更新用户
	 * 
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * 通过用户id加载用户
	 * 
	 * @param userId
	 * @return
	 */
	User userDetials(Integer userId);

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
	 * 统计用户数量
	 * 
	 * @return
	 */
	public int countUserWithNameOrRole(String username, String role);

}
