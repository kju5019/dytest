package ch06.date0516;

public class A {
	static int a = 0;
	public static void main(String[] args) {
		System.out.println(a);
	}
}
class B{
	public static void main(String[] args) {		
		System.out.println("B: "+A.a);
	}
}


