import java.awt.*;
import java.util.Scanner;

public abstract class Shape {

    public abstract Point getCenter();
    public abstract double getArea();
    public abstract double getCircumference();
    public abstract boolean isInside();
    //public abstract double euclideanDistance();

    protected int getInt(Scanner scanner, String mesg) {
        System.out.print(mesg);
        return scanner.nextInt();
    }
}
