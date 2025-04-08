package inheritance.Employee;


	public class TechEmployee extends Employee{
		 
		 private int bonus;

		 public TechEmployee(int eid, String name, double basicPay, int bonus) {
		  super(eid, name, basicPay);
		  this.bonus = bonus;
		 }

		    @Override
		 public void calSalary() {
		    double da = 0.5; // 50%
		    double hra = 0.3; // 30%
		    double ta = 0.1; //10%
		    double salary = basicPay*(da+hra+ta)+basicPay+bonus;
		    System.out.println(salary);
		  }
		    @Override
		    public void dispEmployee() { //
		     super.dispEmployee();//
		     System.out.println("Bonus: "+bonus);
		    }

	}
		 
		 
		

