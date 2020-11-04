import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class CircleTest {

    //Initiated rectangle for unit testing, made from the overloaded constructor
    Circle circleTest = new Circle(new Point(6, 6), 4);


    @Test
    public void getCenterTest() {
        final Point expected = new Point(6, 6);
        final Point actual = circleTest.getCenter();
        assertEquals(expected, actual);
    }

    //Maybe cast to int? Since it needs the exact comma number (run test for reference)
    @Test
    public void getAreaTest() {
        final double expected = 50.265;
        final double actual = circleTest.getArea();
        assertEquals(expected, actual);
    }

    //Maybe cast to int? Since it needs the exact comma number (run test for reference)
    @Test
    public void getAreaCircumference() {
        final double expected = 10;
        final double actual = circleTest.getCircumference();
        assertEquals(expected, actual);
    }

    @Test
    public void isInsideTrue() {
        final boolean expected = true;
        final boolean actual = circleTest.isInside(new Point(3,4));
        assertEquals(expected, actual);
    }
}