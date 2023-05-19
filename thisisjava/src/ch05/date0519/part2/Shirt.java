package ch05.date0519.part2;

import java.text.DecimalFormat;

public class Shirt {
	private String name;
	private String color;
	private String company;
	private String materials;
	private String size;
	private int price;
	
	DecimalFormat df = new DecimalFormat("#,###");
	
	public Shirt(String name, String color, String company, String materials, String size, int price) {
		
		this.name = name;
		this.color = color;
		this.company = company;
		this.materials = materials;
		this.size = size;
		this.price = price;
	}

	
	public void printShirt() {
		System.out.println("상품명: "+name);
		System.out.println("색상: "+color);
		System.out.println("제조사: "+company);
		System.out.println("소재: "+materials);
		System.out.println("크기: "+size);
		System.out.println("가격: "+df.format(price)+"(원)");		
	}
	
	
	
	
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
