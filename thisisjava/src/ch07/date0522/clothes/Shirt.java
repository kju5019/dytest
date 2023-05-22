package ch07.date0522.clothes;

public class Shirt extends Clothes{
	private String sleeveCategory;
	private String size;

	public Shirt(String product, String color, String company,String sleeveCategory, String size) {
		super(product, color, company);
		this.sleeveCategory = sleeveCategory;
		this.size = size;		
	}
	
	
	public void printInfo() {
		System.out.println("\n===== Shirt Info=====");
		System.out.println("제품: "+getProduct()+" | 색상: "+getColor()+" | 제조사: "+getCompany()
							+" | 소매유형: "+sleeveCategory+" | 크기: "+size);
	}

}
