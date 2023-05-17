package ch06.date0517;

public class DateDotUtil {

	public static String dotDate(String date) {
		String yearNum = date.substring(0,4);
		String monthNum = date.substring(4,6);
		String dayNum = date.substring(6);
		return yearNum+"."+monthNum+"."+dayNum;
	}

	public static String dashDate(String date) {
		String yearNum = date.substring(0,4);
		String monthNum = date.substring(4,6);
		String dayNum = date.substring(6);
		return yearNum+"-"+monthNum+"-"+dayNum;
	}

}
