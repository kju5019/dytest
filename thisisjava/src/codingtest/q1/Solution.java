package codingtest.q1;

import java.util.Scanner;

public class Solution {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		//테스트케이스 개수
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			
			//String 배열 선언
			String[][] poArray = new String[N][N];
			
			for(int i=0; i<N; i++) {
				Scanner scanner = new Scanner(System.in);
				String str = scanner.next();
				poArray[i] = str.split(" ");
				scanner.close();
			}

//			for(int i=0; i<N; i++) {
//				for(int j=0; j<N; j++) {
//					poArray[i][j]= sc.next();
//				}
//			}
			
			int xi = 0;
			int xj = 0;
			
			//X 찾기
			for(int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					if(poArray[i][j].equals("X")) {
						xi = i;
						xj = j;
					}
				}
			}
			
			//위에꺼
			int count = -1;
			for(int i=xi-1; i>=0; i--) {
				if(poArray[i][xj].equals("Y")) {
					break;
				}else if(poArray[i][xj].equals("L")) {
					continue;
				}else if(poArray[i][xj].equals("H")) {
					count++;
				}
				if(count>=1) {
					AnswerN++;
					count = -1;
				}
			}
			
			
			//아래꺼
			count = -1;
			for(int i=xi+1; i<N; i++) {
				if(poArray[i][xj].equals("Y")) {
					break;
				}else if(poArray[i][xj].equals("L")) {
					continue;
				}else if(poArray[i][xj].equals("H")) {
					count++;
				}
				if(count>=1) {
					AnswerN++;
					count = -1;
				}
			}
			
			
			//왼쪽꺼
			count = -1;
			for(int j=xj-1; j>=0; j--) {
				if(poArray[xi][j].equals("Y")) {
					break;
				}else if(poArray[xi][j].equals("L")) {
					continue;
				}else if(poArray[xi][j].equals("H")) {
					count++;
				}
				if(count>=1) {
					AnswerN++;
					count = -1;
				}
			}
			
			
			//오른쪽꺼
			count = -1;
			for(int j=xj+1; j<N; j++) {
				if(poArray[xi][j].equals("Y")) {
					break;
				}else if(poArray[xi][j].equals("L")) {
					continue;
				}else if(poArray[xi][j].equals("H")) {
					count++;
				}
				if(count>=1) {
					AnswerN++;
					count = -1;
				}
			}
			
			System.out.println("#"+test_case+" "+AnswerN);
		}
		
		
		
		
		
		sc.close();
		
	}
}

