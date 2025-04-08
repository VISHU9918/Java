package ApplianceHierarchyAbstract;

abstract class Appliance {
    private String brand;
    private double powerConsumption; 

    
    public Appliance(String brand, double powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

   
    public abstract void turnOn();

  
    public String getBrand() {
        return brand;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
}

