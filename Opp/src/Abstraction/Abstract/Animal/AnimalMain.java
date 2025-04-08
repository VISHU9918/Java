package Abstraction.Abstract.Animal;

//Main method to test the classes
public class AnimalMain {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();
     Animal cow = new Cow();

     dog.sound();
     cat.sound();
     cow.sound();
 }
}
