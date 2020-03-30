package cn.test.test_05;

public class ReturrnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = new Demo().sum(1, 2);
		System.out.println(x);
	}

}
class Demo{
	public int sum(int a,int b) {
		return a+b;
	}
}
