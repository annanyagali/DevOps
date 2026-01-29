public class circleFeatures {
    public class Circle {
    private double radius;
    private String color; // Optional feature

    // Constructors
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    // Features/Methods
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Area: π * r^2
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter/Circumference: 2 * π * r
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

}
