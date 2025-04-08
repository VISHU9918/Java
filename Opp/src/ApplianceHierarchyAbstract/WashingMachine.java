package ApplianceHierarchyAbstract;

class WashingMachine extends Appliance {
    public WashingMachine(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    public void turnOn() {
        System.out.printf(" Washing Machine is now ON:"+ getBrand()+" \n Power consumption:"+ getPowerConsumption()+"\n");
    }
}