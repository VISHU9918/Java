package Association;

public class Customer {
	 private int cid;
	 private String name;
	 private double balance;
	 private static String bank ="SBI";
	 private Account account; // 
	 
	 public Customer(int cid, String name, double balance, Account account) {
	  super();
	  this.cid = cid;
	  this.name = name;
	  this.balance = balance;
	  this.account = account;
	 }

	 public void display() {
	  System.out.println(cid+" "+name+" "+balance+" "+bank);
	  account.dispAccount();
	  
	 }
	 
	 
	 public void calInterest() {
	  // t=5, rate=8.5
	  double interest = balance*5*8.5/100;
	  System.out.println(interest);
	 }
	 
	}