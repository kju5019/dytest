package ch17.sec04;

import java.util.stream.IntStream;

public class StreamExample3 {
	public static int sum;
	
	public static void main(String[] args) {
	IntStream stream = IntStream.rangeClosed(1, 100);
	stream.forEach(a -> sum += a);
	System.out.println("총합: " + sum);
	}

}
