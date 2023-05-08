package ch05.practice;

class Grade {
	String grade = null;
	
	void GradeFunction(int s) {		
		if(s>=90) {
			if(s>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(s>=85){
				grade = "B+";
			} else {
				grade = "B";
			}
		}
	}
}

class Grade2 {
	String grade = null;
	
	void GradeFunction(int s) {		
		if(s>=90) {
			if(s>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(s>=85){
				grade = "B+";
			} else {
				grade = "B";
			}
		}
	}
}
