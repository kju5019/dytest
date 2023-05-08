package ch05.practice;

public class TestVariable {
	static String staticVariable = "static 변수";
	
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
		System.out.println(TestVariable.staticVariable);	//"static 변수"
		TestVariable.staticMethod("argument(매개)변수");		//"argument(매개)변수"
		TestVariable tv = new TestVariable();				//"생성자 호출"
		System.out.println(tv.memberVariable);				//"member 변수"
		
//		memberMethod();								//***오류 - static이 아니므로 1.static으로 선언하거나
													//						   2.객체 생성 후 호출 가능
		tv.memberMethod();									//"local 변수"
		staticMethod("argument");							//"argument"	static 이므로 객체 생성없이 호출 가능
	}
}
 
/*
		1. static 찾아서 method 영역에 띄움
		2. main() -> args:String 실행
 */




/*
		변수의 종류
		1. static 변수 (class 변수)				--객체 생성 없이 사용 가능
		2. member 변수 (객체 변수)					
		3. local 변수
		4. Argument, Parameter, 매개변수
		
		메모리 영역
		1. method 영역
		-- (1)클래스 로딩
		2. stack 영역
		-- main (3)(4)실행
		3. heap
		-- (2)객체 생성 new		
*/

















