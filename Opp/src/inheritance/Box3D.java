package inheritance;

public class Box3D extends Box {
	private double height;

	public Box3D(double length, double breadth, double height) {
		super(length, breadth);
		this.height = height;
	}
	
	public void Volume() {
		double volume = getLength()*getBreadth()*height;
		System.out.println("Volume " +volume);
	}

}
