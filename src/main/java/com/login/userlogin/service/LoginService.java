package com.login.userlogin.service;

import com.login.userlogin.model.User;

public interface LoginService {
	public String getUser();
	public String createUser(User user);
	public String updateUser(User user);
	public String deleteUser(String username);
}
