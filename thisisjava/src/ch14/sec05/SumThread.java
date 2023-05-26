package ch14.sec05;

import lombok.Data;

@Data
public class SumThread extends Thread{

	private long sum;

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
	
	
}
