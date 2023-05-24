package ch08.date0523.flyer;

public class Human extends Animal {
	
	private String name;

	//생성자
	public Human(int age, String name) {
		super(age);
		this.name = name;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" | 이름: "+name);
	}

	@Override
	public void eat() {
		System.out.println("Human.eat()");
	}
	
	

}
