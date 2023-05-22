package ch07.date0522;


public class Person {

	private String name;// 이름
	private int age; // 나이
	
	//생성자
	public Person() {
		System.out.println("Person() 기본생성자");
	}
	
	public Person(int age) {
		System.out.println("Person(int age)");
		this.age = age;
	}

	public Person(String name) {
		System.out.println("Person(String name)");
		this.name = name;
	}

	public Person(String name, int age) {
		System.out.println("Person(String name, int age)");
		this.name = name;
		this.age = age;
	}

	
	//Getter Setter
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

	
	public void printInfo() {
		System.out.print("Person.printInfo() : ");
		System.out.print("이름:  " + name);
		System.out.println(" | 나이:  " + age);
		
	}

}