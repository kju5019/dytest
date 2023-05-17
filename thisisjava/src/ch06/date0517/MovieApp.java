package ch06.date0517;

public class MovieApp {

	public static void main(String[] args) {
		
		System.out.println("===== Creation =====");
		Movie movie = new Movie("탑건:매버릭","액션","조셉 코신스키",132);
		Movie movie2 = new Movie();
		
		System.out.println("\n===== Field =====");
	
		System.out.println("\n===== Object1 =====");
		System.out.println(movie.title);		
		System.out.println(movie.category);		
		System.out.println(movie.director);		
		System.out.println(movie.runningTime);
		
		
		
		System.out.println("\n===== Object2 =====");
		movie2.title = "아바타:물의 길";
		System.out.println(movie.title);
		movie2.category = "SF";
		System.out.println(movie.category);
		movie2.director = "제임스 카메론";
		System.out.println(movie.director);
		movie2.runningTime = 192;
		System.out.println(movie.runningTime);

	}

}
