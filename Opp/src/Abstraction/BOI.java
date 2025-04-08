package Abstraction;
   public class BOI extends RBI{
		   
		 private String msg;
		 
		 public BOI(double balance, int cashback, String msg) {
		  super(balance, cashback);
		  this.msg = msg;
		 }

		 public void withdraw() {
		  System.out.println("withdraw success!!"+ getCashback());
		 }

		 @Override
		 public void disp() {
		  super.disp();
		  System.out.println(msg+ " BOI");
		 }
		 
		 
		}

