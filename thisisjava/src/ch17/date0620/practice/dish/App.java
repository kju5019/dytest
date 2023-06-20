package ch17.date0620.practice.dish;

import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Dish> menu = DishUtil.getMenu();
		
		Biz.viewMenu(menu);
		Biz.viewHighCaloriesMenu(menu);
		Biz.viewLowCaloriesMenu(menu);
		Biz.viewFishMenu(menu);
		Biz.viewMeatMenu(menu);
		Biz.viewVegetarianMenu(menu);
		

		System.out.println("\n===== Summary =====");
		long howManyDishes = BizSummary.houManyDishes(menu);
		System.out.println("Dishes : " + howManyDishes);
		
//		int totalCalory = BizSummary.getTotalCalory(menu);
//		System.out.println("Calory : " + totalCalory + "(kcal)");
//		
//		double averageCalory = BizSummary.getAverageCalory(menu);
//		System.out.println("Calory : " + averageCalory + "(kcal)");
//		
//		Dish mostCaloricDish = BizSummary.getMostCaloricDish(menu);
//		System.out.println("Dish : " + mostCaloricDish.getName() + " | " + mostCaloricDish.getCal() + "(kcal)");
//		
//		Dish leastCaloricDish = BizSummary.getLeastCaloricDish(menu);
//		System.out.println("Dish : " + leastCaloricDish.getName() + " | " + leastCaloricDish.getCal() + "(kcal)");
//		
//		String dishNameWithComma = BizSummary.getDishNameWithComma(menu);
//		System.out.println("Name : " + dishNameWithComma);
	}

}
