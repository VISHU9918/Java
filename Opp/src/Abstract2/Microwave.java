package Abstract2;

public class Microwave extends Appliance {

	public Microwave(String brand, int power) {
		super(brand, power);
		
	}

	@Override
	void turnOn() {
		System.out.println(brand+" "+power);

		System.out.println("Microwavw is on: ");
		
	}

}
