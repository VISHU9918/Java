package JavaApplication;

public class CalculatorMain {

	public static void main(String[] args) {
		 Calculator calculator = new Calculator(10, 5);
	        System.out.println("Addition: " + calculator.add());
	        System.out.println("Subtraction: " + calculator.subtract());
	        System.out.println("Multiplication: " + calculator.multiply());
	        System.out.println("Division: " + calculator.divide());
	        System.out.println("Modulus: " + calculator.modulus());
	    }

}
