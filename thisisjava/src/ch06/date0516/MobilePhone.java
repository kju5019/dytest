package ch06.date0516;

public class MobilePhone {
	private String company;
	private String produckName;
	private String os;
	private String color;
	private boolean pen;
	private int memory;
	private int storage;
	private int battery;
	
	
	public void printInfo() {
		System.out.println("\n===== Mobile Phone Info =====");
		System.out.println("회사: " + company);
		System.out.println("제품: " + produckName);
		System.out.println("운영체제: " + os);
		System.out.println("컬러: " + color);
		
		if(pen) {System.out.println("펜: 지원");}
		else {System.out.println("펜: 미지원");}
		
		System.out.println("메모리: " + memory + " (GB)");
		System.out.println("스토리지: " + storage + " (GB)");
		System.out.println("배터리: " + battery + " (mAh)");
	}
	
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProduckName() {
		return produckName;
	}
	public void setProduckName(String produckName) {
		this.produckName = produckName;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPen() {
		return pen;
	}
	public void setPen(boolean pen) {
		this.pen = pen;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	

}
