package ch17.sec04;

import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.println(item + ", "));
		System.out.println();
		
		Arrays.stream(strArray).forEach(item -> System.out.println(item + ", "));
		System.out.println();
		
		
		int[] intArray = {1,2,3,4,5};
		Arrays.stream(intArray).forEach(item -> System.out.println(item + ","));
		System.out.println();
		

		

	}

}
