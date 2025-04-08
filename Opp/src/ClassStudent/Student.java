package ClassStudent;

class Student {
    // Private data members
    private int rollno;
    private String name;
    private int age;

    // Method to set data
    public void setData(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    // Method to get data
    public void getData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

