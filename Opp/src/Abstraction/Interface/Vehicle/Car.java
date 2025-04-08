package Abstraction.Interface.Vehicle;

//Car class implementing Vehicle
class Car implements Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Car engine started with a roar!");
 }
}