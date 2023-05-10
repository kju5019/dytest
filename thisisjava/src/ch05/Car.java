package ch05;

public class Car {
	private int wheel = 0;
	private int speed = 0;

	Car(){
		System.out.println("Car 생성자 호출");
	}
			
	Car(int wheel) {
		super();
		this.wheel = wheel;
	}
	Car(int wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}

	/*
	 * @Override public String toString() { return "Car입니다."; }
	 */
	
	//Getter Setter
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
