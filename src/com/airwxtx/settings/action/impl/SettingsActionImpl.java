package com.airwxtx.settings.action.impl;

import java.util.HashMap;
import java.util.Map;

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

	// 用户
	private User user;

	// 修改密码
	private String oldPassword;
	private String newPassword;
	private String confirmPassword;

	private Map<String, Object> jsonResult = new HashMap<>();

	@Autowired
	private SettingsService settingsService;

	@Override
	public String profile() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		user = settingsService.findUser(username);
		return PROFILE;
	}

	@Override
	public String preChangePassword() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}

	public void validateChangePassword() throws Exception {
		String username = (String) ActionContext.getContext().getSession().get("user");
		User user = settingsService.findUser(username);
		if (!oldPassword.equals(user.getPassword())) {
			this.addFieldError("oldPassword", "原密码错误");
			oldPassword = "";
			newPassword = "";
			confirmPassword = "";
		}
	}

	@Override
	public String changePassword() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		settingsService.changePassword(username, newPassword);
		jsonResult.put("resultInfo", "修改成功");
		return CHANGE_PASSWORD;
	}

	@Override
	public String exit() throws Exception {
		// TODO Auto-generated method stub
		// 删除登录用户
		ActionContext.getContext().getSession().remove("user");
		// 回到登录页面
		return EXIT;
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

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Map<String, Object> getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(Map<String, Object> jsonResult) {
		this.jsonResult = jsonResult;
	}

	private static final String PROFILE = "profile";
	private static final String CHANGE_PASSWORD = "changePassword";
	private static final String EXIT = "exit";

}
