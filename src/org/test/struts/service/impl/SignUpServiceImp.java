package org.test.struts.service.impl;

import org.test.struts.dao.IUserDAO;
import org.test.struts.service.SignUpService;

public class SignUpServiceImp implements SignUpService {

	private IUserDAO userDAO;
	public IUserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public int signUp(String userName, String password) {
		
		return userDAO.signUp(userName, password);
	}

}
