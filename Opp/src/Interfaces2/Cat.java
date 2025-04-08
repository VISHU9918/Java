package Interfaces2;

public class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat is making sound ");
		
	}

	@Override
	public void eat() {
	System.out.println("Cat is eating Rat");
	}

}
