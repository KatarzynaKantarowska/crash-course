package klasy;

public class MainNull {
    static String str;
    static KlasaTestowaDlaNulla obiekt = new KlasaTestowaDlaNulla();

    public static void main(String[] args) {

        if (str == null) {
            System.out.println("Str jest nullem ");
        }

        obiekt.metoda();
    }
}
