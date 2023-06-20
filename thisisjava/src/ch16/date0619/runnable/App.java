package ch16.date0619.runnable;

public class App {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<30; i++) {
					System.out.print("|");
				}

			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		// ===== Lamda =====
		Runnable r2 = () -> {
			for(int i=0; i<10; i++) {
				System.out.print("-");
			}
		};

		Thread t2 = new Thread(r2);
		t2.start();


	}
}
