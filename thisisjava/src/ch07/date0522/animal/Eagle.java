package ch07.date0522.animal;

public class Eagle extends Animal {
	private int wing;
	
	public Eagle() {}
	public Eagle(String name, int age, String sex,int wing) {
		super(name,age,sex);
		setVariety("Cat");
		this.wing = wing;
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
							+ " | 성별: "+ s + " | 날개: "+ wing + "(개)");
	}
	
	
	public void fly() {
		System.out.println("\n"+getName() + " :: fly()");
	}
}
