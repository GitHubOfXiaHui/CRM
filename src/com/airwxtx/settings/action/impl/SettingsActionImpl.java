package com.airwxtx.settings.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.airwxtx.authority.service.AuthorityService;
import com.airwxtx.settings.action.SettingsAction;
import com.airwxtx.user.entity.User;
import com.airwxtx.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("settingsAction")
@Scope("prototype")
public class SettingsActionImpl extends ActionSupport implements SettingsAction {

	// 个人信息
	private User user;
	private List<String> displayAuthorities;

	// 修改密码
	private String oldPassword;
	private String newPassword;
	private String confirmPassword;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthorityService authorityService;

	@Override
	public String profile() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		user = userService.findUserByName(username);
		displayAuthorities = authorityService.changeToDisplayAuthorities(user.getAuthority());
		return PROFILE;
	}

	@Override
	public String preChangePassword() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}

	public void validateChangePassword() throws Exception {
		String username = (String) ActionContext.getContext().getSession().get("user");
		User user = userService.findUserByName(username);
		if (!oldPassword.equals(user.getPassword())) {
			this.addFieldError("oldPassword", "原密码错误");
		}
	}

	@Override
	public String changePassword() throws Exception {
		// TODO Auto-generated method stub
		String username = (String) ActionContext.getContext().getSession().get("user");
		userService.updatePasswordWithUsername(username, newPassword);
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

	public List<String> getDisplayAuthorities() {
		return displayAuthorities;
	}

	public void setDisplayAuthorities(List<String> displayAuthorities) {
		this.displayAuthorities = displayAuthorities;
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

	private static final String PROFILE = "profile";
	private static final String CHANGE_PASSWORD = "changePassword";
	private static final String EXIT = "exit";

}
