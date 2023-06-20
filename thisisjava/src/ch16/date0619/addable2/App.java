package ch16.date0619.addable2;

public class App {

	public static void main(String[] args) {
		System.out.println("\n===== Java =====");
		Addable a1 = new Addable() {
			@Override
			public int add(int i, int j) {
				int add = i+j;
				return add;
			}			
		};
		
		int add1 = a1.add(1, 2);
		System.out.println("i + j = " + add1);
		
		System.out.println("\n===== Lamda =====");
		
		System.out.println("\n----- Type 1. -----");
		
		
		Addable a2 = (i,j) -> { return (i+j);};
		int add2 = a2.add(1, 2);
		System.out.println("i + j = " + add2);
		
		
		System.out.println("\n----- Type 2. -----");
		
		Addable a3 = (i,j) -> (i+j);
		int add3 = a3.add(1, 2);
		System.out.println("i + j = " + add3);
		
		
		

	}

}
