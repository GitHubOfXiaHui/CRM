package com.airwxtx.settings.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.authority.service.AuthorityService;
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

	private String result;
	private String resultInfo;

	@Autowired
	private SettingsService settingsService;

	@Autowired
	private AuthorityService authorityService;

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
		}
	}

	@Override
	public String changePassword() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		settingsService.changePassword(username, newPassword);
		result = "success";
		resultInfo = "密码修改成功。";
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

	public List<String> getDisplayAuthorities() throws IllegalArgumentException, IllegalAccessException {
		return authorityService.changeToDisplayAuthorities(user.getAuthority());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}

	public SettingsService getSettingsService() {
		return settingsService;
	}

	public void setSettingsService(SettingsService settingsService) {
		this.settingsService = settingsService;
	}

	public AuthorityService getAuthorityService() {
		return authorityService;
	}

	public void setAuthorityService(AuthorityService authorityService) {
		this.authorityService = authorityService;
	}

	private static final String PROFILE = "profile";
	private static final String CHANGE_PASSWORD = "changePassword";
	private static final String EXIT = "exit";

}
