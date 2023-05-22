package ch07.date0522.menu;

public class Coffee extends Menu {
	private String bean;

	public Coffee() {}
	
	
	public Coffee(String name, int price, String bean) {
		super(name, price);
		this.bean = bean;
	}


	public void printInfo() {
		System.out.println("\n===== Coffee Info =====");
		System.out.println("메뉴: "+ getName() + " | 가격: "+getPrice() + " | 원두: "+ bean);
	}
	
	
}
