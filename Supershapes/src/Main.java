//Benjamin Andersen, Marie Riskær, Mikkel Iuel & Nanna Holst Larsen
import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        int x = Shape.getInt(scanner, "Please enter an X coordinate: ");
        int y = Shape.getInt(scanner, "Please enter a Y coordinate: ");
        System.out.println("Your coordinates are: " + x + "," + y + "\n");

        Point XY = new Point(x, y);

        Rectangle r1 = new Rectangle("r1",
                new Point(6, 6),
                new Point(6, 8),
                new Point(8, 8),
                new Point(8, 6));
        System.out.println("Information on rectangle r1: ");
        r1.isInside(XY);

        Rectangle r2 = new Rectangle("r2",
                new Point(9, 9),
                new Point(9, 12),
                new Point(12, 12),
                new Point(12, 9));
        System.out.println("Information on rectangle r2: ");
        r2.isInside(XY);

        System.out.println("The euclidean distance between r1 and r2 is: " + r2.euclideanDistance(r1) + "\n");

        Triangle t1 = new Triangle("t1",
                new Point(2, 2),
                new Point(2, 5),
                new Point(10, 2));
        System.out.println("Information on triangle t1: ");
        t1.isInside(XY);

        System.out.println("The euclidean distance between t1 and r2 is: " + t1.euclideanDistance(r1) + "\n");

        Circle c1 = new Circle("c1",
                new Point(4, 4), 4);
        System.out.println("Information on circle c1: ");
        c1.isInside(XY);
    }
}
