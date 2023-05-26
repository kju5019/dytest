package ch13.date0526.menu;

import lombok.Data;

@Data
public class Box<T> {
	T data;
	
	public Box() {		
	}
	
	public Box(T data) {
		this.data = data;
	}
	
	
	
}
