package com.main.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetoone.Laptop;

public class LaptopMain {

	public static void main(String[] args) {

		Laptop laptop = new Laptop("Dell", 55000);
		Laptop laptop2 = new Laptop("Hp", 45000);
		Laptop laptop3 = new Laptop("Asus", 65000);
		Laptop laptop4 = new Laptop("Apple", 75000);

		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(laptop);
		session.save(laptop2);
		session.save(laptop3); 
		session.save(laptop4);
		beginTransaction.commit();
		session.close();
		System.out.println("Laptop Stored...!!!");
	}

}
