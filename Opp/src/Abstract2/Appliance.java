package Abstract2;

public abstract class Appliance {
	protected String brand;
	protected int power;
	
	
	public Appliance(String brand, int power) {
		super();
		this.brand = brand;
		this.power = power;
	}


	abstract void turnOn();

}
