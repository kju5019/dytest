package ch13.date0530.dog;

public class BizApp {

	public static void main(String[] args) {
		System.out.println("===== Class : new Biz(Cat()) =====");
		Biz<Cat> bizCat = new Biz<Cat>(new Cat());
		System.out.println(bizCat.getClass().getSimpleName());
		Cat cat = bizCat.getT();
		System.out.println(cat.getClass().getSimpleName());
		cat.printInfo();
		
		
		System.out.println("\n===== Method : biz(new Eagle()) =====");
		Eagle eagle1 = bizCat.biz(new Eagle());
		eagle1.printInfo();

	}

}
