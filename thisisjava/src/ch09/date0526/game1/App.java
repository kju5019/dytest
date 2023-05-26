package ch09.date0526.game1;

public class App {

	public static void main(String[] args) {

		//Character를 상속받는 Archer 클래스를 만들어서 overriding 후
		//Archer 객체 타입으로 메소드 호출
		System.out.println("===== Object =====");
		Character archer = new Archer();
		archer.attack();
		
		//생성자를 이용해서 상속 받은 것과 같은 효과
		//클래스를 만들지 않고 Character를 상속 받아서 메소드를 overriding
		System.out.println("===== Anonumous Object =====");
		Character c1 = new Character() {

			@Override
			public void attack() {
				System.out.println("원거리 공격");
			}
			
		};
		c1.attack();

	}

}
