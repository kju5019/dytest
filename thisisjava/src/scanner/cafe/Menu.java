package scanner.cafe;

import java.io.Serializable;
import java.text.DecimalFormat;

import lombok.Data;

@Data
public class Menu implements Serializable{

	private static final long serialVersionUID = 1L;
	private int no;
	private String category;
	private String name;
	private int price;
	
	public Menu() {}
	
	public Menu(int no, String category, String name, int price) {
		super();
		this.no = no;
		this.category = category;
		this.name = name;
		this.price = price;
	}
	
	
	public void printInfo() {
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("\t" + no+ ". " + category + " : " + name + " " + df.format(price) + "(원)");
	}

}
