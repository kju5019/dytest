package ch05.date0518;

public class IntArray {

	public static void main(String[] args) {

		//Declaration
		int[] intArray;
		
		//Creation
		intArray = new int[2];
		
		//Initialization
		intArray[0] = 1;
		intArray[1] = 2;
		
		//Output
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		//Output : length
		int arrayLength = intArray.length;
		System.out.println("배열길이 = "+arrayLength);
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.print("intArray["+i+"] ");
			System.out.println(intArray[i]);
		}

	}

}
