package ch06.date0516;

public class SunCream {
	String company;
	String Product;
	boolean sticky;
	char skinType;
	int volume;
	int spf;
	String pa;
	
	
	public void printInfo() {
		System.out.println("\n=====SunCream Info=====");
		System.out.println("회사: " + company);
		System.out.println("제품: " + Product);
		
		if(sticky) {System.out.println("끈적임 있음");}
		else {System.out.println("끈적임 없음");}
		
		switch(skinType) {
		case 's' -> System.out.println("피부타입: 민감성");
		case 'o' -> System.out.println("피부타입: 지성");
		case 'n' -> System.out.println("피부타입: 중성");
		case 'd' -> System.out.println("피부타입: 건성");
		}
		
		System.out.println("용량: " + volume + "(ml)");
		System.out.println("SPF: " + spf);
		System.out.println("PA: " + pa);
	}
	
	
	public void setCompany(String company) {
		this.company = company;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public void setSticky(boolean sticky) {
		this.sticky = sticky;
	}
	public void setSkinType(char skinType) {
		this.skinType = skinType;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setSpf(int spf) {
		this.spf = spf;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	
}
