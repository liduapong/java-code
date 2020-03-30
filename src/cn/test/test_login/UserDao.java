package cn.test.test_login;

public interface UserDao {
	public abstract boolean isLogin(String userName, String passWord);
	
	public abstract void regist(User user);
}
