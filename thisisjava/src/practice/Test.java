package practice;

public class Test {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		sol.solution(45);
		

	}

	
}
class Solution {
	public int solution(int n) {
		int answer = 0;
		String s = "";
		char c1;
		
		while(n>0) {
			s = (n%3) + s;
			n /= 3;
		}
		System.out.println(s);

		for(int i=0; i<s.length(); i++) {
			c1 = s.charAt(i);

		}
		
		
		return answer;
	}
}
