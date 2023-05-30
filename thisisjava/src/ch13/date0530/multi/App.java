package ch13.date0530.multi;

public class App {

	public static void main(String[] args) {
	//GenericP<T extends Person>	--Person의 자식들만 타입으로 올 수 있음
		
		System.out.println("===== GenericP =====");
		System.out.println("----- Person -----");
		GenericP<Person> g1 = new GenericP<Person>();
		g1.setField(new Person("Paige", 20));
		g1.getField().printInfo();
		
		
		System.out.println("\n----- SuperMan -----");			//SuperMan이 Person을 상속받는 자식이므로 가능함
		GenericP<SuperMan> g2 = new GenericP<SuperMan>();
		g2.setField(new SuperMan("Clock", 40));
		g2.getField().printInfo();
		
		
	//GenericFH<T extends Fly & Hidden>
		
		System.out.println("\n===== GenericFH =====");
		System.out.println("----- UFO -----");					//UFO가 Fly와 Hidden을 구현하므로 가능함.
		GenericFH<UFO> g10 = new GenericFH<UFO>();
		g10.setField(new UFO("쟁반"));
		g10.getField().printInfo();
		g10.getField().fly();;
		g10.getField().hidden();
				
		System.out.println("----- SuperMan -----");
		GenericFH<SuperMan> g11 = new GenericFH<SuperMan>();
		g11.setField(new SuperMan("Clock", 40));
		g11.getField().printInfo();
		g11.getField().fly();;
		g11.getField().hidden();
		
		
		System.out.println("\n===== GenericPFH =====");
		System.out.println("----- UFO -----");	
//		GenericPFH<UFO> g20 = new GenericPFH<UFO>();		상속관계가 안맞아서 오류
		
		System.out.println("\n----- SuperMan -----");
		GenericPFH<SuperMan> g21 = new GenericPFH<SuperMan>();
		g21.setField(new SuperMan("Clock", 40));
		g21.getField().printInfo();
		g21.getField().fly();;
		g21.getField().hidden();
		
	}

}
