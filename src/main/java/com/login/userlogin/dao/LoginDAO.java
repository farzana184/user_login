package com.login.userlogin.dao;

import com.login.userlogin.model.User;

public interface LoginDAO {
	public String getUser();
	public String createUser(User user);
	public String updateUser(User user);
	public String deleteUser(String username);
}
