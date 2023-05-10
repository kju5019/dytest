package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567","김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println("-------------------");
		
//		k1.ssn = "14235-1235123";		final 이므로 수정 불가
		k1.name = "박자바";
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);

	}

}
