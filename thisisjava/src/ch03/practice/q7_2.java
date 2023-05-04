package ch03.practice;

import java.util.Scanner;

public class q7_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("x: ");
		int x = Integer.parseInt(scanner.next());
		System.out.println("y: ");
		int y = Integer.parseInt(scanner.next());
		double z = (double)x % y;
		
		if(Double.isNaN(z)) {
			System.out.println(y+"(으)로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: "+result);
		}

	}

}
