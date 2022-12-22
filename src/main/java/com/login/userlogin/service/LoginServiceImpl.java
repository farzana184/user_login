package com.login.userlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.userlogin.dao.LoginDAO;
import com.login.userlogin.model.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO loginDAO ;
	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return loginDAO.getUser();
	}
	public String createUser(User user) {
		// TODO Auto-generated method stubS
		return loginDAO.createUser(user);
	}
	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		return loginDAO.updateUser(user);
	}
	@Override
	public String deleteUser(String username) {
		// TODO Auto-generated method stub
		return loginDAO.deleteUser(username);
	}
}
