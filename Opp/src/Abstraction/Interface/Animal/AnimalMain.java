package Abstraction.Interface.Animal;

//Main class for testing
public class AnimalMain {
public static void main(String[] args) {
   Animal dog = new Dog();
   Animal cat = new Cat();
   
   dog.makeSound();
   dog.eat();
   
   cat.makeSound();
   cat.eat();
}
}