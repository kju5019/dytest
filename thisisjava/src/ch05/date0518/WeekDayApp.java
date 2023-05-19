package ch05.date0518;

public class WeekDayApp {

	public static void main(String[] args) {
		
		String[] weekDay;
		weekDay = new String[] {"월","화","수","목","금","토","일"};
		
		System.out.println("===== Week Day =====");
		
		for(int i=0 ;i< weekDay.length; i++) {
			System.out.println("weekDay["+i+"] "+weekDay[i]+"요일");
			
		}

	}

}
