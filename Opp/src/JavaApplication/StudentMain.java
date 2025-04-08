package JavaApplication;

public class StudentMain {

	 public static void main(String[] args) {
	        Student student = new Student("Pawan", 101, 'A');
	        student.displayInfo();

	       
	        student.setName("Ram");
	        student.setRollNumber(102);
	        student.setGrade('B');
	        System.out.println("\nUpdated Student Information:");
	        student.displayInfo();
	    }
}