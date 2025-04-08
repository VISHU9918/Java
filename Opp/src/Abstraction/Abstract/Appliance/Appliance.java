package Abstraction.Abstract.Appliance;

abstract class Appliance {
    protected String brand;
    protected double powerConsumption;

    public Appliance(String brand, double powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    abstract void turnOn();
}

