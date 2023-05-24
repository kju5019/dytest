package ch11.date0523.control3;

public class App {	//main에서 throws ArrayIndexOutOfBoundsException

	public static void main(String args[]) {

		System.out.println("App.main()::Start");

		try {
			Control c = new Control();
			c.method();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("----- catch : Main.method() -----");
		} finally {
			System.out.println("----- fianally : Main.method() -----");
			System.out.println("App.main()::End");
		}


	}

}