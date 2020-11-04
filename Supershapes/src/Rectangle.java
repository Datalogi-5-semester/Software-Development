import java.awt.*;
import java.util.Scanner;

public class Rectangle extends Shape {


    Point pA;
    Point pB;
    Point pC;
    Point pD;


    public Rectangle(String name, Point pA, Point pB, Point pC, Point pD) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;

    }

    //Rectangle constructor overload for test class "RectangleTest" only
    public Rectangle(Point pA, Point pB, Point pC, Point pD) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;
    }

    public Point getCenter() {
        int x = (pD.x - pA.x) / 2 + pA.x;
        int y = (pB.y - pA.y) / 2 + pA.y;
        Point centerPointR = new Point(x, y);
        return centerPointR;
    }

    public String printGetCenter() {
        System.out.println("The center of the rectangle is: ");
        return printGetCenter();
    }

    // Her er et forsøg på at udregne euclidean distance til de andre former:
    public double euclideanDistance(Shape A) {
        //System.out.println("The euclidean distance to the specified shape is: ");
        double dist = (Math.sqrt(Math.pow((A.getCenter().x - this.getCenter().x), 2) + Math.pow((A.getCenter().y - this.getCenter().y), 2)));
        //System.out.println(dist + "\n");
        return dist;
    }

    //Virker ikke 100% grundet variablen "dist"
    /* public String printEuclideanDistance(){
        System.out.println("The euclidean distance to the specified shape is: ");
        System.out.println(dist + "\n");
        return printEuclideanDistance();
    } */


    public double getArea() {
        return (pC.x - pA.x) * (pC.y - pA.y);
    }

    public String printGetArea() {
        System.out.println("The area of this rectangle is: ");
        return printGetArea();
    }

    public double getCircumference() {
        return ((pC.x - pA.x) * 2) + ((pC.y - pA.y) * 2);
    }

    public String printGetCircumference() {
        System.out.print("The circumference of this rectangle is: ");
        return printGetCircumference();
    }

    public boolean isInside(Point XY) {
        if (XY.x >= pA.x && XY.y >= pA.y && XY.x <= pC.x && XY.y <= pC.y) {
            return true;

        } else {
            return false;
        }
    }

    // Print method moved out of isInside for the true statement
    public String printIsInsideTrue() {
        System.out.println("Your point is inside a rectangle");
        System.out.println(getArea());
        System.out.println(getCircumference());
        System.out.print("The center of this rectangle is: ");
        System.out.println(getCenter() + "\n");
        //System.out.println(euclideanDistance());
        return printIsInsideTrue();
    }

    // Print method moved out of isInside for the false statement
    public String printIsInsideFalse() {
        System.out.println("Your point is not inside a rectangle");
        return printIsInsideFalse();
    }
}
