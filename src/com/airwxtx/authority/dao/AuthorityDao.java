package com.airwxtx.authority.dao;

import java.util.List;
import java.util.Set;

import com.airwxtx.authority.entity.Authority;

public interface AuthorityDao {

	/**
	 * ��������Ȩ��
	 * 
	 * @return
	 */
	public List<Authority> loadAllAuthorities();

	/**
	 * ѡ��������Χ�ڵ�Ȩ��
	 * 
	 * @param authorityNumbers
	 * @return
	 */
	public List<Authority> findAuthoritiesIn(Set<Long> authorityNumbers);
}
