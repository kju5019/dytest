package ch16.date0619.drawable2;

public class App {

	public static void main(String[] args) {

		System.out.println("\n===== Lamda =====");
		System.out.println("\n----- Type 1 -----");
		
		Drawable d1 = new Drawable() {
			@Override
			public void draw() {
				System.out.println("원을 그리다.");				
			}			
		};
		
		d1.draw();

		
		System.out.println("\n----- Type 2 -----");
		Paint paint = new Paint();
		Drawable d2 = () -> {
			paint.paintOrange();
		};
		
		d2.draw();
		
		
		
		System.out.println("\n----- Type 3 : Method Reference -----");
		Paint paint1 = new Paint();
		Drawable d3 = paint1::paintOrange;
		
		d3.draw();
		
		
	}

}
