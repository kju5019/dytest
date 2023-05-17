package ch06.date0516;

public class Kart2 {

	// Field
	private String name; // 이름. 세이버,솔리드,버스트 ...
	private String color; // 색깔

	private int speed; // 현재 속도
	private int upSpeed; // 증가 속도
	private int downSpeed; // 감소 속도
	private int maxSpeed; // 카트 최대속도
	private int boosterSpeed; // 부스터 사용시 증가 속도

	private int booster; // 현재 부스터 개수
	private int maxBooster; // 부스터 최대개수

	// Constructor
	public Kart2(String name, String color) {

		this.name = name;
		this.color = color;

		// Initialization
		this.speed = 0;
		this.upSpeed = 40;
		this.downSpeed = 80;
		this.maxSpeed = 150;
		this.boosterSpeed = 100;

		this.booster = 0;
		this.maxBooster = 1;
	}

	// Method
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

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getBooster() {
		return booster;
	}

	public void setBooster(int booster) {
		this.booster = booster;
	}

	public int getMaxBooster() {
		return maxBooster;
	}

	public void setMaxBooster(int maxBooster) {
		this.maxBooster = maxBooster;
	}

	public int getUpSpeed() {
		return upSpeed;
	}

	public void setUpSpeed(int upSpeed) {
		this.upSpeed = upSpeed;
	}

	public int getDownSpeed() {
		return downSpeed;
	}

	public void setDownSpeed(int downSpeed) {
		this.downSpeed = downSpeed;
	}

	public int getBoosterSpeed() {
		return boosterSpeed;
	}

	public void setBoosterSpeed(int boosterSpeed) {
		this.boosterSpeed = boosterSpeed;
	}

	public void printKartInfo() {
		System.out.println("===== Kart Info =====");
		System.out.println("[" + name + "(" + color + ")]");
		System.out.println(" SpeedUp 증가 속도 : " + upSpeed + "(km)");
		System.out.println(" SpeedDown 감소 속도 : " + downSpeed + "(km)");
		System.out.println(" 카트 최대 속도 : " + maxSpeed + "(km)");
		System.out.println(" 부스터 사용시 증가 속도 : " + boosterSpeed + "(km)");
		System.out.println(" 부스터 최대 개수 : " + maxBooster + "(개)");
	}

	public void printRunInfo(String action) {
		System.out.print("[" + name + "(" + color + ")]");
		System.out.print(" " + action);
		System.out.print(" | 속도 : " + speed + "(km)");
		System.out.println(" | 부스터 : " + booster + "(개)");
	}

	public void printRunInfo(String action, String message) {
		System.out.print("[" + name + "(" + color + ")]");
		System.out.print(" " + action);
		System.out.print(" | 속도 : " + speed + "(km)");
		System.out.print(" | 부스터 : " + booster + "(개)");
		System.out.println(" | " + message);
	}

	public void speedUp() {
		speed = speed + upSpeed;

		if (speed > maxSpeed) {
			speed = maxSpeed;
		}

		printRunInfo("speedUp");
	}

	public void speedDown() {
		speed = speed - downSpeed;

		if (speed < 0) {
			speed = 0;
		}

		printRunInfo("speedDown");
	}

	public void pickupBooster() {

		if (booster == maxBooster) {
			printRunInfo("pickupBooster", "부스터를 더 이상 추가할 수 없습니다.");
		} else {

			booster = booster + 1;

			if (booster > maxBooster) {
				booster = maxBooster;
			}

			printRunInfo("pickupBooster");
		}

	}

	public void useBooster() {

		if (booster == 0) {
			printRunInfo("useBooster", "사용 가능한 부스터가 없습니다.");
		} else {

			booster = booster - 1;

			if (booster < 0) {
				booster = 0;
			} else {
				speed = speed + boosterSpeed;

				if (speed > maxSpeed) {
					speed = maxSpeed;
				}
			}

			printRunInfo("useBooster");
		}

	}

}

