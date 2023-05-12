package ch05;

public class CarCompanyArray2 {
	public static void main(String[] args) {

		//Bus, Trcuk, Sedan 타입의 배열 선언
		Car[] carBusArr= new Bus[2];
		Car[] carCarArr1= new Car[2];

		
//Car타입 Bus 객체
		
		//Bus 객체 배열에 Bus 객체 저장
		carBusArr[0] = new Bus();
		
			System.out.println("carBusArr["+0+"] "+"바퀴수: "+carBusArr[0].getWheel()
				+", 속도: "+carBusArr[0].getSpeed()
				/* +", 좌석수: "+carBusArr[0].getSeat() */);
			System.out.println("-----------------------------------------");

			
//		carBusArr[1] = new Car();						
//			ArrayStoreException 오류남
//			:객체 배열에 잘못된 유형의 객체를 저장하려고 할때 발생하는 런타임 오류
//			Car 객체 배열에 Bus객체 넣는 것은 가능, Bus 객체 배열에 Car객체 넣는 것은 불가능

			
//Car 타입 Car 객체
			
		//Car 객체 배열에 Car 객체 저장
			carCarArr1[0] = new Car();
		
			System.out.println("carCarArr1["+0+"] "+"바퀴수: "+carCarArr1[0].getWheel()
					+", 속도: "+carCarArr1[0].getSpeed()
					/* +", 좌석수: "+carArr1[0].getSeat() */);
			System.out.println("-----------------------------------------");
			
		//Car 객체 배열에 Bus 객체 저장
			carCarArr1[1] = new Bus();
			
			System.out.println("carCarArr1["+1+"] "+"바퀴수: "+carCarArr1[1].getWheel()
					+", 속도: "+carCarArr1[1].getSpeed()
					/* +", 좌석수: "+carArr1[1].getSeat() */);
			System.out.println("-----------------------------------------");



	}

}
