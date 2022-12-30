import java.time.LocalDate;

public class MainZadaniaInternet {
    public static void main(String[] args) {

        int rokUrodzenia = 1994;

        int localDate = 2022;

        LocalDate now = LocalDate.now();

        System.out.println("W tym roku masz: " + (now.getYear() - rokUrodzenia) + " lat");

        String imie = "Kasia";

        System.out.println("Masz na imię " + imie);

        int pierwszy = 5;
        int drugi = 10;

        int suma = pierwszy + drugi;
        int roznica = pierwszy - drugi;
        int iloczyn = pierwszy * drugi;

        System.out.println("suma: " + suma);
        System.out.println("roznica: " + roznica);
        System.out.println("iloczyn: " + iloczyn);

        int parzysta = 15;

         if (parzysta % 2 == 0 ) {
             System.out.println("Czy liczba jest parzysta ? " + true);
         } else System.out.println("Liczba nie jest parzysta");


        if ((parzysta % 3 == 0) && (parzysta % 5 == 0)) {
            System.out.println("Liczba jest podzielna przez 3 i 5");
        } else {
            ; System.out.println("Liczba nie spełnia wymagań");
        }

        double pow = Math.pow(parzysta, 3);

        System.out.println("Podnoszę liczbę do potęgi 3: " + pow );

        double pierwiastek = Math.sqrt(9);
        System.out.println("Pierwiastek z liczby to: " + pierwiastek);

        int a = 6;
        int b = 8;
        int c = 10;

        if ( a * a + b * b == c * c ) {
            System.out.println(true);
        } else System.out.println("Z odcinków nie da się zbudować trójkąta prostokątnego");

    }
}
