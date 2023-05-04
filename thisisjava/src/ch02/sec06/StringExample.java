package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "자바";
		
		System.out.println("나는 \""+str1+ "\"를 배웁니다.");
		
		String str2 = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		
		System.out.println(str2);
		
		

	}

}
