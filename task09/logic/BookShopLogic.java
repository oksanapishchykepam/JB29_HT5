package by.oks.jb29_les09.task09.logic;

import java.util.ArrayList;
import java.util.List;
import by.oks.jb29_les09.task09.bean.Book;
import by.oks.jb29_les09.task09.bean.BookShop;

public class BookShopLogic {

	public List<Book> findByYear(BookShop books, int year) {
		List<Book> list = new ArrayList<Book>();

		for (int i = 0; i < books.getShop().size(); i++) {
			if (books.getShop().get(i).getPublishYear() >= year) {
				list.add(books.getShop().get(i));
			}
		}

		return list;
	}

	public List<Book> findByPublisher(BookShop books, String publisher) {
		List<Book> list = new ArrayList<Book>();

		for (int i = 0; i < books.getShop().size(); i++) {
			if (books.getShop().get(i).getPublisher() == publisher) {
				list.add(books.getShop().get(i));
			}
		}

		return list;
	}

	public List<Book> findByAuthor(BookShop books, String author) {
		List<Book> list = new ArrayList<Book>();

		for (int i = 0; i < books.getShop().size(); i++) {
			if (books.getShop().get(i).getAuthor() == author) {
				list.add(books.getShop().get(i));
			}
		}

		return list;
	}

	public void printBookList(List<Book> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
