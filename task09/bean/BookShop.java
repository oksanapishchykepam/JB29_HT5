package by.oks.jb29_les09.task09.bean;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
	private List<Book> shop;

	public BookShop() {
		shop = new ArrayList<Book>();
	}

	public void addBook(Book newBook) {
		shop.add(newBook);

	}

	public void removeBook(Book book) {
		shop.remove(book);
	}

	public List<Book> getShop() {
		return shop;
	}
}
