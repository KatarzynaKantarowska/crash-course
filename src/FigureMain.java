import java.util.Scanner;

public class FigureMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promień koła");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Podaj pierwszy bok prostokąta" );
        double a = scanner.nextDouble();
        System.out.println("Podaj drugi bok prostokąta" );
        double b = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println("Podaj pierwszy bok trójkąta");
        double c = scanner.nextDouble();
        System.out.println("Podaj drugi bok trójkąta");
        double d = scanner.nextDouble();
        Triangle triangle = new Triangle(c, d);

        Figure[] array = {circle, triangle, rectangle};
        for (int i = 0; i <= array.length -1 ; i++) {
            System.out.println(array[i].getArea());
            System.out.println(array[i].getPerimeter());

        }
    }
}
