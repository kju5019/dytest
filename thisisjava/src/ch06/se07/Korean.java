package ch06.se07;

public class Korean {
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자 오버로딩
	Korean(){}
	
	Korean(String nation) {
		this.nation = nation;
	}
	
	Korean(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	
	
	Korean(String nation, String name, String ssn) {
		super();
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;			//this.멤버변수 = 매개변수
	}
	


}
