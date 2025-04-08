package inheritance.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
	// upcasting
	Employee te1 = new TechEmployee(1223, "XYZ", 120000, 25000);
	
	te1.dispEmployee(); // RTP
	
    //System.out.println(te1.getBonus());
    te1.calSalary(); // RTP

	}

}
