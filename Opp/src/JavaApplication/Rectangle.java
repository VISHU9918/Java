package JavaApplication;

public class Rectangle {
	 private double length;
	    private double width;

	    
	    public Rectangle(double length, double width) {
	        this.length = length; 
	        this.width = width;  
	    }

	    
	    public double calculateArea() {
	        return length * width;
	    }

	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }

	    public void display() {
	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);
	        System.out.println("Area: " + calculateArea());
	        System.out.println("Perimeter: " + calculatePerimeter());
	    }

}