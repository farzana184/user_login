package com.login.userlogin.dao;

import org.springframework.stereotype.Repository;

import com.login.userlogin.model.User;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return "Hello from DAO";
	}

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		return "User created" + user.getUsername();
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		return "User upated " + user.getUsername();
	}

	@Override
	public String deleteUser(String username) {
		// TODO Auto-generated method stub
		return "User deleted" + username;
	}

}
