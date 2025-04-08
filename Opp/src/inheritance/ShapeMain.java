package inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		        Shape circle = new Circle(5.0);
		        Shape rectangle = new Rectangle(4.0, 6.0);

		        System.out.printf("Area of the Circle:" + circle.area()+" \n");
		        
		        System.out.printf("Area of the Rectangle:"+ rectangle.area());
		    }
		}

	
