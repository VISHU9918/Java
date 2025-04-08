package Abstraction.Abstract.Shape;

//Main method to test the classes
	public class ShapeMain {
	    public static void main(String[] args) {
	        Shape circle = new Circle(5);
	        Shape rectangle = new Rectangle(4, 6);

	        System.out.println("Area of Circle: " + circle.area());
	        System.out.println("Area of Rectangle: " + rectangle.area());
	    }
	}
