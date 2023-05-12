package ch05;

public class Sedan extends Car {
	private String roof;

	Sedan(){
		System.out.println("Sedan 생성자 호출");
	}
	
	Sedan(int wheel, int speed, String roof) {
		super(wheel,speed);	
		this.roof = roof;
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
		
	public void setSpeed(int speed) {
		if(speed<=200) {
			super.setSpeed(speed);
			System.out.println("속도 적용 성공");
 		} else if(speed>200) {
			super.setSpeed(200);
			System.out.println("제한속도 200을 초과했습니다.");
		}
	}
	
}
