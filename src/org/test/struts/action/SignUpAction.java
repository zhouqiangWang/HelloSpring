package org.test.struts.action;

import org.test.struts.service.SignUpService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SignUpAction extends ActionSupport {
	private SignUpService signUpService;
	public void setSignUpService(SignUpService signUpService) {
		this.signUpService = signUpService;
	}

	private String username;
	private String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("SignUpAction excute");
		int result = signUpService.signUp(username, password);
		System.out.println("SignUpAction done : result = "+result);
		if (result > 0) {
			return SUCCESS;
		}
		
		return ERROR;
	}
}
