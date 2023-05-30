package ch15.date0530.order;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {
	private List<Menu> menuList;
	static int index = 0;
	static int menuint = 0;
	static int pricesum = 0;
	
	DecimalFormat df = new DecimalFormat("#,###");
	static DecimalFormat df2 = new DecimalFormat("#,###");
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

	public Order(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public void printOrder() {
		int sum=0;
		index++;
		menuint += menuList.size();
		System.out.println("\n===== 주문서 =====");
		System.out.println("* 주문번호: "+ index);
		
		for(int i=0; i<menuList.size(); i++) {
			System.out.print("\t"+(i+1)+".");
			menuList.get(i).printOrder();		
		}
		
		System.out.println("*주문 메뉴수: "+ menuList.size());
		for(int i=0; i<menuList.size(); i++) {
			sum += menuList.get(i).getPrice();
		}
		pricesum += sum;
		System.out.println("*주문액: "+ df.format(sum));
		System.out.println("*주문시간: " + sdf.format(now));
	}

	public static void printSummary() {
		System.out.println("\n===== 정산 =====");
		System.out.println("총 주문 건수: "+ index);
		System.out.println("총 주문 메뉴 수: "+ menuint);
		System.out.println("총 매출: " + df2.format(pricesum)+"(원)");
		
	}
	
	public void printOrder2() {
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i) instanceof Ade) {
				Ade a = (Ade)menuList.get(i);
				System.out.println("메뉴: "+ a.getName() + " | 가격: "+ df.format(a.getPrice()) + " | 재료: "+ a.getIngredient());
			} else if (menuList.get(i) instanceof Coffee) {
				Coffee c = (Coffee)menuList.get(i);
				System.out.println("메뉴: "+ c.getName() + " | 가격: "+ df.format(c.getPrice()) + " | 원두: "+ c.getBean());
			}
		}
	}

}
