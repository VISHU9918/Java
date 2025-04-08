package Abstraction.Abstract.Shape;

//Rectangle class extending Shape
	class Rectangle extends Shape {
	    private double width;
	    private double height;

	    Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    double area() {
	        return width * height;
	    }
	}
