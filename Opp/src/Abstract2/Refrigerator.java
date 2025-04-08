package Abstract2;

public class Refrigerator extends Appliance {

	public Refrigerator(String brand, int power) {
		super(brand, power);
		
	}

	@Override
	void turnOn() {
		System.out.println(brand+" "+power);

		System.out.println("Refrigerator is on: ");
		
		
	}

}
