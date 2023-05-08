package ch06.se07;

public class KoreanExample {
	public static void main(String[] args) {
	
		Korean k1 = new Korean("김자바", "950621-1234567");
		
		System.out.println("k1.nation: "+k1.nation);
		System.out.println("k1.name: "+k1.name);
		System.out.println("k1.ssn: "+k1.ssn);
		System.out.println("--------------------------");
		
		
		Korean k2 = new Korean("박자바", "950818-2345678");
		
		System.out.println("k2.nation: "+k2.nation);
		System.out.println("k2.name: "+k2.name);
		System.out.println("k2.ssn: "+k2.ssn);
		System.out.println("--------------------------");
		
		Korean k3 = new Korean();
		k3.name = "이자바";
		
		System.out.println("k3.nation: "+k3.nation);
		System.out.println("k3.name: "+k3.name);
		System.out.println("k3.ssn: "+k3.ssn);
	}
}
