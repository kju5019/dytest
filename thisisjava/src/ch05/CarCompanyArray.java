package ch05;

public class CarCompanyArray {
	public static void main(String[] args) {

		//Bus, Trcuk, Sedan 타입의 배열 선언
		Bus[] busArr = new Bus[5];
		Truck[] truckArr = new Truck[5];
		Sedan[] sedanArr = new Sedan[5];
		
		
		//Bus
		busArr[0] = new Bus(10, 10 , 40);
		busArr[1] = new Bus(11, 110 , 41);
		busArr[2] = new Bus(12, 210 , 42);
		busArr[3] = new Bus(13, 310 , 43);
		busArr[4] = new Bus(14, 410 , 44);
		
		for(int i=0; i< busArr.length; i++) {
			System.out.println("busArr["+i+"] "+"바퀴수: "+busArr[i].getWheel()
								+", 속도: "+busArr[i].getSpeed()
								+", 좌석수: "+busArr[i].getSeat());
			System.out.println("-----------------------------------------");
		}
		
		
		
		System.out.println("--------------------------------------------------------------------");
		
		
		
		//Truck
		truckArr[0] = new Truck(10, 10 , 40);
		truckArr[1] = new Truck(11, 110 , 41);
		truckArr[2] = new Truck(12, 210 , 42);
		truckArr[3] = new Truck(13, 310 , 43);
		truckArr[4] = new Truck(14, 410 , 44);
		
		for(int i=0; i< truckArr.length; i++) {
			System.out.println("truckArr["+i+"] "+"바퀴수: "+truckArr[i].getWheel()
					+", 속도: "+truckArr[i].getSpeed()
					+", 무게: "+truckArr[i].getWeight());
			System.out.println("-----------------------------------------");
		}
		
		
		System.out.println("--------------------------------------------------------------------");
		
		
		//Sedan		
		sedanArr[0] = new Sedan(10, 10  , "on");
		sedanArr[1] = new Sedan(11, 110 , "off");
		sedanArr[2] = new Sedan(12, 210 , "on");
		sedanArr[3] = new Sedan(13, 310 , "off");
		sedanArr[4] = new Sedan(14, 410 , "on");
		
		for(int i=0; i< truckArr.length; i++) {
			System.out.println("sedanArr["+i+"] "+"바퀴수: "+sedanArr[i].getWheel()
					+", 속도: "+sedanArr[i].getSpeed()
					+", 뚜껑: "+sedanArr[i].getRoof());
			System.out.println("-----------------------------------------");
		}
		
	}

}
