package ApplianceHierarchyAbstract;

class Refrigerator extends Appliance {
    public Refrigerator(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    public void turnOn() {
        System.out.printf(" Refrigerator is now ON:" +
                          getBrand() +"\n Power consumption:"+ getPowerConsumption()+"\n");
    }
}
