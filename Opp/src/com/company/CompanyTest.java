package com.company;

import com.company.accounts.Account;
import com.company.hr.Employee;

public class CompanyTest {

	public static void main(String[] args) {
		Account ac=new Account(32456,"Saving",5000);
		System.out.println("Acoount Deatails:");
		ac.displayAccountDetails();
		
		Employee emp=new Employee("ABC",345612);
		System.out.println("Employee Deatails:");
		emp.displayEmployeeDeatails();

	}

}
