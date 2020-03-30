package cn.test.test_07;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hs = new HashSet<Person>();
		Person p1 = new Person("吕洞宾", 30);
		Person p2 = new Person("何仙姑", 22);
		Person p3 = new Person("曹国舅", 25);
		Person p4 = new Person("铁拐李", 35);
		Person p5 = new Person("张果老", 33);
		Person p6 = new Person("蓝采和", 22);
		Person p7 = new Person("何仙姑", 22);
		Person p8 = new Person("铁拐李", 18);
		Person p9 = new Person("铁拐李", 18);
		hs.add(p1);
		// hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		hs.add(p6);
		hs.add(p7);
		hs.add(p8);hs.add(p9);
		
		for (Person p : hs) {
			System.out.println(p.getAge()+"  "+p.getName());
		}
	}	

}
