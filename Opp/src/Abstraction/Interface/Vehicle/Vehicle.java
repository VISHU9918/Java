package Abstraction.Interface.Vehicle;

interface Vehicle {
    default void startEngine() {
        System.out.println("Engine started");
    }
}