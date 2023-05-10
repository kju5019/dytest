package ch06.sec08;

public class Calculator {
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	double plus(int x, int y) {
		int result = x+y;
		return result;			//자동형변환 가능
	}
	
	double add(double x, double y) {
		double result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}

}
