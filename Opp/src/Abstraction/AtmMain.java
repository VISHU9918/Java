package Abstraction;

public class AtmMain {

	 public static void main(String[] args) {
	  
	  ATM atm = new SBI();
	  atm.disp();
	  atm.withdraw();
	  atm.transfer();

	  new SBI().ownMethod();
	 }

	}