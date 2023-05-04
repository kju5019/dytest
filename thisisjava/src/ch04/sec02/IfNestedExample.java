package ch04.sec02;

public class IfNestedExample {				//p.117  중첩 if문 -> switch문, switch문 표현식

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;		//81~100 뽑아냄
		String grade;
				
		System.out.println("if문");
		System.out.println("점수: " + score);
				
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85){
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: "+grade);
		System.out.println("------------------");
		
//------------------------------------------------------------------------------------------------------------
		
		System.out.println("switch문");
		System.out.println("점수: " + score);
		
		switch((score-80)/5) {
		case 0 : grade = "B"; break;			//81,82,83,84
		case 1 : grade = "B+"; break;			//85,86,87,88,89
		case 2 : grade = "A"; break;			//90,91,92,93,94
		default : grade = "A+"; break;			//95,96,97,98,99,100
		}
		
		System.out.println("학점: "+grade);
		System.out.println("------------------");

//------------------------------------------------------------------------------------------------------------	
		
		System.out.println("switch문 표현식");
		System.out.println("점수: " + score);
		
		grade = switch((score-80)/5) {
		case 0 -> "B";			
		case 1 -> "B+";			
		case 2 -> "A";			
		default -> "A+"	;			
		};
	
		System.out.println("학점: "+grade);
	
	}
}
