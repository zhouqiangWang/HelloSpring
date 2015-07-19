package org.test.struts.service.impl;

import org.test.struts.dao.IUserDAO;
import org.test.struts.service.LoginService;

public class LoginServiceImpl implements LoginService {
	private IUserDAO userDAO;
	public IUserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public boolean isLogin(String username, String password) {
		System.out.println("service starting，，，，，");
		boolean flag = false;
		if (userDAO.checkUser(username, password)) {
			flag = true;
		}
		return flag;
	}
}

