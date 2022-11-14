package operatory;

public class OperatoryArytmetyczne {
    public static void main (String[] args) {
        // ang. arithmetic operators

        System.out.println("wynik dodawania: " + ( 3 + 5));
        System.out.println(5 - 3);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 % 3);

        double a = 9;
        double b = 2;

        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);

        double odejmowanie = a - b;
        System.out.println("Odejmowanie: " + odejmowanie);

        double mnozenie = a * b;
        System.out.println("Mnożenie: " + mnozenie);

        double dzielenie = a / b;
        System.out.println("Dzielenie: " + dzielenie);

        double resztaZDzielenia = a % b;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);

        a += b; // inaczej a = a + b;
        System.out.println("a = a + b: " + a);

        a -=b; // inaczej: a = a - b;
        System.out.println("a = a - b: " + a);

        a *= b; // inaczej: a = a * b;
        System.out.println(" a = a * b: " + a);

        a /= b; // inaczej a = a / b;
        System.out.println(" a / b: " + a);

        a %= b; // inaczej a = a % b;
        System.out.println(" a = a % b: " + a);

        System.out.println(" a: " + a + " b: " + b);
        b -= a; // inaczej b = b-a;

        System.out.println(" b = b - a: " + b);

        a = a + 1;
        System.out.println(" a = a + 1; " + a);
        a += 1;
        System.out.println("a += 1: " + a);
        a++; // zwiększ tę wartość o 1 - INKREMENTACJA
        System.out.println("a ++: " + a);

        a--; // zmniejszanie wartości o 1 DEKREMENTACJA
        System.out.println(" a--: " + a);

        ++a;
        System.out.println("++a:" +a );
        --a;
        System.out.println("--a: " +a);
    }
}
