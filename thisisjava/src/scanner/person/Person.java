package scanner.person;

import lombok.Data;

@Data
public class Person {
	private String id;	
	private String name;	
	private int age;
	private String sex;
	
	
	public Person(String id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	
	
	
	public void printInfo() {
		String s = "";
		if(sex.equals("F")) s = "여";
		else if(sex.equals("M")) s = "남";
		System.out.println("아이디: " + id + " | 이름: " + name
							+ " | 나이: " + age +" | " + s);
		
	}






}
