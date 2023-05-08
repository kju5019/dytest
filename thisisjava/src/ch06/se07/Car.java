package ch06.se07;

public class Car {
	String company = "볼보";
	String model = "s90";
	String color = "white";
	int maxSpeed = 350;
	int speed = 0;
	
	
	Car() {}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String company, String model, String color, int maxSpeed, int speed) {		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
}
