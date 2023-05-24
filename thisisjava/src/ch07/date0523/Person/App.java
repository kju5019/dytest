package ch07.date0523.Person;

public class App {
	public static void main(String[] args) {
		Person p = new Person("Paige",20);
		Student s = new Student("James",30,"2023-001");
		Teacher t = new Teacher("Victoria", 40,"Music");
		
		Biz biz = new Biz();
		
		System.out.println("===== Polymiphic Argument");
		
		biz.top(p);
		biz.top(s);
		biz.top(t);
		
		Biz.staticTop(p);
		Biz.staticTop(s);
		Biz.staticTop(t);
	}

}
