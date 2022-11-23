package wyjatkiZadania;

//import klasy.zadanie3.Matma;
import klasy.zadanie3.Matma;

public class MainWyjatkiZadania {
    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;
            int wynik = a / b;

            System.out.println("Wynik dzielenia: " + wynik);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }

        try {
            System.out.println("Wynik dzielenia z metody: " + podziel(4, 0 ));
        } catch (DzieleniePrzezZeroException e) {
            System.out.println(e.getMessage());
        }
        Matma.obwodKola(-5);


    }

    public static int podziel (int a, int b) throws DzieleniePrzezZeroException {
        if (b==0) {
            throw new DzieleniePrzezZeroException();
        }
        return a/b;
    }


}
