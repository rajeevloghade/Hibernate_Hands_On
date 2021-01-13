package com.entity.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardNo;
	private String cardType;
	private int wlimit;

	@ManyToOne
	private Account accounts;

	public Card() {
		super();
	}

	public Card(int cardNo) {
		super();
		this.cardNo = cardNo;
	}

	public Card(String cardType, int wlimit, Account accounts) {
		super();
		this.cardType = cardType;
		this.wlimit = wlimit;
		this.accounts = accounts;
	}

	public Card(String cardType, int wlimit) {
		super();
		this.cardType = cardType;
		this.wlimit = wlimit;
	}

	public Account getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getWlimit() {
		return wlimit;
	}

	public void setWlimit(int wlimit) {
		this.wlimit = wlimit;
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", cardType=" + cardType + ", wlimit=" + wlimit + "]";
	}

}
