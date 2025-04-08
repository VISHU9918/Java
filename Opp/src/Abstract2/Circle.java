package Abstract2;

public class Circle extends Shape {
   private double r;
 public Circle(double r) {
		this.r=r;
		
	}

@Override
public double area() {
	return Math.PI*r*r;
}
//@Override
//public void display() {
//	System.out.println("Circle Area:"+area());
//}
	
}

	

