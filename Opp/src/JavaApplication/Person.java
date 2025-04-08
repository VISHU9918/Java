package JavaApplication;

public class Person {
	private String name;
	private  int age;
	private String country;
	
	
	// Default constructor
	
	public Person() {

	}
	
	
	// Parameterized constructor
public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}



 Person(String name, int age) {
	
		this.name = name;
		this.age = age;
}
public void setPerson(String n, int a, String c) {
		name = n;
		age = a;
		country = c;
	}




public void getPerson() {
	System.out.println(name+" "+age+" "+country);
}
public void getPerson2() {
	System.out.println(name+" "+age);
}
}


