package Abstract2;

public class WashingMachine extends Appliance {

	
	public WashingMachine(String brand, int power) {
		super(brand,power);
	}

	@Override
	void turnOn() {
		System.out.println(brand+" "+power);

		System.out.println("WashingMachine is on: ");
		
		
	}

}
