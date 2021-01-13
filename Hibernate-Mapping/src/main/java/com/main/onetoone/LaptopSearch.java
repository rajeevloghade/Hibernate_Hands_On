package com.main.onetoone;

import org.hibernate.Session;

import com.SessionUtil.SessionUtils;
import com.entity.onetoone.Employee;
import com.entity.onetoone.Laptop;

public class LaptopSearch {

	public static void main(String[] args) {
		// searching by using QBI
		Session session = SessionUtils.getSession();
		Laptop laptop = session.get(Laptop.class, 1);
		System.out.println(laptop.getlCode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		
		//now we can fetch the employee data from laptop 
		Employee employee = laptop.getEmployee();
		System.out.println(employee.geteCode());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		session.close();
	}

}
