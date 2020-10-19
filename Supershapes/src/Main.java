import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        Rectangle r1 = new Rectangle(scanner, "r1", new Point(6, 6), new Point(6, 8), new Point(8, 8), new Point(8, 6));
        r1.isInside();

        Circle c1 = new Circle(scanner, new Point(4,4), 4);
        c1.isInside();

        Triangle t1 = new Triangle(scanner, new Point(2,2), new Point(2, 5), new Point(10, 2));
        t1.isInside();
    }
}
