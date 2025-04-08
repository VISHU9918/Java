package Abstraction.Payment;


public class PaymentMain {
 public static void main(String[] args) {
     PaymentProcessor processor = new PaymentProcessor();

     Payment creditCard = new PaymentCreditCard();
     Payment paypal = new PaypalPayment();

     processor.processPayment(creditCard);
     processor.processPayment(paypal);
 }
}