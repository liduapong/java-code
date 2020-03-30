package cn.test.test_07;

public class Person implements Comparable<Person>{
	private int age;
	private String name;
	/**
	 * @param age
	 * @param name
	 */
	public Person() {
		super();

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Person p) {
		int num = this.age - p.age;
		System.out.println(this.age+" :"+p.age+".."+this.name.compareTo(p.name));
		System.out.println("---------");
		int num2 = (num == 0)? (this.name.compareTo(p.name)) : num;
		System.out.println(num2);
		return num2;
	} 
}
