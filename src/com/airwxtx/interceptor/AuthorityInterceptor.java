package com.airwxtx.interceptor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airwxtx.authority.service.AuthorityService;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
@Component
public class AuthorityInterceptor extends AbstractInterceptor {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthorityService authorityService;

	@SuppressWarnings("unchecked")
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Set<Long>> authority = (Map<String, Set<Long>>) invocation.getInvocationContext().getApplication()
				.getOrDefault("authority", new HashMap<>());
		String username = (String) invocation.getInvocationContext().getSession().get("user");
		// 全局权限表是否包含当前用户
		if (!authority.containsKey(username)) {
			Set<Long> userAuthority = getUserAuthority(username);
			authority.put(username, userAuthority);
			invocation.getInvocationContext().getApplication().put("authority", authority);
		}
		return invocation.invoke();
	}

	private Set<Long> getUserAuthority(String username) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		User user = userService.findUserByName(username);
		return authorityService.resolveAuthority(user.getAuthority());
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public AuthorityService getAuthorityService() {
		return authorityService;
	}

	public void setAuthorityService(AuthorityService authorityService) {
		this.authorityService = authorityService;
	}

}
