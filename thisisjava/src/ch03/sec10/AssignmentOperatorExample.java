package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 4;			//100(2진수)
		
		result <<= 3;			//100000(2진수)		
		System.out.println("result: "+result);

		result %= 3;	
		System.out.println("result: "+result);
	}

}
