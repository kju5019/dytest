package ch06.date0516;

public class ReportCard {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//rc1
	public ReportCard(String name, int korean, int english, int math) {
		setName(name);
		setKorean(korean);
		setEnglish(english);
		setMath(math);		
	}
	
	//rc2
	public ReportCard(String name) {
		setName(name);
	}
	
	
	public int sum() {
		int result = korean+english+math;
		return result;
	}
	
	public int average() {
		int result = (sum())/3;
		return result;
	}
	
	public char hakjum() {
		char result = switch(average()/10){
		case 9,10 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		default -> 'D';
		};
		return result;
	}
	
	public void printInfo() {
		System.out.println("===== 성적 =====");
		System.out.println("이름: "+name);
		System.out.println("국어: "+korean);
		System.out.println("영어: "+english);
		System.out.println("수학: "+math);
		System.out.println("합계: "+sum());
		System.out.println("평균: "+average());
		System.out.println("학점: "+hakjum());
	}
	
	

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
