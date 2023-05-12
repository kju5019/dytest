package ch05;

public class CarCompany {
	public static void main(String[] args) {
		Car car = new Car(4,130);			
		System.out.println(car.getWheel()+", "+car.getSpeed());
		System.out.println("------------------");
		

		Bus bus = new Bus(10,400,45);
		bus.setSpeed(80);
		System.out.println("바퀴수: "+bus.getWheel()+", 속도: "+bus.getSpeed()+", 좌석수: "+bus.getSeat());
		bus.setSeat(40);
		System.out.println("바퀴수: "+bus.getWheel()+", 속도: "+bus.getSpeed()+", 좌석수: "+bus.getSeat());
		bus.setWheel(8);;
		System.out.println("바퀴수: "+bus.getWheel()+", 속도: "+bus.getSpeed()+", 좌석수: "+bus.getSeat());
		System.out.println("------------------");
		
		Truck truck = new Truck(8,150,5000);		
		System.out.println("바퀴수: "+truck.getWheel()+", 속도: "+truck.getSpeed()+ ", 무게: "+truck.getWeight());
		System.out.println("------------------");
		
		Sedan sedan = new Sedan(4,300,"on");		
		System.out.println("바퀴수: "+sedan.getWheel()+", 속도: "+sedan.getSpeed()+", 뚜껑: "+ sedan.getRoof());
		System.out.println("------------------");
		
		
		
		//다형성
		Car test = new Bus();
		test.setWheel(5);
		System.out.println("test의 wheel: "+test.getWheel());
		//Car 타입의 test의 setWheel 메소드를 실행시켰으나
		//자식클래스인 Bus에서 setWheel 메소드를 재정의 했다면
		//자식클래스에서 재정의한 setWheel이 실행된다.

	}

}
