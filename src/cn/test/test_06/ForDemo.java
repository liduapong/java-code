package cn.test.test_06;

import java.util.ArrayList;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		for (int x : arr) {
			System.out.println(x);
		}
		
		String[] strArr = {"aa","bb","rr"};
		for (String ss : strArr) {
			System.out.println(ss);
		}
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("www");
		array.add("wwwe");
		array.add("eqeqe");
		for (String s :array) {
			System.out.println(s);
		}
	}

}
