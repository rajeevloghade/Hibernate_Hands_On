package com.main.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.SessionUtil.SessionUtils;
import com.entity.onetomany.Account;
import com.entity.onetomany.Card;

public class AccountMain {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Transaction beginTransaction = session.beginTransaction();

//		List<Card> cardList = new ArrayList<Card>();
//		cardList.add(new Card(1));
//		cardList.add(new Card(2));
//		List<Card> cardList2 = new ArrayList<Card>();
//		cardList2.add(new Card(3));
//		cardList2.add(new Card(4));

		Account account = new Account("ABC");
		Account account2 = new Account("XYZ");

		session.save(account);
		session.save(account2);
		beginTransaction.commit();
		session.close();
		System.out.println("Account Data Stored...!!!");
	}

}
