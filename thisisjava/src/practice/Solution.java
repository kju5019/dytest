package practice;

public class Solution {
	public static void main(String[] args) {
		int a = (int)(Math.random()*6 +1);
		int b = (int)(Math.random()*6 +1);
		int c = (int)(Math.random()*6 +1);
		int d = (int)(Math.random()*6 +1);
			
		System.out.println(a+","+b+","+c+","+d);
		Sol s = new Sol();
		s.solution(a, b, c, d);

	}
}

class Sol {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        int temp = 0;
        int p,q,r,s = 0;
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=i+1; j<arr.length;j++) {
        		if(arr[i]<=arr[j]) {
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];        	
        }
        System.out.println(a+","+b+","+c+","+d);
        
        //arr{5,4,1,1}
        //arr{5,5,1,1}
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == arr[i+1]) {
        		p=arr[i];
        	}else if(arr[i] != arr[i+1]) {
            	
            }
        }
       
        
        return answer;
    }
}
