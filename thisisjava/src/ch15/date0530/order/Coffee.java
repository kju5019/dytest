package ch15.date0530.order;

import lombok.Data;

@Data
public class Coffee extends Menu {

	private String bean;
	
	public Coffee(String name, int price, String bean) {
		super(name, price);
		this.bean = bean;
	}
	
	@Override
	public void printOrder() {
		
		super.printOrder();
		System.out.println(" | 원두: " + bean);
	}
}
