package ch06.date0517;

public class DataDoUtilApp {

	public static void main(String[] args) {
		String date = "20230501";
		
		System.out.println("===== YYYY.MM.DD =====");
		String dotDate = DateDotUtil.dotDate(date);
		System.out.println(dotDate);
		
		System.out.println("\n===== YYYY.MM.DD =====");
		String dashDate = DateDotUtil.dashDate(date);
		System.out.println(dashDate);

	}

}
