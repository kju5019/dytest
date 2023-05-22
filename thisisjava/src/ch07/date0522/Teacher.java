package ch07.date0522;


public class Teacher extends Person{

	private String lesson; // 과목
	
	//생성자
	public Teacher() {
		System.out.println("Teacher() 기본생성자");
	}

	public Teacher(String lesson) {
		System.out.println("Teacher(String lesson)");
		this.lesson = lesson;
	}

	
	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
		System.out.println("Teacher(String name, int age, String lesson)");
	}

	//Getter Setter
	public void setLesson(String newLesson) {
		lesson = newLesson;
	}

	public String getLesson() {
		return lesson;
	}

	@Override
	public void printInfo() {
		System.out.print("Teacher.printInfo() : ");
		System.out.print("이름:  " + getName());
		System.out.print(" | 나이:  " + getAge());
		System.out.println(" | 과목: " + lesson);
	}

}
