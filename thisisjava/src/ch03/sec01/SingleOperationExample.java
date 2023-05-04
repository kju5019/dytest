package ch03.sec01;

public class SingleOperationExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z1;
		int z2;
		
		z1 = x++;
		z2 = ++y;
		
		System.out.printf("z1: %d\nz2: %d",z1,z2);
		
	}

}
