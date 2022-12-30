import java.util.Scanner;

public class Triangle implements Figure {

    double c;
    double d;

    public Triangle(double c, double d) {
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return (c + d) * 2 ;
    }

    @Override
    public double getArea() {
        return (c*d)/2;
    }
}
