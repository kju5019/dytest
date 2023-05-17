package ch06.date0516;

public class CalculatorApp2 {

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2(10,6);

		
		cal.plus();
		cal.minus();
		cal.multiply();
		cal.divide();
		cal.rest();
		
		cal.printInfo();
		cal.clear();
		cal.printInfo();

	}

}
