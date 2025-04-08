package Inheritance2;

	public class Employee2 extends Person2{
	     private double salary;
	     
	     public Employee2(String name, int age, int pId, double salary) {
			super(name, age, pId);
			this.salary = salary;
		}

          @Override
	      public void getData() {
			super.getData();
			System.out.println("Salary:"+salary);
		}

}
