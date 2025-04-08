package inheritance;

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area method for Circle
    @Override
    public double area() {
        return 3.14* radius * radius; 
    }
}
