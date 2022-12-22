package com.login.userlogin.controller;

import com.login.userlogin.model.User;

public interface LoginController {
	public String getUser();
	public String createUser(User user);
	public String updateUser(User user);
	public String deleteUser(String username);
}
