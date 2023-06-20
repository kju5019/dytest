package ch17.sec11;

import lombok.Data;

@Data
public class Student {
	private String name;
	private int score;
	
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}
