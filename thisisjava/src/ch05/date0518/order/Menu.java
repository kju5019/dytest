package ch05.date0518.order;

import java.text.DecimalFormat;

public class Menu {
	private String name;
	private int price;
	
	DecimalFormat df = new DecimalFormat("#,###");
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("메뉴: "+name+" | 가격: "+df.format(price));
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
