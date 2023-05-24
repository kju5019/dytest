package ch11.date0523.control3;

public class Control {
	
	public void method() throws ArrayIndexOutOfBoundsException{
		System.out.println("\tControl.method()::Start");	

		Service s = new Service();
		s.method();		


		System.out.println("\tControl.method()::End");
	}

}
