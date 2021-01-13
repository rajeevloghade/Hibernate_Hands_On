package com.entity.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rNo;
	private String name;
	private String branch;

	@ManyToMany
	List<Book> books;

	public Student() {
		super();
	}

	public Student(int rNo) {
		super();
		this.rNo = rNo;
	}

	public Student(String name, String branch, List<Book> books) {
		super();
		this.name = name;
		this.branch = branch;
		this.books = books;
	}

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rNo=" + rNo + ", name=" + name + ", branch=" + branch + "]";
	}

}
