package ch05.practice;

import java.util.Scanner;

public class TestFunction {
	int sum=0;
	int sum2=1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		int x = sc.nextInt();
		
		TestFunction tf = new TestFunction();
		tf.SumFunction(x);
		tf.XFunction(x);
				
		System.out.println("결과: "+tf.sum);
		System.out.println("결과: "+tf.sum2);

	}
		
	void SumFunction(int x) {
				
		for(int i=1; i<=x; i++) {
			sum += i;
		}		
	}
	
	void XFunction(int x) {
		for(int i=1; i<=x; i++) {
			sum2 = sum2*i;
		}
		
	}
}
