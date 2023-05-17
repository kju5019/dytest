package ch06.date0517;

public class Movie {
	String title;
	String category;
	String director;
	int runningTime;
	
	public Movie() {
		System.out.println("Movie()");
	}

	public Movie(String title, String category, String director, int runningTime) {
		System.out.println("Movie(String title, String category, String director, int runningTime)");
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
	}
	
	
}
