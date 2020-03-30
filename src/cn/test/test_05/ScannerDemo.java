package cn.test.test_05;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		
		if (sc.hasNextInt()) {
			int number = sc.nextInt();
			System.out.println(number);
		}
		
		System.out.println("over");
	}

}
