package cn.test.test_03;

public class AddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMathDemo demo = new MyMathDemo();
		
		System.out.println("jia"+demo.add(10, 20));
		System.out.println("jia"+demo.substract(10, 20));
	}

}
class MyMathDemo{
	public int add(int a, int b) {
		return a + b;
	} 
	
	public int substract(int a, int b) {
		return a - b;
	} 
	
	public int multiply(int a, int b) {
		return a / b;
	} 
	
	public int divide(int a, int b) {
		return a * b;
	} 
}