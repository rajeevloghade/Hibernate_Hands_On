package com.main.onetoone;

import org.hibernate.Session;

import com.SessionUtil.SessionUtils;
import com.entity.onetoone.Employee;

public class EmployeeSearch {

	public static void main(String[] args) {
		// searching by using QBI
		Session session = SessionUtils.getSession();
		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getLaptop());
		session.close();
	}

}
