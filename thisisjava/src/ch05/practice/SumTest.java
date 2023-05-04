package ch05.practice;

import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		//Constructor
		
		System.out.println("숫자를 입력하세요.");
		int x = scanner.nextInt();
				
		Sum s = new Sum();
		int sum = s.sumFunction(x);
		
		System.out.println("1부터 "+x+"까지의 합: "+sum);

	}

}
