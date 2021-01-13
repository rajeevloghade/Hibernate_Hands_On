package com.main.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetoone.Vehical;

public class VehicalMain {

	public static void main(String[] args) {

		Vehical vehical = new Vehical("Maruti", 579000);
		Vehical vehical2 = new Vehical("Honda", 750000);
		Vehical vehical3 = new Vehical("Hero", 643000);
		Vehical vehical4 = new Vehical("Indigo", 755000);

		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(vehical);
		session.save(vehical2);
		session.save(vehical3);
		session.save(vehical4);
		beginTransaction.commit();
		session.close();
		System.out.println("Vehical Stored...!!!");

	}

}
