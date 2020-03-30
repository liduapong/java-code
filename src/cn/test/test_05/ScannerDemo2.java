package cn.test.test_05;
import java.util.Scanner;
public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int x = sc.nextInt();
		// int y = sc.nextInt();
		// System.out.println(x);
		// System.out.println(y);

		// String x = sc.nextLine();
		// String y = sc.nextLine();
		// System.out.println(x);
		// System.out.println(y);

		// String x = sc.nextLine();
		// int y = sc.nextInt();
		// System.out.println(x);
		// System.out.println(y);

		int x = sc.nextInt();
		
		sc = new Scanner(System.in);
		
		String y = sc.nextLine(); // 把回车换行给了这里
		System.out.println(x);
		System.out.println(y);
	}
}
