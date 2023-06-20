package ch17.date0620;

import java.util.stream.IntStream;

public class rangeApp {
	public static int sum;

	public static void main(String[] args) {

		System.out.println("===== Java =====");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}

		System.out.println("\n\n===== Stream =====");
		IntStream stream = IntStream.range(0, 10);
		stream.forEach(a -> System.out.print(a));
		


		System.out.println("\n\n----- Method Reference -----");
		IntStream.range(0,10).forEach(System.out :: print);
	}

}
