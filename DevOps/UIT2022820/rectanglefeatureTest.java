package DevOps.UIT2022820;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class rectanglefeatureTest {
    
    rectanglefeature rf = new rectanglefeature();

    @Test
    public void testValidArea() {
        assertEquals(20.0, rf.calculateArea(5, 4));
    }

    @Test
    public void testDecimalValues() {
        assertEquals(12.5, rf.calculateArea(2.5, 5));
    }

    @Test
    public void testZeroLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            rf.calculateArea(0, 5);
        });
    }

    @Test
    public void testNegativeBreadth() {
        assertThrows(IllegalArgumentException.class, () -> {
            rf.calculateArea(5, -2);
        });
    }
}
