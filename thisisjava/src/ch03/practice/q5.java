package ch03.practice;

public class q5 {

	public static void main(String[] args) {

		int lengthTop = 5;
		int lengthButtom = 10;
		int height = 7;
		double area1 = ( (lengthTop+lengthButtom)*height/2.0 );
		double area2 = ( (lengthTop+lengthButtom)*height*1.0/2 );
		double area3 = ( (double)(lengthTop+lengthButtom)*height/2 );
		double area4 = ( (double)((lengthTop+lengthButtom)*height/2) );
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
		System.out.println("-----------------");
		
		
		int a = 3;
		int b = 2;

		double x = (double)(a/b);		//1.5 -> 1.0
		double y = (double)a/b;		//3.0 / 2 -> 1.5

		
		System.out.println(x);
		System.out.println(y);


	}

}
