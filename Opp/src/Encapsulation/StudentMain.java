package Encapsulation;

public class StudentMain {
	public static void main(String[] args) {
        Student student = new Student("Ram", 20, 3.5);

        
        student.displayInfo();

        // Modify student information
        student.setName("Pawan");
        student.setAge(21);
        student.setGpa(3.8);

        // Display updated information
        student.displayInfo();
    }

}
