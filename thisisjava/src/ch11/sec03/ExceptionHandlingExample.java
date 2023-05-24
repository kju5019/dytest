package ch11.sec03;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			}catch(ArrayIndexOutOfBoundsException e) {		//array[2]가 없어서 오류
				System.out.println("배열 인덱스가 초과됨: "+ e.getMessage());
			}catch(NumberFormatException e) {				//1oo이 숫자 형식에 안맞음
				System.out.println("숫자로 변환할 수 없음: "+ e.getMessage());				
			}
		}
	}

}
