package ch04.sec05;

import java.util.Scanner;

public class KeyControllerExample {				//p.131	if문 -> switch문 표현식

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
			System.out.println("--------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			switch(strNum) {
			case "1" -> { speed++; System.out.println("현재속도 = "+speed);}
			case "2" -> { speed--; System.out.println("현재속도 = "+speed);}
			case "3" -> run = false;
			default -> {System.out.println("1,2,3 중 입력하세요");}
			}
		}
		
		System.out.println("프로그램 종료");
		

	}

}
