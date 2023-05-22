package ch07.date0522.animal;

public class Cat extends Animal {
	private int legs;
	
	public Cat() {}
	public Cat(String name, int age, String sex,int legs) {
		super(name,age,sex);
		setVariety("Cat");
		this.legs = legs;
	}
	
	
	

	@Override
	public void printInfo() {
		String s = switch(getSex()) {
		case "F" -> "여";
		case "M" -> "남";
		default -> "";
		};
		System.out.println("\n===== Animal Info =====");
		System.out.println("동물: "+ getVariety() + " | 이름: "+ getName() + " | 나이: "+ getAge()
							+ " | 성별: "+ s + " | 다리: "+ legs + "(개)");
	}
	
	public void sleep() {
		System.out.println("\n"+getName() + " :: sleep()");
	}

	

}
