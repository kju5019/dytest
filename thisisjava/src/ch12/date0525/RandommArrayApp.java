package ch12.date0525;

public class RandommArrayApp {

	public static void main(String[] args) {
		int[] arr = new int[7];
		
		for(int i=0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*45+1);
			
			for(int j=0; j<i; j++) {				
				if(arr[j] == ran) {
					System.out.println("arr["+j+"]: "+ arr[j]+" ran: "+ran);
					System.out.println("중복");
					i--;
				}
			}
			arr[i] = ran;
		}
		
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
