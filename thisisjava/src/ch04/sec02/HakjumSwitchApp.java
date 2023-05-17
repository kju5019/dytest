package ch04.sec02;

public class HakjumSwitchApp {

	public static void main(String[] args) {
		int korean = 88;
		int english = 92;
		int math = 10;
		System.out.println("국어: "+korean);
		System.out.println("영어: "+english);
		System.out.println("수학: "+math);
		
		
		int sum = korean + english + math;
		int avg = sum / 3;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		
		
		String grade = switch(avg/10){
		case 9, 10 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		default -> "D";
		};
		System.out.println("등급: "+grade);
		
	}

}
