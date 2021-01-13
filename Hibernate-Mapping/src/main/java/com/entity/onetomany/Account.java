package com.entity.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accNo;
	private String name;

	@OneToMany(mappedBy = "accounts")
	private List<Card> cards;

	public Account() {
		super();
	}

	public Account(int accNo) {
		super();
		this.accNo = accNo;
	}

	public Account(String name) {
		super();
		this.name = name;
	}

	public Account(String name, List<Card> cards) {
		super();
		this.name = name;
		this.cards = cards;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", cards=" + cards + "]";
	}

}
