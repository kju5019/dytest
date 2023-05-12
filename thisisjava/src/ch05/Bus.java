package ch05;

public class Bus extends Car {
	private int seat;
	
	Bus(){
		super();
		System.out.println("Bus 생성자 호출");
	}
	
	//wheel 초기값, speed = 초기값, seat = 우리가 넣은 40
	Bus(int seat){		
		this.seat = seat;
	}
	
	Bus(int wheel, int speed){
		super(wheel,speed);
	}

	Bus(int wheel, int speed, int seat) {
		super(wheel,speed);
		this.seat = seat;
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
	
	@Override
	public void setSpeed(int speed) {
		if(speed<=120) {
			super.setSpeed(speed);
			System.out.println("속도 적용 성공");
 		} else {
			super.setSpeed(120);
			System.out.println("제한속도 120을 초과했습니다.");
		}
	}
	
	//다형성
	public void setWheel(int wheel) {
		super.setWheel(wheel*2);
	}

}
