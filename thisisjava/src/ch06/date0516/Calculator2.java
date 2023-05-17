package ch06.date0516;

public class Calculator2 {
	int x;
	int y;
	
	public Calculator2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public void plus() {
		System.out.println("plus() :: "+x+" + "+y+" = "+(x+y));
	}
	
	public void minus() {
		System.out.println("minus() :: "+x+" - "+y+" = "+(x-y));
	}
	
	public void multiply() {
		System.out.println("multiply() :: "+x+" * "+y+" = "+(x*y));
	}
	
	public void divide() {
		System.out.println("divide() :: "+x+" / "+y+" = "+(x/y));
	}
	
	public void rest() {
		System.out.println("rest() :: "+x+" % "+y+" = "+(x%y));
	}
	
	
	public void printInfo() {
		System.out.println("\n===== printInfo() =====");
		System.out.println("val1: "+x+" val2: "+y);
	}
	public void clear() {
		x=0;
		y=0;
	}
}
