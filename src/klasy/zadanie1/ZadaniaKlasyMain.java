package klasy.zadanie1;



public class ZadaniaKlasyMain {
    public static void main (String[] args) {

       Programista programista = new Programista("Mateusz", "Kowalski", "Java", 10000);

        System.out.println("Imię: " + programista.pobierzImie());
        System.out.println("Nazwisko: " + programista.pobierzNazwisko());
        System.out.println("Język: " + programista.pobierzJezyk());
        System.out.println("Zarobki: " + programista.pobierzZarobki());
    }
}
