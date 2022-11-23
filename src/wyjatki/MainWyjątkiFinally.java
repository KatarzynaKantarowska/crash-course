package wyjatki;

public class MainWyjątkiFinally {
   static String str = "String tekstowy";
    public static void main(String[] args) {


        try {
            System.out.println("WSZYSTKO WIELKA LITERA " + str.toUpperCase() );
            System.out.println("Znak na miejscu 100: " + str.charAt(100));
        } catch (NullPointerException e) {
            System.out.println("Poszedł null");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Poszedł poza zakres ");
        } finally {
            System.out.println("Ja i tak zawsze się wykonam");
        }
    }
}
