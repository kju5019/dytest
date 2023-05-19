package ch05.date0519.part2;

public class Member {
	private String id;
	private String name;
	private String grade;
	private int point;
	
	public Member(String id, String name, String grade, int point) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public void printInfo() {
		System.out.println("아이디: "+id);
		System.out.println("이름: "+name);
		System.out.println("등급: "+grade);
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
