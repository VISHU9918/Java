package Abstract2;

public class ApplianceMain {

	public static void main(String[] args) {
		Appliance w=new WashingMachine("LG", 120);
		w.turnOn();
		
		Appliance r=new Refrigerator ("Samsung", 100);
		r.turnOn();
		
		Appliance m=new Microwave("TATA", 99);
		m.turnOn();
	}

}
