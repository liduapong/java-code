package cn.test.test_06;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyDay {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月：");
		String s = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date d = sdf.parse(s);
		
		long myTime = d.getTime();
		long time = System.currentTimeMillis();
				
		long dateTime = time - myTime;
		System.out.println("你已经在这个世界上待了"+dateTime/1000/60/60/24+"天了");
	}

}
