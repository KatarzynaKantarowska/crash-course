package klasy;

public class KlasaObiektProsty {
    public static void main(String[] args) {
        int typProsty = 100;
        Przykład przykład = new Przykład();
        Przykład przykladDrugi = new Przykład();

        przykład.pole = 123;
        przykladDrugi.pole = 333;

        System.out.println(" Przykład: " + przykład.pole);
        System.out.println(" PrzykładDrugi: " + przykladDrugi.pole);

        System.out.println("Wypisuję typ prosty: " + typProsty);
        System.out.println("Wypisuję obiekt: " + przykład);

    }
}
