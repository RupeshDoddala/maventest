package com.info.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eno;
	@Column(length = 12)
	private String firstname;
	@Column(length = 12)
	private String lastname;
	@Column(length = 7)
	private String gender;
	@Column
	private double salary;
	@Column(length = 12)
	private String organization;
	@Column(length = 12)
	private String username;
	@Column
	private String password;

	public EmployeeModel() {
	}

	public EmployeeModel(String firstname, String lastname, String gender, double salary, String organization,
			String username, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.salary = salary;
		this.organization = organization;
		this.username = username;
		this.password = password;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
