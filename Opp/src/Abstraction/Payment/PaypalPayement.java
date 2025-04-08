package Abstraction.Payment;

class PaypalPayment implements Payment {
	    @Override
	    public void pay() {
	        System.out.println("Payment made using PayPal.");
	    }
	}

