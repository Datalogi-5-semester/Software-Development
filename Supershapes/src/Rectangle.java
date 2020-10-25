import java.awt.*;
import java.util.Scanner;

public class Rectangle extends Shape {




    Point pA;
    Point pB;
    Point pC;
    Point pD;
    int x;
    int y;


    public Rectangle(String name, Point pA, Point pB, Point pC, Point pD) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;
        this.xCoord = x;
        this.yCoord = y;

    }

    public Point getCenter() {
        int x = (pD.x - pA.x) / 2 + pA.x;
        int y = (pB.y - pA.y) / 2 + pA.y;
        Point centerPointR = new Point (x,y);
        System.out.print("The center of the rectangle is: ");
        return centerPointR;
    }

    /*
    // Her er et forsøg på at udregne euclidean distance til de andre former:
    public double euclideanDistance() {
        System.out.println("The euclidean distance to the nearest triangle is: ");
        System.out.println(Math.sqrt(Math.pow((Triangle.centerPoint.x - r1.centerPoint.x), 2) + Math.pow((t1.centerPoint.y - r1.centerPoint.y), 2)));
        System.out.println("The euclidean distance to the nearest circle is: ");
        System.out.println(Math.sqrt(Math.pow((c1.centerPoint.x - r1.centerPoint.x), 2) + Math.pow((c1.centerPoint.y - r1.centerPoint.y), 2)));
    }
    */

    public double getArea() {
        System.out.print("The area of this rectangle is: ");
        return (pC.x - pA.x) * (pC.y - pA.y);
    }

    public double getCircumference() {
        System.out.print("The circumference of this rectangle is: ");
        return ((pC.x - pA.x) * 2) + ((pC.y - pA.y) * 2);
    }

    public boolean isInside() {
        if (xCoord >= pA.x && yCoord >= pA.y && xCoord <= pC.x && yCoord <= pC.y) {
            System.out.println("Your point is inside a rectangle");
            System.out.println(getArea());
            System.out.println(getCircumference());
            System.out.println(getCenter() + "\n");
            //System.out.println(euclideanDistance());
            return true;

        } else {
            System.out.println("Your point is not inside a rectangle");
            return false;
        }
    }
}