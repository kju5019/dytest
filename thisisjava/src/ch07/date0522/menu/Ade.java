package ch07.date0522.menu;

public class Ade extends Menu {
	private String meterials;
	
	public Ade() {}
	
	
	public Ade(String name, int price, String meterials) {
		super(name, price);
		this.meterials = meterials;
	}


	public void printInfo() {
		System.out.println("\n===== Ade Info =====");
		System.out.println("메뉴: "+ getName() + " | 가격: "+getPrice() + " | 재료: "+ meterials);
	}
}
