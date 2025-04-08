package Abstraction.Shape;

public class ShapeMain{
 public static void main(String[] args) {
     Colorful circle = new Circle(5.00);
     circle.draw();
     System.out.printf("Area of the circle:"+circle.calculateArea()+"\n");
     circle.fillColor();
 }
}