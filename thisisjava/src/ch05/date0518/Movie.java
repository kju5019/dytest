package ch05.date0518;

public class Movie {

	private String title; // 제목
	private String category; // 카테고리
	private String director; // 감독
	private int runningTime; // 상영시간
	private String[] actorArray; // 배우

	// Constructor
	public Movie() {

	}

	public Movie(String title, String category, String director,
					int runningTime, String[] actorArray) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actorArray = actorArray;
	}

	// Method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}


	public void printInfo() {
		System.out.println("===== Movie Info =====");
		System.out.print("제목=" + title);
		System.out.print(" | 카테고리=" + category);
		System.out.print(" | 감독=" + director);
		System.out.println(" | 상영시간=" + runningTime + "(분)");
		System.out.println("\t----- Actor Info -----");
		

		
		
	}

}

