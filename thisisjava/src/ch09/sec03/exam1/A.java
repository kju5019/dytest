package ch09.sec03.exam1;

public class A {
	
	static class B{}
	
	B field1 = new B();
	
	static B field2 = new B();
	
	//생성자
	A(){
		B b = new B();
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	//정적 메소드
	static void method2() {
		B b = new B();
	}
	
}
