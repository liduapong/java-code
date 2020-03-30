package cn.test.test_07;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// 主要条件
				int num = s2.sum() - s1.sum();
				// 次要条件，一次比较语文成绩，数学成绩，英语成绩，姓名
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
						: num;
				return num2;
			}
		});
		System.out.println("学生录入开始");
		Scanner sc = new Scanner(System.in);
		// 5次
		for (int x = 1; x <= 5; x++) {
			// 录入学生信息
			System.out.println("请输入第" + x + "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩：");
			int chinese = Integer.parseInt(sc.nextLine());
			System.out.println("请输入第" + x + "个学生的数学成绩：");
			int math = Integer.parseInt(sc.nextLine());
			System.out.println("请输入第" + x + "个学生的英语成绩：");
			int english = Integer.parseInt(sc.nextLine());

			// 创建学生对象
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);

			// 添加到集合
			ts.add(s);
			
		}
		
		System.out.println("学生录入完毕");

		// 遍历集合
		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getChinese() + "---"
					+ s.getMath() + "---" + s.getEnglish());
		}
		
	}

}
