package nestedClass;

public class Printer {
   public  void printMessage() {
	   System.out.println("Message");
   }
}

class Print{
	public void createPrinter() {
		Printer p=new Printer() {
		@Override
		public void printMessage() {
		System.out.println("Override Message");	
		}
		};
		p.printMessage();
	}
	
	public static void main(String[] args) {
		Print p1=new Print();
		p1.createPrinter();
	}
}

