package ch09.date0616;

public class DrinkApp {

	public static void main(String[] args) {
		System.out.println("===== Outer Class =====");
		Drink drink = new Drink("Water");
		drink.printInfo();
		
		/*
		 ===== Iner Class =====
		 - Iner Class를 사용하려면 먼저, Outer Class를 인스턴스화해야함
		 - 객체생성
		 Outer out = new Outer();
		 Outer.Inner in = out.new Inner();
		 */
		
		System.out.println("===== Inner Class =====");
		Drink.Coffee coffee = drink.new Coffee("아메리카노");
		coffee.printInfo();

		//Inner Class에서 Outer Class field(non-static)접근
		coffee.printAllInfo();

	}

}
