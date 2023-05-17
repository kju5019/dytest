package ch06.date0516;

public class Movie {
	String title;
	String category;
	String director;
	int runningTime;
	
	public Movie() {
	}
	
	public Movie(String title) {
		this.title = title;
	}
	
	public Movie(String title, String category) {
		this(title);
		this.category = category;
	}

	public Movie(String title, String category, String director) {
		this(title, category);
		this.director = director;
	}

	public Movie(String title, String category, String director, int runningTime) {
		this(title, category, director);
		this.runningTime = runningTime;
	}
	
	
	public void printInfo() {
		System.out.println("\n===== Movie Info =====");
		System.out.println("제목: "+title);
		System.out.println("카테고리: "+category);
		System.out.println("감독: "+director);
		System.out.println("상영시간: "+runningTime);
	}
	
}
