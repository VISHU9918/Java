package Abstraction.Abstract.Appliance;

class WashingMachine extends Appliance {
    public WashingMachine(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    void turnOn() {
        System.out.println("Washing Machine " + brand + " is turned on. Power consumption: " + powerConsumption + "W");
    }
}
