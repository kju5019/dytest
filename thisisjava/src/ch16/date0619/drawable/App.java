package ch16.date0619.drawable;

public class App {

	public static void main(String[] args) {

		System.out.println("\n===== Lamda =====");

		System.out.println("\n----- 1. -----");
		
		Drawable d2 = (color, lineType) -> {
			return color + " " + lineType;			
		};
		System.out.println(d2.draw("검은색", "점선 삼각형"));
		
		
		
		System.out.println("\n----- 2. -----");
		Drawable d3 = (color, lineType) -> {
			return color + " " + lineType;			
		};
		System.out.println(d3.draw("파란색", "실선 원"));

	}

}
