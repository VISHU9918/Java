package com.company.hr;

public class Employee {
  private String name;
  private int eId;
public Employee(String name, int eId) {
	this.name = name;
	this.eId = eId;
}

public void displayEmployeeDeatails() {
	System.out.println(name+","+eId);
}
  
}
