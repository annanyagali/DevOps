package DevOps.UIT2022820;

public class rectanglefeature {
    public double calculateArea(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException(
                "Length and breadth must be greater than zero"
            );
        }
        return length * breadth;
    }
}
