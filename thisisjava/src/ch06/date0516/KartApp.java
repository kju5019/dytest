package ch06.date0516;

public class KartApp {

	public static void main(String[] args) {
		Kart2 kart = new Kart2("버스트", "Green");

		System.out.println("===== READY =====");
		kart.printKartInfo();
		
		System.out.println("\n===== RUN =====");
		kart.speedUp();
		kart.pickupBooster();
		kart.pickupBooster();
		kart.useBooster();
		kart.useBooster();
		kart.speedUp();
		kart.speedDown();
//		kart.speedUp();
		kart.pickupBooster();
		kart.speedDown();


	}

}
