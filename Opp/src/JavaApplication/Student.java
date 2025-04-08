package JavaApplication;

public class Student {
   
    private String name;
    private int rollNumber;
    private char grade;

    
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    
    public String getName() {
        return name;
    }

 
    public void setName(String name) {
        this.name = name;
    }

   
    public int getRollNumber() {
        return rollNumber;
    }

   
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

 
    public char getGrade() {
        return grade;
    }

    
    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
   
}
