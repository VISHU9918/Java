package ExceptionHandilng;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number:");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("The result of division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}

