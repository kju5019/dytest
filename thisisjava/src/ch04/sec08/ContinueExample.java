package ch04.sec08;

public class ContinueExample {			//p.137 continue문 -> switch문

	public static void main(String[] args) {	
		for( int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("\n-------------------");
		
//-------------------------------------------------------------------------------
		
		for( int i=1; i<=10; i++) {
			switch(i%2) {
			case 0 : System.out.print(i + " ");
			default : 
			}
		}
		
		System.out.println("\n-------------------");
		
//-------------------------------------------------------------------------------
		
		for( int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}			
		}
		
		
	}

}
