
public class trianglej {
    public static boolean isTriangle(double l, double b, double h) {
        return (l + b > h) && (l + h > b) && (b + h > l);
    }
}
