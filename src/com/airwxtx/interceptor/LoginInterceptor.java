package com.airwxtx.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		if (invocation.getInvocationContext().getSession().containsKey("user")) {
			return invocation.invoke();
		} else {
			return LOGIN;
		}
	}

	private static final String LOGIN = "login";
}
