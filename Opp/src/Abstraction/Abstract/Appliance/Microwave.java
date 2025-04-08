package Abstraction.Abstract.Appliance;

class Microwave extends Appliance {
    public Microwave(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    void turnOn() {
        System.out.println("Microwave " + brand + " is turned on. Power consumption: " + powerConsumption + "W");
    }
}