package Interfaces2;

public class PaymentMain {

	public static void main(String[] args) {
		Payment c=new CreditCardPayment();
		Payment p=new PayPalPayment();
		Payment pps=new PaymentProcessor();
		
		c.pay();
		p.pay();
		pps.pay();

	}

}
