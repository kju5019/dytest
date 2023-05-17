package ch06.date0515;

public class Teacher {
	String name;
	int age;
	String lesson;
	
	
	
	public void printInfo() {
		System.out.println("===== Teacher Info=====");
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println("과목: "+ lesson);		
	}
	
	
	//Getter Setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

}
