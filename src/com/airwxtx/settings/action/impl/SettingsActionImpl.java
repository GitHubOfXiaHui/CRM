package com.airwxtx.settings.action.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.settings.action.SettingsAction;
import com.airwxtx.settings.service.SettingsService;
import com.airwxtx.user.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("settingsAction")
@Scope("prototype")
public class SettingsActionImpl extends ActionSupport implements SettingsAction {

	// ”√ªß
	private User user;
	
	@Autowired
	private SettingsService settingsService;
	
	@Override
	public String profile() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		user = settingsService.findUser(username);
		return PROFILE;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SettingsService getSettingsService() {
		return settingsService;
	}

	public void setSettingsService(SettingsService settingsService) {
		this.settingsService = settingsService;
	}

	private static final String PROFILE = "profile";
}
