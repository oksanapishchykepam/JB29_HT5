package by.oks.jb29_les09.task08.bean;

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Определить конструкторы, set- и get- методы и метод toString()

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(int id, String surname, String name, String patronymic, String address, int creditCardNumber,
			int bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Customer() {
		this.id = 0;
		this.surname = "";
		this.name = "";
		this.patronymic = "";
		this.address = "";
		this.creditCardNumber = 0;
		this.bankAccountNumber = 0;
	}

	@Override
	public String toString() {
		return id + ", " + surname + ", " + name + ", " + patronymic + ", "+ address + ", номер кредитной карты = " + creditCardNumber + ", номер счета = " + bankAccountNumber + ".";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

}
