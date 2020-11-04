import java.awt.*;
import java.util.Scanner;

public class Triangle extends Shape {

    Point pA;
    Point pB;
    Point pC;

    public Triangle(String name, Point pA, Point pB, Point pC) {

        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
    }

    // Triangle constructor overload for test class "TriangleTest" only
    public Triangle(Point pA, Point pB, Point pC) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
    }

    public Point getCenter() {
        int x = (pA.x + pB.x + pC.x) / 3;
        int y = (pA.y + pB.y + pC.y) / 3;
        Point centerPoint = new Point(x, y);
        return centerPoint;
    }

    public String printGetCenter() {
        System.out.print("The center of the triangle is: ");
        return printGetCenter();
    }

    public double getArea() {
        return (Math.sqrt(Math.pow(pA.x * (pB.y - pC.y) + pB.x * (pC.y - pA.y) + pC.x * (pA.y - pB.y), 2))) / 2.0;
    }

    public double getArea_pA_pB_xy(Point XY) {
        return (Math.sqrt(Math.pow(pA.x * (pB.y - XY.y) + pB.x * (XY.y - pA.y) + XY.x * (pA.y - pB.y), 2))) / 2.0;
    }

    public double getArea_pA_xy_pC(Point XY) {
        return (Math.sqrt(Math.pow(pA.x * (XY.y - pC.y) + XY.x * (pC.y - pA.y) + pC.x * (pA.y - XY.y), 2))) / 2.0;
    }

    public double getArea_xy_pB_pC(Point XY) {
        return (Math.sqrt(Math.pow(XY.x * (pB.y - pC.y) + pB.x * (pC.y - XY.y) + pC.x * (XY.y - pB.y), 2))) / 2.0;
    }

    public double getCircumference() {
        int sideAB = (int) Math.sqrt((int) Math.pow((pB.x - pA.x), 2) + (int) Math.pow((pB.y - pA.y), 2));
        int sideBC = (int) Math.sqrt((int) Math.pow((pC.x - pB.x), 2) + (int) Math.pow((pB.y - pC.y), 2));
        int sideCA = (int) Math.sqrt((int) Math.pow((pC.x - pA.x), 2) + (int) Math.pow((pC.y - pA.y), 2));
        return (sideAB + sideBC + sideCA);
    }

    public String printGetCircumference() {
        System.out.print("The circumference of this triangle is: ");
        return printGetCircumference();
    }

    public double euclideanDistance(Shape A) {
        System.out.println("The euclidean distance to the specified shape is: ");
        double dist = (Math.sqrt(Math.pow((A.getCenter().x - this.getCenter().x), 2) + Math.pow((A.getCenter().y - this.getCenter().y), 2)));
        System.out.println(dist + "\n");
        return dist;
    }

    public boolean isInside(Point XY) {
        if (getArea() == (getArea_pA_pB_xy(XY) + getArea_pA_xy_pC(XY) + getArea_xy_pB_pC(XY))) {
            return true;
        } else {

            return false;
        }
    }

    public String printIsInsideTrue() {
        System.out.println("Your point is inside a triangle");
        System.out.print("The area of this triangle is: ");
        System.out.println(getArea());
        System.out.println(getCircumference());
        System.out.print("The center of this triangle is: ");
        System.out.println(getCenter() + "\n");
        //System.out.println(euclideanDistance());
        return printIsInsideTrue();
    }

    // Print method moved out of isInside for the false statement
    public String printIsInsideFalse() {
        System.out.println("Your point is not inside a triangle \n");
        return printIsInsideFalse();
    }
}
