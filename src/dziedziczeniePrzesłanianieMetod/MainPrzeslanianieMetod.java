package dziedziczeniePrzesłanianieMetod;


public class MainPrzeslanianieMetod {
    public static void main(String[] args) {
        // ang. override

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metoda();
        klasaRozszerzona.metoda();


    }
}
