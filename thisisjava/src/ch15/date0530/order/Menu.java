package ch15.date0530.order;

import java.text.DecimalFormat;

import lombok.Data;

@Data
public class Menu {
	private String name;
	private int price;
	
	DecimalFormat df = new DecimalFormat("#,###");
	
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public void printOrder() {
		
		System.out.print("메뉴: "+ name + " | 가격: "+ df.format(price));
				
	}

}
