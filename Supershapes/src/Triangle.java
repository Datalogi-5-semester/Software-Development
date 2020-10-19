import java.awt.*;
import java.util.Scanner;

public class Triangle extends Shape {

    int xCoord;
    int yCoord;
    Point pA;
    Point pB;
    Point pC;

    public Triangle(Scanner scanner, Point pA, Point pB, Point pC) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        xCoord = getInt(scanner, "Enter an x-value for the triangle: ");
        yCoord = getInt(scanner, "Enter a y-value for the triangle: ");
    }

    public Point getCenter() {
        int x = (pA.x + pB.x + pC.x) / 3;
        int y = (pA.y + pB.y + pC.y) / 3;
        Point centerPoint = new Point(x,y);
        System.out.print("The center of the triangle is: ");
        return centerPoint;
    }

    public double getArea() {
        return (Math.sqrt(Math.pow(pA.x * (pB.y - pC.y) + pB.x * (pC.y - pA.y) + pC.x * (pA.y - pB.y), 2))) / 2.0;
    }

    public double getArea_pA_pB_xy(){
        return (Math.sqrt(Math.pow(pA.x * (pB.y - yCoord) + pB.x * (yCoord - pA.y) + xCoord * (pA.y - pB.y), 2))) / 2.0;
    }

    public double getArea_pA_xy_pC(){
        return (Math.sqrt(Math.pow(pA.x * (yCoord - pC.y) + xCoord * (pC.y - pA.y) + pC.x * (pA.y - yCoord), 2))) / 2.0;
    }

    public double getArea_xy_pB_pC(){
        return (Math.sqrt(Math.pow(xCoord * (pB.y - pC.y) + pB.x * (pC.y - yCoord) + pC.x * (yCoord - pB.y), 2))) / 2.0;
    }

    public double getCircumference() {
        int sideAB = (int) Math.sqrt((int) Math.pow((pB.x - pA.x), 2) + (int) Math.pow((pB.y - pA.y), 2));
        int sideBC = (int) Math.sqrt((int) Math.pow((pC.x - pB.x ), 2) + (int) Math.pow((pB.y - pC.y), 2));
        int sideCA = (int) Math.sqrt((int) Math.pow((pC.x - pA.x), 2) + (int) Math.pow((pC.y - pA.y), 2));
        System.out.print("The circumference of this triangle is: ");
        return (sideAB + sideBC + sideCA);
    }

    public boolean isInside(){
        if(getArea() == (getArea_pA_pB_xy() + getArea_pA_xy_pC() + getArea_xy_pB_pC())){
            System.out.println("Your point is inside a triangle");
            System.out.print("The area of this triangle is: ");
            System.out.println(getArea());
            System.out.println(getCircumference());
            System.out.println(getCenter() + "\n");
            //System.out.println(euclideanDistance());
            return true;

        } else {

            System.out.println("Your point is not inside a triangle");

            return false;
        }
    }
}