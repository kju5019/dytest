package ch02.sec04;

public class FloatDobleExample {

	public static void main(String[] args) {
		float var1 = 0.1234f;
		float var2 = 0.1234f;
		float var3 = var1+var2;
		double var4 = var1+var2;
		double var5 = (float)(var1+var2);
		double var6 = (double)var1 + (double)var2;
		
		 System.out.println(var3); System.out.println(var4); System.out.println(var5);
		 System.out.println(var6);
		 	
		
		float var11 = 0.1f;
		float var22 = 0.1f;
		
		double var111 = var11;
		double var33 = var11 + var22;
		/*
		 * System.out.println(var33); System.out.println(var111);
		 */	
		
		
		byte b1 = 10;
		int i1 = b1;
		
		System.out.println(i1);
		
		
		float f1 = 0.1f;
		double d1 = 0.1;
		double d2 = f1;
		
		System.out.println("f1: "+f1+",d1: "+d1);
		System.out.println("d2: "+d2);
		
		
		
		double d3 = 0.123456789012;
		float f3 = (float)d3;
		
		System.out.println("f3: "+f3);

	}

}
