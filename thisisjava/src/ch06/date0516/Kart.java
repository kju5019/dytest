package ch06.date0516;

public class Kart {
	//필드
	private String name;
	private String color;
	private int speed;
	private int booster;
	
	//생성자
	public Kart(String name, String color) {
		setName(name);
		setColor(color);
	}

	//메소드
	public void printKartInfo() {
		System.out.println("["+name+"("+color+")]");
		System.out.println("SpeedUp 증가 속도 : 40(km)");
		System.out.println("SpeedDown 감소 속도 : 80(km)");
		System.out.println("카트 최대 속도 : 150(km)");
		System.out.println("부스터 사용시 증가 속도 : 100(km)");
		System.out.println("부스터 최대 개수 : 1(개)");		
	}
	
	public void speedUp() {
		speed += 40;
		if(speed>150) {speed = 150;}
		System.out.println("["+name+"("+color+")] speedUp | 속도 : "+speed+"(km) | 부스터 : "+booster+"(개)");
	}
	
	public void pickupBooster() {
		if(booster == 0) {
			booster++;
			System.out.println("["+name+"("+color+")] pickupBooster | 속도 : "+speed+"(km) | 부스터 : "+booster+"(개)");
		}else if(booster == 1) {
			System.out.println("["+name+"("+color+")] pickupBooster | 속도 : "+speed+"(km) | 부스터 : "+booster+"(개)"
								+" | 부스터를 더이상 추가할 수 없습니다.");
		}
	}
	
	public void useBooster() {
		if(booster == 1) {
			booster--;
			speed += 100;
			if (speed > 150) {speed = 150;}
			System.out.println("["+name+"("+color+")] useBooster | 속도 : "+speed+"(km) | 부스터 : "+booster+"(개)");

		}else if(booster == 0) {
			System.out.println("["+name+"("+color+")] useBooster | 속도 : "+speed+"(km) | 부스터 : "+booster+"(개)"
								+" | 사용 가능한 부스터가 없습니다.");
		}
		
	}
	public void speedDown() {
		speed -= 80;
		if(speed<0) {speed = 0;}
		System.out.println("["+name+"("+color+")] speedDown | 속도 : "+speed+"(km) | 부스터 : "+booster+"(개)");
	}
	
	
	
	
	
	
	
	
	
	
	//Getter Setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getBooster() {
		return booster;
	}

	public void setBooster(int booster) {
		this.booster = booster;
	}

	
	
}
