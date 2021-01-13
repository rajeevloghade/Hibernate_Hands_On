package com.main;

import java.util.Scanner;

import org.hibernate.Session;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

//Query By ID(QBI)
public class EmployeeSearch {

	public static void main(String[] args) {

		System.out.println("Please enter employee number for searching : ");
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();

		Session session = SessionUtils.getSession();

		Employee employee = session.get(Employee.class, code);// select query
//		Employee employee = session.load(Employee.class, code);
		
		System.out.println(employee);//printing object
		System.out.println(employee.getId());//printing value individually
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getDesignation());

		sc.close();
		session.close();
		System.out.println("Record Updated...!!!");

	}
}
