package ch15.date0530.book;

import java.util.List;

public class BookStore {
	private Book[] bookArray;
	List<Book> bookList;

	public BookStore(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	public BookStore(List<Book> bookList) {
		this.bookList = bookList;
	}

	//북스토어 전체 도서 정보
	public void printBookStore() {
		int index = 0;
		for(int i=0; i<bookList.size(); i++) {
			index++;
			System.out.println("\n"+index+".");
			bookList.get(i).printBook();
		}
		
	}

	//분야별 도서 정보
	public void printBookByCategory(String category) {
		int index = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getCategory().equals(category)) {
				index++;
				System.out.println("\n"+index+".");
				bookList.get(i).printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	////특정 ISBN 도서 정보
	public void printBookByIsbn(String isbn) {
		int index = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getIsbn().equals(isbn)) {
				index++;
				System.out.println("\n"+index+".");
				bookList.get(i).printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}


	//특정 금액 이하 도서 목록
	public void printBookByMaxPrice(int maxPrice) {
		int index = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getPrice() <= maxPrice) {
				index++;
				System.out.println("\n"+index+".");
				bookList.get(i).printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	//특정 금액 이상 도서 목록
	public void printBookByMinPrice(int minPrice) {
		int index = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getPrice() >= minPrice) {
				index++;
				System.out.println("\n"+index+".");
				bookList.get(i).printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	//특정 금액 사이인 도서 목록
	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		int index = 0;
		for(int i=0; i<bookList.size(); i++) {
			if((bookList.get(i).getPrice() >= betweenMinPrice) && (bookList.get(i).getPrice() <= betweenMaxPrice)) {
				index++;
				System.out.println("\n"+index+".");
				bookList.get(i).printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

}
