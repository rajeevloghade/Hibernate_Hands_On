package com.main.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.manytomany.Book;

public class BookMain {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		Book book = new Book("M-I", 450);
		Book book2 = new Book("M-II", 550);
		Book book3 = new Book("M-III", 600);
		Book book4 = new Book("M-IV", 650);

		session.save(book);
		session.save(book2);
		session.save(book3);
		session.save(book4);
		beginTransaction.commit();
		session.close();
	}

}
