package com.main.onetoone;

import org.hibernate.Session;

import com.SessionUtil.SessionUtils;
import com.entity.onetoone.Employee;
import com.entity.onetoone.Vehical;

public class VehicalSearch {

	public static void main(String[] args) {
		// searching by using QBI
		Session session = SessionUtils.getSession();
		Vehical vehical = session.get(Vehical.class, 1);
		System.out.println(vehical.getResNo());
		System.out.println(vehical.getBranch());
		System.out.println(vehical.getPrice());

		// now we can fetch the employee data from laptop
		Employee employee = vehical.getEmployee();
		System.out.println(employee.geteCode());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

		session.close();
	}

}
