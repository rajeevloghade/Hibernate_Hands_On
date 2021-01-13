package com.main.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.manytomany.Book;
import com.entity.manytomany.Student;

public class StudentMain {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1));
		books.add(new Book(2));
		List<Book> books2 = new ArrayList<Book>();
		books2.add(new Book(3));
		books2.add(new Book(4));

		Student student = new Student("AAA", "CSE", books);
		Student student2 = new Student("BBB", "CE", books2);
		Student student3 = new Student("CCC", "ME", books2);
		Student student4 = new Student("DDD", "EE", books);

		session.save(student);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		beginTransaction.commit();
		session.close();
	}

}
