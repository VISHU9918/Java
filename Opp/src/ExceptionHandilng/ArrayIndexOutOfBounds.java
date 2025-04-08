package ExceptionHandilng;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an index to access the array:");
            int index = sc.nextInt();
            
            System.out.println("Value at index " + index + " is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and " + (array.length - 1) + ".");
        } finally {
            sc.close();
        }
    }
}

