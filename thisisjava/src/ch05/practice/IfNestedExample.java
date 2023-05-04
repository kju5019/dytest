package ch05.practice;

public class IfNestedExample {	
	String grade =null;

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		
		Grade g = new Grade();
		g.GradeFunction(score);
		
		//ine.grade = " "
				
		System.out.println("점수: " + score);								
		System.out.println("학점: "+g.grade);		
	}
		
}
