package Inheritance2;

public class PersonMain {

	public static void main(String[] args) {
		Person p=new Person();
		p.setData("Yash", 25, 12342);
		p.getData();
		
		Employee emp=new Employee();
		emp.setData("Jhansi",500 , 3736, 576);
		emp.getData();

	}

}
