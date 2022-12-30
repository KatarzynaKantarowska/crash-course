import java.util.Scanner;

public class Rectangle implements Figure {

        double a;
        double b;

        public Rectangle( double a, double b){
            this.a = a;
            this.b = b;
        }

        Scanner scanner = new Scanner(System.in);

        @Override
        public double getPerimeter () {
            return a + a + b + b;
        }

        @Override
        public double getArea () {
            return a*b;
        }
    }
