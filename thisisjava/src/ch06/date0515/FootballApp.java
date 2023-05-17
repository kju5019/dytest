package ch06.date0515;

public class FootballApp {

	public static void main(String[] args) {

		FootballPlayer fp1 = new FootballPlayer();
		
		fp1.name = "Kim";
		fp1.uniformNumber = "7";
		fp1.teamName = "Real Madrid";
		fp1.speed = 5;
		fp1.tech = 5;
		fp1.printInfo();
		
		
		FootballPlayer fp2 = new FootballPlayer();
		
		fp2.name = "Lee";
		fp2.uniformNumber = "19";
		fp2.teamName = "Barcelona";
		fp2.speed = 4;
		fp2.tech = 3;
		fp2.printInfo();

	}

}
