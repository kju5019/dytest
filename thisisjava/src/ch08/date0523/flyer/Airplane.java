package ch08.date0523.flyer;

public class Airplane implements Flyer, Transport {

	
	//Flyer
	@Override
	public void takeOff() {
		System.out.println("Airplane.takeOff()");
	}

	@Override
	public void land() {
		System.out.println("Airplane.land()");
	}

	@Override
	public void fly() {
		System.out.println("Airplane.fly()");
	}

	//Transport
	@Override
	public void load() {
		System.out.println("Airplane.load()");
	}

	@Override
	public void unload() {
		System.out.println("Airplane.unload()");		
	}

	@Override
	public void test1() {
		System.out.println("Airplane.test1()");
	}

	
}
