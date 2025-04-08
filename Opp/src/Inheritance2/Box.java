package Inheritance2;

public class Box {
	private double length;
	private double breadth;
	
	public Box(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	
	}
	
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void Area() {
		double Area=length*breadth;
		System.out.println("Area " +Area);
	}

	}

	
	

