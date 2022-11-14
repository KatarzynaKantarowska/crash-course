package stringi;

public class StringiMetody {
    public static void main(String[] args) {
        String tekst = "Jakiś tekst";
        System.out.println("Length: " + tekst.length());

        System.out.println("isEmpty: " + tekst.isEmpty());

       char pojedynczyZnak = tekst.charAt(tekst.length() - 1);
        System.out.println("charArt: " + pojedynczyZnak);

        System.out.println("substring: " + tekst.substring(6));
        String substring = tekst.substring(3,9);
        System.out.println("substring: " + substring);

        String nowyString = " dfmkdsfd fdsfdsf       ";
        System.out.println("." + nowyString + ".");
        System.out.println("trim: " + "." + nowyString.trim() + ".");

        String rozneWielkosciLiter = "Rozne Litery DUZE i male HaHahaHAHAHA";
        System.out.println("toLowerCase: " + rozneWielkosciLiter.toLowerCase());
        System.out.println("toUpperCase: " + rozneWielkosciLiter.toUpperCase());

        String czyZawiera = "     Czy zawiera jakiś tekst     ";
        // String czyZawieraMaleZnaki = czyZawiera.toLowerCase();
        // String czyZawieraMaleZnakiBezSpacji = czyZawieraMaleZnaki.trim();
        //String czyZawieraUproszczony = czyZawiera.toLowerCase().trim();
        System.out.println("startsWith: " + czyZawiera.toLowerCase().trim().startsWith("czy"));

        String czyZawieraKoncowke = "Jakis tekst z koncowka";
        System.out.println("endsWith: " + czyZawieraKoncowke.endsWith("koncowka"));

        System.out.println("contains: " + czyZawiera.contains("zawiera"));

        System.out.println("replace: " + czyZawiera.replace(' ', '.'));
    }
}
