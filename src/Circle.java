import java.util.Scanner;

public class Circle implements Figure{

    double r;

    public Circle (double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*(r*r);
    }

    @Override
    public double getArea() {
        return 2 * r * Math.PI;
    }
}
