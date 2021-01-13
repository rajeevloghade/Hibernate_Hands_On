package com.HQL;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sessionUtil.SessionUtils;

public class HQLExampleTwo {

	public static void main(String[] args) {
		// fetching all the records using HQL
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

//		Query hqlQuery = session.createQuery("update Employee set name='Rajeev', salary=salary+5000 where id=2");
		Query hqlQuery = session.createQuery("delete from Employee where id=2");

		int executeUpdate = hqlQuery.executeUpdate();
		System.out.println(executeUpdate + " rows updated");
		
		beginTransaction.commit();
		session.close();
	}
}
