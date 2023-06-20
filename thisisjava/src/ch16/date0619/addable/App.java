package ch16.date0619.addable;

public class App {

	public static void main(String[] args) {
		System.out.println("\n===== Java =====");
		
		Addable a1 = new Addable() {
			@Override
			public void add(int i, int j) {
				System.out.println("i + j = " + (i+j));
			}			
		};
		a1.add(1,2);
		
		
		System.out.println("\n===== Lamda =====");
		
		System.out.println("\n----- Type 1. -----");
		Addable a2 = (int i, int j) -> {
			System.out.println("i + j = " + (i+j));
		};
		a2.add(1, 2);
		
	
		System.out.println("\n----- Type 2. -----");
		Addable a3 = (i, j) -> System.out.println("i + j = " + (i+j));
		
		a3.add(3, 4);
		
	}

}
