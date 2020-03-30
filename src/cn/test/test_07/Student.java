package cn.test.test_07;

public class Student {
	private String name;
	private int math;
	private int english;
	private int chinese;
	/**
	 * @param name
	 * @param math
	 * @param english
	 * @param chinese
	 */
	public Student() {
		super();
		
	}
	public Student(String name, int math, int english, int chinese) {
		this.name = name;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int sum() {
		return chinese+math+english;
	}
}
