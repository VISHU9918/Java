package ClassStudent;

import java.util.*;


public class StudentMain {
	    public static void main(String[] args) {
	       
			Scanner sc= new Scanner(System.in);
	        
	        // Declaring the first student object
	        Student student1 = new Student();
	        
	        // Initializing the first student at runtime
	        student1.setData(101, "Alice", 20);
	        
	        // Declaring the second student object
	        Student student2 = new Student();
	        
	        // Reading data for the second student from console
	        System.out.print("Enter Roll No for Student 2: ");
	        int rollno = sc.nextInt();
	        sc.nextLine(); // Consume newline
	        System.out.print("Enter Name for Student 2: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Age for Student 2: ");
	        int age = sc.nextInt();
	        
	        student2.setData(rollno, name, age);
	        
	        // Displaying data for both students
	        System.out.println("\nData for Student 1:");
	        student1.getData();
	        
	        System.out.println("\nData for Student 2:");
	        student2.getData();
	        sc.close();
	    }
	}
