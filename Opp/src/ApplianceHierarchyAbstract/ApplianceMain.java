package ApplianceHierarchyAbstract;

public class ApplianceMain {

	public static void main(String[] args) {
		 Appliance washingMachine = new WashingMachine("LG", 500);
	        Appliance refrigerator = new Refrigerator("Samsung", 150);
	        Appliance microwave = new Microwave("Panasonic", 1000);

	        washingMachine.turnOn();
	        refrigerator.turnOn();
	        microwave.turnOn();
	    }
	}
	
