package inheritance.Person;

class Employee extends Person {
    String department;

    void setData(String name, int age, String department) {
        super.setData(name, age);
        this.department = department;
    }

    @Override
    void getData() {
        super.getData();
        System.out.println("Department: " + department);
    }
}
