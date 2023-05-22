package ch07.date0522.menu;

public class Menu {
	private String name;
	private int price;
	
	public Menu() {}

	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("\n===== Menu Info =====");
		System.out.println("메뉴: "+ name + " | 가격: "+price);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
