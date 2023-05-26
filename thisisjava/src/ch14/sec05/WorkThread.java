package ch14.sec05;

import lombok.Data;

@Data
public class WorkThread extends Thread {
	public boolean work = true;
	
	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {
				try {
					System.out.println(getName() + " 작업처리");
					sleep(500);
				} catch (InterruptedException e) {
				}
			} else {
				Thread.yield();
			}
		}
	}
	
	

}
