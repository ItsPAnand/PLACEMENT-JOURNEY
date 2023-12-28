package com.app.bank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SavingsAccount")
public class SavingAccountModel {

	@Id
	String accid;
	
	@Column
	String accno;
	
	@Column
	double balance;
	
	
	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		System.out.println(accid + " new Balance" + this.balance);
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	@Override
	public String toString() {
		return "SavingAccountModel [accid=" + accid + ", balance=" + balance + ", accno=" + accno + "]";
	}
	
	
}
