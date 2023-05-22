package ch07.date0522.polymophism;

public class App {

	public static void main(String[] args) {
		System.out.println("===== Person =====");
		Person p = new Person("Paige", 20);
		System.out.println("p.getName(): "+ p.getName());
		System.out.println("p.getAge(): "+ p.getAge());

		System.out.println("\n===== Student =====");
	}

}
