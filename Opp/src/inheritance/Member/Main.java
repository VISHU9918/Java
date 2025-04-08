package inheritance.Member;

public class Main {
 public static void main(String[] args) {
     Employee emp = new Employee("Alice", 30, "1234567890", "123 Street", 50000, "Engineering");
     Manager mgr = new Manager("Bob", 45, "0987654321", "456 Avenue", 70000, "Sales");

     emp.printSalary();
     mgr.printSalary();
 }
}
