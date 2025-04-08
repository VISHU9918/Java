package Abstraction.Shape;

class Circle implements Colorful {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public void draw() {
     System.out.println("Drawing a circle.");
 }

 @Override
 public double calculateArea() {
     return 3.14 * radius * radius;
 }

 @Override
 public void fillColor() {
     System.out.println("Filling the circle with color.");
 }
}