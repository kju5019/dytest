package ch11.date0523.control4;

public class App {	//main에서도 throw ===> 서버 다운

	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{

		System.out.println("App.main()::Start");


		Control c = new Control();
		c.method();

		System.out.println("App.main()::End");
	}

}