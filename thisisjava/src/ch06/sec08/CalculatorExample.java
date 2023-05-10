package ch06.sec08;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		double resultPlus = myCalc.plus(5, 6);
		System.out.println("resultPlus: "+resultPlus);
		
		double resultAdd = myCalc.add(5.5, 6.5);
		System.out.println("resultAdd: "+resultAdd);
		
		double resultDivide = myCalc.divide(6, 5);
		System.out.println("resultDivide: "+resultDivide);
		
		myCalc.powerOff();
	}

}
