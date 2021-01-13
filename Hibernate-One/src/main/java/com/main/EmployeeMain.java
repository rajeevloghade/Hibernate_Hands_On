package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

//		Configuration configuration = new Configuration().configure();
//		Session openSession = configuration.buildSessionFactory().openSession();
//		Transaction beginTransaction = openSession.beginTransaction();

		// creating configuration object to read the data from our configuration file
		Configuration configuration = new Configuration().configure();

		// creating SessionFactory object(to create session object)
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		// creating session instance for performing CRUD operation
		Session openSession = buildSessionFactory.openSession();

		Transaction transaction = openSession.beginTransaction();

		// will insert a record using save method
		openSession.save(new Employee("FFF", 70000, "Developer", "SD"));
		openSession.save(new Employee("GGG", 80000, "Tester", "QA"));
		openSession.save(new Employee("HHH", 90000, "Devops", "Devops"));
		openSession.save(new Employee("III", 100000, "Admin", "DB"));
		openSession.save(new Employee("JJJ", 11000, "System Admin", "IT"));

		transaction.commit();
		openSession.close();
		System.out.println("RECORD STORED");
	}
}
