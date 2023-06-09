package ch05;

public class CarCompanyArray2 {
	public static void main(String[] args) {

		//Bus, Trcuk, Sedan 타입의 배열 선언
		Car[] carBusArr= new Bus[2];
		Car[] carCarArr1= new Car[2];
		
//Car타입 Bus 객체
		
		//Bus 객체 배열에 Bus 객체 저장	(자식 <- 자식)
		carBusArr[0] = new Bus();
		
			System.out.println("carBusArr["+0+"] "+"바퀴수: "+carBusArr[0].getWheel()
				+", 속도: "+carBusArr[0].getSpeed()
				/* +", 좌석수: "+carBusArr[0].getSeat() */);
			System.out.println("-----------------------------------------");

		//Bus 객체 배열에 Car 객체 저장	(자식 <- 부모)
//		carBusArr[1] = new Car();						
//			ArrayStoreException 오류남
//			:객체 배열에 잘못된 유형의 객체를 저장하려고 할때 발생하는 런타임 오류
//			Car 객체 배열에 Bus객체 넣는 것은 가능, Bus 객체 배열에 Car객체 넣는 것은 불가능

			
//Car 타입 Car 객체
			
		//Car 객체 배열에 Car 객체 저장	(부모 <- 부모)
			carCarArr1[0] = new Car();
		
			System.out.println("carCarArr1["+0+"] "+"바퀴수: "+carCarArr1[0].getWheel()
					+", 속도: "+carCarArr1[0].getSpeed()
					/* +", 좌석수: "+carArr1[0].getSeat() */);
			System.out.println("-----------------------------------------");
			
		//Car 객체 배열에 Bus 객체 저장	(부모 <- 자식)
			//자식타입이 부모 타입으로 형변환
			//변수는 자식객체를 참조하지만 변수로 접근 가능한 멤버는 부모클래스의 멤버로 한정된다.
			carCarArr1[1] = new Bus();
			
			System.out.println("carCarArr1["+1+"] "+"바퀴수: "+carCarArr1[1].getWheel()
					+", 속도: "+carCarArr1[1].getSpeed()
					/* +", 좌석수: "+carArr1[1].getSeat() */);
			System.out.println("-----------------------------------------");

	}

}
