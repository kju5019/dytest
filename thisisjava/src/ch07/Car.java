package ch07;

public class Car {
	static String company = "현대자동차";
	private int wheel;
	private int speed;
	
	//생성자
	//bus, bus1
	Car(){
		System.out.println("Car(부모) 생성자 호출");
	}
	
	//bus2, bus4
	Car(int wheel, int speed){
		this.wheel = wheel;
		this.speed = speed;
	}
		
	
	//getter와 setter
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
