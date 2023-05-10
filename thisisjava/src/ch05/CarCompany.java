package ch05;

public class CarCompany {
	public static void main(String[] args) throws Exception{
		Car car = new Car(4,130);			
		System.out.println(car.getWheel()+", "+car.getSpeed());
		System.out.println("------------------");
		
		Bus bus = new Bus(4,120);
//		bus.setSpeed(140);
		System.out.println(bus.getWheel()+", "+bus.getSpeed());
		System.out.println("------------------");
		
		Truck truck = new Truck();		
		System.out.println(truck.toString());
		System.out.println("------------------");
		
		Sedan sedan = new Sedan();		
		System.out.println(sedan.toString());
		System.out.println("------------------");
		
		

	}
	/*
	 		if(speed<=120) {
		this.speed = speed;
		} else {
			System.out.println("제한속도 초과");
			this.speed = 120;
		}
	 */

}
