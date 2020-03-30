package cn.test.test_07;

import java.util.TreeSet;

public class TressSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts = new TreeSet<Person>();
		
		Person p1 = new Person("tangsong", 20);
		Person p2 = new Person("jiapingwa", 25);
		Person p3 = new Person("zhangyimou", 66);
		Person p4 = new Person("xijinping", 26);
		Person p5 = new Person("yanni", 27);
		Person p6 = new Person("wenzhang", 30);
		Person p7 = new Person("tianliang", 28);
		Person p8 = new Person("xijinping", 26);
		
		// 添加元素
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		ts.add(p6);
		ts.add(p7);
		ts.add(p8);
		for (Person p : ts) {
			System.out.println(p.getName() + "---" + p.getAge());
		}
	}

}
