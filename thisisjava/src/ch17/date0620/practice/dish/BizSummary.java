package ch17.date0620.practice.dish;

import java.util.List;

public class BizSummary {

	public static long houManyDishes(List<Dish> menu) {
		System.out.println("\n----- houManyDishes() -----");
		return menu.size();
	}

	public static int getTotalCalory(List<Dish> menu) {
		System.out.println("\n----- getTotalCalory() -----");
		int total = 0;
//		menu.stream()
//				.forEach(m -> total += m.getCal());
		return total;
	}

	public static double getAverageCalory(List<Dish> menu) {
		System.out.println("\n----- getAverageCalory() -----");
		return 0;
	}

	public static Dish getMostCaloricDish(List<Dish> menu) {
		System.out.println("\n----- getMostCaloricDish() -----");
		return null;
	}

	public static Dish getLeastCaloricDish(List<Dish> menu) {
		System.out.println("\n----- getLeastCaloricDish() -----");
		return null;
	}

	public static String getDishNameWithComma(List<Dish> menu) {
		System.out.println("\n----- getDishNameWithComma() -----");
		return null;
	}

}
