package ch11.date0523.control2;

public class Control {
	
	public void method() {
		System.out.println("\tControl.method()::Start");	
		try {
		Service s = new Service();
		s.method();		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\t----- catch : Control.method() -----");
		}finally {
			System.out.println("\t----- fianally : Control.method() -----");
		}
		System.out.println("\tControl.method()::End");
	}

}
