package com.HQL;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;
 
import com.entity.Employee;
import com.sessionUtil.SessionUtils;

//Parametrize HQL
public class HQLExampleThree {
	public static void main(String[] args) {

		System.out.println("Please enter amount to get data from employee : ");
		Scanner sc = new Scanner(System.in);
//		int amt = sc.nextInt();

		Session session = SessionUtils.getSession();
//		Query hqlQuery = session.createQuery("from Employee where salary>=:amount");
//		hqlQuery.setParameter("amount", amt);

		Query hqlQuery = session.createQuery("from Employee where salary between :low and :high");
		hqlQuery.setParameter("low", 60000);//we can take input from users also
		hqlQuery.setParameter("high", 80000);
		
		List<Employee> employeeList = hqlQuery.list();
		System.out.println();
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		session.close();
	}
}
