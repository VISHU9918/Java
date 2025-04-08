package inheritance.Employee;

public class Employee {
	  private int eid;
	  private String name;
	  protected double basicPay;
	  private static String org = "C-DAC Hyd";
	  
	public Employee(int eid, String name, double basicPay) {
	 this.eid = eid;
	 this.name = name;
	 this.basicPay = basicPay;
	}
	  
	public void dispEmployee() {
	 System.out.println(eid+" "+name+" "+basicPay+" "+org);
	}

	public void calSalary() {
	  double da = 0.5; // 50%
	  double hra = 0.3; // 30%
	  double ta = 0.1; //10%
	  
	  double salary = basicPay*(da+hra+ta)+basicPay;
	  System.out.println(salary);
	}

	}