package com.airwxtx.authority.service;

import java.util.List;
import java.util.Set;

import com.airwxtx.authority.entity.Authority;

public interface AuthorityService {

	/**
	 * 加载所有权限
	 * 
	 * @return
	 */
	public List<Authority> loadAllAuthorities();

	/**
	 * 将权限编号变为权限描述
	 * 
	 * @param authorityNumbers
	 * @return
	 */
	public List<String> changeToDisplayAuthorities(Set<Long> authorityNumbers);

	/**
	 * 将权限编号变为权限描述
	 * 
	 * @param authority
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public List<String> changeToDisplayAuthorities(Long authority)
			throws IllegalArgumentException, IllegalAccessException;

	/**
	 * 将聚合的权限分解
	 * 
	 * @param authority
	 * @return
	 */
	public Set<Long> resolveAuthority(Long authority) throws IllegalArgumentException, IllegalAccessException;

}
