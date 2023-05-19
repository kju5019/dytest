package ch05.date0518.order;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderManager {
	private Menu[] order;
	
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	DecimalFormat df = new DecimalFormat("#,###");
	
	public OrderManager(Menu[] order) {
		this.order = order;
	}
	
	public void printReceipt() {
		int count=0;
		
		System.out.println("===== [영수증] =====");
		System.out.println("\n----- 주문 시간 -----");		
		System.out.println(sdf.format(now));
		System.out.println("\n----- 주문 상세 -----");		
		for(int i=0;i<order.length;i++) {
			System.out.print((i+1)+". ");
			order[i].printInfo();
			count += order[i].getPrice();
		}
		
		System.out.println("\n----- 주문 금액 합계 -----");
		System.out.println(df.format(count)+"(원)");
	}

}
