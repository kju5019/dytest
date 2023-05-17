package ch06.date0515;

public class FootballPlayer {
	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;
	
	public void printInfo() {
		System.out.println("\n===== FootballPlayer Info =====");
		System.out.println("선수: "+name);
		System.out.println("팀: "+teamName);
		System.out.println("유니폼 번호: "+uniformNumber);
		System.out.println("스피드: "+speed);
		System.out.println("기술: "+tech);
	}

}
