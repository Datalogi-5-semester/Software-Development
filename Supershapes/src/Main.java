import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        int x = Shape.getInt(scanner, "Please enter an X coordinate: ");
        int y = Shape.getInt(scanner, "Please enter a Y coordinate: ");
        System.out.println("Your coordinates are: " + x + "," + y + "\n");

        Point XY = new Point(x, y);

        Rectangle r1 = new Rectangle("r1", new Point(6, 6), new Point(6, 8),
                new Point(8, 8), new Point(8, 6));
        r1.isInside(XY);

        Rectangle r2 = new Rectangle("r2", new Point(10, 10), new Point(10, 12),
                new Point(12, 12), new Point(12, 10));
        r2.isInside(XY);

        r2.euclideanDistance(r1);

        Circle c1 = new Circle("c1", new Point(4, 4), 4);
        c1.isInside(XY);

        Triangle t1 = new Triangle("t1", new Point(2, 2), new Point(2, 5), new Point(10, 2));
        t1.isInside(XY);

        t1.euclideanDistance(r2);


    }
}
