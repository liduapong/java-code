package cn.test.test_05;
import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x<3;x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("用户名:");
			String name = sc.nextLine();
			System.out.println("密码");
			String pwd = sc.nextLine();
			
			if("admin".equals(name)&&"admin".equals(pwd)) {
				System.out.println("登陆成功");
				break;
			} else {
				if(2-x == 0) {
					System.out.println("zhanghaomimasuoding ");
				}else {
					System.out.println("haiyou"+(2-x)+"jihui");
				}
			}
		}
	}

}
