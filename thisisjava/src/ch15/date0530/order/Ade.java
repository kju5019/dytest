package ch15.date0530.order;

import lombok.Data;

@Data
public class Ade extends Menu {
	private String ingredient;
	
	public Ade(String name, int price, String ingredient) {
		super(name, price);
		this.ingredient = ingredient;
	}

	@Override
	public void printOrder() {
		
		super.printOrder();
		System.out.println(" | 재료: " + ingredient);
	}

	
}
