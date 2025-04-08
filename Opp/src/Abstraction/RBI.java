package Abstraction;

public abstract class RBI {
	
	private double balance;
	 private int cashback;
	 
	 
	 public int getCashback() {
	  return cashback;
	 }
	 
	 public double getBalance() {
		  return balance;
		 }

	 public RBI(double balance, int cashback) {
	  super(); // Object
	  this.balance = balance;
	  this.cashback = cashback;
	 }

	 public abstract void withdraw();
	  
	 public void disp() {
	   System.out.println("Im RBI");
	  }
	}
