package ch06.date0517;

public class Data {

	private int no;
	private static int count=0;
	
	public Data() {
		no = no + 1;
		count = count + 1;
	}
	
	public void printInfo() {
		System.out.println("번호: "+no);
		System.out.println("카운트: "+count);
	}
}
