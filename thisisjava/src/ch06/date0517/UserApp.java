package ch06.date0517;

public class UserApp {

	public static void main(String[] args) {

		User user = new User();
		User user1 = new User("Lee", 20, 180.5f, 'M', true);
		
		System.out.println("\n===== printInfo =====");
		user.printInfo();
		user1.printInfo();

	}

}
