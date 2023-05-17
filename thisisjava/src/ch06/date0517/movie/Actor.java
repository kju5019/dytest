package ch06.date0517.movie;

public class Actor {
	String name;
	String sex;
	String birthdate;
	String nationality;

	
	public Actor(String name, String sex, String birthdate, String nationality) {
		this.name = name;
		this.sex = sex;
		this.birthdate = birthdate;
		this.nationality = nationality;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name);
		System.out.println("성별=" + sex);
		System.out.println("생년월일=" + birthdate);
		System.out.println("국적=" + nationality);
	}
	
}
