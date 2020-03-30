package cn.test.test_07;

import java.util.HashSet;
import java.util.Set;
// set 存储的值是惟一的   list可存储相同的

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("ee");
		set.add("aaaa");
		set.add("aaaa");
		set.add("qweq");
		
		for (String s : set) {
			System.out.println(s);
		}
	}

}
