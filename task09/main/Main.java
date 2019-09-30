package by.oks.jb29_les09.task09.main;

import java.util.List;

import by.oks.jb29_les09.task09.bean.Book;
import by.oks.jb29_les09.task09.bean.BookShop;
import by.oks.jb29_les09.task09.logic.BookShopLogic;

/*Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
   a) список книг заданного автора;
   b) список книг, выпущенных заданным издательством;
   c) список книг, выпущенных после заданного года.*/

public class Main {

	public static void main(String[] args) {
		BookShop shop = new BookShop();

		shop.addBook(new Book(1, "Мастер и Маргарита", "Михаил Афанасьевич Булгаков", "АСТ", 2014, 446, 15, "мягкий"));
		shop.addBook(new Book(2, "Американские боги", "Нил Гейман", "АСТ", 2014, 704, 25, "твердый"));
		shop.addBook(new Book(3, "Убить пересмешника", "Харпер Ли", "АСТ", 2018, 412, 21, "твердый"));
		shop.addBook(new Book(4, "Изучаем Java", "Кэти Сьерра, Берт Бэйтс", "Эксмо", 2019, 720, 48, "твердый"));
		shop.addBook(new Book(5, "Скандинавские боги", "Нил Гейман", "АСТ", 2017, 320, 18, "твердый"));

		BookShopLogic shopLogic = new BookShopLogic();

		List<Book> list = shopLogic.findByAuthor(shop, "Нил Гейман");
		shopLogic.printBookList(list);

		list = shopLogic.findByPublisher(shop, "Эксмо");
		shopLogic.printBookList(list);

		list = shopLogic.findByYear(shop, 2017);
		shopLogic.printBookList(list);
	}

}
