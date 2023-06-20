package ch16.date0619.drink;

public class App {

	public static void main(String[] args) {

		System.out.println("===== Variable =====");
		System.out.println("\n----- implements Interface -----");
		Beer beer = new Beer();
		beer.drink();
		
		Soda soda = new Soda();
		soda.drink();
		
		Water water = new Water();
		water.drink();


		System.out.println("\n----- Anonymous -----");
		// 익명 클래스는 Beer, Soda, Water 클래스를 생성하지 않는다.
		Drink drinkBeer = new Drink() {
			@Override
			public void drink() {
				System.out.println("맥주를 마시다.");
			}			
		};
		
		Drink drinkSoda = new Drink() {
			@Override
			public void drink() {
				System.out.println("소다를 마시다.");
			}			
		};
		
		Drink drinkWater = new Drink() {
			@Override
			public void drink() {
				System.out.println("물을 마시다.");
			}			
		};
		
		drinkBeer.drink();
		drinkSoda.drink();
		drinkWater.drink();
		
		System.out.println("\n----- Lamda -----");
		Drink drinkBeer2 = () ->{
			System.out.println("맥주를 마시다.");			
		};
		Drink drinkSoda2 = () ->{
			System.out.println("소다를 마시다.");			
		};
		Drink drinkWater2 = () ->{
			System.out.println("물를 마시다.");			
		};
		
		drinkBeer2.drink();
		drinkSoda2.drink();
		drinkWater2.drink();


		System.out.println("\n===== Method =====");
		System.out.println("\n----- implements Interface -----");
		
		Biz b = new Biz();
		b.biz(beer);
		b.biz(soda);
		b.biz(water);



		System.out.println("\n----- Anonymous -----");
		b.biz(drinkBeer);
		b.biz(drinkSoda);
		b.biz(drinkWater);
		
		//메소드 안에서 익명객체를 만든다. (로컬 변수에 익명 구현 객체 대입)
		b.biz(new Drink() {
			@Override
			public void drink() {
				System.out.println("와인을 마시다.");
			}
		});

		b.biz(new Drink() {
			@Override
			public void drink() {
				System.out.println("커피 마시다.");
			}
		});
		
		System.out.println("\n----- Lamda -----");
		b.biz(() -> {
			System.out.println("와인을 마시다.");
		});
		
		b.biz(() -> System.out.println("커피 마시다."));

	}

}
