package ch11.date0523.control1;

public class App {	//Service에서 try-catch
	
	public static void main(String args[]) {

		System.out.println("App.main()::Start");
		
		Control c = new Control();
		c.method();		
		
		System.out.println("App.main()::End");

	}

}