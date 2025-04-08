package JavaApplication;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bankaccount=new BankAccount(2345,"Saving", 1000.00);
		bankaccount.Deposit(500);
		bankaccount.Withdraw(200);
		bankaccount.getBalance();
		bankaccount.Display();


	}

}
