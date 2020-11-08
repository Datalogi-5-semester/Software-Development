import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectangleTest {


    Rectangle rectangleTest = new Rectangle(
            new Point(4, 3),
            new Point(4, 6),
            new Point(6, 6),
            new Point(6, 3));

    Triangle euclideanDistanceTrianglePlusRectangleTest = new Triangle(
            new Point(2, 2),
            new Point(4, 8),
            new Point(8, 2));

    @Test
    public void getCenterTest() {
        final Point expected = new Point(5, (int) 4.5);
        final Point actual = rectangleTest.getCenter();
        assertEquals(expected, actual);
    }

    @Test
    public void getAreaTest() {
        final double expected = 6;
        final double actual = rectangleTest.getArea();
        assertEquals(expected, actual);
    }

    @Test
    public void getCircumferenceTest() {
        final double expected = 10;
        final double actual = rectangleTest.getCircumference();
        assertEquals(expected, actual);
    }

    @Test
    public void isInsideTrueTest() {
        final boolean expected = true;
        final boolean actual = rectangleTest.isInsideUnitTest(new Point(1,1));
        assertEquals(expected, actual);
    }
    @Test
    public void euclideanDistanceTest() {
        final double expected = 8;
        final double actual = (Math.sqrt(Math.pow((rectangleTest.getCenter().x - euclideanDistanceTrianglePlusRectangleTest.getCenter().x), 2) +
                Math.pow((rectangleTest.getCenter().y - euclideanDistanceTrianglePlusRectangleTest.getCenter().y), 2)));
        assertEquals(expected, actual);
    }
}