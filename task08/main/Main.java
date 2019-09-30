package by.oks.jb29_les09.task08.main;

import java.util.List;
import by.oks.jb29_les09.task08.bean.CustomersBase;
import by.oks.jb29_les09.task08.logic.CustomersBaseLogic;
import by.oks.jb29_les09.task08.bean.Customer;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

 * Найти и вывести:
  a) список покупателей в алфавитном порядке;
  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Main {

	public static void main(String[] args) {
		
		CustomersBase customers = new CustomersBase();
		
		customers.addCustomer(new Customer(1, "Иванов", "Петр", "Дмитриевич", "Минск", 12344, 123456));
		customers.addCustomer(new Customer(2, "Петров", "Максим", "Леонидович", "Минск", 21223, 234567));
		customers.addCustomer(new Customer(3, "Сидоров", "Артем", "Александрович", "Минск", 12234, 345678));
		customers.addCustomer(new Customer(4, "Зайцева", "Анна", "Сергеевна", "Минск", 54234, 456789));
		customers.addCustomer(new Customer(5, "Васильева", "Ольга", "Викторовна", "Минск", 21234, 567890));
		customers.addCustomer(new Customer(6, "Наумова", "Анна", "Андреевна", "Минск", 37234, 654321));

		CustomersBaseLogic customersLogic = new CustomersBaseLogic();
		
		customersLogic.printListOfCustomers(customers);
		
		List<Customer> list = customersLogic.findByCreditCard(customers, 21223, 44891);
		customersLogic.printCustomerList(list);
		
		
	}

}
