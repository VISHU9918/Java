package Interfaces;

public class Dog implements Animal{

	@Override
	public void makeSound() {
	 System.out.println("The dog is barking");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating food");	
	}

}
