package ch05;

public class Bus extends Car {
	private int seat = 0;
	


	Bus(){
		System.out.println("Bus 생성자 호출");
	}
	
	Bus(int wheel, int speed) {
		setWheel(wheel);
		setSpeed(speed);
	}
	
	@Override
	public String toString() {
		return "Bus입니다.";
	}

	
	//Getter Setter
	public int getSeat() {
		return seat;
	}
		
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public void setSpeed(int speed) {
		if(speed<=120) {
			super.setSpeed(speed);
			System.out.println("속도 적용 성공");
 		} else if(speed>120) {
			super.setSpeed(120);
			System.out.println("제한속도 120을 초과했습니다.");
		}

	}

}
