package cn.test.test_05;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = new String();
//		System.out.println(s1);
//		System.out.println(s1.length());
//		System.out.println("-----------");
//		
//		byte[] bytes = {11,22,33,55,66};
//		String s2 = new String(bytes);
//		System.out.println(s2);
//		System.out.println(s2.length());
//		System.out.println("-----------");
//		
//		
//		String s3 = new String(bytes, 0, bytes.length);
//		System.out.println(s3);
//		System.out.println(s3.length());
//		System.out.println("-----------");
//		
//		char[] chs = { 'a', 'b', 'c', 'd', 'e', '林', '青', '霞' };
//		String s4 = new String(chs);
//		System.out.println("s4:" + s4);
//		System.out.println("s4.length():" + s4.length());
//		System.out.println("--------------------------");
//
//		// public String(char[] value,int index,int count):把字符数组的一部分转成字符串
//		// 需求：我要输出的字符串是:de林青
//		String s5 = new String(chs, 3, 4);
//		System.out.println("s5:" + s5);
//		System.out.println("s5.length():" + s5.length());
//		System.out.println("--------------------------");
//
//		// public String(String original):把字符串转成字符串
//		String s6 = new String("helloworld");
//		System.out.println("s6:" + s6);
//		System.out.println("s6.length():" + s6.length());
//		System.out.println("--------------------------");
//
//		// Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
//		String s7 = "helloworld";
//		System.out.println("s7:" + s7);
//		System.out.println("s7.length():" + s7.length());
		String s = "helloworld";

		// boolean equals(Object obj):比较字符串的内容是否相同，严格区分大小写
		System.out.println("equals():" + s.equals("helloworld"));
		System.out.println("equals():" + s.equals("HelloWorld"));
		// boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，不考虑大小写
				System.out.println("equalsIgnoreCase():"
						+ s.equalsIgnoreCase("helloworld"));
				System.out.println("equalsIgnoreCase():"
						+ s.equalsIgnoreCase("HelloWorld"));
				System.out.println("----------------------------------");
	}

}
