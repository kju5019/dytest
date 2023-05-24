package ch08.date0523.car;

public class Sedan extends Car implements PassngerModel {

	public Sedan(String name) {
		super(name);
	}

	@Override
	public void getOn() {
		System.out.println(getName()+"에 타다");
	}

	@Override
	public void getOff() {
		System.out.println(getName()+"에서 내리다");
		
	}

}
