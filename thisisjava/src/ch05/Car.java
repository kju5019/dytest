package ch05;

public class Car {
	private int wheel;
	private int speed;

	Car(){
		System.out.println("Car 생성자 호출");
	}
			
	Car(int wheel) {
		this.wheel = wheel;
	}
	
	Car(int wheel, int speed) {
		setWheel(wheel);
		setSpeed(speed);
	}


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
