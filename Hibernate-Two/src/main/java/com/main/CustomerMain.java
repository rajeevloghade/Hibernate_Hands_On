package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.customer.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter address: ");
		String address = sc.next();

		Customer customer = new Customer();
		customer.setName(name);
		customer.setAddress(address);

		Session openSession = new Configuration().configure().buildSessionFactory().openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		openSession.save(customer);

		beginTransaction.commit();
		openSession.close();
		System.out.println("Record Added...!!!");
	}
}


