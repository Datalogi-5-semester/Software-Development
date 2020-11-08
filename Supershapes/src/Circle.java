import java.awt.*;
import java.util.Scanner;

public class Circle extends Shape {

    int r;
    Point centerPoint;

    public Circle(String name, Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.r = radius;
    }

    //Circle constructor for unit test
    public Circle(Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.r = radius;
    }

    public double getArea() {
        return (Math.PI * (r * r));
    }

    public double getCircumference() {
        return ((2 * Math.PI) * r);
    }

    public Point getCenter() {
        Point centerPointC = new Point(centerPoint.x, centerPoint.y);
        return centerPointC;
    }

    public double euclideanDistance(Shape A) {
        double dist = (Math.sqrt(Math.pow((A.getCenter().x - this.getCenter().x), 2) + Math.pow((A.getCenter().y - this.getCenter().y), 2)));
        return dist;
    }

    public boolean isInside(Point XY) {
        if (Math.sqrt((XY.x - centerPoint.x) * (XY.x - centerPoint.x) + (XY.y - centerPoint.y) * (XY.y - centerPoint.y)) <= r) {
            System.out.println("Your point is inside the circle");
            System.out.println("The area of this circle is: " + getArea());
            System.out.println("The circumference of this circle is: " + getCircumference());
            System.out.println("The center of this circle is: " + getCenter() + "\n");
        } else {
            System.out.println("Your point is not inside the circle");
            System.out.println("The area of this circle is: " + getArea());
            System.out.println("The circumference of this circle is: " + getCircumference());
            System.out.println("The center of this circle is: " + getCenter() + "\n");
        }
        return false;
    }
    //Is inside function for unit test
    public boolean isInsideUnitTest(Point XY) {
        if  (Math.sqrt((XY.x - centerPoint.x) * (XY.x - centerPoint.x) + (XY.y - centerPoint.y) * (XY.y - centerPoint.y)) <= r) {
            return true;
        } else {
            return false;
        }
    }
}

