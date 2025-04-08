package Abstraction.Abstract.Appliance;

public class ApplianceMain {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine("LG", 1500);
        Appliance refrigerator = new Refrigerator("Samsung", 200);
        Appliance microwave = new Microwave("Panasonic", 1200);

        washingMachine.turnOn();
        refrigerator.turnOn();
        microwave.turnOn();
    }
}