package Interfaces;

public class PayPalPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("This is a paypal payment");
		
	}

}
