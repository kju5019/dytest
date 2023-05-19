package ch05.date0518;

public class WeekIntent {

	public static void main(String[] args) {
		String daysString = "일,월,화,수,목,금,토";
		
		for(int i =0; i<daysString.length(); i+=2) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("\t");
			}
			System.out.println(daysString.charAt(i)+"요일");
		}
		
		
		String[] days = daysString.split(",");
		for(int i =0; i<days.length; i++) {
			for(int j=0; j<i; j++ ) {
				System.out.print("\t");
			}
			System.out.println(days[i]+"요일");
		}

	}

}
