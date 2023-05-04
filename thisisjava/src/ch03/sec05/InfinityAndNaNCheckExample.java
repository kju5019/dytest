package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		
		double v1 = 5 / 0.0;
		boolean result1 = Double.isInfinite(v1);
		System.out.println(v1);
		System.out.println(result1);
		System.out.println("------------");
		

		double v2 = 5 % 0.0;
		boolean result2 = Double.isInfinite(v2);
		System.out.println(v2);
		System.out.println(result2);
		
	}

}
