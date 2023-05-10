package ch06;

public class TestVariable {
	static {
		System.out.println("static initializer");
		System.out.println(TestVariable.classVariable);		//--메모리는 먼저 잡지만 초기화는 나중에 된다. --> null
	}
	
	static String classVariable = "class 변수";
	String a = "aaa";
	
	{
		System.out.println("instance initializer");
	}
	
	String memberVariable = "member 변수";
	
	TestVariable() {
		System.out.println("생성자 호출");
	}
	
	static void staticMethod(String argument) {
		System.out.println(argument);
	}
	
	void memberMethod() {
		String localVariable = "local 변수";
		System.out.println(localVariable);
	}
	
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println(TestVariable.classVariable);			//1번
		TestVariable tvv = new TestVariable();
		System.out.println(tvv.a);
		System.out.println("----------------------");
		TestVariable.staticMethod("argument(매개)변수");			//2번
		System.out.println("----------------------");
		TestVariable tv = new TestVariable();					//3번
		System.out.println("----------------------");
		System.out.println(tv.memberVariable);					//4번
		
/*
		static initializer			
		1번.
		class 변수
		
		2번.
		argument(매개)변수
		
		3번.
		instance initializer
		생성자 호출
		
		4번.
		member 변수
 */
		

	}
}
 