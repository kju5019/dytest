package ch06.date0516;

public class UserApp {

	public static void main(String[] args) {
		User u1 = new User();
		
		u1.setName("James");
		u1.setAge(30);
		u1.setSex('M');
		u1.setHeight(178.5F);
		u1.setMarry(true);
		u1.printInfo();
		
		User u2 = new User("Paige",25,'W');
		u2.setHeight(175.2f);
		u2.setMarry(true);
		u2.printInfo();
		
		User u3 = new User("Victoria",30,'W',180.0f,false);
		u3.printInfo();
		

	}

}
