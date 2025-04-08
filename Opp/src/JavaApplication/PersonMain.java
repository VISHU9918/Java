package JavaApplication;

public class PersonMain {

	public static void main(String[] args) {
		Person person=new Person();
		person.setPerson("Pawan",34,"India");
		person.getPerson();
		
		Person person2=new Person("vishal", 5, "USA");
		person2.getPerson();
		
		Person person3=new Person("vishal", 5);
		person3.getPerson2();


	}

}
