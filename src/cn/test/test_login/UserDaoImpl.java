package cn.test.test_login;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
	private static ArrayList<User> array = new ArrayList<User>();
	
	@Override
	public boolean isLogin(String userName, String passWord) {
		// TODO Auto-generated method stub
		boolean flog = false;
		for (User user : array) {
			if(user.getUserName().equals(userName) && user.getPassWord().equals(passWord)) {
				flog = true;
				break;
			}
		}
		return flog;
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		array.add(user);
		
	}
	
	
}
