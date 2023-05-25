package codingtest.q1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		String[][] poArray = new String[N][N];
		for(int i=0; i<N; i++) {
			String str = sc.nextLine();
			poArray[i] = str.split(" ");
		}
		System.out.println();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print("poArray["+i+"]["+j+"]:"+poArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
