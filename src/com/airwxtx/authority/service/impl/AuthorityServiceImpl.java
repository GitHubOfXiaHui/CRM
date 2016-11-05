package com.airwxtx.authority.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.airwxtx.authority.entity.Authority;
import com.airwxtx.authority.service.AuthorityService;
import com.airwxtx.utils.Constants;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Override
	public List<String> changeToDisplayAuthorities(Long authorities)
			throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		List<String> displayAuthorities = new ArrayList<>();
		for (Authority authority : Constants.ALL_AUTHORITIES) {
			if ((authority.getAuthorityNumber() & authorities) != 0) {
				displayAuthorities.add(authority.getDescription());
			}
		}
		return displayAuthorities;
	}

	@Override
	public List<String> changeToDisplayAuthorities(Set<Long> authorityNumbers) {
		// TODO Auto-generated method stub
		List<String> displayAuthorities = new ArrayList<>();
		for (Authority authority : Constants.ALL_AUTHORITIES) {
			if (authorityNumbers.contains(authority.getAuthorityNumber())) {
				displayAuthorities.add(authority.getDescription());
			}
		}
		return displayAuthorities;
	}

	@Override
	public Set<Long> resolveAuthority(Long authorities) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Set<Long> authorityNumbers = new HashSet<>();
		for (Authority authority : Constants.ALL_AUTHORITIES) {
			if ((authority.getAuthorityNumber() & authorities) != 0) {
				authorityNumbers.add(authority.getAuthorityNumber());
			}
		}
		return authorityNumbers;
	}

	@Override
	public List<Authority> loadAllAuthorities() {
		// TODO Auto-generated method stub
		return Constants.ALL_AUTHORITIES;
	}

}
