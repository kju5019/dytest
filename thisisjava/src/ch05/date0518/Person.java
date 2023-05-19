package ch05.date0518;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public void printInfo() {
		System.out.println("이름: "+name+" | 나이: "+age);
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

	
}
