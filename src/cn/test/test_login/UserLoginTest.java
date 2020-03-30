package cn.test.test_login;

import java.util.ArrayList;
import java.util.Scanner;

public class UserLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------欢迎光临------------");
		System.out.println("1 登录");
		System.out.println("2 注册");
		System.out.println("3 退出");
		System.out.println("请选择：");
		while(true) {
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			
			UserDao ud = new UserDaoImpl();
			
			switch (choiceString) {
			case "1":
				System.out.println("-----------登录界面------------");
				// 键盘录入用户名和密码
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入密码：");
				String password = sc.nextLine();
				
				boolean flag = ud.isLogin(username, password);
				if(flag) {
					System.out.println("登陆成功");
				}else {
					System.out.println("登录失败");
				}
				break;
			case "2":
				System.out.println("-----------注册界面------------");
				// 键盘录入用户名和密码
				System.out.println("请输入用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码：");
				String newPassword = sc.nextLine();
				// 调用功能
				// UserDao ud = new UserDaoImpl();
				// 把数据封装到对象中
				// User user = new User(newUsername, newPassword);
				User user1 = new User();
				user1.setUserName(newUsername);
				user1.setPassWord(newPassword);

				ud.regist(user1);
				System.out.println("注册成功,回到选择界面");
				break;
			case "3":
			default:
				System.out.println("谢谢光临，欢迎再来");
				System.exit(0);
				break;
			}
			
		}
		
		
	}

}
