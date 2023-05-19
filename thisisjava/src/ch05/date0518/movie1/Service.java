package ch05.date0518.movie1;

public class Service {

	public static Actor getActor(String name, String sex, String birthdate, String nationality) {
		Actor a = new Actor(name,sex,birthdate,nationality);
		return a;
	}

}
