package inheritance;

public class Employee3 extends Person3 {
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
