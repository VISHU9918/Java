package Association;

public class AccountMain {

	 public static void main(String[] args) {
	  
	  Account acc = new Account(111, "Savings", "Hyd");
	  
	  Customer c1 = new Customer(12345,"ABC",40000,acc);
	  c1.display();
	  c1.calInterest();
	 }

	}
