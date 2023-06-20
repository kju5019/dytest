package ch17.date0620.practice.dish;

import lombok.Data;

@Data
public class Dish {
	private String name;
	private boolean veget;
	private int cal;
	private Type type;
	
	
	
	public Dish(String name, boolean veget, int cal, Type type) {
		super();
		this.name = name;
		this.veget = veget;
		this.cal = cal;
		this.type = type;
	}
	
	
	public void printInfo() {
		String v = "";
		if(veget) v="";
		else v="(X)";
		
		String t = switch(type) {
		case MEAT -> "고기";
		case FISH -> "생선";
		default -> "기타";
		};
		
		System.out.println("음식=" + name
						+ " | 채식" + v
						+ " | 열량=" + cal + "(kcal)"
						+ " | " + t
				);
	}
}
