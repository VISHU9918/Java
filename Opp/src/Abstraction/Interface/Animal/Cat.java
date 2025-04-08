package Abstraction.Interface.Animal;

//Cat class implementing Animal
class Cat implements Animal {
@Override
public void makeSound() {
   System.out.println("The Cat sound is: Meow!");
}

@Override
public void eat() {
   System.out.println("Cat is eating.");
}
}
