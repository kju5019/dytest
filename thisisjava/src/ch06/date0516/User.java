package ch06.date0516;

public class User {
	private String name;
	private int age;
	private float height;
	private char sex;
	private boolean marry;
	
	User(){}
	User(String name, int age, char sex){
		setName(name);
		setAge(age);
		setSex(sex);
	}
	User(String name, int age, char sex, float height, boolean marry){
		setName(name);
		setAge(age);	
		setSex(sex);
		setHeight(height);
		setMarry(marry);
	}
	
	public void printInfo() {
		System.out.println("\n===== User Info=====");
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		
		if(sex == 'M')
			System.out.println("성별: 남");
		else if (sex == 'W')
			System.out.println("성별: 여");
		
		System.out.println("키: "+ height);
		
		if(marry)
			System.out.println("결혼 여부: 기혼");
		else
			System.out.println("결혼 여부: 미혼");
			
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	
	

}
