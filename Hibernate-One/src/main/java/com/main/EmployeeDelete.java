package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class EmployeeDelete {

	public static void main(String[] args) {

		System.out.println("Please enter employee number for deletion : ");
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		Employee emp = new Employee();
		emp.setId(code);

		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		
		session.delete(emp);
		
		beginTransaction.commit();
		sc.close();
		session.close();
		System.out.println("Record Deleted...!!!");
	}

}
