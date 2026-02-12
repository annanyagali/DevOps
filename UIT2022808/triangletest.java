package UIT2022808;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;

import org.junit.Test;

//import trianglej;

import org.junit.*;


public class triangletest {

    @Test
    public void testValidTriangle() {
        assertTrue(trianglej.isTriangle(3, 4, 5));
        assertTrue(trianglej.isTriangle(5, 5, 5));
    }

    @Test
    public void testInvalidTriangle() {
        assertFalse(trianglej.isTriangle(1, 1, 3));
        assertFalse(trianglej.isTriangle(0, 4, 5));
    }
}
