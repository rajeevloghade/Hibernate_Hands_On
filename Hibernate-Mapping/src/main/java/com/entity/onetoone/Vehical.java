package com.entity.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vehical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resNo;
	private String brand;
	private int price;

	@OneToOne(mappedBy = "vehical")
	@JoinColumn(name = "employeeid_fk")
	private Employee employee;

	public Vehical() {
		super();
	}

	public Vehical(int resNo) {
		super();
		this.resNo = resNo;
	}

	public Vehical(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public int getResNo() {
		return resNo;
	}

	public void setResNo(int resNo) {
		this.resNo = resNo;
	}

	public String getBranch() {
		return brand;
	}

	public void setBranch(String branch) {
		this.brand = branch;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Vehical [resNo=" + resNo + ", brand=" + brand + ", price=" + price + ", employee=" + employee + "]";
	}

}
