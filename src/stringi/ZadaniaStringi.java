package stringi;

public class ZadaniaStringi {
    public static void main(String[] args) {

        String imie = "Kasia";
        String nazwisko = "Kantarowska";
        String imieNazwiskozeSpacja = "Kasia Kantarowska";
        System.out.println("Ile znaków zawiera imię: " + imie.length());
        System.out.println("Ile znaków zawiera nazwisko: " + nazwisko.length());
        System.out.println("Ile znaków zawiera imię i nazwisko: " + imieNazwiskozeSpacja.length());

        String inneImie1 = "Alicja";
        System.out.println("Czy moje imię jest równe Alicja: " + imie.equals(inneImie1));

        System.out.println("Nazwisko z wielkich liter: " + nazwisko.toUpperCase());
        System.out.println("Zmiana w nazwisku 'a' na 'e': " + nazwisko.replace('a', 'e' ));

        //2. Dla zdania "Potrafię coraz więcej z programowania" Wypisz każdy znak w osobnej linii

        System.out.println("Zadanie 2");
        String zdanie = "Potrafię coraz więcej z programowania.";
        for (int i = 0; i < zdanie.length(); i++) {
            System.out.println(zdanie.charAt(i));
            
        }

        // 3. Napisz to samo zdanie od tyłu.

        for (int i = zdanie.length() - 1 ; i >= 0;  i--) {
            System.out.println(zdanie.charAt(i));

        }
    }
}
