import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class TriangleTest {

    //Initiated rectangle for unit testing, made from the overloaded constructor
    Triangle triangleTest = new Triangle(
            new Point(2, 2),
            new Point(4, 8),
            new Point(8, 2));

    @Test
    public void getCenterTest() {
        final Point expected = new Point((int) 4.7, 4); //The calculation rounds 4.7 to 4
        final Point actual = triangleTest.getCenter();
        assertEquals(expected, actual);
    }

    @Test
    public void getAreaTest() {
        final double expected = 18;
        final double actual = triangleTest.getArea();
        assertEquals(expected, actual);
    }

    @Test
    public void getArea_pA_pB_xyTest() {
        final double expected = 4;
        final double actual = triangleTest.getArea_pA_pB_xy(new Point(3,4));
        assertEquals(expected, actual);
    }

    @Test
    public void getArea_pA_xy_pCTest() {
        final double expected = 6;
        final double actual = triangleTest.getArea_pA_xy_pC(new Point(3,4));
        assertEquals(expected, actual);
    }

    @Test
    public void getArea_xy_pB_pCTest() {
        final double expected = 8;
        final double actual = triangleTest.getArea_xy_pB_pC(new Point(3,4));
        assertEquals(expected, actual);
    }

    @Test
    public void getAreaCircumference() {
        final double expected = 19;
        final double actual = triangleTest.getCircumference();
        assertEquals(expected, actual);
    }

    @Test
    public void isInsideTrue() {
        final boolean expected = true;
        final boolean actual = triangleTest.isInside(new Point (3,4));
        assertEquals(expected, actual);
    }
}
