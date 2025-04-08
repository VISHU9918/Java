package JavaApplication;

public class Person2Main {

	public static void main(String[] args) {
		Address address = new Address("GKP", "UP", "INDIA");
        Person2 person = new Person2("Pawan", address);

        person.displayPersonDetails();
    }

	}

