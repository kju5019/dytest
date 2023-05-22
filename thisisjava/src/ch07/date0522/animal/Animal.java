package ch07.date0522.animal;

public class Animal {
	private String variety;
	private String name;
	private int age;
	private String sex;
	
	public Animal() {}
	
	public Animal(String variety, String name, int age, String sex) {
		setVariety(variety);
		setName(name);
		setAge(age);
		setSex(sex);
	}
	public Animal(String name, int age, String sex) {
		setName(name);
		setAge(age);
		setSex(sex);
	}
	
		
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex2) {
		this.sex = sex2;
	}
	
	
	public void printInfo() {
		String s = switch(sex) {
		case "F" -> "여";
		case "M" -> "남";
		default -> "";
		};
		System.out.println("\n===== Animal Info =====");
		System.out.println("동물: "+ variety + " | 이름: "+ name + " | 나이: "+ age + " | 성별: "+ s);
	}
	
	

}
