package com.main;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.entity.Customer;
import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class CustomerList {

	public static void main(String[] args) {

		Session session = SessionUtils.getSession();

		Criteria createCriteria = session.createCriteria(Customer.class);

		//with restriction(filteration)
		createCriteria.add(Restrictions.eq("address.city", "Bhikangaon"));
		
		List<Customer> list = createCriteria.list();

		for (Customer customer : list) {
			System.out.println(customer);
		}
		session.close();
	}

}
