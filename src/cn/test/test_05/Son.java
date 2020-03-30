package cn.test.test_05;
import cn.test.test_05.Father;
public class Son extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
//		f.show1();
		f.show2();
		f.show3();
		f.show4();
		
		Son s = new Son();
		//s.show();
		s.show2();
		s.show3();
		s.show4();
	}

}
