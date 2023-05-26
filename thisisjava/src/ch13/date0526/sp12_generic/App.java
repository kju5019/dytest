package ch13.date0526.sp12_generic;


public class App {

	public static void main(String[] args) {
		//Generic
		//Integer Biz + String Biz -> Generic Biz
		//<T> : T가 타입 파라미터임을 뜻하는 기호
		//객체가 생성될 때 실제 타입이 결정된다.
		
		Biz<Integer> biz1 = new Biz<Integer>();
		biz1.setData(10);
		System.out.println("biz1.data: "+biz1.getData());

		Biz<String> biz2 = new Biz<String>();
		biz2.setData("hello");
		System.out.println("biz2.data: "+biz2.getData());
		
		Biz<String> biz3 = new Biz<>();
		biz3.setData("world");
		System.out.println("biz3.data: "+biz3.getData());


	}

}
