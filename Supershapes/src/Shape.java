import java.awt.*;
import java.util.Scanner;

public abstract class Shape {

    Scanner scanner = new Scanner((System.in));

    public abstract Point getCenter();

    public abstract double getArea();

    public abstract double getCircumference();

    public abstract boolean isInside(Point XY);

    public abstract double euclideanDistance(Shape A);

    public static int getInt(Scanner scanner, String mesg) {
        System.out.print(mesg);
        return scanner.nextInt();
    }
}
