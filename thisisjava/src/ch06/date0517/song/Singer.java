package ch06.date0517.song;

public class Singer {
	private String name;
	private char sex;
	private String birthDate;
	private String company;

	public Singer(String name, char sex, String birthDate, String company) {
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.company = company;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name);
		
/*		if(sex=='M')
			System.out.println("성별=남");
		else if(sex == 'F')
			System.out.println("성별=여");*/
		String s = "";
		if(sex=='M') s="남";
		else if(sex == 'F') s="여";
		System.out.println("성별="+s);
			
		System.out.println("생년월일=" + birthDate);
		System.out.println("소속사=" + company);
	}
}
