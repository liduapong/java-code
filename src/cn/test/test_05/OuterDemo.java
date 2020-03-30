package cn.test.test_05;
/*
按照要求，补齐代码
	interface Inter { void show(); }
	class Outer { //补齐代码 }
	class OuterDemo {
	    public static void main(String[] args) {
		      Outer.method().show();
		  }
	}
要求在控制台输出”HelloWorld”
*/

class OuterDemo {
    public static void main(String[] args) {
	      Outer.method().show();
	  }
}
class Outer { //补齐代码 }
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("hello world");
			}
		};
	}
}

interface Inter { void show(); }

