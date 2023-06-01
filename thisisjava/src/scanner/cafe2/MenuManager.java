package scanner.cafe2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch15.date0530.book.Book;

public class MenuManager {

	Scanner sc = new Scanner(System.in);
	List<Menu> menuList = new ArrayList<>();
		
	//메뉴 메인
	public void begin() throws IOException, ClassNotFoundException {
			
		boolean whileLoop = true;
		while (whileLoop) {
			System.out.println("========== [메뉴 관리] ==========");
			System.out.println("1. 메뉴 조회");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 메뉴 수정");
			System.out.println("4. 메뉴 삭제");
			System.out.println("9. 종료");
			System.out.println("메뉴를 선택하세요 =>");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.println("[메뉴 조회]");
				printMenuList();
				break;
			case "2":
				System.out.println("[메뉴 추가]");
				addMenu();
				break;
			case "3":
				System.out.println("[메뉴 수정]");
				updateMenu();
				break;
			case "4":
				System.out.println("[메뉴 삭제]");
				deleteMenu();
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


	//메뉴 조회
	public void printMenuList() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("C:/Temp/1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);		
		for(int i=0; i<menuList.size(); i++) {
			String str = ois.readUTF();
		}
		
//		List<Menu> list = (List<Menu>)ois.readUTF();
		
		ois.close(); fis.close();
		for(int i=0; i<menuList.size(); i++) {			
			menuList.get(i).printInfo();
		}
		
//		for(int i=0; i<contents.length; i++) {				
//			bookList.add(new Book(contents[i].split("/")));
//		}
//		for(int i=0; i<menuList.size(); i++) {			
//			menuList.get(i).printInfo();
//		}
	}
	
	//메뉴 추가
	public void addMenu() throws IOException, ClassNotFoundException {
		System.out.print("메뉴 번호를 입력하세요 =>");
		String n = sc.nextLine();
		int no = Integer.parseInt(n);
		System.out.print("메뉴 카테고리를 입력하세요(커피,에이드,케이크) =>");
		String category = sc.nextLine();
		System.out.print("메뉴명을 입력하세요 =>");
		String name = sc.nextLine();
		System.out.print("가격을 입력하세요 =>");
		String a = sc.nextLine();
		int price = Integer.parseInt(a);
		
//		FileInputStream fis = new FileInputStream("C:/Temp/1.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		List<Menu> menuList = (List<Menu>)ois.readObject();
//		ois.close(); fis.close();
		
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getNo() == no) {
				System.out.println("이미 존재하는 메뉴번호입니다.");
				return;
			}
		}
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/1.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		menuList.add(new Menu(no,category,name,price));
		for(int i=0; i<menuList.size(); i++) {
			oos.writeUTF(
					menuList.get(i).getNo()+"/"
					+menuList.get(i).getCategory()+"/"
					+menuList.get(i).getName()+"/"
					+menuList.get(i).getPrice()+"/"
					);
		}		
		
		oos.flush(); oos.close(); fos.close();
	}
	
	//메뉴 수정
	public void updateMenu() throws IOException, ClassNotFoundException{
		System.out.print("메뉴 번호를 입력하세요 =>");
		String n = sc.nextLine();
		int no = Integer.parseInt(n);
		System.out.print("메뉴 카테고리를 입력하세요(커피,에이드,케이크 =>");
		String category = sc.nextLine();
		System.out.print("메뉴명을 입력하세요");
		String name = sc.nextLine();
		System.out.print("가격을 입력하세요 =>");
		String a = sc.nextLine();
		int price = Integer.parseInt(a);
		
		FileInputStream fis = new FileInputStream("C:/Temp/1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Menu> menuList = (List<Menu>)ois.readObject();
		ois.close(); fis.close();
		
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getNo() == no) {
				menuList.get(i).setCategory(category);
				menuList.get(i).setName(name);
				menuList.get(i).setPrice(price);
			}
		}
				
		FileOutputStream fos = new FileOutputStream("C:/Temp/1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(menuList);
		oos.flush(); oos.close(); fos.close();
		
	}
	
	//메뉴 삭제
	public void deleteMenu() throws IOException, ClassNotFoundException{
		System.out.print("메뉴 번호를 입력하세요 =>");
		String n = sc.nextLine();
		int no = Integer.parseInt(n);
		
		FileInputStream fis = new FileInputStream("C:/Temp/1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Menu> menuList = (List<Menu>)ois.readObject();
		ois.close(); fis.close();
		
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getNo() == no) {
				menuList.remove(i);
			}
		}
				
		FileOutputStream fos = new FileOutputStream("C:/Temp/1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(menuList);
		oos.flush(); oos.close(); fos.close();
		
		
	}
	
}//클래스
