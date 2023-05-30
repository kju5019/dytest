package practice;

public class acac {
	public static void main(String[] args) {
		
		int[] arr = new int[3];

		arr[0] = (int) (Math.random() * 6 + 1);
		arr[1] = (int) (Math.random() * 6 + 1);
		arr[2] = (int) (Math.random() * 6 + 1);
		
		for(int i=0; i<arr.length-1; i++){
            int temp = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>=arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
