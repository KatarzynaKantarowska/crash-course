package stringi;

public class StringLiteralObject {
    public static void main(String[] args) {
        String str = "jakiś string";
       String str2 = "jakiś string";
       String str3 = "jakiś string";

       String inny = "inny";
       String inny2 = "inny";
       //flyweight = pyłek

       String przezKonstruktor = new String ("przez konstruktor");
       String przezKonstruktor2 = new String ("przez konstruktor");
    }
}
