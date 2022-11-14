package stringi;

public class StringRownyEquals {
    public static void main(String[] args) {
        String strLiteral1 = "tekst";
        String strLiteral2 = "tekst";

        boolean wynik = strLiteral1 == strLiteral2;
        System.out.println("strLiteral1 == strLiteral2: " + wynik );

        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");

        wynik = strObject1 == strObject2;
        System.out.println("strObject1 == strObject2 " + wynik);

        wynik = strLiteral1 == strObject1;
        System.out.println("strLiteral1 == strObject1: " + wynik);

        // equals()
        wynik = strLiteral1.equals(strLiteral2);
        System.out.println("strLiteral1.equals(strLiteral2: " + wynik);

        wynik = strObject1.equals(strObject2);
        System.out.println("strObject1.equals(strObject2: " + wynik);

        wynik = strLiteral1.equals(strObject1);
        System.out.println("strLiteral1.equals(strObject1: " + wynik);

        String strInnyTekst = "inny tekst";
        wynik = strLiteral1.equals(strInnyTekst);
        System.out.println("strLiteral1.equals(strInnyTekst: " + wynik);
    }
}
