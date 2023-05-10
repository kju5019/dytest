package ch07;

public class Cal {
	static int add(int a, int b) {
		System.out.println("정수 연산");
		int result = a+b;
		return result;
	}
	
	static double add(double a, double b) {
		System.out.println("실수 연산");
		double result = a+b;
		return result;
	}

}
