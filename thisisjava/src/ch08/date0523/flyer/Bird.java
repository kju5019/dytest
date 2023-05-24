package ch08.date0523.flyer;

public class Bird extends Animal implements Flyer {

	private int wing;

	//생성자
	public Bird(int age, int wing) {
		super(age);
		this.wing = wing;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" | 날개: "+wing);
	}
	@Override
	public void eat() {
		System.out.println("Bird.eat()");
	}

	@Override
	public void takeOff() {
		System.out.println("Bird.takeOff()");
	}

	@Override
	public void land() {
		System.out.println("Bird.land()");
	}

	@Override
	public void fly() {
		System.out.println("Bird.fly()");
	}
	
	
	
}
