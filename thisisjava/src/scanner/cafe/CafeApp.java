package scanner.cafe;

import java.util.Scanner;

public class CafeApp {

	public void begin() {
		try {
			
			Scanner sc = new Scanner(System.in);
			MenuManager mm = new MenuManager();
			OrderManager om = new OrderManager();
			
			boolean whileLoop = true;
			while (whileLoop) {

				System.out.println("\n########## Cafe App ##########");
				System.out.println("1. 메뉴 관리");
				System.out.println("2. 주문 관리");
				System.out.println("9. 종료");
				System.out.println("메뉴를 선택하세요 =>");
				String menu = sc.nextLine();
				
				switch(menu) {
				case "1":
					mm.begin();
					break;
				case "2":
					om.begin();
					break;
				case "9":
					System.out.println("[종료]");
					whileLoop = false;
					break;
				default:
					System.out.println("잘못 선택하셨습니다.");
					break;
				}

			} // try

		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	}// begin()

}// 클래스
