package cn.test.test_04;

public class Extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi = new Zi();
		//zi.show();
		zi.show2();
		Fu fu = new Fu();
		
		System.out.println();
		System.out.println(fu.num2);
	}

}
class Fu{
	private int num = 100;
	public int num2 = 200;
	
	private void show() {
		System.out.println("show1");
	}
	
	public void show2() {
		System.out.println("show2");
	}
}
class Zi extends Fu{
	
}