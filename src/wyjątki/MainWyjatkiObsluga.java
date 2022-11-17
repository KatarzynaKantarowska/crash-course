package wyjątki;

public class MainWyjatkiObsluga {
    static String str;
    static int [] tablica;
    public static void main(String[] args) {
        // ang. exception

        //str = "Przypiszę coś";

//        try {
//            System.out.println("Przed wykonaniem");
//            System.out.println("Czy pusty: " + str.isEmpty());
//            System.out.println("Po wykonaniu");
//        } catch(NullPointerException wyjatek) {
//            System.out.println("Nie utworzyłeś stringa");
//        }

        tablica = new int[2];
        try {
            tablica[0] = 101;
            tablica[1] = 102;
            System.out.println("Wszystko poszło ok ");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd z tablicą");
        }
        System.out.println("Na koniec programu wypisz to coś");
    }
}
