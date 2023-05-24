package ch11.date0523;

public class App {

	public static void main(String[] args) {
		try {
			
		int a = 10;
		int b = 0;
		System.out.print("a="+a);
		System.out.println(" b="+b);
		
		int result = a/b;
		System.out.println("result= "+result);
		
		}catch(ArithmeticException e) {
			System.out.println("===== catch =====");
			
		}finally {
			System.out.println("===== finally =====");		
		}
	}

}
