package ch11.date0523.control1;

public class Control {
	
	public void method() {
		System.out.println("\tControl.method()::Start");	
		
		Service s = new Service();
		s.method();		
		
		System.out.println("\tControl.method()::End");
	}

}
