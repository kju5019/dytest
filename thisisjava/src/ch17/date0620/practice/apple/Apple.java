package ch17.date0620.practice.apple;

import lombok.Data;

@Data
public class Apple {
	private int weight;
	private Color color;
	
	public Apple(int weight, Color color) {
		super();
		this.weight = weight;
		this.color = color;
	}



	public void printInfo() {
		System.out.println("컬러=" + color + " | 무게=" + weight);
	}
}
