package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Address;
import com.entity.Customer;
import com.sessionUtil.SessionUtils;

public class CustomerMain {

	public static void main(String[] args) {

		Session session = SessionUtils.getSession();

		Address address = new Address(04, "M G Road", "Indore");
		Customer customer = new Customer();
		customer.setName("Cust1");
		customer.setAddress(address);

		Customer customer2 = new Customer("Cust2", new Address(05, "Chouta Chouraha", "Bhikangaon"));
		Customer customer3 = new Customer("Cust3", new Address(03, "Canot Place", "Delhi"));

		Transaction beginTransaction = session.beginTransaction();
		session.save(customer);
		session.save(customer2);
		session.save(customer3);
		
		beginTransaction.commit();
		session.close();
		System.out.println("Record Stored...!!!");
	}
}
