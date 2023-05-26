package ch09.date0526.game2;

public class App {
	public static void main(String[] args) {

		// Character를 상속받는 Archer 클래스를 만들어서 overriding 후
		// Archer 객체 타입으로 메소드 호출
		System.out.println("===== Object =====");
		Character archer = new Archer();
		archer.attack();

		// 생성자를 이용해서 상속 받은 것과 같은 효과
		// 클래스를 만들지 않고 Character를 상속 받아서 메소드를 overriding
		System.out.println("===== Anonumous Object =====");
		Character c1 = new Character() {

			@Override
			public void attack() {
				System.out.println("원거리 공격");
			}

		};
		c1.attack();
		
		
		System.out.println("===== Game.attack() =====");
		Game game = new Game();
		game.attack(archer);
		game.attack(c1);
		
		
		System.out.println("\n===== Knight =====");
		Character c2 = new Character() {
			@Override
			public void attack() {
				System.out.println("원거리 공격");
			}			
		};
		c2.attack();
		game.attack(c2);
		
		
		System.out.println("\n===== Wizard =====");
		Character c3 = new Character() {
			@Override
			public void attack() {
				System.out.println("마법 공격");
			}			
		};
		c3.attack();
		game.attack(c3);
		
		
		System.out.println("\n===== 라이플맨 =====");
		Character c4 = new Character("제임스","라이플맨") {
			@Override
			public void attack() {
				System.out.println("소총 공격");
			}
		};
		c4.printInfo();
		c4.attack();
		game.attack(c4);
		

	}
}
