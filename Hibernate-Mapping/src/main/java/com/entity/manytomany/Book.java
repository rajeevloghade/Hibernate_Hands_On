package com.entity.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bCode;
	private String name;
	private int cost;

	@ManyToMany
	private List<Student> students;

	public Book() {
		super();
	}

	public Book(int bCode) {
		super();
		this.bCode = bCode;
	}

	public Book(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public int getbCode() {
		return bCode;
	}

	public void setbCode(int bCode) {
		this.bCode = bCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [bCode=" + bCode + ", name=" + name + ", cost=" + cost + "]";
	}

}
