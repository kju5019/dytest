package ch05;

public class Truck extends Car {
	private int weight = 0;

	Truck(){
		System.out.println("Truck 생성자 호출");
	}
	
	Truck(int wheel, int speed, int weight) {
		super(wheel,speed);		
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return "Truck입니다.";
	}

	
	//Getter Setter
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setSpeed(int speed) {
		if(speed<=100) {
			super.setSpeed(speed);
			System.out.println("속도 적용 성공");
 		} else if(speed>100) {
			super.setSpeed(100);
			System.out.println("제한속도 100을 초과했습니다.");
		}
	}
	
	
}
