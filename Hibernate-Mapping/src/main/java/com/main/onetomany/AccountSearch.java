package com.main.onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetomany.Account;
import com.entity.onetomany.Card;

public class AccountSearch {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

		Account account = session.get(Account.class, 1);
		System.out.println(account.getAccNo() + ", " + account.getName());
		List<Card> cards = account.getCards();
		for (Card card : cards) {
			System.out.println(card);
		}
		beginTransaction.commit();
		session.close();
	}

}
