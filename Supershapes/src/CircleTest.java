import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class CircleTest {


    Circle circleTest = new Circle(new Point(6, 6), 4);


    @Test
    public void getCenterTest() {
        final Point expected = new Point(6, 6);
        final Point actual = circleTest.getCenter();
        assertEquals(expected, actual);
    }


    @Test
    public void getAreaTest() {
        final double expected = 50.265;
        final double actual = circleTest.getArea();
        assertEquals(expected, actual);
    }

    @Test
    public void getAreaCircumference() {
        final double expected = 10;
        final double actual = circleTest.getCircumference();
        assertEquals(expected, actual);
    }

    @Test
    public void isInsideTrue() {
        final boolean expected = true;
        final boolean actual = circleTest.isInsideUnitTest(new Point(3, 4));
        assertEquals(expected, actual);
    }
}