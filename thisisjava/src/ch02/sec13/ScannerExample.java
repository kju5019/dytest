package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값: ");
		int x = Integer.parseInt(scanner.nextLine());

		System.out.print("y 값: ");
		int y = Integer.parseInt(scanner.nextLine());
		
		System.out.println("x+y = "+(x+y));
		
		 scanner.close(); 
	}

}
