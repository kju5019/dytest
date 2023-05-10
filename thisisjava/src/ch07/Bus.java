package ch07;

public class Bus extends Car{
	private int seat = 0;
	
	//생성자
	//bus
	Bus(){
		System.out.println("Bus(자식) 생성자 호출");
	}
	
	//bus1
	Bus(int seat) {
		this.seat = seat;
	}
	
	//bus3
	Bus(int wheel, int speed){
		super(wheel,speed);
	}
	
	//bus4
	Bus(int wheel, int speed, int seat){
		super(wheel,speed);
		this.seat = seat;
	}

	
	//getter와 setter
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	

}
