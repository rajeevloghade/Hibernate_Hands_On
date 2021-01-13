package com.entity.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeid_pk")
	private int eCode;
	private String name;
	private int salary;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "laptopid_fk")
	private Laptop laptop;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicalid_fk")
	private Vehical vehical;

	public Employee() {
		super();
	}

	public Employee(String name, int salary, Laptop laptop, Vehical vehical) {
		super();
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
		this.vehical = vehical;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public int geteCode() {
		return eCode;
	}

	public void seteCode(int eCode) {
		this.eCode = eCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [eCode=" + eCode + ", name=" + name + ", salary=" + salary + ", laptop=" + laptop
				+ ", vehical=" + vehical + "]";
	}

}
