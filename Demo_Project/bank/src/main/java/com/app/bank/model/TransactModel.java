package com.app.bank.model;

import jakarta.persistence.*;

@Entity
@Table(name="Transaction")
public class TransactModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	String name;
	
	@Column
	String accid; 
	
	@Column
	String accno;
	@Column
	double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TransactModel [name=" + name + ", accid=" + accid + ", accno=" + accno + ", amount=" + amount + "]";
	}

}
