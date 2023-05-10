package ch05;

public class Truck extends Car {
	private int weight = 0;

	Truck(){
		System.out.println("Truck 생성자 호출");
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
	
	
}
