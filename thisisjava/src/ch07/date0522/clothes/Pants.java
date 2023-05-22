package ch07.date0522.clothes;

public class Pants extends Clothes{
	private String pantsCategory;

	public Pants(String product, String color, String company, String pantsCategory) {
		super(product, color, company);
		this.pantsCategory = pantsCategory;
	}
	
	public void printInfo() {
		System.out.println("\n===== Pants Info=====");
		System.out.println("제품: "+getProduct()+" | 색상: "+getColor()+" | 제조사: "+getCompany()
							+" | 바지유형: "+pantsCategory);
	}

}
