package ch14.sec03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("웅");
					try {
						Thread.sleep(500);
					} catch (Exception e) {

					}
				}
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

}
