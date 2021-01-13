package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class EmployeeUpdate {

	public static void main(String[] args) {
		System.out.println("Please enter employee number for updation : ");
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		Employee emp = new Employee();
		emp.setId(code);
		emp.setName("Sanjay");
		emp.setSalary(15000);
		emp.setDepartment("HR");
		emp.setDesignation("HR Manager");

		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		
		session.update(emp);
		
		beginTransaction.commit();
		sc.close();
		session.close();
		System.out.println("Record Updated...!!!");

	}

}
