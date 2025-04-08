package Abstraction.Payment;

	 class PaymentCreditCard implements Payment {
	    @Override
	    public void pay() {
	        System.out.println("Payment made using Credit Card.");
	    }
	}