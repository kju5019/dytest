package ch07.sec05;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		super.speedUp();
		speed += 10;
	}

/*	@Override											//final 메소드는 오버라이딩 할 수 없음
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
*/	
}
