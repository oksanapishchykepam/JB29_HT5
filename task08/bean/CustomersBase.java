package by.oks.jb29_les09.task08.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomersBase {
	private List<Customer> customers;

	public CustomersBase() {
		customers = new ArrayList<Customer>();
	}

	public void addCustomer(Customer newCustomer) {
		customers.add(newCustomer);
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
}
