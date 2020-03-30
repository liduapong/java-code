package cn.test.test_05;

public class ReturnDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new personDemo().getPerson().study();
	}

}
interface Person{
	public abstract void study();
}

class Student implements Person {
	public void study() {
		System.out.println("好好学习天天向上");
	}
}
class personDemo{
	public Person getPerson() {
		return new Student();
	}
}