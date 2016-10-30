package com.airwxtx.authority.dao;

import java.util.List;
import java.util.Set;

import com.airwxtx.authority.entity.Authority;

public interface AuthorityDao {

	/**
	 * 加载所有权限
	 * 
	 * @return
	 */
	public List<Authority> loadAllAuthorities();

	/**
	 * 选出参数范围内的权限
	 * 
	 * @param authorityNumbers
	 * @return
	 */
	public List<Authority> findAuthoritiesIn(Set<Long> authorityNumbers);
}
