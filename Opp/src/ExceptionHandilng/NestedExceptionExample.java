package ExceptionHandilng;
import java.util.Scanner;
import java.util.InputMismatchException;


// Custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NestedExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("Negative number not allowed: " + number);
            }

            System.out.println("You Entered: " + number);

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Error: Input is not an integer");
            //System.out.println(e.getMessage());
        } catch (NegativeNumberException e) {
        	e.printStackTrace();
        	System.out.println(e.getMessage());
        }
        sc.close();
    }
}

