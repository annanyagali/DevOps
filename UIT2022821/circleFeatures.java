public class circleFeatures {

    // The Circle class (Static so Main can use it easily)
    public static class Circle {
        private double radius;

        public Circle() {}
        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() { return radius; }
        public void setRadius(double radius) { this.radius = radius; }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

}