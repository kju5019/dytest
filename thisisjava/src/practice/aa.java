package practice;

public class aa {
	public static void main(String[] args) {
		aa a1 = new aa();
		System.out.println(a1.solution(5));
	}

	public int[][] solution(int n) {
        int[][] answer = {};
        int count = 1;
        
        answer =  new int[n][n];
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		
        	if(answer[i][j]==0) {answer[i][j] = count;}
        	
        	
        	}
        }
        
        		
        		
        return answer;
    }
}


