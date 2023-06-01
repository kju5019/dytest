package scanner.cafe2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderManager {
	
	Scanner sc = new Scanner(System.in);
	MenuManager mm = new MenuManager();
	List<Order> orderList = new ArrayList<>();
	DecimalFormat df = new DecimalFormat("#,###");

	public void begin() throws IOException, ClassNotFoundException {
		
		boolean whileLoop = true;
		while (whileLoop) {
			System.out.println("========== [주문 관리] ==========");
			System.out.println("1. 메뉴 조회");
			System.out.println("2. 주문");
			System.out.println("3. 주문 조회");
			System.out.println("9. 종료");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.println("[메뉴 조회]");
				mm.printMenuList();
				break;
			case "2":
				System.out.println("[주문]");
				order();
				break;
			case "3":
				System.out.println("[주문 조회]");
				printOrder();
				break;			
			case "9":
				System.out.println("[종료]");
				whileLoop = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				break;
			}//switch
			
		
		}//while
		
	}//begin()

	//2.주문
	public void order() throws IOException, ClassNotFoundException {
		Menu m = new Menu();
		
		FileInputStream fis = new FileInputStream("C:/Temp/1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Menu> menuList = (List<Menu>)ois.readObject();
		ois.close(); fis.close();
		
		while(true) {
		System.out.print("메뉴 번호를 입력하세요 =>");
		String n1 = sc.nextLine();
		int no = Integer.parseInt(n1);
		System.out.print("주문 개수를 입력하세요 =>");
		String n2 = sc.nextLine();
		int amount = Integer.parseInt(n2);
				
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getNo() == no) {
			m = menuList.get(i);
			}
		}
		orderList.add(new Order(m,amount));
		
		
		System.out.println("주문을 추가하시겠습니까?");
		System.out.println("\t 1.추가");
		System.out.println("\t 2.주문 종료");
		System.out.print("선택=>");
		String n3 = sc.nextLine();
		int choice = Integer.parseInt(n3);
		if(choice == 2) break;

		}
		System.out.println("주문 목록");
		printOrder();
		
		int sumPrice =0;
		for(int i=0; i<orderList.size();i++) {
			sumPrice += orderList.get(i).printSumPrice();
		}
		System.out.println("\t*총 금액: " + df.format(sumPrice));
	}
	
	//주문 조회
	public void printOrder() throws IOException, ClassNotFoundException {
		for(int i=0; i<orderList.size(); i++) {			
			System.out.print("\t주문번호 "+ (i+1)+". ");
			orderList.get(i).printInfo();			
		}
	}
	
	
	

}//클래스
