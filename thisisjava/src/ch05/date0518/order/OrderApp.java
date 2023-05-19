package ch05.date0518.order;

public class OrderApp {

	public static void main(String[] args) {

		Menu[] order = new Menu[3];
		order[0] = new Menu("빅맥세트", 5500);
		order[1] = new Menu("아이스크림 콘", 700);
		order[2] = new Menu("아이스커피", 1000);

		OrderManager manager = new OrderManager(order);
		manager.printReceipt();
	}

}
