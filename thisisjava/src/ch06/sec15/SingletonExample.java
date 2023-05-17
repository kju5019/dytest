package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		//error : The constructor Singleton() is not visible
//		Singleton obj = new Singleton();

		//정적 메소드를 호출해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.gerInstance();
		Singleton obj2 = Singleton.gerInstance();

		//동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
