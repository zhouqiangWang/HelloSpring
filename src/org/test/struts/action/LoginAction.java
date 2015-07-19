package org.test.struts.action;

import org.test.struts.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private LoginService loginservice;
	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		System.out.println("action starting，，，，，");
		if(loginservice.isLogin(username, password)){
			return SUCCESS;
		}
		return INPUT;
	}
}
