package stringi;

public class KlasaString {
    public static void main(String[] args) {
        String nazwaDlaStringa = "Nazwa dla Stringa";
        System.out.println(nazwaDlaStringa);
        String kolejnyString = "jakiś kolejny tekst";
        System.out.println(nazwaDlaStringa+ " " + kolejnyString);
        String polaczoneStringi = nazwaDlaStringa+ " " + kolejnyString;
        System.out.println(polaczoneStringi);
        System.out.println("Coś przed tym: " + polaczoneStringi);
    }
}
