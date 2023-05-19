package ch05.date0519.part2;

public class BookService {

	public static Book makeBook(String category, String title, String writer, String company, int price, String isbn) {
		
		return new Book(category, title, writer, company, price, isbn);
	}

}
