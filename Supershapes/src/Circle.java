import java.awt.*;
import java.util.Scanner;

public class Circle extends Shape {

    int xCoord;
    int yCoord;
    int r;
    Point centerPoint;

    public Circle(Scanner scanner, Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.r = radius;
        xCoord = getInt(scanner, "Enter an x-value for the circle: ");
        yCoord = getInt(scanner, "Enter a y-value for the circle: ");
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
        System.out.print("The center of the circle is: ");
        return centerPointC;
    }

    public boolean isInside() {
        if (Math.sqrt((xCoord - centerPoint.x) * (xCoord - centerPoint.x) +
                (yCoord - centerPoint.y) * (yCoord - centerPoint.y)) <= r) {
            System.out.println("Your point is inside a circle");
            System.out.println(getArea());
            System.out.println(getCircumference());
            System.out.println(getCenter() + "\n");
            //System.out.println(euclideanDistance());
            return true;
        } else {
            System.out.println("Your point is not inside a circle");
            return false;
        }
    }
}

