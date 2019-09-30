package by.oks.jb29_les09.task08.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.oks.jb29_les09.task08.bean.CustomersBase;
import by.oks.jb29_les09.task08.bean.Customer;

public class CustomersBaseLogic {

	
	public void sortBySurname(CustomersBase customers) {
		Collections.sort(customers.getCustomers(), new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getSurname().compareToIgnoreCase(c2.getSurname());
			}
		});
		
	}
	
	public void printListOfCustomers(CustomersBase customers) {
		sortBySurname(customers);
		Customer cust;
		for(int i = 0; i < customers.getCustomers().size(); i++) {
			cust = customers.getCustomers().get(i);
			System.out.println(cust.getSurname() + " " + cust.getName() + " " + cust.getPatronymic());
		}
	}
	
	public List<Customer> findByCreditCard(CustomersBase customers, int leftBound, int rightBound) {
		List<Customer> list = new ArrayList<Customer>();
		
		for(int i = 0; i < customers.getCustomers().size(); i++) {
			int creditCard = customers.getCustomers().get(i).getCreditCardNumber();
			if(creditCard >= leftBound && creditCard <= rightBound) {
				list.add(customers.getCustomers().get(i));
			}
		}
		
		return list;
	}
	
	public void printCustomerList(List<Customer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
