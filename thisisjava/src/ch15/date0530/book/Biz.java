package ch15.date0530.book;

import java.util.ArrayList;
import java.util.List;

public class Biz {
	List<Book> bookList = new ArrayList<>();

	public List<Book> convert(String[] contents) {
		for(int i=0; i<contents.length; i++) {				
			bookList.add(new Book(contents[i].split("/")));
		}
		
		return bookList;
	}

}
