package ch07;

public class CarCompany {

	public static void main(String[] args) {
		
		Bus bus = new Bus();			System.out.println("--1--");
		Bus bus1 = new Bus(30);			System.out.println("--2--");
		Car bus2 = new Bus(4,20);		System.out.println("--3--");
		Bus bus3 = (Bus)bus2;			System.out.println("--4--");
		Bus bus4 = new Bus(6,50,40);	System.out.println("--5--");
		
		//bus
		System.out.println("bus: "+bus.getWheel()+
				", "+bus.getSpeed()+", "+bus.getSeat());
		//bus1
		System.out.println("bus1: "+bus1.getWheel()+
				", "+bus1.getSpeed()+", "+bus1.getSeat());
		//bus3
		System.out.println("bus3: "+bus3.getWheel()+
				", "+bus3.getSpeed()+", "+bus3.getSeat());
		//bus4
		System.out.println("bus4: "+bus4.getWheel()+
					", "+bus4.getSpeed()+", "+bus4.getSeat());
		
	}

}
