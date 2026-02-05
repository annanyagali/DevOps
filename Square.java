
public class Square {

    public int calculateArea(int side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side cannot be negative");
        }
        return side * side;
    }
}
