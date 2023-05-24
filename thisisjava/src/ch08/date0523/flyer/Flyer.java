package ch08.date0523.flyer;

public interface Flyer {
		
	public void takeOff();
	public void land();
	public void fly();
	
	
	
	public static void test() {
		System.out.println("Flyer.test()");
	}
	public default void test1() {
		System.out.println("Flyer.test1()");
	}
	
}
