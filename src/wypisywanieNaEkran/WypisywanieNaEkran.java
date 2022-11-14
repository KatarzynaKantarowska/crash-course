package wypisywanieNaEkran;

public class WypisywanieNaEkran {
    public static void main(String[] args) {
        int mojaZmienna = 222;
        double zmiennaTypuDouble = 12.55;
        System.out.print("Jakiś tekst" + "Kolejny tekst" + (5 + 6));
        System.out.print("Jakiś tekst" + "Kolejny tekst" + mojaZmienna);
        System.out.println(" Kolejny tekst");
        System.out.println("Wynik: " + mojaZmienna);
        System.out.println("Wynik: " + mojaZmienna + " " + zmiennaTypuDouble); // połączone a nie dodane !

    }
}
