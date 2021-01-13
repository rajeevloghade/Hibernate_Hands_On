package com.entity.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "laptopid_pk")
	private int lCode;
	private String brand;
	private int price;

	@OneToOne(mappedBy = "laptop") // by this mapped by we specified that don't create extra column in laptop table
									// it is already mapped in employee table
	@JoinColumn(name = "employeeid_fk")
	private Employee employee;

	public Laptop() {
		super();
	}

	public Laptop(int lCode) {
		super();
		this.lCode = lCode;
	}

	public Laptop(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getlCode() {
		return lCode;
	}

	public void setlCode(int lCode) {
		this.lCode = lCode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lCode=" + lCode + ", brand=" + brand + ", price=" + price + "]";
	}

}
