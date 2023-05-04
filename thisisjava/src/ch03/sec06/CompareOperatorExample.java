package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "자바";
		String str4 = new String("Java");
		
		boolean result1 = (str1==str2);				//Java와 Java
		boolean result2 = str1.equals(str2);
		
		boolean result3 = (str1==str3);				//Java와 자바
		boolean result4 = str1.equals(str3);
		
		boolean result5 = (str1==str4);				//Java와 새로운 객체 Java
		boolean result6 = str1.equals(str4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("--------------");
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println("--------------");
		
		System.out.println(result5);
		System.out.println(result6);
		System.out.println("--------------");

	}

}
