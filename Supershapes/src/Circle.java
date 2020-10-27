import java.awt.*;
import java.util.Scanner;

public class Circle extends Shape {

    int r;
    Point centerPoint;

    public Circle(String name, Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.r = radius;
    }

    public double getArea() {
        System.out.print("The area of this circle is: ");
        return (Math.PI * (r * r));
    }

    public double getCircumference() {
        System.out.print("The circumference of this circle is: ");
        return ((2 * Math.PI) * r);
    }

    public Point getCenter() {
        Point centerPointC = new Point(centerPoint.x, centerPoint.y);
        return centerPointC;
    }

    public double euclideanDistance(Shape A) {
        System.out.println("The euclidean distance to the specified shape is: ");
        double dist = (Math.sqrt(Math.pow((A.getCenter().x - this.getCenter().x), 2) + Math.pow((A.getCenter().y - this.getCenter().y), 2)));
        System.out.println(dist + "\n");
        return dist;
    }

    public boolean isInside(Point XY) {
        if (Math.sqrt((XY.x - centerPoint.x) * (XY.x - centerPoint.x) +
                (XY.y - centerPoint.y) * (XY.y - centerPoint.y)) <= r) {
            System.out.println("Your point is inside a circle");
            System.out.println(getArea());
            System.out.println(getCircumference());
            System.out.print("The center of this circle is: ");
            System.out.println(getCenter() + "\n");
            //System.out.println(euclideanDistance());
            return true;
        } else {
            System.out.println("Your point is not inside a circle \n");
            return false;
        }
    }
}

