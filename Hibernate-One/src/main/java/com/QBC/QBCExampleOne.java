package com.QBC;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

//Query By Criteria(QBC)
public class QBCExampleOne {

	public static void main(String[] args) {
		// we wish to fetch all the record
		// we are using criteria object
		Session session = SessionUtils.getSession();
		Criteria createCriteria = session.createCriteria(Employee.class);

		// Ordering
		Order asc = Order.asc("salary"); // ascending order
		createCriteria.addOrder(asc);

		List<Employee> empList = createCriteria.list();
		System.out.println();
		for (Employee emp : empList) {
			System.out.println(emp);
		}
//		for (int i = 0; i < empList.size(); i++) {
//			Employee employee = empList.get(i);
//			System.out.println(employee);
//		}
		session.close();
		System.out.println();
	}

}
