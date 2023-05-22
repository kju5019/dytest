package ch07.date0522;

public class PrintInfoApp {
	public static void main(String[] args) {

		System.out.println("===== Person =====");
		Person p = new Person("Lee", 30);
		p.printInfo();

		System.out.println("\n===== Student =====");
		Student s = new Student("Park", 20, "2020-001");
		s.printInfo();

		System.out.println("\n===== Teacher =====");
		Teacher t = new Teacher("Hong", 25, "music");
		t.printInfo();
		
		System.out.println("\n===== Teacher =====");
		Person p1 = new Teacher("Hong", 25, "music");
		p1.printInfo();

	}

}
