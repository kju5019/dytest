package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		float v4 = 1.5f;

		
/*1번*/		long result1 = v1 + v2 + v3;
/*2번*/		double result2 = v1 + v2 + v4;
/*3번*/		float result3 = v2 + v3 + v4;
/*4번*/		int result4 = (int) (v1 + v3);
				
//Q . 다음의 결과를 쓰시오.
//result1 : 
//result2 : 
//result3 : 
//result4 : 



		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
