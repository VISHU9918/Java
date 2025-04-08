package JavaApplication;

public class Person2 {
	private String name;
    private Address address; // Composition relationship

    
    public Person2(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.displayAddress());
    }

}
