package Abstraction.Interface.Vehicle;

public class VehicleMain{
 public static void main(String[] args) {
     Vehicle car = new Car();
     car.startEngine(); // This will call the overridden method
 }
}