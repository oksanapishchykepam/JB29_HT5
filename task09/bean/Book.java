package by.oks.jb29_les09.task09.bean;

/*Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.*/

public class Book {
	int id;
	String name;
	String author;
	String publisher;
	int publishYear;
	int pages;
	int price;
	String binding;

	public Book(int id, String name, String author, String publisher, int publishYear, int pages, int price,
			String binding) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "\"" + name + "\", автор: " + author + ", издательство \"" + publisher + "\", " + publishYear + "г., "
				+ pages + "стр., цена: " + price + "р., " + binding + " переплет";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

}
