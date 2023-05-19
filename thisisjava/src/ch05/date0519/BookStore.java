package ch05.date0519;

public class BookStore {
	private Book[] bookArray;

	public BookStore(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	//북스토어 전체 도서 정보
	public void printBookStore() {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			index++;
			System.out.println("\n"+index+".");
			bookArray[i].printBook();
		}
		
	}

	//분야별 도서 정보
	public void printBookByCategory(String category) {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			if(bookArray[i].getCategory() == category) {
				index++;
				System.out.println("\n"+index+".");
				bookArray[i].printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	////특정 ISBN 도서 정보
	public void printBookByIsbn(String isbn) {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			if(bookArray[i].getIsbn() == isbn) {
				index++;
				System.out.println("\n"+index+".");
				bookArray[i].printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	//특정 글자가 들어가는 제목의 도서 정보
	public void printBookByTitleLike(String title) {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			if(bookArray[i].getTitle().contains(title)) {
				index++;
				System.out.println("\n"+index+".");
				bookArray[i].printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	//특정 금액 이하 도서 목록
	public void printBookByMaxPrice(int maxPrice) {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			if(bookArray[i].getPrice() <= maxPrice) {
				index++;
				System.out.println("\n"+index+".");
				bookArray[i].printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	//특정 금액 이상 도서 목록
	public void printBookByMinPrice(int minPrice) {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			if(bookArray[i].getPrice() >= minPrice) {
				index++;
				System.out.println("\n"+index+".");
				bookArray[i].printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

	//특정 금액 사이인 도서 목록
	public void printBooksByBetweenPrice(int betweenMinPrice, int betweenMaxPrice) {
		int index = 0;
		for(int i=0; i<bookArray.length; i++) {
			if((bookArray[i].getPrice() >= betweenMinPrice) && (bookArray[i].getPrice() <= betweenMaxPrice)) {
				index++;
				System.out.println("\n"+index+".");
				bookArray[i].printBook();
			}
		}
		if(index==0) {
			System.out.println("\nNo data available");
		}
		
	}

}
