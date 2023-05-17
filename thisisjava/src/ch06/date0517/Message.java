package ch06.date0517;

public class Message {

	public void printInfo(String str) {
		System.out.println(str);
	}
	
	public void printInfo(int i) {
		System.out.println(i);
	}
	
	public void printInfo(String str, int i) {
		System.out.println(str+", "+i);
	}
	
	public void printInfo(int i, String str) {
		System.out.println(i+", "+str);
	}
	
}
