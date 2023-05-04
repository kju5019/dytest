package ch02.sec12;

public class PrintExample {

	public static void main(String[] args) {
		
		//정수 d , 실수 f , 문자열 s
		//탭 t , 줄바꿈 \n
		
		int value = 123;
		
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		System.out.println("-------------------------------");

		
		double area = 3.14159 *10 *10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이:%-10.2f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", 10, area);
		System.out.println("-------------------------------");
		
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%s | %s \n");
		
		
	}

}
