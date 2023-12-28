package com.app.bank.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Register")
public class RegisterModel {

	@Id
	private String aadhar;
	@Column
	private String name;
	@Column
	private String email;
	@Override
	public String toString() {
		return "RegisterModel [aadhar=" + aadhar + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", pincode=" + pincode + ", mobileNum=" + mobileNum + ", panNum=" + panNum + "]";
	}
	@Column
	private String address;
	@Column
	private String pincode;
	@Column
	private String mobileNum;
	@Column
	private String panNum;
	@Column
	private String accId;
	@Column
	private String accNum;
	

	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	
}
