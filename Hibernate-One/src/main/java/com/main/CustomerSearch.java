package com.main;

import org.hibernate.Session;

import com.entity.Customer;
import com.sessionUtil.SessionUtils;

public class CustomerSearch {

	public static void main(String[] args) {

		Session session = SessionUtils.getSession();
		
		//fetching data by Query By ID
		Customer customer = session.get(Customer.class, 1);
		System.out.println(customer);
		
		session.close();
	}

}
