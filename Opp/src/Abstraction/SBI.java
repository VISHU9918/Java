package Abstraction;

public class SBI implements ATM {

	@Override
	public void withdraw() {
		System.out.println("withdraw success..got a cash back: "+cashback); 

	}

	@Override
	public void transfer() {
		System.out.println("Transfer success..and got: "+cashback);

	}

	@Override
	public void disp() {
		System.out.println("Welcone to SBI-ATM");

	}
	public void ownMethod() {
        System.out.println("Its class specific method");

}
}
