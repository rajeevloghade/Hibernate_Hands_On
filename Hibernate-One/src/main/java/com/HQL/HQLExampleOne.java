package com.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class HQLExampleOne {

	public static void main(String[] args) {
		// fetching all the records using HQL
		String hql = "from Employee"; // SELECT * FROM Employee;

		Session session = SessionUtils.getSession();
		Query hqlQuery = session.createQuery("from Employee where salary>=50000 order by salary desc");
		List<Employee> employeeList = hqlQuery.list();
		System.out.println();
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		session.close();
	}

}
