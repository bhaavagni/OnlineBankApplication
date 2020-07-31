package com.hcl.task.models;

public class CustomerM {
	
	private String cname;
	private int accountno;
	private String accounttype;
	private int balance;
	private int age;
	private String address;
	private int phone;
	private String gender;
	private String email;
	
	public CustomerM()
	{
		
	}
	
	
	



	@Override
	public String toString() {
		return "CustomerM [cname=" + cname + ", accountno=" + accountno + ", accounttype=" + accounttype + ", balance="
				+ balance + ", age=" + age + ", address=" + address + ", phone=" + phone + ", gender=" + gender
				+ ", email=" + email + "]";
	}






	public CustomerM(String cname, int accountno, String accounttype, int balance, int age, String address, int phone,
			String gender, String email) {
		super();
		this.cname = cname;
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.balance = balance;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
	}






	public String getCname() {
		return cname;
	}






	public void setCname(String cname) {
		this.cname = cname;
	}






	public int getAccountno() {
		return accountno;
	}






	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}






	public String getAccounttype() {
		return accounttype;
	}






	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}






	public int getBalance() {
		return balance;
	}






	public void setBalance(int balance) {
		this.balance = balance;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public int getPhone() {
		return phone;
	}






	public void setPhone(int phone) {
		this.phone = phone;
	}






	public String getGender() {
		return gender;
	}






	public void setGender(String gender) {
		this.gender = gender;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	

}
