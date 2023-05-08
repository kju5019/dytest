package ch06.se07;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car("BMW","X6","Black",300,0);
		Car yourCar2 = new Car("s40");
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		System.out.println("--------------------");
		
		
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		System.out.println("--------------------");
		

		System.out.println(yourCar2.company);
		System.out.println(yourCar2.model);
		System.out.println(yourCar2.color);
		System.out.println(yourCar2.maxSpeed);
		System.out.println(yourCar2.speed);

		
	}
}
