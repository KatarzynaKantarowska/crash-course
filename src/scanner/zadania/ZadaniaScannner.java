package scanner.zadania;

import java.util.Scanner;

public class ZadaniaScannner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String imie = scanner.next();
//        String nazwisko = scanner.next();
//        int wzrost = scanner.nextInt();
//        System.out.println("Jestem " + imie + " " + nazwisko + " i mam " + wzrost + " cm wzrostu");

//        scanner.useDelimiter(";");
//        String tekst;
//        while (!(tekst = scanner.next()).toLowerCase().equals("x")) {
//            }
//            System.out.println(tekst);

        scanner.reset();
//        System.out.println("Podaj linię:");
//        String linia = scanner.nextLine();
//        System.out.println("Podaj liczbę linii:");
//        int liczbaLinii = scanner.nextInt();
//        for (int i = 0; i < liczbaLinii; i++) {
//            System.out.println(linia);
//            }

            int suma = 0;
            int liczbaNieujemna;
            while ((liczbaNieujemna = scanner.nextInt()) >= 0 ) {
                suma += liczbaNieujemna;
            }
        System.out.println("Wynik: " + suma);
        }
    }
