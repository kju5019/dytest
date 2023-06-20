package ch17.date0620.filter;

import java.util.Arrays;
import java.util.List;

public class StreamIntegerFilterApp {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("===== Stream.filter() =====");
		System.out.println("짝수만 출력");
		
		list.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		list.stream().filter(n -> n%2==0)
					.forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println();
		System.out.println();
		

		
		
		
		List<String> list2 = Arrays.asList("Paige", "James", "Smith", "Tom", "Victoria");


		// - "a" 가 포함되어 있는 문자열 출력
		list2.stream().filter(n -> n.contains("a")).forEach(n -> System.out.print(n + " "));
		System.out.println();		

		// - 시작문자 : P, 종료문자 : e, 길이 : 5이상 문자열 출력
		// - 여러 조건은 && 로 연결
		list2.stream().filter(n -> n.startsWith("P"))
						.filter(n -> n.endsWith("e"))
						.filter(n -> n.length()>=5)
						.forEach(n -> System.out.println(n + " "));

	}

}
