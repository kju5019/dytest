package ch17.sec06;

import lombok.Data;

@Data
public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {		
		this.name = name;
		this.score = score;
	}

}
