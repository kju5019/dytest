package ch05.sec10;

public class ForEachApp {

	public static void main(String[] args) {
		String[] messageArr = {"Hello", "world", "Welcome"};

		System.out.println("===== for =====");
		for(int i=0; i<messageArr.length;i++) {
			System.out.println(messageArr[i]);
		}
		
		System.out.println("\n===== advanced for =====");
		for(String str : messageArr) {
			System.out.println(str);
		}
		
		
	}

}
