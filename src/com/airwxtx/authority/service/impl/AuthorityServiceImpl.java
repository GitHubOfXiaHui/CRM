package com.airwxtx.authority.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airwxtx.authority.dao.AuthorityDao;
import com.airwxtx.authority.entity.Authority;
import com.airwxtx.authority.entity.AuthorityNumber;
import com.airwxtx.authority.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;

	@Override
	public List<String> changeToDisplayAuthorities(Set<Long> authorityNumbers) {
		// TODO Auto-generated method stub
		List<Authority> authorities = authorityDao.findAuthoritiesIn(authorityNumbers);
		List<String> descriptions = new ArrayList<>();
		for (Authority authority : authorities) {
			descriptions.add(authority.getDescription());
		}
		return descriptions;
	}

	@Override
	public List<String> changeToDisplayAuthorities(Long authorities)
			throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Set<Long> authorityNumbers = resolveAuthority(authorities);

		return changeToDisplayAuthorities(authorityNumbers);
	}

	@Override
	public Set<Long> resolveAuthority(Long authority) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Set<Long> authorityNumbers = new HashSet<>();

		Field[] fields = AuthorityNumber.class.getFields();
		for (Field field : fields) {
			if ((authority & field.getLong(null)) != 0) {
				authorityNumbers.add(field.getLong(null));
			}
		}
		return authorityNumbers;
	}

	@Override
	public List<Authority> loadAllAuthorities() {
		// TODO Auto-generated method stub
		return authorityDao.loadAllAuthorities();
	}

	public AuthorityDao getAuthorityDao() {
		return authorityDao;
	}

	public void setAuthorityDao(AuthorityDao authorityDao) {
		this.authorityDao = authorityDao;
	}

}
