package ch05.practice;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재시간: "+time+"시");
		
		TimeWalk tw = new TimeWalk();
	   	tw.worktime(time);

	}

}
