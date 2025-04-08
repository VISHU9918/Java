package treeSet;

import java.util.TreeSet;
import java.util.Comparator;

public class EmployeeMain {

    public static void main(String[] args) {
        TreeSet<Employee> nameComp = new TreeSet<Employee>(new MyNameComp());
        Employee e1 = new Employee("Ram", 1000);
        Employee e2 = new Employee("Kumar", 2000);
        Employee e3 = new Employee("Amit", 3000);
        Employee e4 = new Employee("Shyam", 5000);

        nameComp.add(e1);
        nameComp.add(e2);
        nameComp.add(e3);
        nameComp.add(e4);

        System.out.println("Employees by names in ascending order:");
        for (Employee e : nameComp) {
            System.out.println(e);
        }

        System.out.println("=========");

        TreeSet<Employee> salComp = new TreeSet<Employee>(new MySalaryComp());
        salComp.add(e1);
        salComp.add(e2);
        salComp.add(e3);
        salComp.add(e4);

        System.out.println("Employees by salaries in descending order:");
        for (Employee e : salComp) {
            System.out.println(e);
        }
    }
}

class MyNameComp implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class MySalaryComp implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e2.getSalary()>e1.getSalary()) {
        	return 1;
        }else {
        	return -1;
        }
    }
}
