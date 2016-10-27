package com.airwxtx.interceptor;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airwxtx.authority.entity.AuthorityNumber;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
@Component
public class AuthorityInterceptor extends AbstractInterceptor {

	@Autowired
	private UserService userService;

	@SuppressWarnings("unchecked")
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Set<String>> authority = (Map<String, Set<String>>) invocation.getInvocationContext()
				.getApplication().getOrDefault("authority", new HashMap<>());
		String username = (String) invocation.getInvocationContext().getSession().get("user");
		//全局权限表是否包含当前用户
		if (!authority.containsKey(username)) {
			Set<String> userAuthority = getUserAuthority(username);
			authority.put(username, userAuthority);
			invocation.getInvocationContext().getApplication().put("authority", authority);
		}
		return invocation.invoke();
	}

	private Set<String> getUserAuthority(String username) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		User user = userService.findUserByName(username);
		Set<String> authority = new HashSet<>();
		Field[] fields = AuthorityNumber.class.getFields();
		for (Field field : fields) {
			if ((user.getAuthority() & field.getLong(null)) != 0) {
				authority.add(field.getName());
			}
		}
		return authority;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
