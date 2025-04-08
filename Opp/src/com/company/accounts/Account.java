package com.company.accounts;

public class Account {
  private int accNo;
  private String accType;
  private double balance;
public Account(int accNo, String accType, double balance) {
	this.accNo = accNo;
	this.accType = accType;
	this.balance = balance;
}

public void displayAccountDetails() {
	System.out.println(accNo+","+accType+","+balance);
}
}
