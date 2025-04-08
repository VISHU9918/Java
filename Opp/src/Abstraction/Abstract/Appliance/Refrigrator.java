package Abstraction.Abstract.Appliance;

class Refrigerator extends Appliance {
    public Refrigerator(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    void turnOn() {
        System.out.println("Refrigerator " + brand + " is turned on. Power consumption: " + powerConsumption + "W");
    }
}
