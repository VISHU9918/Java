package Abstraction.Abstract.Shape;

//Circle class extending Shape
	class Circle extends Shape {
	    private double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double area() {
	        return 3.14* radius * radius;
	    }
	}