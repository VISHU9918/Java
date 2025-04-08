package treeSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Employee2Main {

    public static void main(String[] args) {
        TreeSet<Employee2> empSet = new TreeSet<>(new MyNameCom());

        Employee2 e1 = new Employee2(23, "Ram", 3000, "IT");
        Employee2 e2 = new Employee2(13, "Shyam", 2000, "CS");
        Employee2 e3 = new Employee2(20, "DK", 8000, "ECE");
        Employee2 e4 = new Employee2(35, "Pawan", 6000, "EE");

        Employee2Main manager = new Employee2Main();
        manager.addEmployee(empSet, e1);
        manager.addEmployee(empSet, e2);
        manager.addEmployee(empSet, e3);
        manager.addEmployee(empSet, e4);

        System.out.println("\nEmployees sorted by name in ascending order:");
        manager.displayEmployees(empSet);

        // Searching for an Employee
        String searchName = "DK";
        Employee2 foundEmployee = manager.searchEmployee(empSet, searchName);
        if (foundEmployee != null) {
            System.out.println("Found Employee: " + foundEmployee);
        } else {
            System.out.println("Employee " + searchName + " not found.");
        }

        // Removing an Employee
        manager.removeEmployee(empSet, "Shyam");
        System.out.println("\nEmployees after removing Shyam:");
        manager.displayEmployees(empSet);
    }

    public void addEmployee(TreeSet<Employee2> empSet, Employee2 e) {
        empSet.add(e);
    }

    public void removeEmployee(TreeSet<Employee2> empSet, String name) {
        empSet.removeIf(e -> e.getName().equalsIgnoreCase(name));
    }

    public Employee2 searchEmployee(TreeSet<Employee2> empSet, String name) {
        for (Employee2 e : empSet) {
            if (e.getName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public void displayEmployees(TreeSet<Employee2> empSet) {
        for (Employee2 e : empSet) {
            System.out.println(e);
        }
    }
}

class MyNameCom implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 e1, Employee2 e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
