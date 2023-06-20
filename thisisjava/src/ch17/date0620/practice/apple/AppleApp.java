package ch17.date0620.practice.apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppleApp {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
				new Apple (200, Color.GREEN),
				new Apple (180, Color.RED),
				new Apple (120, Color.RED),
				new Apple (80, Color.GREEN),
				new Apple (155, Color.GREEN)
				);
		
		System.out.println("\n===== 녹색 사과(정렬:무게) =====");
		List<Apple> greenApples = null;
		greenApples = inventory.stream()
					.filter(item -> item.getColor().equals(Color.GREEN))
					.sorted((s1,s2) -> Integer.compare(s1.getWeight(), s2.getWeight()))
					.collect(Collectors.toList());
		
		for(Apple apple : greenApples) {
			apple.printInfo();
		}
		
		
		System.out.println("\n===== 무거운 사과(정렬:무게) =====");
		System.out.println("+ 기준 : 무게가 150 이상");
		List<Apple> heavyApples = null;
		heavyApples = inventory.stream()
					.filter(item -> item.getWeight()>=150)
					.sorted((s1,s2) -> Integer.compare(s1.getWeight(), s2.getWeight()))
					.collect(Collectors.toList());
		
		for(Apple apple : heavyApples) {
			apple.printInfo();
		}
		
		
		
		System.out.println("\n===== 무거운 빨간 사과 =====");
		List<Apple> redHeavyApples = null;
		redHeavyApples = inventory.stream()
					.filter(item -> item.getColor().equals(Color.RED))
					.filter(item -> item.getWeight()>=150)
					.sorted((s1,s2) -> Integer.compare(s1.getWeight(), s2.getWeight()))
					.collect(Collectors.toList());
		
		for(Apple apple : redHeavyApples) {
			apple.printInfo();
		}

	}

}
