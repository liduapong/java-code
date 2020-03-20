package cn.test.test_03;
// 构造函数的例子
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();

		s.setName("linggg");
		s.setAge(29);
		s.show();
				
	}

}

class Student {
	private String name;
	private int age;
	public Student() {}
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println("姓名是："+name+"年龄是"+age);
	}
}
