package com.main.onetomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetomany.Account;
import com.entity.onetomany.Card;

public class CardMain {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		Card card = new Card("Gold", 30000, new Account(1));
		Card card2 = new Card("Silver", 40000, new Account(2));
		Card card3 = new Card("Platinum", 50000, new Account(1));
		Card card4 = new Card("Gold", 60000, new Account(2));

		session.save(card);
		session.save(card2);
		session.save(card3);
		session.save(card4);
		beginTransaction.commit();
		session.close();
		System.out.println("Data Stored...!!!");
	}

}
