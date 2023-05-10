package ch05;

public class Sedan extends Car {
	private String roof;

	Sedan(){
		System.out.println("Sedan 생성자 호출");
	}
	
	@Override
	public String toString() {
		return "Sedan입니다.";
	}

	
	
	//Getter Setter
	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}
	
	
	
	
}
