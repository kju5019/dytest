package ch04.sec07;

public class BreakExample {					//p.134 break문 -> do while문

	public static void main(String[] args) {			
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("-----------");
//------------------------------------------------------------------------------
		int num = 0;
		do {
			num = (int)(Math.random()*6)+1;
			System.out.println(num);
		} while(num!=6);
		
	}

}
