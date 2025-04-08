package inheritance;

public class PersonMain {

	public static void main(String[] args) {
		Person3 p=new Person3();
		p.setData("Yash", 25, 12342);
		p.getData();
		
		Employee3 emp=new Employee3();
		emp.setData("Jhansi",500 , 3736, 576);
		emp.getData();

	}

}
