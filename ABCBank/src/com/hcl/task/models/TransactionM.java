package com.hcl.task.models;

public class TransactionM {

	private int fromccno;

	private int toaccno;
	private int funds;

	private int balance;

	public TransactionM(int fromccno, int toaccno, int funds, int balance) {
		super();
		this.fromccno = fromccno;
		this.toaccno = toaccno;
		this.funds = funds;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "TransactionM [fromccno=" + fromccno + ", toaccno=" + toaccno + ", funds=" + funds + ", balance="
				+ balance + "]";
	}

	public int getFromccno() {
		return fromccno;
	}

	public void setFromccno(int fromccno) {
		this.fromccno = fromccno;
	}

	public int getToaccno() {
		return toaccno;
	}

	public void setToaccno(int toaccno) {
		this.toaccno = toaccno;
	}

	public int getFunds() {
		return funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	
	
	
}
