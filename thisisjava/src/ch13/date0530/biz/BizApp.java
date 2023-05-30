package ch13.date0530.biz;

public class BizApp {

	public static void main(String[] args) {
		Biz biz = new Biz();
		
		System.out.println("===== 명시적 방법 =====");
		Integer i = biz.<Integer>biz(100);
		System.out.println(i);
		
				
		System.out.println("\n===== 묵시적 방법 =====");
		String str = biz.biz("Hello");
		System.out.println(str);
	}

}
