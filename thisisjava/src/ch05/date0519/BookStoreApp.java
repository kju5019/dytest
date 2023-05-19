package ch05.date0519;

public class BookStoreApp {

	public static void main(String[] args) {
		
		Member member = new Member("coldwinter","Victoria","A",5000);
		
		Book[] bookArray = new Book[5];
		bookArray[0] = BookService.makeBook("comic","열혈강호", "전극진,양재현", "대원씨아이", 4500, "979-11-5754-926-9");
		bookArray[1] = BookService.makeBook("travel", "뉴욕 100배 즐기기", "홍지윤", "알에이치코리아", 14400, "978-89-255-8673-1");
		bookArray[2] = BookService.makeBook("travel", "바르셀로나 지금이 좋아", "정다운", "중앙북스", 15000, "978-89-991-7580-0");
		bookArray[3] = BookService.makeBook("food", "오늘의 맥주", "이성준", "오운", 18000, "979-11-92814-04-9");
		bookArray[4] = BookService.makeBook("food", "버번 위스키의 모든 것", "조승원", "(주)교유당", 24000, "979-11-90277-42-6");

		BookStore bs = new BookStore(bookArray);
		
		//북스토어 전체 도서 정보
		System.out.println("\n===== printBookStore() =====");
		bs.printBookStore();
		
		
		
		//분야별 도서 정보
		System.out.println("\n===== printBookByCategory() =====");
		
		System.out.println("\n----- comic -----");
		String category = "comic";
		bs.printBookByCategory(category);
		
		System.out.println("\n----- travel -----");
		category = "travel";
		bs.printBookByCategory(category);
		
		System.out.println("\n----- food -----");
		category = "food";
		bs.printBookByCategory(category);
		
		System.out.println("\n----- health -----");
		category = "health";
		bs.printBookByCategory(category);
		
		
		
		//특정 ISBN 도서 정보
		System.out.println("\n===== printBookByIsbn() =====");
		
		System.out.println("\n----- 979-11-90277-42-6 -----");
		String isbn = "979-11-90277-42-6";
		bs.printBookByIsbn(isbn);
		
		
		System.out.println("\n----- 979-11-90277-42-7 -----");
		isbn = "979-11-90277-42-7";
		bs.printBookByIsbn(isbn);
		
		
		
		//특정 글자가 들어가는 제목의 도서 정보
		System.out.println("\n===== printBookByTitleLike() =====");
		
		System.out.println("\n----- 뉴욕 -----");
		String title = "뉴욕";
		bs.printBookByTitleLike(title);
		
		System.out.println("\n----- 서울 -----");
		title = "서울";
		bs.printBookByTitleLike(title);
		
		
		
		//특정 금액 이하 도서 목록
		System.out.println("\n===== printBookByMaxPrice() =====");
		
		System.out.println("\n----- 10000 -----");
		int maxPrice = 10000;
		bs.printBookByMaxPrice(maxPrice);
		
		System.out.println("\n----- 2000 -----");
		maxPrice = 2000;
		bs.printBookByMaxPrice(maxPrice);
		
		
		
		//특정 금액 이상 도서 목록
		System.out.println("\n===== printBookByMinPrice() =====");
		
		System.out.println("\n----- 15000 -----");
		int minPrice = 15000;
		bs.printBookByMinPrice(minPrice);
		
		System.out.println("\n----- 50000 -----");
		minPrice = 50000;
		bs.printBookByMinPrice(minPrice);
		
		
		
		//특정 금액 사이인 도서 목록
		System.out.println("\n===== printBooksByBetweenPrice =====");
		
		System.out.println("\n----- 5000 ~ 20000 -----");
		int betweenMinPrice = 5000;
		int betweenMaxPrice = 20000;
		bs.printBooksByBetweenPrice(betweenMinPrice,betweenMaxPrice);
		
		System.out.println("\n----- 50000 ~ 200000 -----");
		betweenMinPrice = 50000;
		betweenMaxPrice = 200000;
		bs.printBooksByBetweenPrice(betweenMinPrice,betweenMaxPrice);
		
	}

}
