package ch08.date0523.flyer;

public class SuperMan extends Human implements Flyer {

	//생성자
	public SuperMan(int age, String name) {
		super(age, name);
		
	}

	@Override
	public void takeOff() {
		System.out.println("SuperMan.takeOff()");
	}

	@Override
	public void land() {
		System.out.println("SuperMan.land()");
	}

	@Override
	public void fly() {
		System.out.println("SuperMan.fly()");
	}

}
