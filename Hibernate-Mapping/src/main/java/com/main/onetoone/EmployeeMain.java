package com.main.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetoone.Employee;
import com.entity.onetoone.Laptop;
import com.entity.onetoone.Vehical;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee = new Employee("AAA", 20000, new Laptop(1), new Vehical(1));
		Employee employee2 = new Employee("BBB", 30000, new Laptop(2), new Vehical(2));
		Employee employee3 = new Employee("CCC", 40000, new Laptop(3), new Vehical(3));
		Employee employee4 = new Employee("DDD", 50000, new Laptop(4), new Vehical(4));

		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(employee);
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);

		beginTransaction.commit();
		session.close();
		System.out.println("Employee Stored with laptop id...!!!");
	}
}
