package Abstract2;

public class ShapeMain {

	public static void main(String[] args) {
		Shape c=new Circle(4.0);
		System.out.println("Circle Area: "+c.area());
				
		Shape r=new Rectangle(4.0,5.0);
		System.out.println("Rectangle Area: "+r.area());
		

		
		

	}

}
