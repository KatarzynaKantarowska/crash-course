package pola;

public class MainPola {
    public static void main(String[] args) {
        // ang. fields

        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 15;
        char znak;
        System.out.println(obiekt.liczbaCalkowita);

        obiekt.zwrocWartoscPola();

        obiekt.ustawWartośćPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartośćPola(202);
        int zmienna = obiekt.zwrocWartoscPolaZMetody();
        System.out.println("Zmienna: " + zmienna);
    }
}
