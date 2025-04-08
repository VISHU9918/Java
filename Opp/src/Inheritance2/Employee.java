package Inheritance2;

public class Employee extends Person {
     private double salary;
     
     
     //overloading
	public void setData(String name, int age, int pId,double salary){
		super.setData(name, age, pId);
		this.salary=salary;
	}

	@Override
      public void getData() {
		super.getData();
		System.out.println("Salary:"+salary);
	}

	
      
	
}
