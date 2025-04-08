package Abstraction.Interface.Animal;

//Dog class implementing Animal
class Dog implements Animal {
@Override
public void makeSound() {
   System.out.println("The Dog sound is: Woof!");
}

@Override
public void eat() {
   System.out.println("Dog is eating.");
}
}