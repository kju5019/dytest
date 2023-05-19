package ch05.date0518.movie1;

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
		System.out.print("이름=" + name);
		System.out.print(" | 성별=" + sex);
		System.out.print(" | 생년월일=" + birthdate);
		System.out.println(" | 국적=" + nationality);
	}
	
}
