package ch15.date0530.book;

import java.text.DecimalFormat;
import java.util.List;

public class Book {
	private String category;
	private String title;
	private String writer;
	private String company;
	private int price;
	private String isbn;
	
	DecimalFormat df = new DecimalFormat("#,###");
	
	public Book(String category, String title, String writer, String company, int price, String isbn) {
		this.category = category;
		this.title = title;
		this.writer = writer;
		this.company = company;
		this.price = price;
		this.isbn = isbn;
	}
	

	public Book(String[] bookList) {
		this.category = bookList[0];
		this.title = bookList[1];
		this.writer = bookList[2];
		this.company = bookList[3];
		this.price = Integer.parseInt(bookList[4]);
		this.isbn = bookList[5];
	}

	//북스토어 전체 도서 정보
	public void printBook() {
		String cate=switch(category) {
		case "comic" -> "만화";
		case "travel" -> "여행";
		case "food" -> "음식";
		case "health" -> "건강";
		case "pc" -> "컴퓨터";
		default -> "기타";
		};
				
		System.out.println("분야: "+cate);
		System.out.println("제목: "+title);
		System.out.println("저자: "+writer);
		System.out.println("출판사: "+company);
		System.out.println("가격: "+df.format(price)+"(원)");
		System.out.println("isbn: "+isbn);
	}

	
	
	
	//Getter Setter
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
