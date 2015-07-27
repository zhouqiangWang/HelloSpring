
package org.test.struts.dao;

/**
 * @author Administrator
 *
 */
public interface IUserDAO {

	public boolean checkUser(String username,String password);
	
	public boolean checkUsernameRepeat(String username);
	
	public int signUp(String userName, String password);

}
