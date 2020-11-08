import java.awt.*;

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

    //Rectangle constructor for unit test
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


    public double euclideanDistance(Shape A) {

        double dist = (Math.sqrt(Math.pow((A.getCenter().x - this.getCenter().x), 2) + Math.pow((A.getCenter().y - this.getCenter().y), 2)));
        return dist;
    }

    public double getArea() {
        return (pC.x - pA.x) * (pC.y - pA.y);
    }

    public double getCircumference() {
        return ((pC.x - pA.x) * 2) + ((pC.y - pA.y) * 2);
    }

    public boolean isInside(Point XY) {
        if (XY.x >= pA.x && XY.y >= pA.y && XY.x <= pC.x && XY.y <= pC.y) {
            System.out.println("Your point is inside the rectangle");
            System.out.println("The area of this rectangle is: " + getArea());
            System.out.println("The circumference of this rectangle is: " + getCircumference());
            System.out.println("The center of this rectangle is: " + getCenter() + "\n");
        } else {
            System.out.println("Your point is not inside the rectangle");
            System.out.println("The area of this rectangle is: " + getArea());
            System.out.println("The circumference of this rectangle is: " + getCircumference());
            System.out.println("The center of this rectangle is: " + getCenter() + "\n");
        }
        return false;
    }

    //Is inside function for unit test
    public boolean isInsideUnitTest(Point XY) {
        if (XY.x >= pA.x && XY.y >= pA.y && XY.x <= pC.x && XY.y <= pC.y) {
            return true;
        } else {
            return false;
        }
    }
}