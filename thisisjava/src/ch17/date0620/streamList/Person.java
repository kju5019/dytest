package ch17.date0620.streamList;
public class Person {

	private String name; // 이름
	private int age; // 나이

	// Constructor
	public Person() {
	}

	// region getter setter
	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//endregion
	
	public void printInfo() {
		System.out.print("이름=" + name);
		System.out.println(" | 나이=" + age);
	}

	@Override
	public String toString() {
		return name;
	}

}