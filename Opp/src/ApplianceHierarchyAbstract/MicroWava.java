package ApplianceHierarchyAbstract;

class Microwave extends Appliance {
    public Microwave(String brand, double powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    public void turnOn() {
        System.out.printf(" Microwave is now ON:"+
                          getBrand()+"\n Power consumption:"+ getPowerConsumption());
    }
}