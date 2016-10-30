package com.airwxtx.authority.service;

import java.util.List;
import java.util.Set;

import com.airwxtx.authority.entity.Authority;

public interface AuthorityService {

	/**
	 * ��������Ȩ��
	 * 
	 * @return
	 */
	public List<Authority> loadAllAuthorities();

	/**
	 * ��Ȩ�ޱ�ű�ΪȨ������
	 * 
	 * @param authorityNumbers
	 * @return
	 */
	public List<String> changeToDisplayAuthorities(Set<Long> authorityNumbers);

	/**
	 * ��Ȩ�ޱ�ű�ΪȨ������
	 * 
	 * @param authority
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public List<String> changeToDisplayAuthorities(Long authority)
			throws IllegalArgumentException, IllegalAccessException;

	/**
	 * ���ۺϵ�Ȩ�޷ֽ�
	 * 
	 * @param authority
	 * @return
	 */
	public Set<Long> resolveAuthority(Long authority) throws IllegalArgumentException, IllegalAccessException;

}
