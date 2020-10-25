import java.awt.*;
import java.util.Scanner;

public abstract class Shape {

    protected int xCoord;
    protected int yCoord;

    public abstract Point getCenter();
    public abstract double getArea();
    public abstract double getCircumference();
    public abstract boolean isInside();
    //public abstract double euclideanDistance();

    public int getInt(Scanner scanner, String mesg) {
        System.out.print(mesg);
        return scanner.nextInt();
    }
}
