package com.SQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class SQLExample {

	public static void main(String[] args) {

		Session session = SessionUtils.getSession();

		SQLQuery SQLQuery = session.createSQLQuery("select * from employee");
		SQLQuery.addEntity(Employee.class);
		
		List<Employee> list = SQLQuery.list();
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
//		List<Object[]> employeeList = SQLQuery.list();
//		System.out.println();
//		for (Object[] objects : employeeList) {
//			for (Object objects2 : objects) {
//				System.out.println(objects2);
//			}
//			System.out.println();
//		}
		session.close();
	}

}
