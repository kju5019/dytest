package ch06.date0516;

public class Calculator {

	public void plus( int x, int y) {
		System.out.println("plus() :: "+x+" + "+y+" = "+(x+y));
	}
	
	public void minus( int x, int y) {
		System.out.println("minus() :: "+x+" - "+y+" = "+(x-y));
	}
	
	public void multiply( int x, int y) {
		System.out.println("multiply() :: "+x+" * "+y+" = "+(x*y));
	}
	
	public void divide( int x, int y) {
		System.out.println("divide() :: "+x+" / "+y+" = "+(x/y));
	}
	
	public void rest( int x, int y) {
		System.out.println("rest() :: "+x+" % "+y+" = "+(x%y));
	}
}
