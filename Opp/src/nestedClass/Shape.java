package nestedClass;

 public abstract class Shape {
   public abstract void draw();
}


 class ShapeGenerator{
	public void createShape() {
		Shape s=new Shape(){
		@Override
		 public void draw() {
			System.out.println("Draw the Rectangle");
		}
		
		};
		s.draw();
	}
	
	public static void main(String[] args) {
		ShapeGenerator sg=new ShapeGenerator();
		sg.createShape();
		
		
	}
}
