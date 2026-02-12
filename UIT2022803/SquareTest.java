import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void testCalculateArea() {
        Square square = new Square();
        assertEquals(16, square.calculateArea(4));
    }

    @Test
    void testCalculateAreaWithZero() {
        Square square = new Square();
        assertEquals(0, square.calculateArea(0));
    }

    @Test
    void testNegativeSideThrowsException() {
        Square square = new Square();
        assertThrows(
            IllegalArgumentException.class,
            () -> square.calculateArea(-3)
        );
    }
}
