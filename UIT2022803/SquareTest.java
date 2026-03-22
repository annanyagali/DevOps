import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
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
    void testBoundaryValue(){
        Square square=new Square();
        assertEquals(1, square.calculateArea(1));
        assertEquals(4, square.calculateArea(2));
    }

    @Test
    void testLargeValues(){
        Square square =new Square();
        assertEquals(1000000, square.calculateArea(1000));
    }
    @Test
    void testNegativeSideThrowsException() {
        Square square = new Square();
        assertThrows(
            IllegalArgumentException.class,
            () -> square.calculateArea(-3)
        );
    }
    @RepeatedTest(5)
    public void RepeatedTest(){
        Square square=new Square();
        assertEquals(25, square.calculateArea(5));
    }

    @Test
    public void testNotEqual(){
        Square square=new Square();
        assertNotEquals(20, square.calculateArea(4));
    }

    @Test
    public void trueorfalse(){
        Square square=new Square();
        assertTrue(square.calculateArea(5)==25);
        assertFalse( square.calculateArea(4)==20);
    }


}
