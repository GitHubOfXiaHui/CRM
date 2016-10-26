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
	 * 查找用户（分页）
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<User> findUserWithPage(int page, int pageSize);

	/**
	 * 统计用户数量
	 * 
	 * @return
	 */
	int countMaxPage(int pageSize);
	
	/**
	 * 列出所有用户
	 * @return
	 */
	List<User> listAllUsers();

}
