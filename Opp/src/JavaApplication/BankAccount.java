package JavaApplication;

public class BankAccount {
	private int accNo;
	private  String accType;
	private double Balance;
	private static double interestRate;
	
	
	static {
        interestRate = 5; 
    }

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accNo, String accType, double Balance) {
		this.accNo = accNo;
		this.accType = accType;
		this.Balance = Balance;
	}



	public void Deposit(int amount) {
		Balance+=amount;
	}

	public void Withdraw(int amount) {
		Balance-=amount;
	}
	
	public static double calculateInterest(double Balance) {
        return (Balance * interestRate)/100;
    }
	public double getBalance() {
		return(Balance);
	}

	public void Display() {
		System.out.println("Account No: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + Balance);
        System.out.println("Interest Rate: " + (interestRate) + "%");
        double interestEarned = calculateInterest(Balance);
        System.out.println("Interest Earned: " + interestEarned);
	}
	}




