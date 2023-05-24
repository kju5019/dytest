package ch11.date0523.control4;

public class Service {

	public void method() throws ArrayIndexOutOfBoundsException{
		System.out.println("\t\tService.method()::Start");

		
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
		
		for (int i = 0; i < 4; i++) {
			System.out.println("\t\tstringArray[" + i + "]=" + stringArray[i]);
		}
		

		System.out.println("\t\tService.method()::End");
	}

}
