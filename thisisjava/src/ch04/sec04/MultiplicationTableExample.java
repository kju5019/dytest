package ch04.sec04;

import java.util.Scanner;

public class MultiplicationTableExample {			//p.127	중첩 for문 -> while문

	public static void main(String[] args) {
		
		  System.out.println("중첩 for문\n");
		  
		  for (int m=2; m<=3; m++) {
			  System.out.println("*** "+m+ "단 ***");
			  for (int n=1; n<=9; n++) { 
				  System.out.println(m+" x "+n+" = "+ (m*n)); } 
			  		}
		  
		  System.out.println("--------------------------");
		  		 
//------------------------------------------------------------------------------------------------------	
//		System.out.println("while문\n");
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("구구단 몇 단을 출력할까요");
		int m = scanner.nextInt();
						
		System.out.println("*** "+m+ "단 ***");
		int n = 1;
		while(n<=9) {				
			System.out.println(m+" x "+n+" = "+ (m*n));
			n++;
		}
	

		

	}

}
