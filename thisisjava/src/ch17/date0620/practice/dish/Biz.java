package ch17.date0620.practice.dish;

import java.util.List;

public class Biz {

	//전체
	public static void viewMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 전체 =====");
		menu.stream()
				.forEach(f -> f.printInfo());
		
	}

	//고열량(500이상)
	public static void viewHighCaloriesMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 고열량(500이상) =====");
		menu.stream()
				.filter(f-> f.getCal() >=500)
				.sorted((f1,f2) -> Integer.compare(f2.getCal(), f1.getCal()))
				.forEach(f -> f.printInfo());
		
	}

	//저열량(300미만)
	public static void viewLowCaloriesMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 저열량(300미만) =====");
		menu.stream()
				.filter(f-> f.getCal() <= 300)
				.sorted((f1,f2) -> Integer.compare(f1.getCal(), f2.getCal()))
				.forEach(f -> f.printInfo());
	}

	//메뉴: 생선
	public static void viewFishMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 생선 =====");
		menu.stream()
				.filter(f -> f.getType().equals(Type.FISH))
				.forEach(f -> f.printInfo());
	}

	//메뉴: 고기
	public static void viewMeatMenu(List<Dish> menu) {
		System.out.println("\n===== 메뉴 : 고기 =====");
		menu.stream()
				.filter(f -> f.getType().equals(Type.MEAT))
				.forEach(f -> f.printInfo());
	}

	//채식 메뉴
	public static void viewVegetarianMenu(List<Dish> menu) {
		System.out.println("\n===== 채식 메뉴 =====");
		menu.stream()
				.filter(f -> f.isVeget())
				.forEach(f -> f.printInfo());
	}

}
