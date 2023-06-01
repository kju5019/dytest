package scanner.cafe;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private Menu m;
	private int amount;


	public Order() {}
		
	public Order(Menu m, int amount) {
		this.m = m;
		this.amount = amount;
	}



	public void printInfo() {
		Date now = new Date();
		DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(m.getName() + " | "+ amount + "(개)" 
							+ " | 금액: " + df.format(m.getPrice()*amount) + "(원)"
							+ " | "+ sdf.format(now));
	}

	public int printSumPrice() {
		
		return m.getPrice();
	}
}
