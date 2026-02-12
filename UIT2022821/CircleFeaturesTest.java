package UIT2022821;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleFeaturesTest {

    @Test
    void testRadiusGetterSetter() {
        circleFeatures.Circle c = new circleFeatures.Circle();
        c.setRadius(5.0);
        assertEquals(5.0, c.getRadius());
    }

    @Test
    void testArea() {
        circleFeatures.Circle c = new circleFeatures.Circle(7.0);
        double expected = Math.PI * 7.0 * 7.0;
        assertEquals(expected, c.getArea(), 0.0001);
    }

    @Test
    void testPerimeter() {
        circleFeatures.Circle c = new circleFeatures.Circle(3.0);
        double expected = 2 * Math.PI * 3.0;
        assertEquals(expected, c.getPerimeter(), 0.0001);
    }
}
