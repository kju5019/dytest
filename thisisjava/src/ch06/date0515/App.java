package ch06.date0515;

public class App {
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		System.out.println(movie.getTitle());
		System.out.println(movie.getCategory());
		System.out.println(movie.getDirector());
		System.out.println(movie.getRunningTime());
		
		System.out.println("===== Field =====");
		
		movie.setTitle("탑건: 매버릭");
		System.out.println(movie.getTitle());
		System.out.println(movie.getCategory());
		System.out.println(movie.getDirector());
		System.out.println(movie.getRunningTime());
		System.out.println("-----------");
		
		movie.setCategory("액션");
		System.out.println(movie.getTitle());
		System.out.println(movie.getCategory());
		System.out.println(movie.getDirector());
		System.out.println(movie.getRunningTime());
		System.out.println("-----------");
		
		movie.setDirector("조셉 코신스키");
		System.out.println(movie.getTitle());
		System.out.println(movie.getCategory());
		System.out.println(movie.getDirector());
		System.out.println(movie.getRunningTime());
		System.out.println("-----------");
		
		movie.setRunningTime(132);
		System.out.println(movie.getTitle());
		System.out.println(movie.getCategory());
		System.out.println(movie.getDirector());
		System.out.println(movie.getRunningTime());
		
		
	}
}
