package ch06.date0516;

public class Pay {
	//필드
	private int hourPay;

	//생성자
	public Pay(int hourPay) {
		setHourPay(hourPay);
	}
	
	//Getter setter 메소드
	public int getHourPay() {
		return hourPay;
	}

	public void setHourPay(int hourPay) {
		this.hourPay = hourPay;
	}
	
	//메소드
	public int getDayPay() {
		return hourPay*8;
	}
	public int getWeekPay() {
		return getDayPay()*5;
	}
	public int getYearPay() {		
		return getWeekPay()*52;
	}

}
