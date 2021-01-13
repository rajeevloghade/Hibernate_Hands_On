package com.main.onetomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetomany.Account;
import com.entity.onetomany.Card;

public class CardSearch {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		Card card = session.get(Card.class, 1);
		System.out.println(card);
		Account accounts = card.getAccounts();
		System.out.println(accounts.getCards());

		beginTransaction.commit();
		session.close();

	}

}
