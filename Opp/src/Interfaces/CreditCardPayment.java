package Interfaces;

public class CreditCardPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("This is a CreditCard Payment");
		
	}

}
